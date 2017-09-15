package basic.collection.foreach;

import entity.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Use class People to test foreach
 *
 * @auther chengshaojin
 * @since 2016/12/20
 */
public class UsePeople {

    public static void main(String[] args) {
        People p = new People();
        p.addPerson(new Person("richard", 20, 165.5, 56.5, "male"));
        p.addPerson(new Person("cassiel", 25, 160, 50, "female"));
        p.addPerson(new Person("sunny", 22, 158, 40, "female"));
        p.addPerson(new Person("jerry", 23, 180, 70, "male"));

        System.out.println("========================iterator");
        Iterator<Person> iterator = p.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        p.removePerson(new Person("jerry", 23, 180, 70, "male"));
        System.out.println("========================foreach");
        for (Person person : p) {
//            p.addPerson(new Person("kathy", 23, 180, 70, "female"));
            System.out.println(person);
        }

        List<String> strs = new ArrayList<>();
        strs.add("1");
        strs.add("2");
        strs.add("3");
        strs.add("4");
        strs.add("5");

        Iterator<String> iteratorStr = strs.iterator();
        while(iteratorStr.hasNext()) {
            String str = iteratorStr.next();
            if("1".equalsIgnoreCase(str)) {
                iteratorStr.remove();
            }
            System.out.println(str);
        }
    }
}
