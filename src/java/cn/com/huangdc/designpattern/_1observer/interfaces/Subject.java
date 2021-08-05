package cn.com.huangdc.designpattern._1observer.interfaces;

public interface Subject {
    /**
     * @Description: 注册一个观察者
     * @author Administrator
     * @date 2021/8/4 22:28
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * @Description: 移除一个观察者
     * @author Administrator
     * @date 2021/8/4 22:28
     */
    public void removeObserver(Observer observer);

    /**
     * @Description: 通知所有观察者
     * @author Administrator
     * @date 2021/8/4 22:29
     */
    public void notifyObservers();
}
