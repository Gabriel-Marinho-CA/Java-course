package nelioAlves.course.exceptions;

public class Base {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imp(a1);
        } catch(Exception error) {
            System.out.println("There's a mistake in imp func");
        }

        try {
            System.out.println(7/0);
        } catch( ArithmeticException e) {
            System.out.println("There's a erroo: "+ e.getMessage());
        }

        System.out.println("koee");
    }
    public static void imp(Aluno aluno) {
        System.out.println(aluno.nome);
    }

    public static class Aluno {
        public String nome;
    }
}
