package com.NickTor;

public class EmployeeDaoFactory {
    public static EmployeeDao dao;

    private EmployeeDaoFactory(){} //Ensures no default constructor is created.

    public static EmployeeDao getEmployeeDao() {
        if (dao == null)
            dao = new EmployeeDaoImpl();
        return dao;
    }
}
