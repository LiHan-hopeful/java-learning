public class PrintArray{
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,9,8,34,25,16,98,4,67};
        printArray(arr);        
        } 
    public static void printArray(int[] arr){
          for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);    
            }
    }
}