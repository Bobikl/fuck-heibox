package com.max.hbpay.bean;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes11.dex */
public class WeixinQueryObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String coin;
    private String diamond;
    private String state;

    public String getCoin() {
        return this.coin;
    }

    public String getDiamond() {
        return this.diamond;
    }

    public String getState() {
        return this.state;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setDiamond(String str) {
        this.diamond = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
