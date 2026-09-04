package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BalanceCheckResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7052730722708621787L;
    private String balance;
    private String enough;
    private String rmb;

    public String getBalance() {
        return this.balance;
    }

    public String getEnough() {
        return this.enough;
    }

    public String getRmb() {
        return this.rmb;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setEnough(String str) {
        this.enough = str;
    }

    public void setRmb(String str) {
        this.rmb = str;
    }
}
