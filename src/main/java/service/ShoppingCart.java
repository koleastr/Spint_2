
package service;
import model.Food;

public class ShoppingCart {
    public Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getTotalSumWithoutDiscount(){
        double result = 0;
        for (Food food : foods) {
            result += food.getAmount() * food.getPrice();
        }
        return result;
    }

    public double getTotalSumWithDiscount(){
        double result = 0;
        for (Food food : foods) {
            result += food.getAmount() * food.getPrice() * (1 - food.getDiscount() / 100);
        }
        return result;
    }

    public double getTotalSumVegetarian(){
        double result = 0;
        for (Food food : foods){
            if (food.getIsVegetarian()){
                result += food.getAmount() * food.getPrice();
            }
        }
        return result;
    }
}
