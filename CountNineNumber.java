public class CountNineNumber{
  
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