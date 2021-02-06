function birthday(s, d, m) {
    let res = 0;
    let temp = 0;

    for (let i = 0; i < s.length; i++) {
        temp = 0;
        try {
            for (let j = i; j < m + i; j++) {
                temp += s[j];
            }
        } catch (error) {
            break;
        }
        if (temp == d) res++;
    }

    return res;
}