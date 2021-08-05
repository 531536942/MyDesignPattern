package cn.com.huangdc.designpattern._2factory.factorymethod.beijing;

import cn.com.huangdc.designpattern._2factory.factorymethod.dto.LaRoujiamo;
import cn.com.huangdc.designpattern._2factory.factorymethod.dto.Roujiamo;
import cn.com.huangdc.designpattern._2factory.factorymethod.dto.TianRoujiamo;
import cn.com.huangdc.designpattern._2factory.factorymethod.dto.XianRoujiamo;

public class BeijingSimpleRoujiamoFactory {

    public Roujiamo createRoujiamo(String type) {
        Roujiamo roujiamo = null;
        switch (type) {
            case "tian":
                roujiamo = new TianRoujiamo();
                break;
            case "la":
                roujiamo = new LaRoujiamo();
                break;
            case "xian":
                roujiamo = new XianRoujiamo();
                break;
            default:
                roujiamo = new XianRoujiamo();
                break;
        }
        return roujiamo;
    }
}
