package java15.service.impl;

import java15.Exceptions.CheckNameException;
import java15.Exceptions.CheckStringException;
import java15.Exceptions.InvalidAgeException;
import java15.dao.EmployeeDAO;
import java15.models.Employee;
import java15.service.EmployeeService;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void addEmployee() {
        Employee employee = commandAddEmployee();
        boolean hasErrors = false;

        try {
            checkName(employee.getName());

        } catch (CheckNameException e) {
            System.err.println("Ошибка: " + e.getMessage());
            hasErrors = true;
        }
        try {
            checkAge(employee.getAge());

        } catch (InvalidAgeException e) {
            System.err.println("Ошибка: " + e.getMessage());
            hasErrors = true;
        }
        try {
            checkString(employee.getJob());

        }catch (CheckStringException e){
            System.err.println("Ошибка: " + e.getMessage());
            hasErrors = true;
        }
        if (!hasErrors) {

            employeeDAO.addEmployeeImpl(employee);
        } else {
            System.err.println("Не удалось добавить сотрудника из-за ошибок в данных.");
        }

    }

    @Override
    public void getAll() {
        employeeDAO.getAllImpl();

    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        }
    }

    public static void checkName(String name) throws CheckNameException{
        if(name == null || name.trim().isEmpty()){
            throw new CheckNameException("Имя не может быть пустым! ");

        }  String regex = "^[a-zA-Zа-яА-Я ]+$";
        if(!name.matches(regex) ) {
            throw new CheckNameException("Имя не может содержать символы");
        }
    }

    public static void checkString(String text) throws CheckStringException{
        if(text == null || text.trim().isEmpty()) {
            throw new CheckStringException("строка не может быть пустой! ");
        }
    }
    public static Employee commandAddEmployee(){
        Employee newEmployee = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.print("Имя: ");
        newEmployee.setName(scan.nextLine());

        System.out.print("Возраст: ");
        newEmployee.setAge(scan.nextInt());
        scan.nextLine();

        System.out.print("Место работы: ");
        newEmployee.setJob(scan.nextLine());

        return newEmployee;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие");
            System.out.println("1. Добавить сотрудника");
            System.out.println("2. Показать всех сотрудников");
            System.out.println("3. Exit");
            System.out.print("Команда: ");
            String choice = scanner.nextLine();



            switch (choice){
                case "1" -> addEmployee();
                case "2" -> getAll();
                case "3" -> {
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }


}
