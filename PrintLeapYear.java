public class PrintLeapYear{
  
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