// 3. Lista mężczyzn narodowości niemieckiej
printjson(db.cwiczenia2.find({ sex: 'Male', nationality: 'Germany' }).toArray())
