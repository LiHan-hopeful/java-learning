import java.util.Scanner;

public class LoginSimulation{
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