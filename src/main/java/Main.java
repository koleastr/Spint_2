import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(5, 100),
                new Apple(10, 50, Colour.RED),
                new Apple(8, 60, Colour.GREEN),
        };
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма без скидки: " + cart.getTotalSumWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalSumWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalSumVegetarian());

    }
}