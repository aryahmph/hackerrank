function diagonalDifference(arr) {
    let result = 0;

    let left = 0, right = 0;
    let iLeft = 0, iRight = arr.length - 1;

    while (iLeft < arr.length) {
        left += arr[iLeft][iLeft];
        right += arr[iLeft][iRight];

        iLeft++;
        iRight--;
    }

    result = left - right;
    return (result > 0) ? result : -result;
}

