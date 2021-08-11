package cn.com.huangdc.designpattern._6command.television.imp;

import cn.com.huangdc.designpattern._6command.television.Command;
import cn.com.huangdc.designpattern._6command.television.Television;

public class Cctv1Command extends Command {

    public Cctv1Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCctv1();
    }
}
