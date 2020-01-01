import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,1,5,7,6,12,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int bound = 0; bound <= arr.length;bound++) {
            for(int cur = arr.length-1;cur > bound;cur--) {
                if(arr[cur-1] > arr[cur]){
                    int tmp = arr[cur-1];
                    arr[cur-1] = arr[cur];
                    arr[cur] = tmp;
                }           
            }  
        }
    }
}