boolean solution(int n) {
    String s = Integer.toString(n);
    int first = 0;
    int second = 0;
    for(char c : String.valueOf(s.substring(0, s.length()/ 2)).toCharArray()){
        first += Character.getNumericValue(c);
    }
    for(char c : String.valueOf(s.substring(s.length()/ 2, s.length())).toCharArray()){
        second += Character.getNumericValue(c);
    }

    if(first == second) return true;
    
    return false;
}
