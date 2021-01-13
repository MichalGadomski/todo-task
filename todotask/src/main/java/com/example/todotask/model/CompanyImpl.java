package com.example.todotask.model;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompanyImpl implements Company {
    private Employee root;

    public CompanyImpl(String firstName, int age, int employeeId, String address, int reports, String bossFirstName) {
        this.root = new Subordinate(firstName, age, employeeId, address, reports, bossFirstName);
    }

    @Override
    public void addEmployee(String firstName, int age, int employeeId, String address, int reports, String bossFirstName) {
        Employee newEmployee = new Subordinate(firstName, age, employeeId, address, reports, bossFirstName);
        // Root always receives the most actual hierarchy.
        root = root.addSubordinate(bossFirstName, newEmployee);
    }

    @Override
    public Employee getEmployee(String firstName) {
        return root.addAllEmployeesToList().stream()
                .filter(employee -> {
                    if (employee.getFirstName() == firstName) {
                        return true;
                    }
                    return false;
                })
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple elements: " + a + ", " + b);
                })
                .get();
    }

    @Override
    public List<String> getAllEmployeesNames() {
        return root.addAllEmployeesToList().stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
    }
}
