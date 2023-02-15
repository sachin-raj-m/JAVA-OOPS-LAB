    /* 
        * Author : JEC21AD041 SACHIN RAJ M  
        * Date : 27/10/2022 Thursday
        * Program No : #15
        * Aim:  Java program which creates a class named 'Employee' having the following
                members: Name, Age, Phone number, Address, Salary. It also has a method named 'print-
                Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager inherits
                the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization'
                and 'department' respectively. Now, assign name, age, phone number, address and salary
                to an officer and a manager by making an object of both of these classes and print the same.
        
    */


    class Employee{
        int age;
        String name,address,mob;
        float salary;

        void printSalary(){
            System.out.println("Salary: "+salary);
        }

        void printAll(){
            System.out.println("\n Name: "+name+"\n Age: "+age+"\n Mobile: "+mob+"\n Address: "+address);
        }
    }

    class Officer extends Employee{

        String specialization;
    }

    class Manager extends Employee{

        String dept;
    }

    public class EmployeeDemo{
        public static void main(String[] args) {

            Officer o = new Officer();
            Manager m = new Manager();

            o.name = "John Doel";       
            o.age = 25;
            o.mob = "7907546215";
            o.address = "5th Avenue Street";
            o.salary = 50000;
            o.specialization = "Ai Engineer";

            m.name = "Paul Atreides";     
            m.age = 21;
            m.mob = "9852548624";
            m.address = "Galaxy";
            m.salary = 10000;
            m.dept = "AD";

            o.printAll();       //calling inherited fnctions
            o.printSalary();
            System.out.println("Specialization: "+o.specialization);
            

            m.printAll();       //calling inherited functions
            m.printSalary();
            System.out.println("Department: "+m.dept);


        }
    }