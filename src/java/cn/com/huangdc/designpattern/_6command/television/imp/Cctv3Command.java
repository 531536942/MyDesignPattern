package cn.com.huangdc.designpattern._6command.television.imp;

import cn.com.huangdc.designpattern._6command.television.Command;
import cn.com.huangdc.designpattern._6command.television.Television;

public class Cctv3Command extends Command {

    public Cctv3Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCctv3();
    }
}
