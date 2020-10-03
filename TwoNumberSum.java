import java.util.HashSet;

public class TwoNumberSum extends ArrayHelper{

    public static int[] twoNumberSumUnsorted(int[] array, int targetSum) {
        //will need to use a hashset
        HashSet<Integer> buffer = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            if(buffer.contains(array[i])){
                return new int[]{array[i], targetSum-array[i]};
            }
            else{
                buffer.add(targetSum-array[i]);
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumSorted(int[] array, int targetSum) {
        // use two pointers left and right which iterate through the array
        //if sum is bigger than target move the right pointer to the left to decrease the sum
        //if sum is less than target move the left pointer to the right to increase the sum

        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int currentSum = array[left] + array[right];
            if(currentSum < targetSum){
                left++;
            }
            else if(currentSum > targetSum){
                right--;
            }
            else{
                return new int[]{array[left], array[right]};
            }
        }
        return new int[0];

    }

    public static void main(String[] args) {
        //lets use 3 sorted arrays
        int[] array1 = {1,4,7,32,45,51,52,90,98,100};
        int[] array2 = {Integer.MIN_VALUE,-4,3,5,19,30,45, Integer.MAX_VALUE};
        int[] array3 = {2,4,4,6,7,99,102,110};

        System.out.println(arrayString(array1) + " Target Sum: " + 96 + " result: " + 
        arrayString(twoNumberSumSorted(array1, 96)));
        System.out.println(arrayString(array2) + " Target Sum: " + 49 + " result: " + 
        arrayString(twoNumberSumSorted(array2, 49)));
        System.out.println(arrayString(array3) + " Target Sum: " + 108 + " result: " + 
        arrayString(twoNumberSumSorted(array3, 108)));

        //unsorted array
        int[] array4 = {1000, 4, -1 , 6 -99, -1000};

        System.out.println(arrayString(array4) + " Target Sum: " + 0 + " result: " + 
        arrayString(twoNumberSumUnsorted(array4, 0)));
    }
}