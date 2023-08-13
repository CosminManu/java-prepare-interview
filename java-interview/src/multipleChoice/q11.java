package multipleChoice;

public class q11 {
    private String name;
    private int size;

    public q11(){
        this.name = "defaultName";
        System.out.println("A ");
    }

    public q11(String name){
        this();
        this.name = name;
        System.out.println("B ");
    }

    public q11(int size){
        this.size = size;
        System.out.println("C ");
    }

    public q11(String name, int size){
        this();
        this.name = name;
        this.size = size;
        System.out.println("D ");
    }

    public static void main(String[] args) {
        q11 q11 = new q11("C1", 5);
        System.out.println(q11);
    }

    public String toString() {
        return "" + name + " " + size;
    }
}

/*
* What is the output?
* a) A defaultName B C1 5
* b) C1 5
*  -> c) A D C1 5
* d) A B C D
* e) Compilation error
* f) Exception error
*
* First time object 'q11' of type class q11 is built calling the ctor
* ctor q11(String, int) is called => calls this() -> default ctor of the same class, q11()
* -> name ='defaultName', sout('A')
* then call back q11(string, int) and continue execution
* */
