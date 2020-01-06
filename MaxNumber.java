import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个整数： ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int result = max3(num1,num2,num3);
		System.out.println("result = " + result);

	}
    public static int max2(int x,int y) {
    	if (x > y) {
    		return x;
    	}else if(x == y) {
    		return x;
    	}else {
    		return y;
    	}
    }
    public static int max3(int num1,int num2,int num3) {
    	int result1 = max2(num1,num2);
    	int result2 = max2(num1,num3);
    	if(result1 < result2) {
    		return result2;
    	}
    	return result1;
    }
}