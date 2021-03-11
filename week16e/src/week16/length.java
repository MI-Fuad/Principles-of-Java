package week16;

public interface length {

    public int x = 4;

    public void printMessage(String message);
    public void printNumber(int i);

}
class myClass implements length{
    @Override
    public void printMessage(String message){
        System.out.print(message);
    }

    public void printNumber(int i){
        System.out.print(i);
    }
}
class anon{
    public static int x = 8;

    public static void main(String[] args) {

        myClass length = new myClass();

        length.printMessage("y");
        length.printNumber(length.x);
        length.printMessage("x");
        length.printNumber(10);
    }
}
