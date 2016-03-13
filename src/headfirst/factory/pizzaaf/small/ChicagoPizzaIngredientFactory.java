package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
