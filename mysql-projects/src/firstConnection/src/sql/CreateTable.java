package firstConnection.src.sql;
public class CreateTable {

    static String sql = """
            CREATE TABLE IF NOT EXISTS people (
                cod INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(80) NOT NULL
            )
            """;

    public static void CreateNewTable() {
        QueryExecutor.ExecuteQuery(0,sql,QueryStatment.QUERY_UPDATE);

        System.out.println("Table Created");

    }

}
