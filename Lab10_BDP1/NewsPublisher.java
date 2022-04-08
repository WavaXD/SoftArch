package lab10;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
    private List<NewsReader> NewsReaders = new ArrayList<>();

    public void subscribe(NewsReader NewsReader) {
        this.NewsReaders.add(NewsReader);
    }

    public void unsubscribe(NewsReader NewsReader) {
        this.NewsReaders.remove(NewsReader);
    }

    void publish(News news) {
        for(NewsReader sub : NewsReaders){
            sub.update(news.getContent());
        }
    }

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
