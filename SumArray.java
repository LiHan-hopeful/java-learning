public class SumArray{
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,9,8,34,25,16,98,4,67};
        int result = sum(arr);  
        System.out.println(result);      
        } 
    public static int sum(int[] arr){
        int result = 0;
          for (int i=0;i<arr.length;i++){
               result +=arr[i] ;    
            }
            return result;
    }
}