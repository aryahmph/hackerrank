function bonAppetit(bill, k, b) {
    let total = (bill.reduce((num, current) => num + current) - bill[k]) / 2;
    console.log(((total === b) ? 'Bon Appetit' : b - total));
}
