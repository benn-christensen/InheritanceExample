package model;

public class Person extends Object {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void print() {
        System.out.println(name + " " + address.getStreetName());
    }
}
