package cn.com.huangdc.designpattern._5adapter.obj;

import cn.com.huangdc.designpattern._5adapter.common.Ps2;
import cn.com.huangdc.designpattern._5adapter.common.Usb;

public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
