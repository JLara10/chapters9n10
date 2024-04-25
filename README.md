Chapter 9 page 261

The heap = where objects live (also known as “the garbage collectible heap” 

The Stack= where method invocations and local variable live

Instance Variable are declared inside a class but not inside a method.

Local variables are declared inside a method, including method parameters.

If the local variable is a reference to an object, only the variable (the reference/remote control) goes on the stack.

All local variables live on the stack, in the frame corresponding to the method where the variables are declared.

Object reference variables work just like primitive variables – if the reference is declared as a local variable, it goes on the stack.

All objects live in the heap, regardless of whether the reference is a local or instance variable. 

The 3 steps of object declaration and assignment are declaring a reference variable, create an object and assign the object to the reference.
Only way to invoke a constructor is with the keyword new followed by the class name.

Remember if a method (or constructor) has a parameter, you must pass an appropriate argument when you invoke that method or constructor. 
The complier will not a create a no argument constructor if you created a constructor with a parameter. If you create a constructor the system will automatically back off and let you take over and the no argument constructor created for you will no longer be available, you will have to create your own. 

If you have more than one constructor in a class, they must have different argument lists.

Instance variables live within the object they belong to, on the heap.

If the instance variable is a reference to an object both the reference and the object it refers to are on the heap. 

A constructor is the code that runs when you say the keyword new on a class type. 

Constructors must have same name as the class it’s in and must not have a return type.

You can use a constructor to initialize the state (the instance variables) of the object being constructed.

If you don’t put a constructor in your class, the compiler will do it for you!

The default constructor has no arguments or body it is empty!

Instance variables are assigned a default value, even when you don’t explicitly assign one. The default values are 0/0.0/false for primitive types, and null for references. 

All constructors in an object’s inheritance tree must run when you make a new object. 

To call a super constructor you must use the keyword super (). 

The super constructor must be created before all other constructors.

Use this () to call a constructor from another overloaded constructor in the same class.

The call to this () can be used only in a constructor and must be the first statement in a constructor.

Every constructor can have a call to super () or this (), but never to both!

The super class parts of an object must be fully formed before the new subclass object can exist. 

An objects life depends on the life of references referring to it. 

Life = A local variable is alive as long as its Stack frame is on the stack. Basically, until the method compiles. 

Scope = A local variable is in scope only within the method in which the variable was declared. When its own method calls another, the variable is alive but not in the scope until its method resumes. You can use a variable only when it’s in scope.


Chapter 10 

Keyword static lets a method run without any instance of the class. A static method means the behavior is not dependent on an instance variable, so no instance/ object is required. Just the class.

Static methods can’t use non static methods either.

All static variables in a class are initialized before any object of that class can be created. 

Static variables in a class are initialized before any static method of the class runs. 

Static variables are initialized when the class is loaded. If you don’t explicitly initialize a static variable by assigning it a value at the time you declare it, it will get a default value for example an int will get a default value of 0. 

A variable marked final means it can never be changed.

Example Math.PI will never change value. 

Constant variable’s (final variables) should be in ALL CAPS! 

A static initializer is a block of code that runs when a class is loaded, before any other code can use the class, so it’s a great place to initialize a static final variable. 

Final keyword is not just for static variables can be used on non-static variables. 

A final method cannot be overridden!

A final class means you can’t extend the class. 

A static method should be called using the class name rather than an object reference variable:
Example Math.random() vs myFoo.go().

A static method can be invoked without any instances of the methods class on the heap. 

A static method is good for a utility method that does not and will never depend on a particular instance variable value. 

A static method is not associated with a particular instance only the class so it cannot access any instance variable values of its class. It wouldn’t know which instances values to use. 

A static method cannot acces a non-static method since non-static methods are usually associated with instance variable state. 

If you have a class with only static methods, and you do not want the class to be instantiated you can mark the constructor private. 

A static variable is a variable shared by all members of a given class. There is only one copy of a static variable in a class, rather than one copy per each individual instance for instance variables.

A static method can access a static variable.

To make a constant in java, mark variable as static and final. 

A final static variable must be assigned a value either at the time it is declared or in a static initializer. 

MATH METHODS
Math.random() = returns a double between 0.0 through(but not including) 1.0

Math.abs() = returns a double that is the absolute. Value of the argument. The method is overloaded, so if you pass it an int it returns an int. Pass it a double and it returns a double.

Math.round () method in the math class rounds floating point number to the nearest integer. 

Math.min() = returns a value that is the minimum of the two arguments. The method is overloaded to take ints, longs, floats, or doubles.

Math.max() = returns a value that is the maximum of the two arguments. The method is overloaded to take ints, longs, floats, or doubles.

When you need to treat a primiative like an object wrap it. 
Example: int i = 288; 	Integer iWrap = new Integer(i);

Auto boxing lets you use either a primitive or its wrapper type virtually anywhere one or the other is expected. 

If a method takes a wrapper type, you can pass a reference to a wrapper or a primitive of the matching type. 

If a method declares a primitive return type you can return either a compatible primitive or a reference to the wrapper of that primitive type. 

Any place a Boolean value is expected you can use either an expression that evaluates to a Boolean (4>2) or a primitive Boolean, or a reference to a Boolean wrapper.

The parse methods take a string and give you back a primitive value. 

%, d = insert commas and format the number as a decimal integer

%.2f = format the number as a floating point with a precision of two decimal places.

%,.2f = insert commas and format the number as a floating point with precision of two decimal places. 
