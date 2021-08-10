package cn.com.huangdc.designpattern._5adapter.classes;

import cn.com.huangdc.designpattern._5adapter.common.Ps2;
import cn.com.huangdc.designpattern._5adapter.common.Usber;

public class Ps2ToUsbAdapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        this.isUsb();
    }
}
