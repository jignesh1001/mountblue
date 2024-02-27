
function stringConstruction(s) {
    // Write your code here
    let str = '';
    let count = 0;
    for(let i = 0;i< s.length;i++){
        if(!(str.includes(s[i]))){
            count++;
        }
        str += s[i];
    }
    return count;
}