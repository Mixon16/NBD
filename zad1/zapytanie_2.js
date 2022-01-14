// 2. Jedna kobieta narodowości chińskiej
printjson(db.cwiczenia2.find({ sex: 'Female', nationality: 'China' }).limit(1).toArray())
