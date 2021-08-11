package cn.com.huangdc.designpattern._6command.appliance.command;

import cn.com.huangdc.designpattern._6command.appliance.equipment.Door;

public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
