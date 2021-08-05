package cn.com.huangdc.designpattern._2factory.simple;

import cn.com.huangdc.designpattern._2factory.simple.dto.ApplePizza;
import cn.com.huangdc.designpattern._2factory.simple.dto.BeefPizza;
import cn.com.huangdc.designpattern._2factory.simple.dto.Pizza;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "beef":
                return new BeefPizza();
            case "apple":
                return new ApplePizza();
            default:
                return new ApplePizza();

        }
    }
}
