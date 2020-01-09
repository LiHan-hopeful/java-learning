import java.util.Scanner;
public class NumberSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个非负整数：");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n  < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}