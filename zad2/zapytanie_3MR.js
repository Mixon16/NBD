// 3. Listę unikalnych zawodów
printjson(db.cwiczenia2.mapReduce(
  function () {
    emit(this.job, null);
  },
  function (key, values) {
    return 1;
  },
  {
    out: 'jobs'
  }
).results)
