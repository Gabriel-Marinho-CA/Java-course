package firstConnection.src.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static firstConnection.src.application.Program.conn;
import static firstConnection.src.application.Program.sc;

public class UpdatePerson {

    static final String sql = "UPDATE people SET name = ? WHERE cod = ? ";

    public static void UpdatePersonById() {

        try {
            PreparedStatement prep = conn.prepareStatement(sql);

            System.out.println("Type name to update: ");
            String nameUpdate = sc.next();

            System.out.println("Type id to update name: ");
            int codUpdate = sc.nextInt();

            prep.setString(1,nameUpdate);
            prep.setInt(2,codUpdate);

            prep.executeUpdate();

            SearchPerson.SearchPeople();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
