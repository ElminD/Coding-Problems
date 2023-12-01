public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    int tallest = 0;
    for(int i = 0; i < word.length(); i++){
        char c = word.charAt(i);
        if(h.get(c - 'a') > tallest){
            tallest = h.get(c - 'a');
        }
    }
    
    return tallest * word.length();
    }

}