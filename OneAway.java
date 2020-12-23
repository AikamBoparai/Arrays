public class OneAway {
    public static boolean oneEditAway(String s1, String s2) {
        int difference = Math.abs(s1.length() - s2.length());
        if(difference > 1){
            return false;
        }

        else if(difference == 0){
            int numEdits = 0;
            int index = 0;
            while(index < s1.length() && index < s2.length()){
                if(s1.charAt(index) != s2.charAt(index)){
                    numEdits++;
                }
                index++;
            }

            return numEdits <= 1;
        }
        else{ //When the difference is one
            int numEdits = 0;
            //rearrange the strings so we know which is larger
            String larger = s1.length() > s2.length() ? s1 : s2;
            String smaller = s1.length() > s2.length() ? s2 : s1;
            int index1 = 0;
            int index2 = 0;

            while(index1 < larger.length() && index2 < smaller.length()){
                if(larger.charAt(index1) != smaller.charAt(index2)){
                    index1++;
                    numEdits++;
                }
                else{
                    index1++;
                    index2++;
                }
            }

            return numEdits <= 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "ple"));
        System.out.println(oneEditAway("pales", "pale"));
        System.out.println(oneEditAway("pale", "bale"));
        System.out.println(oneEditAway("pale", "bae"));
    }
}
