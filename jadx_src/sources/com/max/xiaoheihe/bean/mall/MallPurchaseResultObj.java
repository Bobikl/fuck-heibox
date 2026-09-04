package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class MallPurchaseResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String not_finish_order;
    private String order_id;
    private String order_src;

    public String getNot_finish_order() {
        return this.not_finish_order;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getOrder_src() {
        return this.order_src;
    }

    public void setNot_finish_order(String str) {
        this.not_finish_order = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setOrder_src(String str) {
        this.order_src = str;
    }
}
