package cn.com.huangdc.designpattern._2factory.factorymethod.beijing;

import cn.com.huangdc.designpattern._2factory.factorymethod.RoujiamoStroe;
import cn.com.huangdc.designpattern._2factory.factorymethod.dto.Roujiamo;

public class BeijingRoujiamoStroe extends RoujiamoStroe {

    private BeijingSimpleRoujiamoFactory factory;

    public BeijingRoujiamoStroe(BeijingSimpleRoujiamoFactory factory) {
        this.factory = factory;
    }

    @Override
    public Roujiamo sellRoujiamo(String type) {
        Roujiamo roujiamo = factory.createRoujiamo(type);
        return roujiamo;
    }
}
