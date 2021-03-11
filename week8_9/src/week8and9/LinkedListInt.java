package week8and9;

import java.util.ArrayList;
import java.util.Collections;


public class LinkedListInt {

	private Node head;
	ArrayList<Object> intList = new ArrayList<Object>();
	public LinkedListInt(int item) {
		head = new Node();
		head.value=item;
		head.link=null;
	}
	public boolean insertItemAtBack(int item) {
		// add code to add an item the end of the list
		Node temp = head; // starts with the first node.
	    while (temp.link != null){
	       temp = temp.link;
	    }
	    Node temp2 = new Node();
	    temp.link = temp2;
	    temp2.value = item;
	    return true;
		
	}
	public boolean insertItemAtFront(int item) {
		// add code to add an item a front of the list
		  if (head == null) {
			 head = new Node();
		     head.value = item;
		  }
		  else {
			  Node temp = new Node();
			  temp.value = item;
			  temp.link = head;
			  head = temp;
		  }
//		  System.out.println(head.link);
		  return true;
		
	}
	public boolean deleteItem(int item) {
		//add code to delete an item from anywhere in the list
		Node tmpNode = head;
	    Node prevNode = null;
	    boolean deletedANode = false;

	    while (tmpNode != null) {
	        if (tmpNode.value == item) {
	            if (tmpNode == head) {
	                head = head.link;
	            } else { // fixed indenting/newline
	                prevNode.link = tmpNode.link;
	            }
	            // fixed indenting
	            deletedANode = true;
	         } else {
	             // only advance the prevNode when there's no match.
	             prevNode = tmpNode;
	         }
	         tmpNode = tmpNode.link;
	    }
		return true;
	}
	public void printList() {
		// add a code to delete an item from anywhere in the list
        Node current = head;
        String result = current.value + ", ";
        intList.add(current.value);
		while(current.link != null){
            current = current.link;
            result += current.value + ", ";
            intList.add(current.value);
        }
        System.out.println( "List: " + result);

	}
	public void sortListDesc() {
		//add a code to sort the list descending order.            String result = "";
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("List: " + intList.toString());
	}

		   
	class Node{
		private int value;
		private Node link;
	}
}
