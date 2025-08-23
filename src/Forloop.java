public class Forloop {
    public static void main(String[] args) {
        for (int i = 0; i<=6;i++) {
            if (i == 2) continue;
            System.out.print((i * 2) + "," + (i * 1) + ",");
        }
    }
}
