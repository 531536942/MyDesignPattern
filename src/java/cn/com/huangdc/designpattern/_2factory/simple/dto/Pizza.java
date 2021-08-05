package cn.com.huangdc.designpattern._2factory.simple.dto;

public abstract class Pizza {

    private String name;

    public abstract void pre();

    private void cook() {
        System.out.println("做" + name + "披萨");
    }

    private void cut() {
        System.out.println("切" + name + "披萨");
    }

    public void doPizza() {
        pre();
        cook();
        cut();
    }

    /**
     * 获取name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
