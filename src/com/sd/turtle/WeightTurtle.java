/*
 * @author jsl
 * @since 20160312
 */
package com.sd.turtle;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtle extends Turtle {
    protected int weight;
    public WeightTurtle(int w) {
        weight=w;
        setColor(Color.red);
        setPenColor(Color.red);
    }
    public int getWeight() {
        return weight;
    }
}
