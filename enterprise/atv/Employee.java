package nelioAlves.course.enterprise.atv;

public class Employee {

    private String id;
    private String name;
    private Double salary;


    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Double increaseSalary(Double percent) {
        return salary = (salary * (percent / 100)) + salary;
    }

    public String toString() {
        return
                id + ", " + name + ", " + String.format("%.2f", salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
