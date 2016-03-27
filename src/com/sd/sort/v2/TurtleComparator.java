/*
 * @author jsl
 * @since 20160312
 * to show how to use java.util.Comparator
    > import com.sd.turtle.WeightTurtle;
    > import com.sd.sort.v2.TurtleComparator;
    > WeightTurtle wt10 = new WeightTurtle(10);
    > WeightTurtle wt20 = new WeightTurtle(20);
    > TurtleComparator tc=new TurtleComparator()
    > int res=tc.compare(wt10,wt20)
    > res
    -10
 */
package com.sd.sort.v2;
import ch.aplu.turtle.*;
import com.sd.turtle.WeightTurtle;

import java.util.Comparator;
public class TurtleComparator implements Comparator<WeightTurtle> {
    public int compare(WeightTurtle t1, WeightTurtle t2) {
        return t1.getWeight()-t2.getWeight();
    }
}

