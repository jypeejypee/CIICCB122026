package chapter2;
import java.util.*;

public class LoopsLesson {
  
    public static void main(String[] args) {
        byte a = 1;
        // while, do-while, do-while
       
        while(a<=10)
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--); 
        while (a<10);
            System.out.println("end of program"+a++);
        do
            System.out.println("It's a prank"+a--);
        while(a<10);
            System.out.println("Real end");
       
       
        // Initialize a = 2; print "a = " + a, incrementing by 1 each time, until a = 5. use for loop
   
        for(a=1;a>=5;a++)
            System.out.println("a = "+ a);
        
    

        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x=1;x<limit;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        String[] colors ={"black","red","pink","yellow","white","blue"}; 
        for(String color: colors)
            System.out.println("Color: "+color);

        ROW_TABLE: for(int p = 1;p<=10;p++){
                   for(int l = 1;l<=10;l++){
                            if(l==5)
                                // break ROW_TABLE;
                            
                                continue ROW_TABLE;
                            System.out.print(l*p+"\t");
                            }
                        System.out.println();     
        }
        
        }
    
}