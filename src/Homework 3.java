import java.sql.SQLOutput;

class Homework {
    public static void main(String[] args) {
        System.out.println("First Part");
        int a = 4;
        int b = 6;
        int c = (a * a + b * b);
        System.out.println("c=" + c);
        System.out.println("Second Part");

        a = 16;
// Մեծ հիմք
        b = 10;
//Փոքր հիմք
        c = 5;
//Բարձրություն
        int s = (((a + b) / 2) * c);
        System.out.println("s=" + s);
        System.out.println("Third Part");
        int e = 167;
        System.out.println(e / 100);
        System.out.println((e / 10) % 10);
        System.out.println(e % 10);
    }
}