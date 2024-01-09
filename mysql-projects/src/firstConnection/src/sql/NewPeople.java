package firstConnection.src.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static firstConnection.src.application.Program.conn;
import static firstConnection.src.application.Program.sc;
import static firstConnection.src.sql.QueryStatment.QUERY_EXECUTE;
import static firstConnection.src.sql.QueryStatment.QUERY_UPDATE;

public class NewPeople {

    private String name;
    private Integer cod;

    public NewPeople(String name, Integer cod) {
        this.name = name;
        this.cod = cod;
    }

    public static void InsertNewPeople () {

        try {
            System.out.println("What's the name :");
            String name = sc.next();

            String sql = "INSERT INTO people (name) VALUES(?)";

            QueryExecutor.ExecuteQuery(1,sql,QUERY_UPDATE,name);

            System.out.println("Included Successfully");

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
