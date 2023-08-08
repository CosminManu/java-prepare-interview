package q7;

public class Test {
    public static void main(String[] args) {
        Enemy enemy = new Enemy() {
            @Override
            public void attack() {
                super.attack();
            }
        };
    }
}
