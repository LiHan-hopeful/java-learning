import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        boolean flag = true;
        for(int i=2;i*i<=num;i++){
            if(num % i==0){
                flag = false;                
            }
        }    
        if(flag==false){
            System.out.println(num +"不是素数");
        }else{
            System.out.println(num +"是素数");
        }             
    }
}