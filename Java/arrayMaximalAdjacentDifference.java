int solution(int[] inputArray) {
    int maxDiff = Integer.MIN_VALUE;
    
    for(int i = 1; i < inputArray.length; i++){
        maxDiff = Math.max(maxDiff, Math.abs(inputArray[i - 1] - inputArray[i]));
    }
    
    return maxDiff;
}
