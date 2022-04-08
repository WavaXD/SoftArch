package lab10;

/**
 *
 * @author Asus
 */

public class TechnologyNews extends News {
    TechnologyNews(String content) {super(content);}

    @Override
    public NewsTopic getTopic() {
        return NewsTopic.TECHNOLOGY;
    }
}
