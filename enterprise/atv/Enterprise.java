package nelioAlves.course.enterprise.atv;

import java.util.*;

public class Enterprise {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numberEmployees = 0;

        List<Employee> employeeList = new ArrayList<>();
        String idSearch = "";

        do {
            System.out.print("How many employees to  be registered? ");

            try {
                numberEmployees = sc.nextInt();

                addEmployee(employeeList, numberEmployees, sc);

                do {
                    System.out.print("\nEnter the employee id that will have salary increase: ");
                    idSearch = sc.next();

                    Employee employeeSearched = searchEmployee(employeeList, idSearch);

                    if (employeeSearched == null) {
                        System.out.println("\n -- This id doesn't exist! -- \n");
                        getAllEmployee(employeeList);

                    } else {
                        System.out.println("Enter the percentage: ");
                        Double percentageIncrease = sc.nextDouble();

                        employeeSearched.increaseSalary(percentageIncrease);

                        getAllEmployee(employeeList);
                    }

                } while (!idSearch.isEmpty());

            }catch (InputMismatchException e) {
                System.out.println("Only numbers are allowed");

                sc.nextLine();
            }

        } while (numberEmployees == 0);

        sc.close();

    }


    static void addEmployee(List<Employee> employeeList, int numberEmployees, Scanner sc) {
        for (int i = 0; i < numberEmployees; i++) {
            System.out.printf("Employee #%d\n", i + 1);

            System.out.print("Id: ");
            String id = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);
        }
    }

    static void getAllEmployee(List<Employee> listEmployee) {
        System.out.println("\nList of employees: ");
        for (Employee people : listEmployee) {
            System.out.println(people);
        }
    }

    static Employee searchEmployee(List<Employee> employeeList, String idSearch) {
        return employeeList.stream()
                .filter(employee ->
                        employee.getId().equals(idSearch))
                .findFirst()
                .orElse(null);
    }

}
