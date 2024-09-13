// Write any import statements here
import java.util.*;  
import java.util.stream.Collectors;  

class Solution {
  
  public double getHitProbability(int R, int C, int[][] G) {
    // Write your code here
    double count = 0;
    
    for(int[] intArr : G){
      for(int i: intArr){
         if(i == 1){
        count++;
      }
      }

    }
    double result = count / ((double)R*(double)C);
    
    return result;
  }
  
}
