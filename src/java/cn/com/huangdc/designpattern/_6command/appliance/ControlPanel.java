package cn.com.huangdc.designpattern._6command.appliance;

import cn.com.huangdc.designpattern._6command.appliance.command.Command;
import cn.com.huangdc.designpattern._6command.appliance.command.NoCommand;

/**
 * <pre>类名: ControlPanel</pre>
 * <pre>描述: 控制面板，9键</pre>
 * <pre>日期: 2021/8/11 8:14</pre>
 * <pre>作者: Administrator</pre>
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 9;
    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];

        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void keyPressed(int index) {
        commands[index].execute();
    }
}
