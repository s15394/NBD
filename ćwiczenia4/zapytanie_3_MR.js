printjson(db.people.mapReduce( function() { emit(this.job, 1); }, function(key) { return 1; }, { out: "mapreduce_job_only"}).find().toArray())
