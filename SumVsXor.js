function sumXor(n) {
    // Write your code here
    let counter = 0;
    while(n > 0){
        if(n % 2 ===0){
            counter++;
        }
        n = Math.floor(n/2);
        
    }
     return 2 ** counter;
}