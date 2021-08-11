package cn.com.huangdc.designpattern._6command.appliance;

import cn.com.huangdc.designpattern._6command.appliance.command.Command;
import cn.com.huangdc.designpattern._6command.appliance.command.ComputerOffCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.ComputerOnCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.DoorCloseCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.DoorOpenCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.LightOffCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.LightOnCommand;
import cn.com.huangdc.designpattern._6command.appliance.command.QuickCommand;
import cn.com.huangdc.designpattern._6command.appliance.equipment.Computer;
import cn.com.huangdc.designpattern._6command.appliance.equipment.Door;
import cn.com.huangdc.designpattern._6command.appliance.equipment.Light;

/**
 * 需求变动时，不需要修改控制面板按键代码，只需要定义新的命令，将命令设置于对应的按键，即可完成
 */
public class MainClass {
    public static void main(String[] args) {
        /**
         * 定义主体
         */
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();

        /**
         * 定义命令
         */
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        ComputerOnCommand computerOnCommand = new ComputerOnCommand(computer);
        ComputerOffCommand computerOffCommand = new ComputerOffCommand(computer);

        /**
         * 设置控制面板
         */
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(1, doorOpenCommand);
        controlPanel.setCommand(2, doorCloseCommand);
        controlPanel.setCommand(3, lightOnCommand);
        controlPanel.setCommand(4, lightOffCommand);
        controlPanel.setCommand(5, computerOnCommand);
        controlPanel.setCommand(6, computerOffCommand);
        /**
         * 一键操作
         */
        controlPanel.setCommand(7, new QuickCommand(new Command[]{doorOpenCommand, lightOnCommand, computerOnCommand}));
        controlPanel.setCommand(8, new QuickCommand(new Command[]{doorCloseCommand, lightOffCommand, computerOffCommand}));

        /**
         * 操作模拟
         */
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(6);

        controlPanel.keyPressed(7);
        controlPanel.keyPressed(8);
    }
}
