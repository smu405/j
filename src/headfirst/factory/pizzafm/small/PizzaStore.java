package headfirst.factory.pizzafm.small;

public abstract class PizzaStore {
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
