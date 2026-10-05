package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        //charAt e.g.
        String name = "fluffy";
        char result = name.charAt(0);
        System.out.println(result);
        
        String a = "1";

        a = "0";
        a+="2";
        a+="3";
        a.concat("5");
        System.out.println( a.concat("5"));
        //a = 0235


        String b = "1";
        String name2 = "fluffy";
        name = null;
        name2 = null;
        String name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
     


        String trimSample = "       \t \n Jaypee Vilador          \t \n";
        System.out.println(trimSample);
        System.out.println(trimSample.length());
        System.out.println(trimSample.trim());
        System.out.println(trimSample.trim().length());

   
        String names1 = "SpongeBob";
        String names2 = "SpongeBob";
        String names3 = "SpongeBob ";
        // [0]=83 == [0]=83
        String p1 = "Hello World";
        String p2 = new String("Hello World");
        System.out.println(p1==p2);
    
    }

}

