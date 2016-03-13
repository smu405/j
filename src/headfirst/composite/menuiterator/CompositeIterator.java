package headfirst.composite.menuiterator;

import java.util.*;
  
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();
    public CompositeIterator(Iterator iterator) {
        //System.out.println("jsl:constructor pushing now..."+iterator.toString());
    	stack.push(iterator);
        System.out.println(">>> jsl:constructor"+Arrays.toString(stack.toArray()));
    }
    public Object next() {
    	if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                System.out.println(">>> jsl:next"+Arrays.toString(stack.toArray()));
                stack.push(component.createIterator());
            } 
            return component;
    	} else {
            return null;
    	}
    }
    public boolean hasNext() {
    	if (stack.empty()) {
            return false;
    	} else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                System.out.println(">>> jsl:hasNext"+Arrays.toString(stack.toArray()));
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
    	}
    }
    public void remove() {
    	throw new UnsupportedOperationException();
    }
}

