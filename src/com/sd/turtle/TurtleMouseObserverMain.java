/*
 * author jsl
 * since 20160327
 * key observer
 *
 * move on arrow key press
 *
 */

//import java.awt.geom.*;

package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

//no need to extend MouseListener which is provided by Turtle
class TurtleMouseListener extends Turtle {
    public TurtleMouseListener() {
        //MouseAdapter is an observer
        //anonymouse class here again!
        //e.getSource() returns ch.aplu.turtle.Palyground
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Point2D.Double p;
                double d;
                double w;
                //returns java.awt.Point
                //no! p = (Point2D.Double)(e.getPoint());
                p = toTurtlePos(e.getPoint());
                d = distance(p);
                w = towards(p);
                heading(w);
                forward(d);
                setStatusText("moving to "+p.toString());
            }
        });
        //to enable dragging, add a motion listener
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point2D.Double p;
                p = toTurtlePos(e.getPoint());
                moveTo(p);
                setStatusText("dragging to "+p.toString());
            }
        });
    }
}

public class TurtleMouseObserverMain {
    public static void main(String[] args) {
        TurtleMouseListener t=new TurtleMouseListener();
        t.addStatusBar(20);
        t.setStatusText("Click or drag!");
    }
}

