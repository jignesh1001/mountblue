function sumXor(n) {
    let count = 0;
    // Count the number of zero bits in n
    while (n > 0) {
        if ((n & 1) === 0) {
            count++;
        }
        n >>= 1; // right shift n by 1 bit
    }
    // The number of possible i's is 2 to the power of the count of zero bits
    return 1 << count;
}