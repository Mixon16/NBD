// 1. Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet)
printjson(db.cwiczenia2.mapReduce(
    function () { emit(this.sex, { "height": parseFloat(this.height), "weight": parseFloat(this.weight), "count": 1 }) },
    function (_, values) {
        return {
            "height": Array.sum(values.map(e => e["height"])),
            "weight": Array.sum(values.map(e => e["weight"])),
            "count": Array.sum(values.map(e => e["count"]))
        }
    },
    {
        finalize: function (_, value) {
            return { "avgHeight": (value.height / value.count), "avgWeight": (value.weight / value.count) }
        },
        out: { inline: 1 }
    }
).results)
