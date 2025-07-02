package model;

import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food implements Discountable {
    private String colour;

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.DISCOUNT;
        }else{
            return 0;
        }
    }


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }
}