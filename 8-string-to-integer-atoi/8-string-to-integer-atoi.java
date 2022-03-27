class Solution {
    public int myAtoi(String s) {
        
        int sign = 1;
        int res = 0;
        int start_index=0;
        while(start_index<s.length() && s.charAt(start_index)==' '){
            start_index++;
        }
        if(start_index<s.length() && s.charAt(start_index)=='+'){
            start_index++;
        }else if(start_index<s.length() && s.charAt(start_index)=='-'){
            sign*=-1;
            start_index++;
        }

        for(int i=start_index; i<s.length() && Character.isDigit(s.charAt(i)); i++){
            char c = s.charAt(i);
            int digit = c - '0';
             if(res>Integer.MAX_VALUE/10 ||
                    (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                return sign==1?Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res = res*10 + digit;

        }
        return res*sign;
        
    }
}