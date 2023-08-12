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
}
