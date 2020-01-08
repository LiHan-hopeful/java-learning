import java.util.Scanner;

public class TestAdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个整数： ");
		int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result1 = add(num1,num2);
        System.out.println(result1);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入三个小数： ");
        double number1 = scanner2.nextDouble();
        double number2 = scanner2.nextDouble();
        double number3 = scanner2.nextDouble();
        double result2 = add(number1,number2,number3);
        System.out.println(result2);	
    }
    public static int add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static double add(double num1,double num2,double num3){
        double sum = num1 + num2 + num3;
        return sum;
    }
}