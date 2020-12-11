package 第二次考核.task1;

import java.time.LocalDate;

public class Beer extends Drinks {
    private float degree;//酒精度数


    public Beer(String name, double cost, LocalDate PD, float degree) {
        super(name, cost, PD,30);
        this.degree = degree;

    }

    public Beer(){

    }
    @Override
    public boolean isexpired() {
       if (LocalDate.now().isAfter(PD.plusDays(shelf_life))){
           System.out.println("亲，啤酒的保质期过了噢");
           return false;
       }
        System.out.println("啤酒可放心饮用");
        return true;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", PD=" + PD +
                ", shelf_life=" + shelf_life +
                '}';
    }

}
