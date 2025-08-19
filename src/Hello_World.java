public class Hello_World {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping a = " + a + ", b =" + b);
        System.out.println("Type of a : " + ((Object)a).getClass().getName());
        byte aa = (byte) a;
        System.out.println("Type of a : " + ((Object)aa).getClass().getName());
    }
}
