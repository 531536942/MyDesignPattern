package cn.com.huangdc.designpattern._3singleton.ehan;

/**
 * 在类加载的时候就实例化了
 */
public class SingletonEhan {
    private SingletonEhan() {}

    private static SingletonEhan singletonEhan = new SingletonEhan();

    public static SingletonEhan getInstance() {
        return singletonEhan;
    }
}
