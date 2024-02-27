
function palindromeIndex(s) {
    // Write your code here
   for(let i = 0;i<Math.floor(s.length/2);i++){
       if(s[i] !== s[s.length - i - 1]){
           const s1 = s.slice(i + 1,s.length -i)
           const s2 = s1.split("").reverse().join("")
           if(s1 === s2) return i
           else return s.length - i - 1
       }
   }
    return -1;
}

function driver(){
    let test = palindromeIndex("abcd")
    console.log(test)
}