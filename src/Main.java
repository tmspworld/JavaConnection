import com.mysql.cj.jdbc.Driver;

// https://www.youtube.com/watch?v=TcJZQvDE1ow
// Best Tutorial for This Connection

import java.sql.*;

public class Main {

    private static final String url="jdbc:mysql://localhost:3306/school";

    private static final String username ="root";

    private static final String password ="";


    public static void main(String[] args) {
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        try
        {
            Connection con = DriverManager.getConnection(url,username,password);

            Statement st = con.createStatement();

            String query = "select * from student";

            ResultSet rs =  st.executeQuery(query);

            while(rs.next()){
int id = rs.getInt("stu_id");
String name = rs.getString("stu_name");
String stu_class = rs.getString("stu_class");
int marks = rs.getInt("marks");

System.out.println("ID : " + id);
System.out.println("Name : " + name);
System.out.println("Class : " + stu_class);
System.out.println("Marks : " + marks);

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
