public class Task8 {

    static int sumAll(int... nums) {
        int total = 0;

        for (int n : nums) {                    // OUTER: n = 4, 5, 10
            int running = 0;
            String steps = "";

            for (int i = 1; i <= n; i++) {      // INNER: i = 1 up to n
                running = running + i;          // adds up 1+2+...+n
                steps = steps + i;              // builds the text "1+2+3+4"
                if (i < n) steps = steps + "+"; // a "+" between numbers, not after the last
            }

            System.out.println(n + " = (" + steps + ") = " + running);
            total = total + n;                  // Job B
        }
        return total;
    }

    public static void main(String[] args) {
        int total = sumAll(4, 5, 10);
        System.out.println("Sum of all parameters = " + total);
    }
}
