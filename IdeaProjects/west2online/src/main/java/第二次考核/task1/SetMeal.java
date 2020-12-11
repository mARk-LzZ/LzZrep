package 第二次考核.task1;


import 第二次考核.task1.Drinks;

public class SetMeal {
    protected String name ;
    protected int id;
    protected double price;
    protected String chicken ;
    Drinks beer;
    Drinks juice;
    public SetMeal(int id,String name,double price ,Drinks beer) {
        this.id = id;
        this.name = name;
        this.price = price;
        chicken = "脆皮鸡腿";
        this.beer = beer;
        this.juice = beer;
    }



}
