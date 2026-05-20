package com.suyog.practise;

public class Employee {
    String name;
    int age;
    double salary;
    String department;
    String email;

    Employee(String name, int age, double salary, String department, String email){
        this.name = name;
        this.age = age;
        this.salary =  salary;
        this.department = department;
        this.email = email;
    }

    void displayInfo(){
        System.out.println("Name of the employee is: "+ name);
        System.out.println("Age of the employee is: "+age);
        System.out.println("Salary of the employee is: "+salary);
        System.out.println("Department of the employee is: "+department);
        System.out.println("Email  of the employee is: "+email);
    }
}
