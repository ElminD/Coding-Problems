// Write any import statements here

class Solution {
  
  public String getWrongAnswers(int N, String C) {
    // Write your code here
    String answer = "";
    for(char c: C.toCharArray()){
      if(c == 'A'){
        answer += 'B';
      }
      else{
        answer += 'A';
      }
    }
    return answer;
  }
  
}
