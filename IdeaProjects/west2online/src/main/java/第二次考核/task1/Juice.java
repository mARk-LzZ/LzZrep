package 第二次考核.task1;

import 第二次考核.task1.Drinks;

import java.time.LocalDate;

public class Juice extends Drinks {

    public Juice(String name, double cost, LocalDate PD) {
        super(name, cost, PD, 2);
    }

    public Juice(){

    }
    @Override
    public boolean isexpired() {
        if (LocalDate.now().isAfter(PD.plusDays(shelf_life))){
            System.out.println("亲，果汁的保质期过了噢");
            return false;
        }
        System.out.println("果汁可放心饮用");
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
