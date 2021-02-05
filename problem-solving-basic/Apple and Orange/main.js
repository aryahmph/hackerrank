function countApplesAndOranges(s, t, a, b, apples, oranges) {
    let orgCount = 0, appCount = 0;

    apples.forEach(el => { if (el + a >= s && el + a <= t) appCount++ });
    oranges.forEach(el => { if (el + b >= s && el + b <= t) orgCount++ });

    console.log(appCount);
    console.log(orgCount);
}