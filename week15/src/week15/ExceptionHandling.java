package week15;


public class ExceptionHandling {
    public static void main(String[] args) {
        String[] s = {"abc", "123", null, "xyz"};
        for (int i = 0; i < s.length; i++)

            try {
                int a = s[i].length();
                System.out.println(s[i+1]); //java.lang.nullpointerexception and Java.lang.ArrayIndexOutOfBounds
                a = Integer.parseInt(s[i]); //NumberFormatException
            } catch (Exception dd) {
                System.out.println("Type MUST be string, try again");
            }
    }

}