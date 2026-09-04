package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class AccountStateObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String level;
    private String msg;
    private String msg2;
    private boolean state;

    public String getLevel() {
        return this.level;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsg2() {
        return this.msg2;
    }

    public boolean getState() {
        return this.state;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setMsg2(String str) {
        this.msg2 = str;
    }

    public void setState(boolean z10) {
        this.state = z10;
    }
}
