public class ArrayHelper {
    public static String arrayString(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append('[');
        for(int i = 0; i < array.length - 1; i++){
            result.append(array[i]);
            result.append(',');
        }
        result.append(array[array.length - 1]);
        result.append(']');
        return result.toString();
    }
}
