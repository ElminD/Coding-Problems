class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 1;
        int qtr = arr.length / 4;
        int prev = arr[0];

        for(int i = 0; i < arr.length; i++){
            if( prev == arr[i]) count++;
            else count = 1;

            if(count > qtr) return arr[i];

            prev = arr[i];
        }

        return prev;

    }
}