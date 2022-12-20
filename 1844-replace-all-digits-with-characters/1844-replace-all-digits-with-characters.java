class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder("");
     
        for( int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
              int add =(s.charAt(i)-'0')+s.charAt(i-1);
                char ch =(char)add;
                sb.append((char)ch);   
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}