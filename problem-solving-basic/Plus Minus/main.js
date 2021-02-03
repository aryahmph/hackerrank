function plusMinus(arr) {
    let minus = 0, postive = 0, zero = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            postive++;
        } else if (arr[i] < 0) {
            minus++;
        } else {
            zero++;
        }
    }
    postive /= arr.length;
    minus /= arr.length;
    zero /= arr.length;

    console.log(postive.toFixed(6));
    console.log(minus.toFixed(6));
    console.log(zero.toFixed(6));
}


