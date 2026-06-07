/*
 * To sort the collections internally we can use 2 interfaces
 * 1. Comparable:
 *  this comes from .lang package and it has only 1 method compareTo().
 *  can be sorting only single sorting technique
 * 2. Comparator:
 * this comes from .util package. and has method compare()
 * can be sorted based on multiple sorting technqiues, can be sorted by multiple attributes
 *
 * when implementing the Comparable mention the type of the class we are comparing
 * */
package concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employe implements Comparable<Employe>
{
    int id;
    String name;
    Double sal;
    Employe(int id , String name , Double sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.id ,e.id);
    }
    public String toString()
    {

        return "Id: "+this.id + " name: " + this.name+ " sal: " +this.sal ;
    }
}
public class ComparableDemo {
    public static void main(String[] args)
    {
        List<Employe> list = Arrays.asList(
                new Employe(1,"Raju", 2000.0),
                new Employe(3, "Sanju", 3000.0),
                new Employe(2,"Raghu",7000.0)
        );
        Collections.sort(list);
        System.out.println(list);
    }
}
