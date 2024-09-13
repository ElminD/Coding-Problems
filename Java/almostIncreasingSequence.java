boolean solution(int[] sequence) {
    int count = 0;
    
    for(int i = 1; i < sequence.length; i++){
        if(sequence[i - 1] >= sequence[i]){
            count++;
            
        }
        if(count > 1) return false;
        
         if (i - 1 >= 0 && i + 2 <= sequence.length - 1
		       && sequence[i] - sequence[i+2] >= 0
		       && sequence[i-1] - sequence[i+1] >= 0) {
		              return false;
		}
    }
    
    return true;
}
