package cn.com.huangdc.designpattern._6command.appliance.command;

import cn.com.huangdc.designpattern._6command.appliance.equipment.Computer;

public class ComputerOnCommand implements Command {
    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
