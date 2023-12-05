package nelioAlves.course.exceptions;

public class Cause {

    public static void main(String[] args) {

        try {
            methodA(null);
        } catch (IllegalArgumentException e) {
            if(e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        methodA(null);
    }

    static void methodA(Aluno aluno) {
        try {
            methodB(aluno);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
    static void methodB(Aluno aluno) {
            if(aluno == null) {
                throw new NullPointerException("Aluno is null !");
            }
    }

    public static class Aluno {

    }
}
