import java.util.Scanner;

public class PrintBinarySequence{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt(); 
        int i = 0;
        System.out.println("奇数序列为：");
        for( i=31;i>=0;i-=2) {
            System.out.print((num>>i) & 1 );
        } 
        System.out.println();
        System.out.println("偶数序列为：");
        for( i=30;i>=0;i-=2) {
            System.out.print((num>>i) & 1);
        } 
        System.out.println();
    }
}