import static java.lang.Math.pow;
import static java.lang.Math.scalb;

public class Z4 {
    public static void main(String[] args) {
        System.out.println(ryad(2));
    }

    public static double ryad(int n) {
        double s = 0;
        while ((1. / (n * n + n - 2.)) >= pow(10, -6)) {
            s += (1. / (n * n + n - 2.));
            n++;
        }
        return s;
    }
}