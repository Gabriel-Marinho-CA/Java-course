package nelioAlves.course.heranca_polimorfismo.abstractClass;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000.00);
        System.out.println(gerente);
        gerente.show();

        Desenvolvedor dev = new Desenvolvedor("Sanji", 15000.00);
        System.out.println(dev);
        dev.show();
    }

}
