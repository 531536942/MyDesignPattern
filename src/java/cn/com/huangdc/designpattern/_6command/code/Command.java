package cn.com.huangdc.designpattern._6command.code;

/**
* <pre>类名: Command</pre>
* <pre>描述: 命令</pre>
* <pre>日期: 2021/8/10 22:45</pre>
* <pre>作者: Administrator</pre>
*/
public abstract class Command {
    // 命令接受者电视
    protected Television television;

    public Command(Television television) {
        this.television = television;
    }

    public abstract void execute();
}
