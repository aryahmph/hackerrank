function timeConversion(s) {
    let hh = parseInt(s.substr(0, 2));
    const format = s.substr(s.length - 2, s.length);

    if (format === 'AM') {
        hh = (hh === 12) ? `${hh - 12}0` : `0${hh}`;
    } else if (format === 'PM') {
        hh = (hh === 12) ? hh : hh + 12;
    }

    return `${hh}${s.substr(2, s.length - 4)}`;

}

console.log(timeConversion('06:40:03AM'));