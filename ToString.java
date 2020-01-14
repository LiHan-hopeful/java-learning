public class ToString{
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,9,8,34,25,16,98,4};  
        System.out.println(toString(arr));      
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
}