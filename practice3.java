import java.util.Scanner;

public class test {
    public static void print(int num){
        if(num > 9){
            print(num / 10);
        }
        System.out.println(num % 10);
    }
//    public static int sum(int num){
//        if(num == 1){
//            return 1;
//        }
//        return num + sum(num - 1);
//    }

    public static int sum(int num){
        if(num < 10){
            return num;
        }
        return num/10 + sum(num % 10);
    }

    public static int factor(int num){
        if(num == 1){
            return 1;
        }
        return num * factor(num - 1);
    }

    public static int fib(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void hanoi(int n,char A,char B,char C) {
        if(n==1) {
            move(A,C);
        }else {
            hanoi(n-1,A,C,B);
            move(A,C);
            hanoi(n-1,B,A,C);
        }
    }
    public static void move(char A,char B) {
        System.out.println("move"+A+"->"+B);
    }

    public static int fun(int n){
        if(n <= 2){
            return n;
        }
        return fun(n-1) +fun(n-2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num1 = scanner.nextInt();
        //System.out.println(fib(num1));
        System.out.println(factor(num1));
    }
    }