printjson(db.people.findOne({ $and: [ {sex: "Female"},{nationality: "China"}]}))
