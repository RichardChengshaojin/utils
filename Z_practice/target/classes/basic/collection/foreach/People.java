package basic.collection.foreach;

import entity.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * a collection of person, for testing foreach
 *
 * @auther chengshaojin
 * @since 2016/12/20
 */
public class People implements Iterable<Person> {

    private List<Person> persons;

    private int curIndex = 0;

    public People() {
        super();
        persons = new ArrayList<>();
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void removePerson(Person p) {
        persons.remove(p);
    }

    @Override
    public Iterator<Person> iterator() {
        curIndex = 0;
        return new Iterator<Person>() {
            @Override
            public boolean hasNext() {
                return curIndex < persons.size();
            }

            @Override
            public Person next() {
                return persons.get(curIndex++);
            }
        };
    }
}
