// 10. Usuń u wszystkich osób o zawodzie „Editor” własność „email”
printjson(db.cwiczenia2.update(
  {"job": "Editor"},
  {
    $unset: {
      "email": true
    }
  },
  {"multi": true}
))
