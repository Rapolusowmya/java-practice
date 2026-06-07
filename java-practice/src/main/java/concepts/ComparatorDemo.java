/*
* To sort the collections internally we can use 2 interfaces
* 1. Comparable:
*  this comes from .lang package and it has only 1 method compareTo().
*  can be sorting only single sorting technique
* 2. Comparator:
* this comes from .util package. and has method compare()
* can be sorted based on multiple sorting technqiues, can be sorted by multiple attributes
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */


package concepts;

import java.util.*;

class Employee
{
    int id;
    String name;
    Double sal;
    Employee(int id, String name, Double sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public String toString()
    {

        return "Id: "+this.id + " name: " + this.name+ " sal: " +this.sal ;
    }
}

public class ComparatorDemo {
    public static  void main(String[] args)
    {
        List<Employee> list = Arrays.asList(
                new Employee(1,"Raju", 2000.0),
                new Employee(2, "Sanju", 3000.0),
                new Employee(3,"Raghu",7000.0)
    );
        System.out.println("sorting based on Ids ");
        Comparator<Employee> sortByID = (e1, e2) -> e1.id - e2.id;
        list.sort(sortByID);
        System.out.println(list);
        System.out.println("sorting bsaed on names");
        Comparator<Employee> sortByName = (e1, e2) -> e1.name.compareTo(e2.name);
        list.sort(sortByName);
        System.out.println(list);
        System.out.println("sorting based on sal");
        Comparator<Employee> sortBySal = (e1, e2)->Double.compare(e1.sal , e2.sal);
        list.sort(sortBySal);
        System.out.println(list);

    }
}
