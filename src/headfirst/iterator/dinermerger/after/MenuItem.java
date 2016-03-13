package headfirst.iterator.dinermerger.after;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian; //jsl20151122: used in isVegetarian() and for waitress to order
    double price;
 
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    //public boolean isVegetarian() {
    //    return vegetarian;
    //}
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
