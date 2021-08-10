package cn.com.huangdc.designpattern._4strategy.cash;

/**
* <pre>类名: CashReturn</pre>
* <pre>描述: 满减优惠</pre>
* <pre>日期: 2021/8/10 21:38</pre>
* <pre>作者: Administrator</pre>
*/
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0;// 满减条件

    private double moneyReturn = 0.0;// 满减金额

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
