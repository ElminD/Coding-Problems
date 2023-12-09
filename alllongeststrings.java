String[] solution(String[] inputArray) {
    ArrayList<String> sol = new ArrayList<String>();
    int max = 0;
    for(String s : inputArray){
        if(s.length() > max){
            sol.clear();
            max = s.length();
            sol.add(s);
            
        }
        else if(s.length() == max){
            max = s.length();
            sol.add(s);
            
        }
    }
    
    String[] answer = new String[sol.size()];
    answer = sol.toArray(answer);
    return answer;
}
