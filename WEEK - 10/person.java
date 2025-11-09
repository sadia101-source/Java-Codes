package week_10;

class Person{
    String name;
    String phone;
    
    Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    class Address {
        int houseNo;
        String street, city, state;

        Address(int houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayAddr() {
            System.out.println("Address:");
            System.out.println(houseNo + ", " + street + ", " + city + ", " + state);
        }
    }

    class DateOfBirth {
        int day, month, year;

        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDOB() {
            System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        }
    }

    void display(Address addr, DateOfBirth dob) {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        addr.displayAddr();
        dob.displayDOB();
    }

    public static void main(String[] args) {
        Person person = new Person("Alice Johnson", "9876543210");

        Person.Address address = person.new Address(101, "Maple Street", "New York", "NY");
        Person.DateOfBirth dob = person.new DateOfBirth(12, 5, 1995);
        person.display(address, dob);
    }
}