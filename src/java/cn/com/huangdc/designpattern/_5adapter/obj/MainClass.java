package cn.com.huangdc.designpattern._5adapter.obj;

import cn.com.huangdc.designpattern._5adapter.common.Ps2;
import cn.com.huangdc.designpattern._5adapter.common.Usber;

public class MainClass {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
