/**
 temperatureEndpoints = [
  mostAccurate,
  lessAccurate,
  leastAccurate,
]


// Array contains temperature api endpoints sorted from the most accurate to the least accurate
// A get request returns the temperature, all the endpoints take some random time to return the temperature
// Todo: Display the best possible temperature to the user

**/

async function main() {
  const temperatureEndpoints = [
    mostAccurate, // 5000  // 0
    lessAccurate,          // 1000
    leastAccurate, // 2000 // 2000
    // 2000 // 3000       
  ]

  function timeout(func, seconds) {
    return Promise.resolve(setTimeout(func, seconds));
  }

  const promisesList = [temperatureEndpoints.map((each, index) => {
    return timeout(axios.get({ url: each, timeout: 30000 - (index * 1000) }), index * 1000)
      .catch(error => Promise.reject(false)
      );
  })]

  const responsesList = await Promise.any(promisesList);
  responsesList.forEach(each => {
  })
}

main();