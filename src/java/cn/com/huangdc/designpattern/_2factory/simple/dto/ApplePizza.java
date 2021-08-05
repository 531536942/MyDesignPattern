package cn.com.huangdc.designpattern._2factory.simple.dto;

public class ApplePizza extends Pizza {

    public ApplePizza() {
        this.setName("苹果");
    }

    @Override
    public void pre() {
        System.out.println("准备苹果披萨的食材");
    }
}
