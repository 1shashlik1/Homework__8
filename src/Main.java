public class Main {
    public static void main(String[] args) {
        //Задача№1
        System.out.println("Задача№1: Ответ.");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] s = new double[]{1.57, 7.654, 9.986};
        double[] f = {1.8, 8.98, 5};
        System.out.println();
        //Задача№2
        System.out.println("Задача№2: Ответ.");
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]);
            if (i < 2) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(s[i]);
            if (i < 2) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(f[i]);
            if (i < 2) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
        //Задача№3
        System.out.println("Задача№3: Ответ.");
        for (int i = 2; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(s[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(f[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
        //Задача№4
        System.out.println("Задача№4: Ответ.");
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            System.out.print(a[i]);
            if (i < 2) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }

    }
}







