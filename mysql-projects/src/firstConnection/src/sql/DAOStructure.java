package firstConnection.src.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static firstConnection.src.application.Program.conn;

public class DAOStructure {

    private Connection conn;

    public int insert(String sql, Object... attributes) {
        try {
            PreparedStatement st = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            addAttr(st,attributes);

            if (st.executeUpdate() > 0) {
                ResultSet result = st.getGeneratedKeys();

                if (result.next()) {
                    return result.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void addAttr(PreparedStatement st, Object[] attributes) throws SQLException {
        int idx = 1;

        for (Object attr : attributes) {
            if (attr instanceof String) {
                st.setString(idx, (String) attr);
            } else if (attr instanceof Integer) {
                st.setInt(idx, (Integer) attr);
            }

            idx++;
        }

    }

}
