import com.alibaba.druid.DruidRuntimeException;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
    public static DruidPooledConnection getConnection() {
        Properties properties = new Properties();
        DruidPooledConnection connection = null;
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
            DruidDataSource druidDataSource = new DruidDataSource();
            druidDataSource.configFromPropety(properties);
            try {
                connection = druidDataSource.getConnection();
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        DruidPooledConnection connection = JDBC.getConnection();
        System.out.println(connection);
    }
}
