package com.example.todotask.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class GeneralEmployee implements Employee {
    protected String firstName;
    protected int age;
    protected int employeeId;
    protected String address;
    protected int reports;
    protected String bossFirstName;

    public GeneralEmployee(String firstName, int age, int employeeId, String address, int reports, String bossFirstName) {
        this.firstName = firstName;
        this.age = age;
        this.employeeId = employeeId;
        this.address = address;
        this.reports = reports;
        this.bossFirstName = bossFirstName;
    }

    @Override
    public List<Employee> addAllEmployeesToList() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(this);
        return employeesList;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getReports() {
        return reports;
    }

    @Override
    public void setReports(int reports) {
        this.reports = reports;
    }

    @Override
    public String getBossFirstName() {
        return bossFirstName;
    }

    @Override
    public void setBossFirstName(String bossFirstName) {
        this.bossFirstName = bossFirstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralEmployee that = (GeneralEmployee) o;
        return age == that.age &&
                employeeId == that.employeeId &&
                reports == that.reports &&
                firstName.equals(that.firstName) &&
                address.equals(that.address) &&
                bossFirstName.equals(that.bossFirstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, age, employeeId, address, reports, bossFirstName);
    }
}
