package cn.com.huangdc.designpattern._6command.appliance.command;

import cn.com.huangdc.designpattern._6command.appliance.equipment.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
