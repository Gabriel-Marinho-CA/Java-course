package nelioAlves.course.heranca_polimorfismo.abstractClass;

public class Gerente extends Funcionario{
    public Gerente(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public void calcBonus() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
