package week8and9;

public class Container{
	Object key;
	Object value;
	public void insert(Object k, Object v){
		this.key=k;
		this.value=v;
	}
	public String toString() {
		return key+"="+value;
	}
	public Object getValue() {
		return value;
	}
	public Object getKey() {
		return key;
	}
}
