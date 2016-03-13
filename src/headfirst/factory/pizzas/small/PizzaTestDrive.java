package headfirst.factory.pizzas.small;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory fac=new SimplePizzaFactory();
    PizzaStore store=new PizzaStore(fac);
    Pizza pizza=store.orderPizza("cheese");
    System.out.println("We ordered a "+pizza.getName());
  }
}
