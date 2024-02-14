
function equalizeArray(arr) {
    // Write your code here
    let frequency = {};
    let maxFrequency = 0;
    arr.forEach(num =>{
        frequency[num] = (frequency[num] || 0) + 1;
        maxFrequency = Math.max(maxFrequency,frequency[num]);
        
    })
    
    return arr.length - maxFrequency;
}

console.log(equalizeArray([1,22,3,11,1,3,3]))