package model;

public class Address {
    private String city;
    private String street;
    private Integer building;
    public Address(String city, String street, Integer building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }
}
