class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> l1= new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                l1.add(s.charAt(i));
            }
        }
        int j = l1.size()-1;
        for(int i = 0; i< l1.size();i++){
            if(i>=j){
                break;
            }
            if(l1.get(i)!=l1.get(j)){
                return false;
            }
            j--;
        }
        return true;
        
    }
}