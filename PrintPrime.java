import java.lang.*;

public class PrintPrime{
  
    public static void main(String[] args) {
        int num = 0;
        for(int i = 2;i <= 100;i++){
            for(num=2;num<=Math.sqrt(i);num++){
               if(i % num==0){
                 break;                
                }
            }    
            if(num>Math.sqrt(i)){
             System.out.println(i);
            }
        }       
    }  
}