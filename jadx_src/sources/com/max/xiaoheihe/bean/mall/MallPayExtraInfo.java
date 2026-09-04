package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallPayExtraInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String alipay_msg;
    private String lianlian_msg;
    private String profit;
    private String weixin_msg;

    public String getAlipay_msg() {
        return this.alipay_msg;
    }

    public String getLianlian_msg() {
        return this.lianlian_msg;
    }

    public String getProfit() {
        return this.profit;
    }

    public String getWeixin_msg() {
        return this.weixin_msg;
    }

    public void setAlipay_msg(String str) {
        this.alipay_msg = str;
    }

    public void setLianlian_msg(String str) {
        this.lianlian_msg = str;
    }

    public void setProfit(String str) {
        this.profit = str;
    }

    public void setWeixin_msg(String str) {
        this.weixin_msg = str;
    }
}
