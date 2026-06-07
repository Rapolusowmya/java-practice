/*  Exceptions are 2 types
checked Exception - checked at compile time, can be caught using either try catch or throws extends Exception. if not caught will throw an exception at compile time
unchecked Exception - checks at runtime time. extends RunTimeException class. if not caught compiles successfully, but throws an Exception at runtime. Its ur choice to catch it or not.
*
checked Exceptions:
Common Checked Exceptions
Exception	When?
IOException	File operations
FileNotFoundException	File doesn't exist
SQLException	Database operations
ClassNotFoundException	Class loading issues
ParseException	Parsing failures

unchecked exceptions:
Exception	When?
NullPointerException	Accessing null
ArithmeticException	Divide by zero
ArrayIndexOutOfBoundsException	Invalid index
NumberFormatException	Invalid conversion
IllegalArgumentException	Invalid argument

Custom Exceptions:
create a new Exception and throw it

*  A try  should either have a catch or finally or both. try cannot be alone
* */
package concepts;
class A
{
    public void validate() throws Exception {
        throw new Exception("DO not touch validate");
    }
}
public class Exceptions {

    public static  void main(String[] args) throws Exception {
        A a = new A();
        try{
            a.validate();
        }
        finally {
            System.out.println(" a catch is not necessary for try block. Finally also sufficient");
        }
//        catch (Exception e)
//        {
//            System.out.println("handled the Exception");
//        }

    }

}
/*
*  If a try has multiple catches, Then the order of handling the catches is also imp.
* specific to error or Exception must be on the top and Exception e should be at the below.
* catch 1 caughts the Exception then fine if not goes to catch 2 , and 3 and goes on. If caught at catch 1 then rest all catches are ignored.
*
*
*
*
* */