package cn.com.huangdc.designpattern._2factory.simple;

import cn.com.huangdc.designpattern._2factory.simple.dto.Pizza;

public class PizzaActivity {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza beef = pizzaFactory.createPizza("beef");
        beef.doPizza();

        Pizza apple = pizzaFactory.createPizza("apple");
        apple.doPizza();
    }
}
