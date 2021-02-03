function compareTriplets(a, b) {
    const score = [0, 0];

    for (let i = 0; i < 3; i++) {
        if (a[i] > b[i]) {
            score[0]++;
        } else if (b[i] > a[i]) {
            score[1]++;
        }
    }
    return score;
}