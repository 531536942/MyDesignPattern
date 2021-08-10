package cn.com.huangdc.designpattern._4strategy;

import cn.com.huangdc.designpattern._4strategy.cash.CashNormal;
import cn.com.huangdc.designpattern._4strategy.cash.CashRebate;
import cn.com.huangdc.designpattern._4strategy.cash.CashReturn;

public class MainClass {
    public static void main(String[] args) {
        double money = 700;
        // 正常收费
        CashContext cashContext1 = new CashContext(new CashNormal());
        cashContext1.getResult(money);

        // 7折活动
        CashContext cashContext2 = new CashContext(new CashRebate(0.7));
        cashContext2.getResult(money);

        // 满减活动
        CashContext cashContext3 = new CashContext(new CashReturn(300, 120));
        cashContext3.getResult(money);
    }
}
