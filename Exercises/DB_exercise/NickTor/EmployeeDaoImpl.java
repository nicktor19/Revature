package com.NickTor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao{

    Connection connection;

    public EmployeeDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employee (name, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee saved");
        else
            System.out.println("Oops something went wrong.");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        Scanner scan = new Scanner(System.in);
        if (employee != null) {
            boolean flag = false;
            System.out.println("What do you want to Edit?\nSelect number#\n1. Name\n2. Email\n3. Both (Name & Email)");
            switch (scan.nextInt()) {
                case 1:
                    //change name
                    System.out.println("Please enter " + employee.getName() + " new Name:");
                    employee.setName(scan.next());
                    flag = true;
                    break;
                case 2:
                    System.out.println("Please enter " + employee.getEmail() + " new Email:");
                    employee.setEmail(scan.next());
                    flag = true;
                    break;
                case 3:
                    System.out.println("Please enter " + employee.getName() + " new name:");
                    employee.setName(scan.next());
                    System.out.println("Please enter " + employee.getEmail() + " new Email:");
                    employee.setEmail(scan.next());
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid Entry.");
                    break;
            }
            if (flag) {
                String sql = "UPDATE employee SET name=?, email=? WHERE id =?";
                PreparedStatement prep = connection.prepareStatement(sql);
                prep.setString(1, employee.getName());
                prep.setString(2, employee.getEmail());
                prep.setInt(3, employee.getId());
                int count = prep.executeUpdate();

                if (count >0)
                    System.out.println(employee.getName() + " has been update.");
                else
                    System.out.println("Sorry could not update.");
            }
            //make a switch statement dependent on 1, change name, 2 change email or 3 change both
        }

    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "DELETE FROM employee WHERE id=" + id;
        int count = connection.prepareStatement(sql).executeUpdate();
        if (count > 0)
            System.out.println("employee with the id: " + id + " has been deleted.");
        else
            System.out.println("No employee with id \"" + id + "\".");
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(sql);
        while (resultset.next()) {
            int id = resultset.getInt(1);
            String name = resultset.getString(2);
            String email = resultset.getString(3);
            Employee employee = new Employee(id, name, email);
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) throws SQLException {
        PreparedStatement prep = connection.prepareStatement("SELECT * FROM employee WHERE id=?");
        prep.setInt(1, id);
        ResultSet result = prep.executeQuery();
        if (result.next())
            return new Employee(result.getInt(1), result.getString(2), result.getString(3));
        else
            System.out.println("Employee couldn't be found");
            return null;
    }
}
