package cn.com.huangdc.designpattern._4strategy.cash;

/**
* <pre>类名: CashRebate</pre>
* <pre>描述: 折扣优惠</pre>
* <pre>日期: 2021/8/10 21:32</pre>
* <pre>作者: Administrator</pre>
*/
public class CashRebate implements CashSuper {

    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
