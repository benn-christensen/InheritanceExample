package model;

public class Address {
    private String streetName;
    private String streetNumber;
    private String postalCode;

    public Address(String streetName, String streetNumber, String postalCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
