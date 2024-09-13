int[] solution(int[] a) {
    
    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a.length; j++){
            if(a[i] == -1){
                break;
            }
            else if(a[i] < a[j]){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    
    return a;
}
