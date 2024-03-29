int solution(int[] inputArray) {
    int moves = 0;
    
    for(int i = 1; i < inputArray.length; i++){
        if(inputArray[i-1] >= inputArray[i]){
            int diff = Math.abs(inputArray[i-1] - inputArray[i]) + 1;
            inputArray[i] += diff;
            moves += diff;
        }
    }
    
    return moves;
}
