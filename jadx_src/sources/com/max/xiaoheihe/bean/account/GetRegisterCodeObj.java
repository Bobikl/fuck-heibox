package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class GetRegisterCodeObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String code;
    private String not_register;
    private String remain_time;

    public String getCode() {
        return this.code;
    }

    public String getNot_register() {
        return this.not_register;
    }

    public String getRemain_time() {
        return this.remain_time;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setNot_register(String str) {
        this.not_register = str;
    }

    public void setRemain_time(String str) {
        this.remain_time = str;
    }
}
