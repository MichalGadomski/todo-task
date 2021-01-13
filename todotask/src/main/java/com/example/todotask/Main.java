package com.example.todotask;

import com.example.todotask.model.Company;
import com.example.todotask.model.CompanyImpl;
import com.example.todotask.model.Employee;

public class Main {
    public static Company bestCompany;

    public static void main(String[] args) {
        System.out.println("Welcome in our company!\n");

        bestCompany = new CompanyImpl("John", 40, 1, "Warszawska", 0, "John");

        bestCompany.addEmployee("Mary", 32, 2, "Konopacka", 3, "John");
        bestCompany.addEmployee("Peter", 35, 3, "Szwedzka", 7, "John");
        bestCompany.addEmployee("Michael", 46, 4, "Sportowa", 27, "John");
        bestCompany.addEmployee("Sam", 23, 5, "Letnia", 25, "Mary");
        bestCompany.addEmployee("Will", 50, 6, "Prosta", 15, "Mary");
        bestCompany.addEmployee("Jackie", 70, 7, "Pomorska", 20, "Will");
        bestCompany.addEmployee("Frank", 29, 8, "Bonifraterska", 88, "Will");

        Employee jackie = bestCompany.getEmployee("Jackie");
        System.out.println("\nGot employee "+jackie.getFirstName()+". Attributes of this employee are following:");
        System.out.println("- age: "+jackie.getAge());
        System.out.println("- employeeId: "+jackie.getEmployeeId());
        System.out.println("- address: "+jackie.getAddress());
        System.out.println("- reports: "+jackie.getReports());
        System.out.println("- bossFirstName: "+jackie.getBossFirstName());
    }
}