package cn.com.huangdc.designpattern._5adapter.common;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("usb口");
    }
}
