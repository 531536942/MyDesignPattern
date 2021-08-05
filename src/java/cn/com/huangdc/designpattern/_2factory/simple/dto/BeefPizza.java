package cn.com.huangdc.designpattern._2factory.simple.dto;

public class BeefPizza extends Pizza {

    public BeefPizza() {
        this.setName("牛肉");
    }

    @Override
    public void pre() {
        System.out.println("准备牛肉披萨的食材");
    }
}
