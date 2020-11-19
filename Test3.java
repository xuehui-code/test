package xuehui.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/test1?user=root&password=420493&useUnicode=true&characterEncoding=UTF-8");
        System.out.println(connection);

        Statement statement = connection.createStatement();

        String sql =  "select stu.sn sn,stu.name name,cou.name coure,sco.score score" +
                "   from score sco left join student stu on sco.student_id = stu.id " +
                "   left join course cou on sco.course_id = cou.id" +
                "   where stu.classes_id = 1" +
                "   order by stu.sn;";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            int sn = resultSet.getInt("sn");
            String name = resultSet.getString("name");
            String coure = resultSet.getString("coure");
            BigDecimal score = resultSet.getBigDecimal("score");
            System.out.printf("sn=%s,name=%s,cooure=%s,score=%s%n",
                    sn,name,coure,score);
        }
        if (resultSet!=null){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if (connection!=null){
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}