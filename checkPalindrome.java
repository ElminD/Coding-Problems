boolean solution(String inputString) {
    if(inputString.length() == 1) return true;
    
    int L = 0;
    int R = inputString.length() - 1;
    
    while(L < R){
        if(inputString.charAt(L) != inputString.charAt(R)) return false;
        
        L++;
        R--;
    }
    
    return true;
}
