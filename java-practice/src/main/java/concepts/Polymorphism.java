/*
Polymorphism - performing a task in diff ways
run time polymorphism - method overriding  runtime
method overloading - compile time
upcasting - assigning child object to parent reference
why upcasting means,
--> we can create objects directly to the child class but if use parent ref , we can assign the same parent reference to multiple children.
--> That means, I have to create 2 objects if I have 2 children, if I use parent reference only 1 object is enough
 class A and class B
 class Parent {}
 Parent p = new A();
 p = new B();  --> same parent p used for 2 classes
* */

package concepts;

class Parent
{
    public void parentMethod()
    {
        System.out.println("parent method");
    }
}
class Child extends Parent
{

}
public class Polymorphism {
    public static void main(String[] args)
    {
        Parent p = new Child();
        p.parentMethod();
    }
}
