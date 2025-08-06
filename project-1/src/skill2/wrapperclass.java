package skill2;
public class wrapperclass {
    public static void main(String[] args) {
        int a = 10;

   
        Integer obj = Integer.valueOf(a);
        System.out.println("Boxed Integer object: " + obj);

       
        Integer autoBoxed = a;
        System.out.println("Auto-boxed Integer: " + autoBoxed);

       
        int b = obj.intValue();
        System.out.println("Unboxed int value: " + b);

      
        int autoUnboxed = obj;
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }
}