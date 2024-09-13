int solution(String s1, String s2) {
    
    char[] one = s1.toCharArray();
    char[] two = s2.toCharArray();
    Arrays.sort(one);
    Arrays.sort(two);
    
    int count = 0;
    
    for(int i = 0; i < one.length; i++){
	        for(int j = 0; j < two.length; j++){
	            if(one[i]==two[j]){
	                count++;
	                one[i] = ' ';
	                two[j] = ' ';
	                break;
	            }
	        }
	    }
    
    return count;
}
