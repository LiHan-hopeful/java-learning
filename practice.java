import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个年龄（整数）：");
        int age = scanner.nextInt();
        if(age <= 18) {
            System.out.println("少年！");
        } else if(age <= 28) {
            System.out.println("青年！");
        } else if(age <= 55) {
            System.out.println("中年！");
        } else {
            System.out.println("老年！");
        }
    }
}


import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请您输入一个整数：");
            int num = scanner.nextInt();
            boolean flag = true;
            for(int i=2;i*i<=num;i++){
                if(num % i==0){
                    flag = false;
                }
            }
            if(flag==false){
                System.out.println(num +"不是素数");
            }else{
                System.out.println(num +"是素数");
            }
        }
}


public class test {
        public static void main(String[] args) {
            int num = 0;
            for(int i = 2; i <= 100; i++){
                for( num = 2; num < Math.sqrt(i); num++){
                    if(i % num == 0){
                        break;
                    }
                }
                if(num > Math.sqrt(i)){
                    System.out.println(i);
                }
            }
        }
}



public class test{
  
    public static void main(String[] args) {
        int year = 0;
        for(year = 1000;year <= 2000;year++){
            if (year % 100 == 0) {               
                if (year % 400 == 0) {
                   System.out.println(year+"是闰年");
                } 
            }  else {
                      if (year % 4 == 0) {
                         System.out.println(year+"是闰年");            
                        }       
                }        
        }
    }
}


public class test{
    public static void main(String[] args) {
        System.out.println("打印乘法表：");
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j+"*"+i+"="+i*j+"   ");
            }
            System.out.println("\n");
        }
    }
}


import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入两个整数：");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int i = num1 % num2;
            while(i != 0){
                num1 = num2;
                num2 = i;
                i = num1 % num2;
            }
            System.out.println("两个数的最大公约数为:" + num2);
        }
}



public class test {
        public static void main(String [] args){
            double sum = 0;
            double tmp = 0;
            double flag = 1.0;
            for (int i = 1; i <= 100; i++) {
                tmp = flag / i;
                flag *= -1;
                sum += tmp;
            }
            System.out.println(sum);
        }
}
