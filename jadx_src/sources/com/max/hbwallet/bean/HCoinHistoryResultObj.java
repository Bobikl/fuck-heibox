package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HCoinHistoryResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String hbalance;
    private String hcoin;
    private List<HCoinHistoryObj> history;
    private String lastval;
    private String profit;

    public String getHbalance() {
        return this.hbalance;
    }

    public String getHcoin() {
        return this.hcoin;
    }

    public List<HCoinHistoryObj> getHistory() {
        return this.history;
    }

    public String getLastval() {
        return this.lastval;
    }

    public String getProfit() {
        return this.profit;
    }

    public void setHbalance(String str) {
        this.hbalance = str;
    }

    public void setHcoin(String str) {
        this.hcoin = str;
    }

    public void setHistory(List<HCoinHistoryObj> list) {
        this.history = list;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setProfit(String str) {
        this.profit = str;
    }
}
