package headfirst.factory.pizzafm.small;

public class PizzaTestDrive {
  public static void main(String[] args) {
    //SimplePizzaFactory fac=new SimplePizzaFactory();
    PizzaStore nystore=new NYPizzaStore();
    Pizza pizza=nystore.orderPizza("cheese");
    System.out.println("We ordered a "+pizza.getName());
  }
}
