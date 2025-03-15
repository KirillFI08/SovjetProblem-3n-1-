public class test {
    public static void main(String[] args) {
        int c = 20;
        int d = c + 1;

        sAuf(c, d);
        sAb(c);

    }

    public static void sAuf(int c, int d) {

        System.out.println(" ");
        if (0 < c) {
            for (int i = 0; i < d - c; i++) {
                System.out.print("*");
            }
            sAuf(c - 1, d);
        }

    }

    public static void sAb(int c) {

        if (0 < c) {
            for (int i = 1; i < c; i++) {
                System.out.print("*");
            }

            System.out.println(" ");
            sAb(c - 1);
        }

    }
}
