import java.lang.*;

public class PrintNarcissisticNumber {
  
    public static void main(String[] args) {
        int ind = 0;
        int tend = 0;
        int hud = 0;
        for(int i = 100;i <= 999;i++){
            ind = i % 10;//取个位
            tend = i/10%10;//取十位
            hud  = i/100;//取百位
            if(i==Math.pow(ind,3)+Math.pow(tend,3)+Math.pow(hud,3)){
               System.out.println(i+"是水仙花数"); 
            }            
        }
    }       
}  
