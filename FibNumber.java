import java.util.Scanner;
public class FibNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要求的数：");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) +fib(n-2);
    }
}