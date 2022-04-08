package lab11;

/**
 *
 * @author Asus
 */

import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people){
        people.sort(Comparator.comparing(Person::getAge));
    }
}
