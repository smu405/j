/* 
 * @see java turtle graphics
 */
package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.Color;

class WithoutThread {
    public WithoutThread() {
        Turtle me = new Turtle(); 
        Turtle me2 = new Turtle(me); 
        me2.setColor(Color.red);
        me2.setPenColor(Color.red);
        me2.setPos(0, 160);
        me2.left(90);
        for (int i = 0; i < 8; i++) {
            step(me);
            step(me2);
        }  
    }
    private void step(Turtle t) {
        t.forward(20);
        t.left(90);
        t.forward(20);
        t.right(90);
    }
}

class ThreadEx1 extends TurtleFrame {
  public ThreadEx1() {
    Turtle me = new Turtle(this);
    Turtle me2 = new Turtle(this);
    me2.setColor(Color.red);
    me2.setPenColor(Color.red);
    me2.setPos(0, 160);
    me2.left(90);
    draw(me);
    draw(me2);
  }

  private void draw(final Turtle t) {
    new Thread() {
      public void run() {
        for (int i = 0; i < 8; i++)
          step(t);
      }
    }.start();
  }

  private void step(Turtle t) {
    t.forward(20);
    t.left(90);
    t.forward(20);
    t.right(90);
  }
}

public class TurtleThreadMain {
    public static void main(String[] args) {
        new WithoutThread();
        new ThreadEx1();
    }
}

