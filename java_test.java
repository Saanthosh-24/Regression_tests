public class RegressionTest {

    public static void main(String[] args) {
        testAddition();
        testSubtraction();
    }

    public static void testAddition() {
        int result = add(3, 5);
        if (result == 8) {
            System.out.println("Addition test passed!");
        } else {
            System.out.println("Addition test failed!");
        }
    }

    public static void testSubtraction() {
        int result = subtract(10, 5);
        if (result == 5) {
            System.out.println("Subtraction test passed!");
        } else {
            System.out.println("Subtraction test failed!");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
