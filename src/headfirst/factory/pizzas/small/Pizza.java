package headfirst.factory.pizzas.small;
public abstract class Pizza {
  String name;
  void prepare() {
    System.out.println("preparing...");
  }  
  void bake()  {
    System.out.println("Baking...");
  }
  void cut() {
    System.out.println("cutting...");
  }
  void box() {
    System.out.println("boxing...");
  }
  public String getName() {
    return name;
  }
  public String toString() {
    System.out.println("---"+name+"---");
    return name;
  }
}
