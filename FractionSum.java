public class FractionSum{
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