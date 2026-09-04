package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponWrapperObj implements Serializable {
    public static final int ITEM_TYPE_CATEGORY = 1;
    public static final int ITEM_TYPE_COUPON = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1619013633988954053L;
    private MallCouponObj coupon;
    private String desc;
    private int itemType;

    public MallCouponObj getCoupon() {
        return this.coupon;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getItemType() {
        return this.itemType;
    }

    public void setCoupon(MallCouponObj mallCouponObj) {
        this.coupon = mallCouponObj;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }
}
