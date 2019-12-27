import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int toGuess = random.nextInt(101);
        while(true){       
        System.out.println("请输入一个数（1到100）：");
        int num = scanner.nextInt(); 
        if(num<toGuess){
            System.out.println("低了！");
        } else if(num>toGuess){
            System.out.println("高了！");
        } else {
            System.out.println("猜对了！");
            break;
        }
        }
    }
}