package week15;

public class catchLab {

    public static double divide(double a, double b) throws IllegalArgumentException{
      if(b == 0){
            throw new IllegalArgumentException("Divisor is 0");
      }
      return a / b;

    }

    public static void printQuotient(double a, double b){
        try {
            System.out.println(divide(a, b));
            System.out.println(divide(a, b));
        }catch(ArithmeticException e){
            System.out.println("Divisor is 0");
        }
    }

    public static void main(String[] args) {
        printQuotient(5,0);
    }
}
