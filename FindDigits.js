function findDigits(n) {
    // Write your code here
    let count = 0;
    var n_str = n.toString();
    for(let i = 0;i <n_str.length ;i++){
        if(n % n_str[i] == 0){
            count++;
        }
    }
    return count;
}