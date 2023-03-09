package model;

public class User {
    private Long id;
    private String name;
    private Long salary;
    private Long departmentId;
    private Address address;

    public User(Long id, String name, Long salary, Long departmentId, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
