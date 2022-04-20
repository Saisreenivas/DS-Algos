
const userids = [0, 1, 2];
async function sendNotification(userid) {
    console.log(userid)
    switch (userid) {
        case 1:
            return new Promise((resolve, reject) => setTimeout(() => reject(), 100));
        case 2:
            return new Promise((resolve, reject) => setTimeout(() => resolve(), 100));
        default:
            return new Promise((resolve, reject) => setTimeout(() => resolve(), 100));
    }
}
// const users = [Promise.resolve(0),Promise.resolve(1),Promise.resolve(2)];

async function delay(func, userid, ms) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            // console.log(index);
            resolve(func(userid));
        }, ms);
    })
}

async function main() {
    console.time('T');
    const promises = userids.map(
        userid => sendNotification(userid).catch(error => {
            return delay(sendNotification, userid, 1000).catch(error => {
                return delay(sendNotification, userid, 2000).catch(error => {
                    console.log("error " + userid)

                })
            })
        }).finally(() => {
            console.log('processed ' + userid);
            console.timeLog('T', "time taken to process " + userid);
        }
        )
    );

    console.timeLog('T', "Will Execute the Promise.AllSetteled API call.");

    await Promise.allSettled(promises);

    console.timeLog('T', "Executed all the Promises.");
    console.timeEnd('T');

}

main();