package headfirst.iterator.dinermerger.before;

//public class DinerMenu implements Menu {
public class DinerMenu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    //public Iterator createIterator() {
    //	return new DinerMenuIterator(menuItems);
    //}
 
    // other menu methods here
}
