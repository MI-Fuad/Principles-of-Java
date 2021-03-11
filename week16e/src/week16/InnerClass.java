package week16;

class Employee {
    private int id;
    private String name;
    private String sex;
    private double salary;
    private String address;

    Employee(int id, String name, String sex, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
    }

    void printInfo() {
        System.out.println("ID:" + id + "\tName:" + name + "\tSex:" + sex + "\tSalary:" + salary);
    }

    class Address {
        private int houseNo;
        private String street;
        private String city;
        private String postCode;

        Address(int houseNo, String street, String city, String postCode) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.postCode = postCode;
        }

        void printAll() {
            Employee.this.printInfo();
            System.out.println("\nHouse no: " + houseNo + "\nStreet:" + street + "\nCity: " + city + "\nPostCode: " + postCode);
        }
    }
}

public class InnerClass{
    public static void main(String[] args) {

        Employee emp=new Employee(1000,"James G","M",32000);
        Employee.Address ad = emp.new Address(26, "St-James", "London", "SE14 6NW");

        ad.printAll();
    }
}

// create object of inner class called address
// call method of inner class printAll() the print all the employe information 29 } 30