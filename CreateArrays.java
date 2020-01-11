public class CreateArrays{
    public static void main(String[] args) {
        int[] arr=new int [100];
        init(arr);
        for(int i=0;i<100;i++){
             System.out.println(arr[i]);
        } 
    }
    public static int[] init(int[] arr){
          for (int i=0;i<100;i++){
              arr[i]=i+1;    
          }
           return arr;
    }
}