import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Addition:");
        System.out.println("10 + 5 = " + add(10, 5));
        System.out.println("-8 + 3 = " + add(-8, 3));

        System.out.println("\nSubtraction:");
        System.out.println("20 - 7 = " + subtract(20, 7));
        System.out.println("4 - 12 = " + subtract(4, 12));

        System.out.println("\nMultiplication:");
        System.out.println("6 * 7 = " + multiply(6, 7));
        System.out.println("-3 * 9 = " + multiply(-3, 9));

        System.out.println("\nDivision:");
        System.out.println("20 / 4 = " + divide(20, 4));
        System.out.println("7 / 2 = " + divide(7, 2));
        System.out.println("-7 / 2 = " + divide(-7, 2));
    }
}
