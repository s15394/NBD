printjson(db.people.mapReduce(
    function() { this.credit.forEach(card => {
        emit(card.currency, { sum: card.balance, avg: card.balance});
    });},
    function(key, values) { 
        sum = 0;
        avg = 0;
        count = 0;
        values.forEach(card => {
            sum += card.sum;
            avg += card.avg;
            count += 1
        })
        avg = avg / count
        return { sum: sum, avg: avg}
    },
    {
        query: { sex: "Female", nationality: "Poland"},
        out: 'mapreduce_sum_balance_per_currency'
    }
).find().toArray())