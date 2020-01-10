import java.util.*;
public class Hanoi{ 
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要求的n的数：");
        int n=scanner.nextInt();   
        System.out.println("移动步骤如下：");
        hanoi(n,'A','B','C');
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
}