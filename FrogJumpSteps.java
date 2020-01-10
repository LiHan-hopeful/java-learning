import java.util.Scanner;
public class FrogJumpSteps{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要求的n的数：");
        int n = scanner.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n <= 2){
            return n;
        }
        return fun(n-1) +fun(n-2);
    }
}