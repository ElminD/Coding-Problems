class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] values = new int[2];
        int j = numbers.length - 1;
        int i = 0;
        while(i < j){

            if(numbers[i] + numbers[j] == target){
            System.out.println(numbers[i]);
            System.out.println(numbers[j]);
                    values[0] = i += 1;
                    values[1] = j += 1;
              break;
            }
            if(numbers[i] + numbers[j] < target){
             i++;
             continue;
            }
            j--;
        }
      return values;
    }
}