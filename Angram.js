function anagram(s){
    if(s.length%2 !== 0){
        return -1;
    }
    const halfLength = s.length / 2;
    const s1 = s.slice(0,halfLength)
    const s2 = s.slice(halfLength)
    
    const charCount = new Array(26).fill(0)
    
    for(let i = 0;i < halfLength;i++){
        charCount[s1.charCodeAt(i) - 'a'.charCodeAt(0)]++
    }
    for(let i = 0;i < halfLength;i++){
        charCount[s2.charCodeAt(i) - 'a'.charCodeAt(0)]--
    }
    console.log(charCount)
    return charCount.reduce((acc,curr) => acc + Math.abs(curr),0)/2
}

console.log(anagram("fdhlvosfpafhalll"))