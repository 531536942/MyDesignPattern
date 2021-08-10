package cn.com.huangdc.designpattern._4strategy.cash;

/**
* <pre>类名: CashNormal</pre>
* <pre>描述: 正常收费</pre>
* <pre>日期: 2021/8/10 21:31</pre>
* <pre>作者: Administrator</pre>
*/
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
