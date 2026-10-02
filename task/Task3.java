public class Task3 {

    public static void main(String[] args) {

        String a = "Wow";
        String b = a;
        String c = new String("Wow!");
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !d.equals(a); //"Wow!" is not equals to "Wow"  - will be false just put ! so it will be true

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
