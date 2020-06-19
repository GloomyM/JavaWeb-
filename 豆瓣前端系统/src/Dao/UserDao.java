package Dao;

import Bean.Admin;
import Utils.JDBC_Utils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    static JdbcTemplate jt = new JdbcTemplate(JDBC_Utils.getDataSource());

    public Boolean login(Admin admin){
        String sql = "select* from admin where username=? and password=?";
        Object[] params = {admin.getUsername(),admin.getPassword()};
        List<Admin> admins = jt.query(sql, params, new BeanPropertyRowMapper<>(Admin.class));
        return admins.isEmpty() ? false : true;
    }

    public void reg(Admin admin){
        String sql = "insert into admin value(?,?)";
        Object[] params = {admin.getUsername(),admin.getPassword()};
        jt.update(sql,params);
        return;
    }
}
