package org.example.entity;

public class Department {
    private int id;
    private String name;
    private Employee employee;

    public Department() {
    }

    public Department(int id, String name, Employee employee) {
        this.id = id;
        this.name = name;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
