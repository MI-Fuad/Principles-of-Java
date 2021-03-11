package week8and9;

public class MyArrayList {

	private static final int SIZE_FACTOR=10;
	private Object data[];
	private int index;
	private int size;
	private Object new1[];
	private Object new2[];
	int nitems;
	
	public MyArrayList(){
		this.data = new Object[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
		nitems = 0;
	}
	
	public void add(Object obj){
		if(this.size == nitems) {
			extend();
		}
		data[nitems] = obj;
        nitems++;
	}
	
	public Object get(int i) throws Exception{
		return data[i];
	}
	
	public void remove(int i) throws Exception{
		for(int j = i; j < this.size-1; j++) {
			data[j] = data[j+1];
		}
	}
	
	public void extend() {
	
		this.size = SIZE_FACTOR;
		this.size = this.size * 2;
		new1 = new Object[this.size];
		for(int i = 0; i < nitems; i++) {
			new1[i] = data[i];
		}
		data = new1;
		
	}
	
	public static void main(String[] args) throws Exception {
		MyArrayList mal = new MyArrayList();
		mal.add("zero");
		mal.add("one");
		mal.add("two");
		mal.add("three");
		mal.add("four");
		mal.add("five");
		mal.add("six");
		mal.add("seven");
		mal.add("eight");
		mal.add("nine");
		mal.remove(6);
		System.out.println(mal.get(8));
	}
}
