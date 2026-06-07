private constructors:
1. A private constructor is a construtor where a object cannot be created directly outside of the class and can be accessible to only within the class.
2. private construtor restricts the object creation and cannot be inherited becoz
   if we create a child class then the child class will call parent class constructor using super(); by defalut and as parent construtor is 
   private it throws a compilation error.

uses of private constructor:
1. if I have to make sure only 1 obj exist for a class then will go with private construtor

eg: Singleton pattern
2. classes that contain only static methods and should never be instanstiated
eg: Math class
3. FOrce object creation thr Factory method