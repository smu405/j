/*
 * @author jsl
 * @version 20151025
 * tests 1) static counter 2) Math constants and functions
*/
package headfirst.singleton.jslStaticCount;

public class StaticCounterMain {
    public static void main(String[] args) {
        StaticCounter c1=new StaticCounter();
        StaticCounter c2=new StaticCounter();
        StaticCounter c3=new StaticCounter();
        System.out.println(Math.abs(-1));
        System.out.println(Math.PI);
    }
}
