function migratoryBirds(arr) {
    const frequency = [0, 0, 0, 0, 0, 0];
    for (let i = 0; i < arr.length; i++) {
        frequency[arr[i] - 1]++;
    }
    let max = 0;
    let birdID = 0, birdID_1 = 0;
    for (let i = 0; i < frequency.length; i++) {
        if (frequency[i] > max) {
            max = frequency[i];
            birdID = i;
            birdID_1 = i;
        } else if (frequency[i] == max) {
            birdID_1 = i;
        }
    }
    return (birdID <= birdID_1) ? birdID + 1 : birdID_1 + 1;
}