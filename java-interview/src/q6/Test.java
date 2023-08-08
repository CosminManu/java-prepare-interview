package q6;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(2, "Tom");
        Cat cat3;   //ctor doesn't call, object not initialized

        cat1.setName("Kiki");
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
