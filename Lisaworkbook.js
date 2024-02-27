function workbook(n, k, arr) {
    let count = 0;
    let pageNumber = 1; // Initialize the page number

    for (let i = 0; i < n; i++) {
        let problems = arr[i]; // Get the number of problems in the chapter

        // Loop through each problem in the chapter
        for (let problem = 1; problem <= problems; problem++) {
            // If the current problem number matches the page number, increment the count
            if (problem === pageNumber) {
                count++;
            }

            // If the current problem is the last problem in the chapter or it's a multiple of k,
            // increment the page number
            if (problem === problems || problem % k === 0) {
                pageNumber++;
            }
        }
    }

    return count;
}
