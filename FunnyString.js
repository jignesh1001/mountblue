
function funnyString(s) {
    // Write your code here
    let reversedString = s.split('').reverse().join('');
    let s_list = stringtoAscii(s);
    let s_rev_list = stringtoAscii(reversedString)
    
    if(arraysAreEqual(absoluteDiff(s_list),absoluteDiff(s_rev_list))) {
        return "Funny";
    }
    return "Not Funny";
}
function stringtoAscii(str){
    let asciiArray = []
    for(let i = 0;i<str.length;i++){
        asciiArray.push(str.charCodeAt(i))
    }
    return asciiArray;
}
function absoluteDiff(arr){
    let abs_diff = []
    for(let i = 0;i<arr.length-1;i++){
        abs_diff.push(Math.abs(arr[i+1] - arr[i]))
    }
    return abs_diff;
}

function arraysAreEqual(arr1,arr2){
    if(arr1.length !== arr2.length){
        return false;
    }
    for(let i = 0;i<arr1.length;i++){
        if(arr1[i] !== arr2[i]){
            return false;
        }
    }
    return true;
}