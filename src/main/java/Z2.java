public class Z2 {
    public static void main(String[] args) {
        System.out.println(mirror("make install"));
    }

    public static String mirror(String str) {
        String l = "";
        for (int i = 0; i < str.length(); i++) {
            l+=str.charAt(str.length() - i - 1);

        }
        return l;
    }
}