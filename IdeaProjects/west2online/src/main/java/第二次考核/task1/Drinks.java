package 第二次考核.task1;

import java.time.LocalDate;

public abstract class Drinks {
    protected String name;//我的名字
    protected double cost;//成本
    protected LocalDate PD;//Production Date 生产日期
    protected int shelf_life;//保质期

    public Drinks(String name, double cost, LocalDate PD, int shelf_life) {
        this.name=name;
        this.cost=cost;
        this.PD=PD;
        this.shelf_life=shelf_life;
    }

    public Drinks() {
    }

    public abstract boolean isexpired();

    @Override
    public abstract String toString();
}



