package multipleChoice;

public class q21 {
    public static void main(String[] args) {
        int i = 2;
        int[] arrays = new int[i];
        arrays[0] = 67;
        arrays[1] = 68;
        arrays[2] = 69;

        System.out.println(arrays[2]);
    }
}

/*
* what will be the output?
* a)66
* b)69
* c)67
*  -> d) exception at runtime
* e) compilation error*/

/*
* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at multipleChoice.q21.main(q21.java:9)
	* */
