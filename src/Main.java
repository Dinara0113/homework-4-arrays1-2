public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        String[] c = {"Hello world", "How are you", "???"};

        System.out.println("Task 2");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);


        System.out.println();
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.print(b[b.length - 1]);


        System.out.println();
        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.print(c[c.length - 1]);
        System.out.println();


        System.out.println("Task 3");
        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0 ; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0 ; i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            System.out.print(a[i] + " ");
        }
    }
}