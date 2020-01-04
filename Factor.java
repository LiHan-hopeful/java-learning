import java.util.Scanner;

public class Factor{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt(); 
        int result = factor(num);
        System.out.println(num + "的阶乘是 ：" + result);
     }
        public static int factor(int n){
            if(n == 1){
                return 1;
            }
            return n * factor(n-1);
        }
}