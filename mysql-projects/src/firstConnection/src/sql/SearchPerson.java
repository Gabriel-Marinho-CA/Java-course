package firstConnection.src.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static firstConnection.src.application.Program.sc;
import static firstConnection.src.sql.QueryStatment.QUERY_EXECUTE;
import static firstConnection.src.sql.QueryStatment.QUERY_UPDATE;

public class SearchPerson {
    public static void SearchPeople() {
        String sql = """
                SELECT * FROM people
                """;

        ResultSet res = QueryExecutor.ExecuteQuery(0, sql, QUERY_EXECUTE);

        List<NewPeople> people = new ArrayList<>();

        try {
            while (res.next()) {
                int cod = res.getInt("cod");
                String name = res.getString("name");
                people.add(new NewPeople(name, cod));
            }

            for (NewPeople person : people) {
                System.out.println(person.getCod() + " ==> " + person.getName());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void SearchPeopleByFName() {
        String sql = "SELECT * FROM people WHERE name LIKE ?";

        System.out.println("Type name to search");
        String nameSearch = "%" + sc.next() + "%";

        ResultSet res = QueryExecutor.ExecuteQuery(1, sql, QUERY_EXECUTE, nameSearch);

        List<NewPeople> list = new ArrayList<>();

        try {
            assert res != null;

            while (res.next()) {
                list.add(
                        new NewPeople(res.getString("name"), res.getInt("cod"))
                );
            }

            for (NewPeople p : list) {
                System.out.println("--- \nName: " + p.getName() + "\nId:" + p.getCod());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
