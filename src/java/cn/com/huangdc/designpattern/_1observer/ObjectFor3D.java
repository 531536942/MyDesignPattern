package cn.com.huangdc.designpattern._1observer;

import cn.com.huangdc.designpattern._1observer.interfaces.Observer;
import cn.com.huangdc.designpattern._1observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
* <pre>类名: ObjectFor3D</pre>
* <pre>描述: 3d服务的实现类</pre>
* <pre>日期: 2021/8/4 22:32</pre>
* <pre>作者: Administrator</pre>
*/
public class ObjectFor3D implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) > -1) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(msg);
        });
    }

    /**
     * 设置msg
     * @param msg msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
