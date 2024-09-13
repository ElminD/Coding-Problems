int[] solution(int[] a) {
    
    int[] sol = new int[2];
    int one = 0;
    int two = 0;
    
    for(int i = 0; i < a.length; i += 2){
        if(i + 1 < a.length){
            two += a[i + 1];
        }
        one += a[i];
    }
    
    sol[0] = one;
    sol[1] = two;
    
    return sol;
}
