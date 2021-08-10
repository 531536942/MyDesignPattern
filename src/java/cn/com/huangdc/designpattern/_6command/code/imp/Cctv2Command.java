package cn.com.huangdc.designpattern._6command.code.imp;

import cn.com.huangdc.designpattern._6command.code.Command;
import cn.com.huangdc.designpattern._6command.code.Television;

public class Cctv2Command extends Command {

    public Cctv2Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCctv2();
    }
}
