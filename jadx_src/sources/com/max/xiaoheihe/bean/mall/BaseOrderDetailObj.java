package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class BaseOrderDetailObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String available_coupon_count;
    private String coupon_center_protocol;

    public String getAvailable_coupon_count() {
        return this.available_coupon_count;
    }

    public String getCoupon_center_protocol() {
        return this.coupon_center_protocol;
    }

    public void setAvailable_coupon_count(String str) {
        this.available_coupon_count = str;
    }

    public void setCoupon_center_protocol(String str) {
        this.coupon_center_protocol = str;
    }
}
