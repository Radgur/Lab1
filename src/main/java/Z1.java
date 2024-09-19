public class Z1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(i+":" +perebor(i));
        }
    }

    public static String perebor(int a) {
        if (a % 35 == 0) {
            return "fizzbuzz";
        } else if (a % 7 == 0) {
            return "buzz";
        } else if (a % 5 == 0) {
            return "fizz";
        } else {
            return "";
        }
    }
}