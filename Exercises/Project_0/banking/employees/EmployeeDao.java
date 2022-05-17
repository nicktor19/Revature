package com.banking.employees;

import com.banking.bankaccount.BankAccount;

import java.sql.SQLException;
import java.util.Scanner;

public interface EmployeeDao {

    void createEmployee(Employee newEmp);
    boolean doesEmailExist(String email);
    Employee loginEmployee(String eEmail, String ePassword) throws SQLException;
    void bankAccountApproval(Employee emp, String status, int accountNum);
    int viewAllPendingAcc(Employee emp);

    void viewCustomersBankAccounts(Employee emp, int accountNum);
    void viewAllTransactions();

    boolean shutDownServer();

}
