package Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JDBC_Utils {
    static DataSource ds;
    static {
        Properties p = new Properties();
        try {
            p.load(new FileReader("D:\\JAVA学习\\豆瓣前端系统\\src\\druid.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
