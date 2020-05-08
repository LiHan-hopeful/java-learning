public class test{
    public static void main(String[] args) {
        int count = 0;
        for(int i=0;i <= 100;i++){
            if(i%10==9){
                count++;
            }//统计个位为9的次数
             if(i/10==9){
                count++;
            }//统计十位为9的次数                   
        }
        System.out.println("数字9出现的次数："+count);
    }           
}


public class test {
  
    public static void main(String[] args) {
        int ind = 0;
        int tend = 0;
        int hud = 0;
        for(int i = 100;i <= 999;i++){
            ind = i % 10;//取个位
            tend = i/10%10;//取十位
            hud  = i/100;//取百位
            if(i==Math.pow(ind,3)+Math.pow(tend,3)+Math.pow(hud,3)){
               System.out.println(i+"是水仙花数"); 
            }            
        }
    }       
}  



import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        System.out.println("欢迎进入登录系统，您有三次机会输入密码！");
        for(int i=1;i<=3;i++){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            if("888888".equals(password)){
                System.out.println("登陆成功！");
                break;
            }else{
                System.out.println("密码错误，您还有"+(3-i) + "次机会！");
            }
        }
        
    }
}

import java.util.Scanner;

public class test {
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


import java.util.Scanner;

public class test{
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


import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入一个整数：");
    int num = scanner.nextInt();   
    Print(num);
  }
  public static void Print(int num) {
    if (num > 9) {
      Print(num / 10);
    }
    System.out.print(num % 10 + " ");   
  }
} 


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