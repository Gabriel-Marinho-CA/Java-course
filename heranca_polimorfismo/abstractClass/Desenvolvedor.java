package nelioAlves.course.heranca_polimorfismo.abstractClass;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public void calcBonus() {
        salary += salary * 0.5;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
