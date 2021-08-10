package cn.com.huangdc.designpattern._6command.code.imp;

import cn.com.huangdc.designpattern._6command.code.Command;
import cn.com.huangdc.designpattern._6command.code.Television;

public class Cctv3Command extends Command {

    public Cctv3Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCctv3();
    }
}
