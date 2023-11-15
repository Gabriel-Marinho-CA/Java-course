package nelioAlves.course.aula1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProductMain {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Product p1 = createProduct();

        menu(p1);
    }

    private static Product createProduct() {
        input.useLocale(Locale.US);
        Product p1 = new Product();

        System.out.println("Nome do pdp :");
        p1.setName(input.next());

        System.out.println("\nValor do pdp :");
        p1.setPrice(input.nextDouble());

        System.out.println("\nQuantidade do pdp :");
        p1.setQuantity(input.nextInt());

        System.out.println(p1);

        return p1;

    }

    private static void menu(Product p1) {
        int op = 0;

        if (p1.getQuantity() <= 0) {
            return;
        }

        do {

            System.out.println("Oque deseja fazer");
            System.out.println("OP - 1: Adionar produto em estoque");
            System.out.println("OP - 2 : Remover produto em estoque");
            System.out.println("OP - 3 : Sair");

            try {
                op = input.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar:");
                        int qtdAdd = input.nextInt();
                        p1.addProduct(qtdAdd);
                        System.out.println(p1);
                        break;
                    case 2:
                        System.out.println("Digite a quantidade que deseja remover:");
                        int qtdRemove = input.nextInt();

                        if (qtdRemove > p1.getQuantity()) {
                            System.out.println("Removendo quantidade maior do que o que há em estoque, estoque do produto setado para 0");
                            p1.removeProductStock(p1.getQuantity());
                        } else {
                            p1.removeProductStock(qtdRemove);
                        }
                        System.out.println(p1);

                        break;
                    case 3:
                        System.out.println("Voce escolheu sair do programa :(");
                        System.out.println(p1);
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                input.nextLine();
            }
        } while (op != 3);

        input.close();
    }
}
