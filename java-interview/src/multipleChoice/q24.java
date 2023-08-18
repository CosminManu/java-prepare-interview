package multipleChoice;

public class q24 {
    public static void main(String[] args) {
        int x = 0;
        for(; x < 5; x+=3) {
            System.out.print(x);
        }
        //Same as:
//        for(int x = 0; x < 5; x+=3){
//            System.out.print(x);
//        }
    }
}

/*
* a) 012345
* b) 0123
* -> c) 03
* d) 3
*
* x = 0; 0 < 5 true => sout(x)
* x = x + 3 => x = 3; 4 < 5 true => sout(x)
* x = x + 3 => x = 6; 66 < 5 false
* */

