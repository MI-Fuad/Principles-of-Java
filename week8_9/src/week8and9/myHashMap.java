package week8and9;

import java.util.*;
import week8and9.*;

public class myHashMap {
	private Container c = new Container();
	private List<Container> recordList;
	public myHashMap(){
		this.recordList=new ArrayList<Container>();
	}
	
	public void put(Object k, Object v){
		Container a = new Container();
		if(recordList.contains(a)) {
			System.out.println("found");
		}else {
			a.insert(k, v);
			recordList.add(a);
		}
	}
	public boolean remove(Object k){
		Container a = new Container();
		for(int i = 0; i < recordList.size(); i++) {
				//System.out.println(recordList);
			a = recordList.get(i);
			if(a.getKey() == k) {
				recordList.remove(i);
				return true;
			}			
		}
		return false;
	}
	public String toString() {
		return recordList.toString();
	}
	public void printMyHashMap() {
		System.out.println(toString());
	}
	public Object get(Object k){
		// add code get a value of the key k
		Container a = new Container();
		for(int i = 0; i < recordList.size(); i++) {
				//System.out.println(recordList);
			a = recordList.get(i);
			if(a.getKey() == k) {
				return a.getValue();
			}			
		}
		return null;
	}
}