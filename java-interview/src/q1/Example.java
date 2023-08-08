package q1;

public class Example {
    public void add(int x, int y){
        System.out.println("x + y = " + (x + y));
    }
    public void add(int x, int y, int z){
        System.out.println("x + y + z = " + (x+y+z));
    }

    public int add(){return 0;}

//    public int add(int x, int y){return 0;} // add(int, int) is already defined in 'q1.Sum'
}
