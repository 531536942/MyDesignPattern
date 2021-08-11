package cn.com.huangdc.designpattern._6command.television.imp;

import cn.com.huangdc.designpattern._6command.television.Command;
import cn.com.huangdc.designpattern._6command.television.Television;

public class Cctv2Command extends Command {

    public Cctv2Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCctv2();
    }
}
