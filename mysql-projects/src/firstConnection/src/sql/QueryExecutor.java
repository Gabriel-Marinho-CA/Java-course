package firstConnection.src.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static firstConnection.src.application.Program.conn;
import static firstConnection.src.application.Program.st;

public class QueryExecutor {

    public static ResultSet ExecuteQuery(Integer numberIndexParam, String sql, QueryStatment queryType, String... param) {

        try {
            st = conn.prepareStatement(sql);

            if (numberIndexParam > 0) {
                if (param.length >= 1) {
                    st.setString(numberIndexParam, param[0]);
                } else {
                    throw new IllegalArgumentException("Missing parameter");
                }
            }

            if (queryType == QueryStatment.QUERY_UPDATE) {
                st.executeUpdate();
                return null;
            }

            return st.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
