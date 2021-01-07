import java.util.HashMap;
class RunningSum{
    static int getRunningSum(int[]array, int targetSum){
        HashMap<Integer,Integer> runningSums = new HashMap<Integer,Integer>();
        int total = 0;
        int runningSum = 0;
        for (int element : array) {
            runningSum += element;
            if(runningSums.containsKey(runningSum-targetSum)){
                total += runningSums.getOrDefault(runningSum-targetSum, 0);
            }
            incrementHashMap(runningSums, runningSum, 1);
        }
        return total;
    }
    static void incrementHashMap(HashMap<Integer,Integer> table, int key, int value){
        int bucket = table.getOrDefault(key, 0) + value;
        if(bucket == 0){
            //just remove to save space
            table.remove(key);
        }
        else{
            table.put(key, bucket);
        }
    }

    public static void main(String[] args) {
        int[] array = {10,5,1,2,-1,-1,7,1,2};
        System.out.println(getRunningSum(array,8));
    }
}