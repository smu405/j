/* 
 * @author jsl
 * @version 20151127
 * simple version of compositeIterator
 * javac -d classes/ -sourcepath src/ src/headfirst/composite/stackiter/jsCompositeIteratorMain.java 
 * java -cp classes/ headfirst.composite.stackiter.jsCompositeIteratorMain
 */
package headfirst.composite.stackiter;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


import headfirst.composite.menuiterator.MenuComponent;
import headfirst.composite.menuiterator.Menu;
import headfirst.composite.menuiterator.Waitress;
import headfirst.composite.menuiterator.MenuItem;
 
class jsCompositeIteratorMain implements Iterator<MenuComponent> {
    //private Stack<Iterator<MenuComponent>> iteratorStack = new Stack<Iterator<MenuComponent>>();
    private Stack<Iterator<MenuComponent>> iteratorStack = new Stack<Iterator<MenuComponent>>();
 
    jsCompositeIteratorMain(MenuComponent component) {
        ArrayList<MenuComponent> temp = new ArrayList<MenuComponent>();
        temp.add(component);
        Iterator<MenuComponent> iterator = temp.iterator();
        iteratorStack.push(iterator);
    }
    public boolean hasNext() {
        return !iteratorStack.isEmpty();
    }
    public MenuComponent next() {
        MenuComponent retComponent = null;
        Iterator<MenuComponent> iterator = iteratorStack.peek();
        retComponent = iterator.next();
 
        if (!iterator.hasNext())
            iteratorStack.pop();
 
        Iterator<MenuComponent> iterator2 = retComponent.createIterator();
        if (iterator2.hasNext())
            iteratorStack.push(iterator2);
 
        return retComponent;
    }
 
    public void remove() {
    }
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("한글PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("한글DINER MENU", "Lunch");
        //MenuComponent cafeMenu = new Menu("한글CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("한글DESSERT MENU", "Dessert of course!");
  
        MenuComponent allMenus = new Menu("한글ALL MENUS", "All menus combined");
  
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        //allMenus.add(cafeMenu);
  
        pancakeHouseMenu.add(new MenuItem("한글K&B's Pancake Breakfast", 
            "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("한글Regular Pancake Breakfast", 
            "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("한글Blueberry Pancakes",
            "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49));
        //pancakeHouseMenu.add(new MenuItem("한글Waffles",
            //"Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("한글Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("한글BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("한글Soup of the day",
            "A bowl of the soup of the day, with a side of potato salad", false, 3.29));
        //dinerMenu.add(new MenuItem("한글Hotdog",
        //    "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
        //dinerMenu.add(new MenuItem("한글Steamed Veggies and Brown Rice",
        //    "A medly of steamed vegetables over brown rice", true, 3.99));
        //dinerMenu.add(new MenuItem("한글Pasta",
        //    "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));

        dinerMenu.add(dessertMenu);
  
        dessertMenu.add(new MenuItem("한글Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("한글Cheesecake",
            "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("한글Sorbet",
            "A scoop of raspberry and a scoop of lime", true, 1.89));

        //cafeMenu.add(new MenuItem("한글Veggie Burger and Air Fries",
        //    "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        //cafeMenu.add(new MenuItem("한글Soup of the day",
        //    "A cup of the soup of the day, with a side salad", false, 3.69));
        //cafeMenu.add(new MenuItem("한글Burrito",
        //    "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
 
        Iterator iterator = allMenus.createIterator();
        System.out.println("\njsVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
