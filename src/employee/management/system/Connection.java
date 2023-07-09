package employee.management.system;

import java.sql.DriverManager;
import java.sql.Statement;
public class Connection {
    
    Connection c;
    Statement s;

    public Connection () {
    	
        try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
           java.sql.Connection  c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}