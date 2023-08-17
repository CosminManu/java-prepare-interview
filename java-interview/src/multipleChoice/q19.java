package multipleChoice;

public class q19 {
    public static void main(String[] args) {
        String x = "hello";
        System.out.println(x.length());
//        System.out.println(x.length);   //Cannot resolve symbol 'length'
//        System.out.println(x.size);      //Cannot resolve symbol 'size'
//        System.out.println(x.size());       //Cannot resolve method 'size' in 'String'
        System.out.println(x.substring(1, 3));
    }
}
