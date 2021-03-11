package week6;


public class invoicer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			invoiceItem bosco = new invoiceItem(001, "Hello World", 3, 3.99);
			invoiceItem invoice2 = new invoiceItem(002, "Hello Universe", 6, 6.99);
		
			System.out.println(bosco.toString());
			System.out.println(invoice2.toString());

			System.out.println(invoiceItem.counter);
			
		}
		catch(ClassCastException e) {
			System.out.println("Please enter correct type!");
		}
	}

}


class invoiceItem {
	
	int id;
	String description;
	int quantity;
	double unitPrice;
	
	//class variable
	static int counter = 0;

	
	
	invoiceItem(int i, String d, int q, double uP){
		
		counter++;
		id = i;
		description = d;
		quantity = q;
		unitPrice = uP;
	}
	
	int getId(){
		return id;
	}
	
	String getDescription() {
		return description;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	double getUnitPrice() {
		return unitPrice;
	}
	
	void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String toString() {
		return "InvoiceItem[id= " + id + ", description= " + description +
				", quantity= " + quantity + ", unitPrice= " + unitPrice + "]";
	}
	
}
