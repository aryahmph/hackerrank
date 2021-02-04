function birthdayCakeCandles(candles) {
    // Only copy the function
    let count = 0, max = candles[0];

    for (let i = 0; i < candles.length; i++) {
        if (candles[i] > max) {
            max = candles[i];
            count = 1;
        } else if (candles[i] == max) {
            count++;
        }
    }
    return count;
}

let arr = [18, 90, 90, 13, 90, 75, 90, 8, 90, 43];
console.log(birthdayCakeCandles(arr))