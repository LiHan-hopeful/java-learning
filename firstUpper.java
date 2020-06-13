public class test {
    public static void main(String[] args) {
        System.out.println(firstUpper("yuisama"));
        System.out.println(firstUpper(""));
        System.out.println(firstUpper("a"));
    }
    public static String firstUpper(String str) {
        if ("".equals(str)||str==null) {
            return str ;
        }
        if (str.length()>1) {
            return str.substring(0, 1).toUpperCase()+str.substring(1) ;
        }
        return str.toUpperCase() ;
    }
}