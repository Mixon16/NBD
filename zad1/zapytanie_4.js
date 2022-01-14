// 4. Lista wszystkich osób znajdujących się w bazie o wadze z przedziału <68, 71.5)
printjson(db.cwiczenia2.find({ weight: {$gt:'68', $lt:'71.5'} }).toArray())
