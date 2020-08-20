package AddressPackage;

public class Address {
    private int index, house,apartment;
    private String country, city, street;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address(int index, int house, int apartment, String country, String city, String street) {
        this.index = index;
        this.house = house;
        this.apartment = apartment;
        this.country = country;
        this.city = city;
        this.street = street;
    }
}
