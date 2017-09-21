package test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 * Created by Administrator on 2017/8/24.
 */
public class App{

    @Test
    public void test() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://599c346947a35.bj.cdb.myqcloud.com:5222/crf","root","HHcrf0822");
            System.out.println(con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void random(){
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(9));
        }
    }

}
