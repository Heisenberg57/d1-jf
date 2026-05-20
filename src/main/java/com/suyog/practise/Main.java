package com.suyog.practise;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Suyog",29,45000,"IQE","suyognimbre@infosys.com");
        emp1.displayInfo();
        emp1.incrementSalary(5000);

        Employee emp2 = new Employee("mayur",33,45000,"IQE","mayurpawar@infosys.com");
        Employee emp3 = new Employee("mangesh",44,90000,"SAP","mangeshkulkrani@infosys.com");
        Employee emp4 = new Employee("sangram",40,70000,"SAP","sangramdesai@infosys.com");
        Employee emp5 = new Employee("shankar",40,80000,"Java","shankardongre@infosys.com");

        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();



    }
}
