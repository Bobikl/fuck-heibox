package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallPayPurchaseParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1387047871561994610L;
    private String coupon_id;
    private String deduct_coin;
    private String out_order_id;
    private String pay_price;
    private String pay_type;
    private String purchase_code;
    private String stack_coupon_id;
    private String stack_coupon_pool_id;

    public String getCoupon_id() {
        return this.coupon_id;
    }

    public String getDeduct_coin() {
        return this.deduct_coin;
    }

    public String getOut_order_id() {
        return this.out_order_id;
    }

    public String getPay_price() {
        return this.pay_price;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPurchase_code() {
        return this.purchase_code;
    }

    public String getStack_coupon_id() {
        return this.stack_coupon_id;
    }

    public String getStack_coupon_pool_id() {
        return this.stack_coupon_pool_id;
    }

    public void setCoupon_id(String str) {
        this.coupon_id = str;
    }

    public void setDeduct_coin(String str) {
        this.deduct_coin = str;
    }

    public void setOut_order_id(String str) {
        this.out_order_id = str;
    }

    public void setPay_price(String str) {
        this.pay_price = str;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPurchase_code(String str) {
        this.purchase_code = str;
    }

    public void setStack_coupon_id(String str) {
        this.stack_coupon_id = str;
    }

    public void setStack_coupon_pool_id(String str) {
        this.stack_coupon_pool_id = str;
    }
}
