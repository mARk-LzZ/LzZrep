package 第二次考核.task1;


import java.time.LocalDate;
import java.util.ArrayList;
public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
    protected double balance ;
    public static ArrayList<Beer> beers = new ArrayList<>();
    public static ArrayList<Juice> juices = new ArrayList<>();
    static  ArrayList<SetMeal> meals = new ArrayList<>();
    public static final Drinks corona = new Beer("科罗娜", 8, LocalDate.of(2020,11,3),5.8f);
    public static final Drinks cola = new Juice("可乐",10,LocalDate.of(2020,10,31));
    public static final Drinks melonjuice = new Juice("西瓜汁",16,LocalDate.of(2020,7,31));
    public static final Drinks lemonade = new Juice("柠檬汁",23,LocalDate.of(2020,12,31));

    public static final SetMeal meala = new SetMeal(0,"meala" , 23,corona);
    public static final SetMeal mealb = new SetMeal(1,"mealb", 27,cola);
    public static final SetMeal mealc = new SetMeal(2,"mealc" , 36,melonjuice);
    public static final SetMeal meald = new SetMeal(3,"meald" , 40,lemonade);


    static {
        meals.add(0,meala);
        meals.add(1,mealb);
        meals.add(2,mealc);
        meals.add(3,meald);
    }






    @Override
    //批量进货
    public void BulkPurchase(Drinks drink , int num) throws OverdraftBalanceException {
        if (drink instanceof Beer){
            if ((drink.cost* num) <= balance){
                balance -= drink.cost* num;
                for (int i=0; i < num; i++) {
                    beers.add(i , (Beer) drink);
                }
                System.out.println(num + "瓶" + drink.name + "进货成功，余额：" + balance);
            }else {
                throw new OverdraftBalanceException("钱不够了，" + drink.name + "进货失败");
            }
        }else if (drink instanceof Juice){
            if ((drink.cost* num) <= balance){
                balance -= drink.cost* num;
                for (int i=0; i < num; i++) {
                    juices.add(i , (Juice) drink);
                }
                System.out.println(num + "瓶" + drink.name + "进货成功，余额：" + balance);
            }else {
                throw new OverdraftBalanceException("钱不够了，" + drink.name + "进货失败");
            }
        }
    }
    @Override
    //出售套餐
    public void SalesMeal(SetMeal meal , int num) throws IngredientSortOutException {
            if (meal.beer instanceof Beer){
                for (int i=0; i < num; i++) {
                    balance += meal.price;
                    use(meal.id, (Beer) meal.beer);
                }
                System.out.println(num + "份套餐" + meal.id + "出售成功, 余额：" + balance);
            }else if (meal.juice instanceof Juice){
                for (int i=0; i < num; i++) {
                    balance += meal.price;
                    use(meal.id, (Juice) meal.juice);
                }
                System.out.println( num + "份套餐" + meal.id + "出售成功, 余额：" + balance);
            }

    }

    private void use(int mealid , Beer beer) throws IngredientSortOutException{
        int beersize = beers.size();
            for (int i=0; i < beers.size(); i++) {
                if(beers.get(i).equals(beer)){
                    beers.remove(i);
                    beersize += 1;
                    break;
                }



        }
        if (beers.size() == beersize){
            throw new IngredientSortOutException(beer.name + "不够， " + meals.get(mealid).name + "出售失败");
        }
    }

    private void use(int mealid,Juice juice) throws IngredientSortOutException{
        int juicesize = juices.size();
        for (int i=0; i < juices.size(); i++) {
            if(juices.get(i).equals(juice)){
                juices.remove(i);
                break;
            }
        }

        if (juices.size() == juicesize){
            throw new IngredientSortOutException(juice.name + "不够， " + meals.get(mealid).name + "出售失败");
        }

    }

}
