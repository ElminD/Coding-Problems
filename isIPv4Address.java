boolean solution(String inputString) {
    String[] nums = (inputString.split("\\."));
    if(nums.length != 4) return false;

    try{
    for(String str : nums){
        if (Integer.parseInt(str) < 0 || 
        Integer.parseInt(str) > 255 || 
        str.isEmpty() || 
        (str.length() > 1 && str.charAt(0) == '0')) return false;
    }
    }
    catch(NumberFormatException e) {return false;}
    
    return true;
    
    
    
}
