package lab10;

/**
 *
 * @author Asus
 */
public class NewsReader {
    private String name;
    public NewsReader(String name) {
        this.name = name;
    }
    
    public void update(String news) {
        System.out.println(this.name+" received news : " + news);
    }
    
    
    
}
