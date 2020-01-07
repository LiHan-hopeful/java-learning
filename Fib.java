import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数： ");
        int num1 = scanner.nextInt();
        System.out.println(fib(num1));
    }
    public static int fib(int n) {
        int last1 = 1;
        int last2 = 1;
        int cur = 0;
        for(int i = 3;i <= n;i++){
            cur = last1 + last2;
            last2 = last1;
            last1 = cur;
        }
        return cur;               
    }
}