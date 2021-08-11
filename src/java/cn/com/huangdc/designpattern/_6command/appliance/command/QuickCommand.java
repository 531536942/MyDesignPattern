package cn.com.huangdc.designpattern._6command.appliance.command;

/**
* <pre>类名: QuickCommand</pre>
* <pre>描述: 快捷指令，一键操作</pre>
* <pre>日期: 2021/8/11 8:19</pre>
* <pre>作者: Administrator</pre>
*/
public class QuickCommand implements Command {

    private Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("一鍵操作");
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
