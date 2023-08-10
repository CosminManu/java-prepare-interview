package multipleChoice;

public class q10 {
    private static int i = 1;
    public static void main(String args[]){
        int i = 2;
        q10 q10 = new q10();
        q10.someMethod(); //Static member 'multipleChoice.q10.someMethod()' accessed via instance reference
    }

    public static void someMethod(){
        System.out.println(i);
    }
}

/* what will happen when you compile and run the code?
a) 1 will be printed
b) 2 will be printed
c) exception will be thrown
  -> d) compile error will be generated
  If the variable 'i' defined in class is not declared as static it can't be accessed from a static context
  'Non-static field 'i' cannot be referenced from a static context'

if private static int i = 1 => 1 will be printed
 */
