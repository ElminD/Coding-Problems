int solution(int[] inputArray) {
    int maxProduct = Integer.MIN_VALUE;
    
    for(int i = 0; i < inputArray.length; i++){
        if(i+1 < inputArray.length){
            maxProduct = Math.max(maxProduct, inputArray[i] * inputArray[i+1]);
        }
    }
    
    return maxProduct;
}
