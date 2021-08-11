package cn.com.huangdc.designpattern._6command.television;

import cn.com.huangdc.designpattern._6command.television.imp.Cctv1Command;
import cn.com.huangdc.designpattern._6command.television.imp.Cctv2Command;
import cn.com.huangdc.designpattern._6command.television.imp.Cctv3Command;

public class MainClass {
    public static void main(String[] args) {
        Television tv = new Television();

        TeleControler tvControler = new TeleControler();

        tvControler.switchCommand(new Cctv1Command(tv));
        tvControler.switchCommand(new Cctv2Command(tv));
        tvControler.switchCommand(new Cctv3Command(tv));
        tvControler.switchCommand(new Cctv2Command(tv));

        tvControler.back();
        tvControler.back();
        tvControler.back();
    }
}
