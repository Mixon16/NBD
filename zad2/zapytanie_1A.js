// 1. Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet)

printjson(db.cwiczenia2.aggregate([{
        "$group": {
           "_id": "$sex",
           "AverageWeight": {
              "$avg": "$weight"
           },
           "AverageHeight": {
              "$avg": "$height"
           }
        }
}]).toArray())
