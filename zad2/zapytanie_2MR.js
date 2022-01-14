// 2. Łączną ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty
printjson(db.cwiczenia2.mapReduce(
    function () { this.credit.forEach(e => emit(e.currency, parseFloat(e.balance))) },
    function (key, values) { return Array.sum(values) },
    { out: { inline: 1 } }
))
