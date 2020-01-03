import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();     
        Print(num);
    }
    public static void Print(int num) {
        if (num > 9) {
            Print(num / 10);
        }
        System.out.print(num % 10 + " ");     
    }
}