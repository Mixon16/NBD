// 2. Łączną ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty
printjson(db.cwiczenia2.aggregate([
    { $unwind : "$credit" },
    { $addFields: {balance_decimal: {$convert: { input: "$credit.balance", to: "decimal", onError: Error }}} },
    { $group: { _id: "$credit.currency" , totalBalancePerCurrency: {$sum: "$balance_decimal"}} }
]).toArray())
