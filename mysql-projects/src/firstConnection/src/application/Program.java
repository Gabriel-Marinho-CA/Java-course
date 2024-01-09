package firstConnection.src.application;

import firstConnection.db.DB;
import firstConnection.db.DbException;
import firstConnection.src.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static firstConnection.src.sql.QueryStatment.QUERY_UPDATE;

public class Program {
    public static Connection conn = null;
    public static PreparedStatement st = null;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String sql = "CREATE DATABASE IF NOT EXISTS curso_java";

        try {
            conn = DB.getConnection();

            if (conn != null) {
                QueryExecutor.ExecuteQuery(0, sql, QUERY_UPDATE);

//                CreateTable.CreateNewTable();

                NewPeople.InsertNewPeople();

                SearchPerson.SearchPeople();

//                SearchPerson.SearchPeopleByFName();

//                UpdatePerson.UpdatePersonById();
                DeletePerson.DeletePersonById();
            }


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());

        } finally {
            CloseResource();
        }
    }

    private static void CloseResource() {
        try {
            if (sc != null) {
                sc.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
