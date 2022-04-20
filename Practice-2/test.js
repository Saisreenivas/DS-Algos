const axios = require('axios');
axios.interceptors.request.use(function (config) {

    config.metadata = { startTime: new Date() }
    return config;
}, function (error) {
    return Promise.reject(error);
});


axios.interceptors.response.use(function (response) {

    response.config.metadata.endTime = new Date()
    response.duration = response.config.metadata.endTime - response.config.metadata.startTime
    return response;
}, function (error) {
    error.config.metadata.endTime = new Date();
    error.duration = error.config.metadata.endTime - error.config.metadata.startTime;
    return Promise.reject(error);
});

async function delay(index, ms) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log(index);
            resolve({});
        }, ms);
    })
}

async function main() {
    // await delay(1000);
    // console.log('1 second');
    // await delay(3000);
    // console.log('3 second');
    // return;
    const endpointsTime = [5000, 1000, 3000, 200, 3000];

    const endpoints = [
        "https://testa.free.beeceptor.com/error",
        "https://api.coingecko.com/api/v3/exchange_rates",
        "https://testa.free.beeceptor.com/error",
        "http://www.7timer.info/bin/api.pl?lon=113.17&lat=23.09&product=astro&output=json",
        "https://api.agify.io/?name=bella",
        "https://archive.org/metadata/TheAdventuresOfTomSawyer_201303",
        "https://api2.binance.com/api/v3/ticker/24hr",
        "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita",
        "https://api.coinbase.com/v2/currencies",
        "https://api.coindesk.com/v1/bpi/currentprice.json"
    ];
    console.time('T');
    console.timeLog('T', "Will Execute the API calls.");
    // const promises = endpoints.map(each => axios.get(each).catch(error => Promise.resolve(false)));
    const promises = endpointsTime.map((each, index) => delay(index, each).catch(error => Promise.resolve(false)));

    console.timeLog('T', "Executed API Calls");

    for (let i = 0; i < endpointsTime.length; i++) {
        const result = await promises[i];
        console.log(i, result === false ? "" : result.duration);
        if (!result) {
            console.log("error")
        }
        console.timeLog('T', "awaited for the " + i + " th Promise");
    }

    console.timeEnd('T');
}

main();