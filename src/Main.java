import java15.dao.impl.EmployeeDaoImpl;
import java15.models.Employee;
import java15.service.impl.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        EmployeeServiceImpl Empl = new EmployeeServiceImpl(employeeDao);

//        Empl.addEmployee(new Employee("Atai" , 23, "Developer"));
//        Empl.addEmployee(new Employee("Kay`$rat" , 20, "Developer"));
//        Empl.addEmployee(new Employee("Bektur" , -23, "INSTRUCTOR"));
//        Empl.addEmployee(new Employee("Askat" , 26, "Dancer"));
//        Empl.addEmployee(new Employee("Kanat" , 45, "Taxi"));
//        Empl.addEmployee(new Employee("Alina" , 23, "Developer JS"));

        Empl.run();

    }
}