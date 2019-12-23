import java.util.Scanner;

public class PrintAge {
    public static void main(final String[] args) {
     Scanner scanner=new Scanner(System.in);
      System.out.println("请输入一个年龄");
      int Age=scanner.nextInt();
      if(Age<=18){
          System.out.println("少年");         
      }else if(Age<=28)
      System.out.println("青年");
      else if(Age<=55)
      System.out.println("中年"); 
      else
      System.out.println("老年");
    }
}