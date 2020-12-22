import java.util.HashSet;
public class IsUnique {
    public static boolean isUniqueExtraSpace(String input) {
        //use a hashset to keep track of the elements
        //O(n) time, O(n) space 
        HashSet<Integer> buf = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            if(buf.contains((int)input.charAt(i))){
                return false;
            }
            else{
                buf.add((int)input.charAt(i));
            }
        }
        return true;
    }

    public static boolean isUniqueLessSpace(String input) {
        //if Unicode the array size would need to be 256 but let's assume it's ASCII so 128 characters
        //O(n) time, O(1) space could argue O(1) time since the string can never have more than 128 unique characters
        if(input.length() > 128){
            return false;
        }

        int[] buffer = new int[128];

        for(int i = 0; i < input.length(); i++){
            buffer[(int)input.charAt(i)]++;
        }

        for(int i = 0; i < input.length(); i++){
            if(buffer[(int)input.charAt(i)] > 1){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "abcdea"; //not unique
        String input2 = "abcdefghijklmnopqrstuvwxyz1234567890@#$%^&*()"; //unique
        System.out.println(isUniqueExtraSpace(input));
        System.out.println(isUniqueExtraSpace(input2));
        System.out.println(isUniqueLessSpace(input));
        System.out.println(isUniqueLessSpace(input2));
    }
}
