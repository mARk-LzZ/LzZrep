package 第二次考核.task1;

import 第二次考核.task1.Drinks;
import 第二次考核.task1.SetMeal;

public abstract interface FriedChickenRestaurant {
    public  abstract void SalesMeal(SetMeal setMeal , int num);//出售套餐
    public abstract void BulkPurchase(Drinks drinks , int num);//批量进货

}
