package com.NickTor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //employee data access object
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("******************************");
            System.out.println("Select from the options below");
            System.out.println("******************************");
            System.out.println("Press 1: Add Employee");
            System.out.println("Press 2: Update Employee");
            System.out.println("Press 3: Delete Employee");
            System.out.println("Press 4: Get All Employees");
            System.out.println("Press 5: Get Employee By ID");
            System.out.println("Press 6: Exit");
            System.out.println("******************************");

            int input = scan.nextInt();
            switch (input) {
                case 1:
                    //add
                    System.out.println("Enter Name: ");
                    String name = scan.next();
                    System.out.println("Enter Email: ");
                    String email = scan.next();
                    Employee newEmployee = new Employee();
                    newEmployee.setName(name);
                    newEmployee.setEmail(email);
                    dao.addEmployee(newEmployee);
                    break;
                case 2:
                    //update
                    System.out.println("Please Enter Employee ID to update:");
                    dao.updateEmployee(dao.getEmployeeById(scan.nextInt()));
                    break;
                case 3:
                    //delete
                    System.out.println("Enter Employee ID to delete: ");
                    dao.deleteEmployee(scan.nextInt());
                    break;
                case 4:
                    //get all
                    List<Employee> employees = dao.getEmployees();
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 5:
                    //get employee by id
                    System.out.println("Enter Employee ID to search: ");
                    Employee employee = dao.getEmployeeById(scan.nextInt());
                    List<Employee> employeesList = new ArrayList<>();
                    employeesList.add(employee);
                    for (Employee emp : employeesList) {
                        if (emp != null)
                            System.out.println(emp);
                    }
                    break;
                case 6:
                    //Exit
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Choose between 1-6");
            }
        }
    }
}