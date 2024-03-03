function isK(n) {
    const digits = `${n * n}`.split('');
    const len = digits.length;
    const d = Math.ceil(len / 2);

    return n === +`${digits.slice(0, len - d).join('')}` +
        +`${digits.slice(-d).join('')}`;
}

function kaprekarNumbers(p, q) {
    const ret = [];
    while (p <= q) {
        if (isK(p)) {
            ret.push(p);
        }
        p++;
    }

    ret.length === 0 ?
        console.log('INVALID RANGE') :
        console.log(ret.join(' '));
}