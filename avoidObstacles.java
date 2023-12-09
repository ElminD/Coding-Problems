int solution(int[] inputArray) {
    
    int jump = 2;
    
    for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i] % jump == 0){
            i = -1;
            jump++;
        }
    }
    
    return jump;
}
