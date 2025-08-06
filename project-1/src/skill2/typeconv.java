package skill2;
public class typeconv {
    public static void main(String[] args) {
      
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value: " + i);
        System.out.println("Long value (implicit): " + l);
        System.out.println("Float value (implicit): " + f);

       
        double d = 123.456;
        int j = (int) d;
        System.out.println("Double value: " + d);
        System.out.println("Int value (after casting): " + j);
    }
}