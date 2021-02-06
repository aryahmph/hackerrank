function breakingRecords(scores) {
    // Only copy the function
    let min = scores[0], max = min;
    const res = [0, 0];
    let i = 1, len = scores.length;

    while (i < len) {
        if (scores[i] > max) {
            res[0]++;
            max = scores[i];
        } else if (scores[i] < min) {
            res[1]++;
            min = scores[i];
        }

        i++;
    }

    return res;
}

const arr = [3, 4, 21, 36, 10, 28, 35, 5, 24, 42];
breakingRecords(arr);