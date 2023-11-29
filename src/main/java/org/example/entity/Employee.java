package org.example.entity;

public class Employee {
    private int id;
    private String name;
    private String email;
    private int department_id;
    private int project_id;

    public Employee() {
    }

    public Employee(int id, String name, String email, int department_id, int project_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department_id = department_id;
        this.project_id = project_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
}
