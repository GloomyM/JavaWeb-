package Service;

import Bean.Book;
import Bean.Movie;
import Dao.SpiderDao;

import java.util.List;

public class SpiderService {

    static SpiderDao pd = new SpiderDao();

    public List<Book> getbooks(){
        return pd.books();
    }

    public List<Movie> getmovies(){
        return pd.movies();
    }

}
