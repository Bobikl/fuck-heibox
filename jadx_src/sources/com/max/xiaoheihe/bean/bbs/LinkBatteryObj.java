package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkBatteryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4532108020729299694L;
    private String balance;
    private List<Integer> charge_limits;
    private boolean charged;
    private String count;
    private String enabled;

    public String getBalance() {
        return this.balance;
    }

    public List<Integer> getCharge_limits() {
        return this.charge_limits;
    }

    public boolean getCharged() {
        return this.charged;
    }

    public String getCount() {
        return this.count;
    }

    public String getEnabled() {
        return this.enabled;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setCharge_limits(List<Integer> list) {
        this.charge_limits = list;
    }

    public void setCharged(boolean z10) {
        this.charged = z10;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setEnabled(String str) {
        this.enabled = str;
    }
}
