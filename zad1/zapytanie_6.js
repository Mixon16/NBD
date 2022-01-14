// 6. Dodaj siebie do bazy, zgodnie z formatem danych użytych dla innych osób (dane dotyczące karty kredytowej, adresu zamieszkania i wagi mogą być fikcyjne)
printjson(db.cwiczenia2.insert({
  sex: 'Male',
  first_name: 'Mikolaj',
  last_name: 'Szy',
  job: 'Student',
  email: 'miko@o2.pl',
  location: {
    city: 'Gdynia',
    address: { streetname: 'Fiołkowa', streetnumber: '111' }
  },
  description: "Dobry student",
  height: 190,
  weight: 90,
  birth_date: '1995-10-21T06:33:13Z',
  nationality: 'Poland',
  credit: [
    {
      type: 'mastercard',
      number: '6900112000004356',
      currency: 'PLN',
      balance: '2000'
    }
  ]
}))
