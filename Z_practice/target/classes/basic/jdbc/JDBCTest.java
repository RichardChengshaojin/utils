package basic.jdbc;

import java.sql.*;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/1
 */
public class JDBCTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://172.20.4.206:3306/tms_test_ls?user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
        String driver = "com.mysql.jdbc.Driver";

        System.out.println(System.getProperty("jdbc.drivers"));

        // 加载驱动
        try {
            Class.forName(driver);
            System.out.println("驱动加载成功...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取数据库连接
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("数据库连接获取成功..");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // DB op
        String sql = "select * from t_app_app;";
        System.out.println(String.format("%s\t\t%s", "id", "name"));
        try {
            assert connection != null;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if(null != resultSet) {
                while(resultSet.next()) {
                    System.out.println(String.format("%s\t\t%s", resultSet.getString("id"), resultSet.getString("name")) );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}