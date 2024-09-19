public class Z5 {
    public static void main(String[] args) {
        System.out.println(pal_check("aboba"));
    }

    public static boolean pal_check(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;

            }

        }
        return true;
    }
}