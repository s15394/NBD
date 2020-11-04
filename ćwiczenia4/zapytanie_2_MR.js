printjson(db.people.mapReduce(
    function() { this.credit.forEach(card => {
        emit(card.currency, card.balance);
    });},
    function(key, values) { return Array.sum(values);},
    {
        out: 'mapreduce_sum_balance_per_currency'
    }
).find().toArray())