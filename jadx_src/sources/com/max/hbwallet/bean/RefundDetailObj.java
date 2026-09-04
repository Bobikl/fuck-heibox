package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RefundDetailObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String fee_desc;
    private String fee_title;
    private String refund_price;
    private String refund_way;
    private String tips;

    public String getFee_desc() {
        return this.fee_desc;
    }

    public String getFee_title() {
        return this.fee_title;
    }

    public String getRefund_price() {
        return this.refund_price;
    }

    public String getRefund_way() {
        return this.refund_way;
    }

    public String getTips() {
        return this.tips;
    }

    public void setFee_desc(String str) {
        this.fee_desc = str;
    }

    public void setFee_title(String str) {
        this.fee_title = str;
    }

    public void setRefund_price(String str) {
        this.refund_price = str;
    }

    public void setRefund_way(String str) {
        this.refund_way = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}
