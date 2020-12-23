public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length() && s1.length() > 0){
            return false;
        }
        else{
            String combination = s1 + s1;
            if(combination.contains(s2)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("waterbottle", "watebottler"));
    }
}
