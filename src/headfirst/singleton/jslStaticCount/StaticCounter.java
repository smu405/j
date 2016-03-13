/*
 * @author jsl
 * @version 20151025
*/
package headfirst.singleton.jslStaticCount;

public class StaticCounter {
    private static int count=0;
    public StaticCounter() {
        count+=1;
        System.out.println("count: "+count);
    }
}

