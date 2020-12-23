public class StringCompression {
    public static String compressString(String s1) {
        int index = 0;
        String result = "";
        while(index < s1.length()){
            int count = 1;
            char currentChar = s1.charAt(index);
            int index2 = index + 1;
            while(index2 < s1.length() && currentChar == s1.charAt(index2)){
                count++;
                index2++;
            }
            result += currentChar;
            result += count;
            index += count;
        }
        return result.length() <= s1.length() ? result : s1;
    }

    public static void main(String[] args) {
       System.out.println(compressString("aabcccccaaa"));
       System.out.println(compressString("abcdefghijklmnop"));
    }
}
