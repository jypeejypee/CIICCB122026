package chapter2;


public class EqualityOperator {
   
    public static void main (String[]args){
        class File {}
        File x = new File ();
        File y = new File ();
        File z = x;

        System.out.println(x==z);
        System.out.println(x==y);

    }
}

    







