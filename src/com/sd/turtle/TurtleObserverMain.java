/* 
 * @author jsl
 * @since 20160310
 * Demonstrate the Observable class and the Observer interface. 
 * The MomTurtle observes and moves to the position of the BabyTurtle.
 * 1) mom moves and baby also moves
 * 2) baby's notification is set on to let mom know
*/ 

package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class TurtleObserverMain {
    public static void main(String[] args) {
        System.out.println("--Observer pattern demo");
        //turtle subject
        BabyTurtle baby=new BabyTurtle();
        //turtle observer
        MomTurtle mom=new MomTurtle();
        baby.addObserver(mom);
        //mom goes to somewhere
        mom.moveTo(100,100);
        //baby moves and let mom know it
        baby.move(100,-100);
        //protected method -> others can not set any changes
        baby.setChanged();
        baby.notifyObservers();
    }
}

class MomTurtle extends Turtle implements Observer {
    Double babyCurpos;
    public MomTurtle() {
        setColor(Color.red);
        label("mom turtle");
    }
    public void update(Observable o, Object arg) {
        System.out.println("update() called, count is " + ((Integer)arg).intValue()); 
        babyCurpos=((BabyTurtle)o).myCurpos;
        System.out.println("current pos" + babyCurpos);
        moveTo(babyCurpos);
    }
}

//BayTurtle did not inherit Turtle
//because multiple inheritance is not allowed in java
class BabyTurtle extends Observable {
    Turtle baby;
    Double myCurpos;
    ArrayList<Observer> obs;
    public BabyTurtle() {
        baby = new Turtle();
        myCurpos=baby.getPos();
        obs=new ArrayList<Observer>();
    }
    public void addObserver(Observer o) {
        obs.add(o);
    }
    public void notifyObservers() {
        for(Observer o:obs)
            o.update(this, 1);
    }
    protected void setChanged() {
        myCurpos=baby.getPos();
    }
    public void move(int x, int y) {
        baby.moveTo(x,y);
    }
}

