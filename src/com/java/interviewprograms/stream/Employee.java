package com.java.interviewprograms.stream;

public class Employee {

    private int id;
    private String eName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String eName, int salary) {
        super();
        this.id = id;
        this.eName = eName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }
}