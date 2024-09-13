boolean solution(String inputString) {
    int[] alph = new int[26];
    int count = 0;
    
    for(char c : inputString.toCharArray()){
        alph[c - 97]++;
    }
    
    for(int i : alph){
        if(i % 2 != 0) count++;
    }
    
    return count <= 1;
}
