package nelioAlves.course.exceptions;

public class checkVsNotCheckedError {
    public static void main(String[] args) {

        try {
            Erro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Erro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    static void Erro1() throws RuntimeException {
        throw new RuntimeException("That's a error :)");
    }

    static void Erro2() throws Exception {
        throw new Exception("Another error ");
    }
}
