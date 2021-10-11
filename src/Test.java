public class Test {
    public static void main(String[] args) {
        getValue(4);
    }

    static void getValue(int value) {
        if (value > 5) {
            System.out.println("Hello World");
        } else {
            throw new RuntimeException("Error value");
        }
    }
}
