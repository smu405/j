/*
 * @author jsl
 * @version 20151125
 * to see how a stack iterator works
 */
package headfirst.composite.stackiter;

import java.util.Stack;
import java.util.Arrays;
import java.util.Iterator;
public class StackIterMain {
    public static void main(String[] args) {
        String myStr;
        //Stack type must be Object
        Stack<Object> myStack=new Stack();
        myStack.push("a");
        myStack.push("b");
        System.out.println(Arrays.toString(myStack.toArray()));

        Iterator iterator = myStack.iterator();
        while(iterator.hasNext()) {
            myStr=(String)iterator.next();
            System.out.println(myStr);
        }
    }
}



