function sockMerchant(n, ar) {
    let ans = 0;
    ar.sort((a, b) => a - b);

    let i = 0;
    while (i < n - 1) {
        if (ar[i] === ar[i + 1]) {
            ans++;
            i += 2;
        } else {
            i++;
        }
    }
    return ans;
}