package cn.com.huangdc.designpattern._6command.television;

import java.util.ArrayList;
import java.util.List;

/**
* <pre>类名: TeleControler</pre>
* <pre>描述: 遥控器</pre>
* <pre>日期: 2021/8/10 22:45</pre>
* <pre>作者: Administrator</pre>
*/
public class TeleControler {
    // 历史播放记录
    List<Command> historyCommands = new ArrayList<>();

    // 切换电视台
    public void switchCommand(Command command) {
        historyCommands.add(command);
        command.execute();
    }

    public void back() {
        if (historyCommands.isEmpty()) {
            return;
        }
        int size = historyCommands.size();
        int preIndex = size - 2 <= 0 ? 0 : size -2;

        // 获取上一个电视的命令
        Command remove = historyCommands.remove(preIndex);
        remove.execute();
    }
}
