/*
 * @author jsl
 * @verison 20160216
 *
 */

package com.sd.sort.v1;

import com.sd.turtle.WeightTurtle;
import ch.aplu.turtle.*;

import java.awt.Color;
//import java.util.Collection;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;

public class WeightTurtleComparable
/*    extends WeightTurtle
    implements Comparable<WeightTurtle> {
    public int compareTo(WeightTurtle wt) {
        return this.getWeight() - wt.getWeight(); 
    }
}*/
    extends Turtle 
    implements Comparable<WeightTurtleComparable> {
    protected int weight;
    public WeightTurtleComparable(int w) {
        weight=w;
        setColor(Color.red);
        setPenColor(Color.red);
    }
    public int getWeight() {
        return weight;
    }
    public int compareTo(WeightTurtleComparable wt) {
        return this.getWeight() - wt.getWeight(); 
    }
}

