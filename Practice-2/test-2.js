
const userids = [0, 1, 2];
async function sendNotification(userids) {

}
// const users = [Promise.resolve(0),Promise.resolve(1),Promise.resolve(2)];

const promises = userids.map(userid => sendNotification(userid));

const results = await Promise.allSettled(promises);

const failedUsers = [];
results.forEach((each, index) => {
    if (each.status == "rejected") {
        failedUsers.push(userids[index])
    }
})

await delay(1000);
const promises = failedUsers.map(userid => sendNotification(userid));

const results = await Promise.allSettled(promises);

const failedUsers = [];
results.forEach((each, index) => {
    if (each.status == "rejected") {
        failedUsers.push(userids[index])
    }
})

await delay(2000);
const promises = failedUsers.map(userid => sendNotification(userid));

const results = await Promise.allSettled(promises);

const failedUsers = [];
results.forEach((each, index) => {
    if (each.status == "rejected") {
        failedUsers.push(userids[index])
    }
})

console.log(failedUsers);