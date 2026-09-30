package chapter2;

public class IfSwitchStatementLesson {
    public static void main(String[] args) {
       
       // make a variable hourOfDay and assign to any numbers
       // Use if statement and print "Good morning" 
        
        int hourOfDay = 12;
        if (hourOfDay<11)
          {System.out.println("Good morning");}
           System.out.println("Good afternoon");


        
        //Use if statement and print "Good morning" if <11 and "Good afternoon" if >11
        if (hourOfDay<11)
            System.out.println("Good morning");
        else
            System.out.println("Good afternoon");

   
        //if, else if, else
       if(hourOfDay>=18)
            System.out.println("Good evening");
       else if(hourOfDay>=12)
            System.out.println("Good afternoon");
        else
            System.out.println("Good morning");

        // (boolean expression) ? T : F;
   System.out.println ( (hourOfDay>=18)?"Good evening":(hourOfDay>=12)?"Good afternoon":"Good morning");
       
   // make case per month
        int monthOfYear =2;
            switch (monthOfYear){
            
            case 1: System.out.println("January");
                    break;
            case 2: System.out.println("February");
                    break;
            case 3: System.out.println("March");
                    break;
            case 4: System.out.println("April");
                    break;
            case 5: System.out.println("May");
                    break;
            default: System.out.println("Error");

        }
        
        System.out.println((1<2)?(false)?3:(true)?"Hello":"world":0);
    
    }
}