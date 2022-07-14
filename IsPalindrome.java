public class IsPalindrome {


    public static boolean isPalindrome(String text){
        int len = text.length();
        for(int i = 0; i < len/2; i++){
            if(text.charAt(i) != text.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
