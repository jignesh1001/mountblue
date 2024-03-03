function angram (s1,s2){
    if(asciiSum(s1) == asciiSum(s2)){
        return "Angram"
    }
    else{
        return "Not Angram"
    }
}

function asciiSum(str){
    let asciiSumCount = 0;
    for(let i = 0;i< str.length;i++){
        asciiSumCount += str.charCodeAt(i);
    }
    return asciiSumCount
}

let s1 = "aaxa*&&"
let s2 = "aaax&*&"

console.log(angram(s1,s2))