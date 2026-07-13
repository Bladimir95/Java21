public class ValidPalindrome {
    public static boolean palindrome(String phrase){
        int left = 0;
        int right = phrase.length()-1;
        while (left < right){
            if(!Character.isLetterOrDigit(phrase.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(phrase.charAt(right))){
                right--;
                continue;
            }

            if(Character.toLowerCase(phrase.charAt(left)) != Character.toLowerCase(phrase.charAt(right))){
                left++;
                right--;
                return false;
            }

        }


        return true;
    }
}
