package cn.com.huangdc.designpattern._3singleton.enums;

/**
 * 这里的instance即为SingletonEnum类型的引用所以得到它就可以调用枚举中的方法了
 */
public enum SingletonEnum {
    instance;

    private SingletonEnum(){
    }

    public void whateverMethod(){

    }
}
