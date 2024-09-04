package java15.dao.impl;

import java15.dao.EmployeeDAO;
import java15.models.Employee;

import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDAO {


    ArrayList<Employee> Employees = new ArrayList<>();


    @Override
    public void addEmployeeImpl(Employee employee) {
        Employees.add(employee);

    }

    @Override
    public void getAllImpl() {
        System.out.println(Employees);

    }
}
