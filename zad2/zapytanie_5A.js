// 5. Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty
printjson(db.cwiczenia2.aggregate([
  {
    $match: { nationality: 'Poland', sex: 'Female' }
  },
  {
    $unwind: {
      path: '$credit'
    }
  },
  {
    $group: {
      _id: '$credit.currency',
      total: {
        $sum: '$credit.balance'
      },
      avarage: {
        $avg: '$credit.balance'
      }
    }
  }
]).toArray())
