import java.util.Arrays;
public class ArrayExchange {
    public static void main(String[] args) {
        int[] arr1={9,5,2,7};
        int[] arr2={1,2,3,4};
        for(int i = 0;i < arr1.length;i++){
            int tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }  
        System.out.println("a :"+ Arrays.toString(arr1));
        System.out.println("b :"+ Arrays.toString(arr2));
    }
}

