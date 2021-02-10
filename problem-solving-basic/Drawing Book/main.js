function pageCount(n, p) {
    const firstPage = Math.ceil((p - 1) / 2);
    let lastPage = 0;
    if (n % 2 == 0) {
        lastPage = Math.ceil((n - p) / 2);
    } else {
        lastPage = Math.floor((n - p) / 2);
    }
    return (firstPage < lastPage) ? firstPage : lastPage;
}