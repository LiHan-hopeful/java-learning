public class FindNumber{
    public static void main(String[] args) {
        int[] arr = {1,1,5,5,7,8,8,9,9}; 
       int result = findSingleNum(arr);
       System.out.println(result);
    }
    public static int findSingleNum(int[] arr){
        int ret = arr[0];
        for(int i = 1;i<arr.length;i++){
            ret ^= arr[i];
        }
        return ret;
    }
}