package nelioAlves.course.generics.ExempleGenerics;

public class TestPair {
    public static void main(String[] args) {
        Pairs<Integer,String> resultShow = new Pairs<>();

        resultShow.addToList(1,"Gabs");
        resultShow.addToList(2,"Gabs2");
        resultShow.addToList(3,"Gabs3");
        resultShow.addToList(2,"Gabs4");

        System.out.println(resultShow.getValue(1));
        System.out.println(resultShow.getValue(3));
    }
}
