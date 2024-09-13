boolean solution(int[] a, int[] b) {
    if(a.length != b.length) return false;
    
    int diff = 0;
    
    boolean result = false;
    
    for(int i = 0; i < a.length; i++){  
       if(a[i] != b[i]) diff++;
    }
    
    Arrays.sort(a);
    Arrays.sort(b);
    
   if(Arrays.equals(a, b)){
		if(diff <= 2) { result = true; 
		} else {result = false;}
	} else {
		result = false; 
		}           
	return result;
}
