package cn.com.huangdc.designpattern._6command.appliance.command;

import cn.com.huangdc.designpattern._6command.appliance.equipment.Computer;

public class ComputerOffCommand implements Command {
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
