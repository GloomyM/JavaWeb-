package Dao;

import Bean.Book;
import Bean.Movie;
import Utils.JDBC_Utils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SpiderDao {
    static JdbcTemplate jt = new JdbcTemplate(JDBC_Utils.getDataSource());

    public List<Book> books(){
        String sql = "select* from book";
        return jt.query(sql,new BeanPropertyRowMapper<>(Book.class));
    }

    public List<Movie> movies(){
        String sql = "select* from movie";
        return jt.query(sql,new BeanPropertyRowMapper<>(Movie.class));
    }
}
