package com.max.hbpay.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes11.dex */
public class PayOrderObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appid;
    private String noncestr;
    private String out_trade_no;
    private String param_after_urlencode;
    private String partnerid;

    @SerializedName("package")
    private String pkg;
    private String prepayid;
    private String sign;
    private String timestamp;
    private String url;

    public String getAppid() {
        return this.appid;
    }

    public String getNoncestr() {
        return this.noncestr;
    }

    public String getOut_trade_no() {
        return this.out_trade_no;
    }

    public String getParam_after_urlencode() {
        return this.param_after_urlencode;
    }

    public String getPartnerid() {
        return this.partnerid;
    }

    public String getPkg() {
        return this.pkg;
    }

    public String getPrepayid() {
        return this.prepayid;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setNoncestr(String str) {
        this.noncestr = str;
    }

    public void setOut_trade_no(String str) {
        this.out_trade_no = str;
    }

    public void setParam_after_urlencode(String str) {
        this.param_after_urlencode = str;
    }

    public void setPartnerid(String str) {
        this.partnerid = str;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public void setPrepayid(String str) {
        this.prepayid = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
