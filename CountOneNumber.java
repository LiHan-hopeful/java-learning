import java.util.Scanner;

public class CountOneNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        int count = 0;
        while(num>0) {
            num = num & (num-1);
            count ++;                   
        }
    System.out.println("转换成二进制1的个数为：" + count);
    }
}