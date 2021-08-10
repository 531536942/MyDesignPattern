package cn.com.huangdc.designpattern._3singleton.lanhan;

/**
 * 懒汉式最优写法
 * 双层判断+锁，保证了延迟加载和线程安全
 * volatile很关键
 */
public class SingletonLanhan {
    private SingletonLanhan () {}

    private volatile SingletonLanhan singletonLanhan;

    public SingletonLanhan getInstance() {
        if (null == singletonLanhan) {
            synchronized (SingletonLanhan.class) {
                if (null == singletonLanhan) {
                    singletonLanhan = new SingletonLanhan();
                }
            }
        }
        return singletonLanhan;
    }
}
