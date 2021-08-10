package cn.com.huangdc.designpattern._4strategy;

import cn.com.huangdc.designpattern._4strategy.cash.CashSuper;

/**
* <pre>类名: CashContext</pre>
* <pre>描述: 超市不同优惠活动下的收费</pre>
* <pre>日期: 2021/8/10 21:20</pre>
* <pre>作者: Administrator</pre>
*/
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        double result = cashSuper.acceptCash(money);
        System.out.println("收费[" + result + "]元");
        return result;
    }
}
