import java.util.Scanner;

public class PrintFactor{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = scanner.nextInt();
      int i = 0;
      int sum = 0;
      for(i = 1;i <= n;i ++){
          int ret = factor(i);
          sum += ret;
      }
      System.out.println("sum =" + sum);
     }
        public static int factor(int n){
            if(n == 1){
                return 1;
            }
            return n * factor(n-1);
        }
}