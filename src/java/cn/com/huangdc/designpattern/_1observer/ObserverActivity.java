package cn.com.huangdc.designpattern._1observer;

public class ObserverActivity {

    public static void main(String[] args) {
        // 服务号
        ObjectFor3D objectFor3D = new ObjectFor3D();

        // 订阅者
        ObserverUser observerUser1 = new ObserverUser(objectFor3D);
        ObserverUser observerUser2 = new ObserverUser(objectFor3D);

        // 发送信息
        objectFor3D.setMsg("qwe");
        objectFor3D.setMsg("asd");
    }
}
