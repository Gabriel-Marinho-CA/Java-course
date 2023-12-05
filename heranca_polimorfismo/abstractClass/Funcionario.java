package nelioAlves.course.heranca_polimorfismo.abstractClass;

public abstract class Funcionario extends Pessoa {
    protected String name;
    protected Double salary;

    public Funcionario(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        calcBonus();
    }

    public abstract void calcBonus();

    @Override
    public void show() {
        System.out.println("Imprime...");
    }
}
