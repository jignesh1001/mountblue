function toys(w) {
    // Write your code here
    w.sort((a,b) => a-b)
    let containerCount = 0;
    let currentContainerEnd = -1;
    
    for(let weight of w){
        if(weight > currentContainerEnd){
            containerCount++;
            currentContainerEnd = weight + 4;
        }
    }
   return containerCount;
}