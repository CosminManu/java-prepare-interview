package multipleChoice;

public class q18 {
    public static void main(String[] args) {
        char ch;
        String test1 = "abcd";
        String test2 = new String("abcd");

        if (test2.equals(test1)) {
            if (test2 == test1) {
                ch = test2.charAt(0);
            } else {
                ch = test2.charAt(1);
            }
        }else {
            if(test2 == test1) {
                ch = test2.charAt(2);
            } else {
                ch = test2.charAt(3);
            }
        }
        System.out.println(ch);
    }
}

/*
* What char gets printed in the console?
* a) 'a'
* -> b) 'b'
* c) 'c'
* d) 'd'
*
* .equals() verifies if the content of the 2 strings are the same
* == verifies if the 2 string variables are same mem location
* */
