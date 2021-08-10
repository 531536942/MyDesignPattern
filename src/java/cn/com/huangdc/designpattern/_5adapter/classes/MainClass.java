package cn.com.huangdc.designpattern._5adapter.classes;

import cn.com.huangdc.designpattern._5adapter.common.Ps2;

public class MainClass {
    public static void main(String[] args) {
        Ps2 p = new Ps2ToUsbAdapter();
        p.isPs2();
    }
}
