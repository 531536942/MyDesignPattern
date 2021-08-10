package cn.com.huangdc.designpattern._3singleton.in;

/**
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 */
public class SingletonIn {
    private SingletonIn() {}

    private static class SingletonInHandler {
        private static SingletonIn singletonIn = new SingletonIn();
    }

    public SingletonIn getInstance() {
        return SingletonInHandler.singletonIn;
    }
}
