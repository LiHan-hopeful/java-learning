import java.util.Scanner;
public class FactorTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要求阶乘的数：");
        int n = scanner.nextInt();
        int result = 1;
        for(int i = 1;i <= n;i++){
            result  *= i;
        }
        System.out.println(result);
    }
}