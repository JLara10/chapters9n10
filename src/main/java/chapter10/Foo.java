package chapter10;

public class Foo {
    final int SIZE = 3;//example of a non-static final variable.
    //you can no longer change value of size!
    final static int y = 10;//example of a final static variable without a static initializer.
    final static int x;
    static {//example of static initializer
        x = 42;
    }
    //x will hold a value of 42 that can never be changed because it
    //has the final keyword.
final void example(){
        //example of a final method. anything within this method CAN NOT BE OVERRIDEN!

}
/* final class example(){
this is an example of a final class. class can not be extended if its final.
}
 */



}
