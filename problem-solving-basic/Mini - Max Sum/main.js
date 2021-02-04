function miniMaxSum(arr) {
    let sum = 0, min = arr[0], max = min;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        } else if (arr[i] > max) {
            max = arr[i];
        }
        sum += arr[i];
    }
    min = sum - min;
    max = sum - max;

    console.log(`${max} ${min}`);
}