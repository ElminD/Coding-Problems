String[] solution(String[] picture) {
    String[] sol = new String[picture.length + 2];
    
    int maxlength = 0;
    
    for(int i = 0; i < picture.length; i++){
        maxlength = Math.max(maxlength , picture[i].length());
        
        sol[i+1] = "*" + picture[i] + "*";
        
    }
    
    String boarder = "";
    
    for(int j = 0; j < maxlength + 2; j++){
        boarder += '*';
    }
    
    sol[0] = boarder;
    sol[sol.length - 1] = boarder;
    
    return sol;
}
