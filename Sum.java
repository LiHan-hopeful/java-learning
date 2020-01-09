import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要求的数：");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}