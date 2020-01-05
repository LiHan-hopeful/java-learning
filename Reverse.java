import java.util.Arrays;
public class Reverse{
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 8, 9, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}