package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
         // shift ops
        System.out.println(2<<3);
        System.out.println(12>>1);
        //0 0 1 0 to 1 0 0 0 0
        //16 8 4 2 1
       // 2 x 2^3 = 16

        //0 1 1 0 0 to 0 0 1 1 0
          // 16 8 4 2 1
          // 12 / 2^1 = 6
        System.out.println(+3 + +6); //9
        int a = 5;
        System.out.println(a++);//5
        System.out.println(a);//6
        System.out.println(++a);//7
        System.out.println(a);//7
        int p = 3;
         System.out.println(++p+p++);
        //❌ ++p++, --p--;
        //✅ p=+p++;
        
        short x = 10;
        short y = 30;
        short z =(short) (x*y);

        System.out.println("z="+z);
        System.out.println(!!false);
        boolean isActive=false;
         boolean isActive2=false, isActive3;
        isActive=isActive2=isActive3=!!true;
        System.out.println(isActive);
        System.out.println(isActive2);
        System.out.println(isActive3);
        
    }
}
