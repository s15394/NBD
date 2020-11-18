printjson(db.people.mapReduce(
    function() { 
        bmi = this.weight / (Math.pow(this.height/100, 2) );
        emit(this.nationality, {sum_bmi: bmi, min_bmi: bmi, max_bmi: bmi, count: 1}) },
    function(key, values) {
        sum = 0;
        min = 1000;
        max = 0;
        count = 0;
        for(let i=0; i< values.length; i++) {
            sum += values[i].sum_bmi;
            min = values[i].min_bmi < min ? values[i].min_bmi : min;
            max = values[i].max_bmi > max ? values[i].max_bmi : max;
            count += values[i].count
        }
        return {sum_bmi: sum, min_bmi: min, max_bmi: max, count: count};
    },
    {
        out: "mapreduce_bmi_avg_min_max",
        finalize: function(key, values) {
            return {
                avg_bmi: values.sum_bmi / values.count,
                min_bmi: values.min_bmi,
                max_bmi: values.max_bmi
            }}
    }
).find().toArray())