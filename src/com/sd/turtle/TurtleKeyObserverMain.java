/*
 * author jsl
 * since 20160327
 * key observer
 *
 * move on arrow key press
 *
 */

package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//no need to extend KeyListener which is provided by Turtle
class TurtleKeyListener extends Turtle {
    public TurtleKeyListener() {
        //anonymous class used because
        //e.getSource() returns ch.aplu.turtle.Palyground
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch( keyCode ) { 
                    case KeyEvent.VK_UP:
                        setStatusText("forward 20");
                        forward(20);
                        break;
                    case KeyEvent.VK_DOWN:
                        setStatusText("back 20");
                        back(20);
                        break;
                    case KeyEvent.VK_LEFT:
                        setStatusText("turn left");
                        left(90);
                        break;
                    case KeyEvent.VK_RIGHT :
                        setStatusText("turn right");
                        right(90);
                        break;
                    case KeyEvent.VK_Q:
                        //to quit
                        setStatusText("q pressed");
                        break;
                 }
            }
        });
    }
}

public class TurtleKeyObserverMain {
    public static void main(String[] args) {
        TurtleKeyListener t=new TurtleKeyListener();
        t.addStatusBar(20);
        t.setStatusText("Press any key!");
    }
}

