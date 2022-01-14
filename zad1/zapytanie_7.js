// 7. Usuń z bazy osoby o wzroście przekraczającym 190;
printjson(db.cwiczenia2.deleteMany({ "height" : {$gt:"190.00"} }))
