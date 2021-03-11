

public class ArrayStack {

    private Object[] array;

    private Object[] temp;

    private int counter;
    public static final int MAX = 100;

    public ArrayStack(){
        array = new Object[MAX];
        counter = 0;
    }
    public Object top() {
        return array[counter-1];
    }

    public void pop(){
        temp = new Object[MAX];
        for(int i = 1; i < array.length; i++){
            temp[i] = array[i];
        }
        counter--;
        array = temp;
    }

    public void push(Object obj){

        array[counter++]=obj;
    }

    public int size(){
        return counter;
    }

    public boolean isEmpty(){

        return counter==0;
    }


}

