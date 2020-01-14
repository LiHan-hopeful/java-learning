public class ArraysCopy{
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,9,8,34,25,16,98,4};  
        System.out.println(toString(arr));  
        System.out.println(toString(copyOf(arr)));    
        } 
    public static String toString(int[] arr){
        String ret = "[";
        for(int i = 0; i < arr.length;i++){
            ret += arr[i];
            if(i != arr.length - 1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    } 
    public static int[] copyOf(int[] arr){
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            ret[i] = arr[i];
            }
        return ret;
    } 
}