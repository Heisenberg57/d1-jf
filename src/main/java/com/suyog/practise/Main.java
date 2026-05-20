package com.suyog.practise;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Suyog",29,45000,"IQE","suyognimbre@infosys.com");
        emp1.displayInfo();
        emp1.incrementSalary(5000);
    }
}
