public class AvgArray{
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,9,8,34,25,16,98,4};
        double result = avg(arr);  
        System.out.println(result);      
        } 
    public static double avg(int[] arr){
        double result = 0;
          for (int i=0;i<arr.length;i++){
               result +=arr[i] ;    
            }
            result = result/arr.length;
            return result;
    }
}