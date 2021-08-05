package cn.com.huangdc.designpattern._1observer;

import cn.com.huangdc.designpattern._1observer.interfaces.Observer;
import cn.com.huangdc.designpattern._1observer.interfaces.Subject;

/**
* <pre>类名: ObserverUser</pre>
* <pre>描述: TODO</pre>
* <pre>日期: 2021/8/4 22:36</pre>
* <pre>作者: Administrator</pre>
*/
public class ObserverUser implements Observer {

    public ObserverUser(Subject subject) {
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("ObserverUser -- 得到3d号码 -- " + msg);
    }
}
