package com.max.hbwallet.bean;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponGuideObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4489261823904170674L;
    private String available_coupon_num;
    private String coupon_desc;
    private String coupon_protocol;
    private String max_reduce;
    private JsonObject params;
    private String price_desc;
    private String primary_id;
    private String sub_title;
    private String title;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.Q2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallCouponGuideObj)) {
            return false;
        }
        MallCouponGuideObj mallCouponGuideObj = (MallCouponGuideObj) obj;
        return Objects.equals(getAvailable_coupon_num(), mallCouponGuideObj.getAvailable_coupon_num()) && Objects.equals(getCoupon_desc(), mallCouponGuideObj.getCoupon_desc()) && Objects.equals(getPrice_desc(), mallCouponGuideObj.getPrice_desc()) && Objects.equals(getMax_reduce(), mallCouponGuideObj.getMax_reduce()) && Objects.equals(getPrimary_id(), mallCouponGuideObj.getPrimary_id()) && Objects.equals(getSub_title(), mallCouponGuideObj.getSub_title()) && Objects.equals(getTitle(), mallCouponGuideObj.getTitle()) && Objects.equals(getCoupon_protocol(), mallCouponGuideObj.getCoupon_protocol());
    }

    public String getAvailable_coupon_num() {
        return this.available_coupon_num;
    }

    public String getCoupon_desc() {
        return this.coupon_desc;
    }

    public String getCoupon_protocol() {
        return this.coupon_protocol;
    }

    public String getMax_reduce() {
        return this.max_reduce;
    }

    public JsonObject getParams() {
        return this.params;
    }

    public String getPrice_desc() {
        return this.price_desc;
    }

    public String getPrimary_id() {
        return this.primary_id;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10099, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getAvailable_coupon_num(), getCoupon_desc(), getPrice_desc(), getMax_reduce(), getPrimary_id(), getSub_title(), getTitle(), getCoupon_protocol(), getParams());
    }

    public void setAvailable_coupon_num(String str) {
        this.available_coupon_num = str;
    }

    public void setCoupon_desc(String str) {
        this.coupon_desc = str;
    }

    public void setCoupon_protocol(String str) {
        this.coupon_protocol = str;
    }

    public void setMax_reduce(String str) {
        this.max_reduce = str;
    }

    public void setParams(JsonObject jsonObject) {
        this.params = jsonObject;
    }

    public void setPrice_desc(String str) {
        this.price_desc = str;
    }

    public void setPrimary_id(String str) {
        this.primary_id = str;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
