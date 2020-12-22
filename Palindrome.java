public class Palindrome {
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length()-1;

        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Hello World"));
    }
}
