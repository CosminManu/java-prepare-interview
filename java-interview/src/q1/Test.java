package q1;

public class Test {
    public static void main(String[] args) {
        Example s1 = new Example();
        s1.add();
        s1.add(2, 3);
        s1.add(2,3,4);

        Example s2 = new Example();
        s2.add(10, -10);

        ExampleChild e1 = new ExampleChild();
        System.out.println(e1.add());   //own implementation of 'add' parent method

    }
}
