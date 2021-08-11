package cn.com.huangdc.designpattern._6command.appliance.command;

import cn.com.huangdc.designpattern._6command.appliance.equipment.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
