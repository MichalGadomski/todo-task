<b>Company Java application</b><br/>

<p>This is the program developed mainly to demonstrate functionality of:<br/>
  
- adding employee to a company;<br/>
- returning employee from a company by given name for reading and writing.</p>

<b>Assumptions</b><br/>

<p>Please remember that this program is a simplified version of a proper software, is developed only for demonstration purposes and should not be used comercially. Assumptions:</br>

- employeeId contains only numbers;<br/>
- address is stored in just one String but should be divided, for example: street, house number, apartment number, postcode, city;<br/>
- each employee has only firstName but it should be divided, for example: nameA, nameB, surname;<br/>
- there are two types of employees: Subordinate and Boss;
- a company must have a CEO, so during initialization, such CEO is added as a root;
- getEmployee method should not find people by firstName because many people in a company can have identical firstName (recommendation: by employeeId).</p>

<b>Build manual</b>

<p>Steps to compile and run this Java application (example based on Android Studio):<br/>
  
1. Clone this repository.
2. In project view you should see module "todotask" which contains all needed classes.
3. In navigation bar click "Add Configuration".
4. Click "+" icon to "Add New Configuration".
5. Select "Application" type.
6. Fill "Name" with "application".
7. Fill "Main class" with "com.example.todotask.Main".
8. Adjust working directory to match your needs.
9. Fill "Use classpath of module" with "TodoTask.todotask".
10. Run.<br/>
Remark: You can also run tests. To do this, go to TestClass (package com.example.todotask.test) and run them.</p>

<b>Files explanation</b>

<p>Package "model":<br/>
  
- interface Company<br/>
It offers methods to interact with a company, for example: "addEmployee", "getEmployee", "getAllEmployeesNames".

- class CompanyImpl<br/>
It is implementation of interface Company.

- interface Employee<br/>
It offers methods to interact with an employee, for example: "addSubordinate", getters and setters. 

- abstract class GeneralEmployee<br/>
It is implementation of interface Employee. 

- class Boss<br/>
It represents a boss - an employee who has its subordinates. It is related to both composition and inheritance because the boss "has-a" and also "is-a".

- class Subordinate<br/>
It represents a typical worker - subordinate. If such employee tries to have a subordinate, then such employee is promoted to a boss type.

<p>Package "test":</br>

- class TestClass<br/>
It offers exemplary test methods to verify correctness of a code.

<p>No package:</br>

- class Main<br/>
It is used to initialize and run program.
