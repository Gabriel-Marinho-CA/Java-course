package firstConnection.src.sql;

import firstConnection.db.DbException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static firstConnection.src.application.Program.*;

public class DeletePerson {

    static final String sql = "DELETE FROM people WHERE cod = ?";
    static final String sqlToSearch = "SELECT * FROM people WHERE cod = ?";

    public static void DeletePersonById() {
        try {
            st = conn.prepareStatement(sql);
            PreparedStatement stCheckPerson = conn.prepareStatement(sqlToSearch);

            System.out.println("Type de cod that you want to delete: ");
            int codPerson = sc.nextInt();

            stCheckPerson.setInt(1, codPerson);
            st.setInt(1, codPerson);

            ResultSet resCheckPerson = stCheckPerson.executeQuery();

            if (resCheckPerson.next()) {

                String name = resCheckPerson.getString(2);
                int cod = resCheckPerson.getInt(1);

                NewPeople peopleDeleted = new NewPeople(name, cod);

                System.out.println("Person: " + peopleDeleted.getName() + " - cod: " + peopleDeleted.getCod() + " have been deleted");

                st.executeUpdate();

            } else {
                throw new RuntimeException("Person not found in database");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}
