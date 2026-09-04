package com.max.xiaoheihe.bean.mall;

import com.max.hbwallet.bean.MallCouponGuideObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class MallPriceObj implements Serializable {
    public static final String TYPE_HEYBOX = "heybox";
    public static final String TYPE_ORIGINAL = "original";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4600549769009348335L;
    private String base_pay_price;
    private String cost_coin;
    private String cost_rmb;
    private String coupon_disable;
    private String coupon_disable_desc;
    private MallCouponGuideObj coupon_info;
    private String coupon_value;
    private String current_price;
    private String deduct_coin;
    private String desc;
    private String discount;
    private List<MallDiscountParamsObj> discount_params;
    private String discount_value;
    private String final_price;
    private String initial_price;
    private String is_lowest;
    private String new_lowest;
    private String pay_price;
    private String payment;
    private String postage_value;
    private String purchase_code_desc;
    private String purchase_code_value;
    private String rebate_desc;
    private String stack_coupon_value;
    private String super_lowest;
    private String type;
    private String value;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15500, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallPriceObj)) {
            return false;
        }
        MallPriceObj mallPriceObj = (MallPriceObj) obj;
        return Objects.equals(getStack_coupon_value(), mallPriceObj.getStack_coupon_value()) && Objects.equals(getBase_pay_price(), mallPriceObj.getBase_pay_price()) && Objects.equals(getCoupon_info(), mallPriceObj.getCoupon_info()) && Objects.equals(getDiscount(), mallPriceObj.getDiscount()) && Objects.equals(getCost_coin(), mallPriceObj.getCost_coin()) && Objects.equals(getCost_rmb(), mallPriceObj.getCost_rmb()) && Objects.equals(getFinal_price(), mallPriceObj.getFinal_price()) && Objects.equals(getCurrent_price(), mallPriceObj.getCurrent_price()) && Objects.equals(getInitial_price(), mallPriceObj.getInitial_price()) && Objects.equals(getDesc(), mallPriceObj.getDesc()) && Objects.equals(getType(), mallPriceObj.getType()) && Objects.equals(getValue(), mallPriceObj.getValue()) && Objects.equals(getDiscount_params(), mallPriceObj.getDiscount_params()) && Objects.equals(getPay_price(), mallPriceObj.getPay_price()) && Objects.equals(getRebate_desc(), mallPriceObj.getRebate_desc()) && Objects.equals(getCoupon_value(), mallPriceObj.getCoupon_value()) && Objects.equals(getPurchase_code_value(), mallPriceObj.getPurchase_code_value()) && Objects.equals(getPurchase_code_desc(), mallPriceObj.getPurchase_code_desc()) && Objects.equals(getDiscount_value(), mallPriceObj.getDiscount_value()) && Objects.equals(getDeduct_coin(), mallPriceObj.getDeduct_coin()) && Objects.equals(getPostage_value(), mallPriceObj.getPostage_value()) && Objects.equals(getPayment(), mallPriceObj.getPayment());
    }

    public String getBase_pay_price() {
        return this.base_pay_price;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getCost_rmb() {
        return this.cost_rmb;
    }

    public String getCoupon_disable() {
        return this.coupon_disable;
    }

    public String getCoupon_disable_desc() {
        return this.coupon_disable_desc;
    }

    public MallCouponGuideObj getCoupon_info() {
        return this.coupon_info;
    }

    public String getCoupon_value() {
        return this.coupon_value;
    }

    public String getCurrent_price() {
        return this.current_price;
    }

    public String getDeduct_coin() {
        return this.deduct_coin;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDiscount() {
        return this.discount;
    }

    public List<MallDiscountParamsObj> getDiscount_params() {
        return this.discount_params;
    }

    public String getDiscount_value() {
        return this.discount_value;
    }

    public String getFinal_price() {
        return this.final_price;
    }

    public String getInitial_price() {
        return this.initial_price;
    }

    public String getIs_lowest() {
        return this.is_lowest;
    }

    public String getNew_lowest() {
        return this.new_lowest;
    }

    public String getPay_price() {
        return this.pay_price;
    }

    public String getPayment() {
        return this.payment;
    }

    public String getPostage_value() {
        return this.postage_value;
    }

    public String getPurchase_code_desc() {
        return this.purchase_code_desc;
    }

    public String getPurchase_code_value() {
        return this.purchase_code_value;
    }

    public String getRebate_desc() {
        return this.rebate_desc;
    }

    public String getStack_coupon_value() {
        return this.stack_coupon_value;
    }

    public String getSuper_lowest() {
        return this.super_lowest;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15501, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getStack_coupon_value(), getBase_pay_price(), getCoupon_info(), getDiscount(), getCost_coin(), getCost_rmb(), getFinal_price(), getCurrent_price(), getInitial_price(), getDesc(), getType(), getValue(), getDiscount_params(), getPay_price(), getRebate_desc(), getCoupon_value(), getPurchase_code_value(), getPurchase_code_desc(), getDiscount_value(), getDeduct_coin(), getPostage_value(), getPayment());
    }

    public void setBase_pay_price(String str) {
        this.base_pay_price = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setCost_rmb(String str) {
        this.cost_rmb = str;
    }

    public void setCoupon_disable(String str) {
        this.coupon_disable = str;
    }

    public void setCoupon_disable_desc(String str) {
        this.coupon_disable_desc = str;
    }

    public void setCoupon_info(MallCouponGuideObj mallCouponGuideObj) {
        this.coupon_info = mallCouponGuideObj;
    }

    public void setCoupon_value(String str) {
        this.coupon_value = str;
    }

    public void setCurrent_price(String str) {
        this.current_price = str;
    }

    public void setDeduct_coin(String str) {
        this.deduct_coin = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDiscount(String str) {
        this.discount = str;
    }

    public void setDiscount_params(List<MallDiscountParamsObj> list) {
        this.discount_params = list;
    }

    public void setDiscount_value(String str) {
        this.discount_value = str;
    }

    public void setFinal_price(String str) {
        this.final_price = str;
    }

    public void setInitial_price(String str) {
        this.initial_price = str;
    }

    public void setIs_lowest(String str) {
        this.is_lowest = str;
    }

    public void setNew_lowest(String str) {
        this.new_lowest = str;
    }

    public void setPay_price(String str) {
        this.pay_price = str;
    }

    public void setPayment(String str) {
        this.payment = str;
    }

    public void setPostage_value(String str) {
        this.postage_value = str;
    }

    public void setPurchase_code_desc(String str) {
        this.purchase_code_desc = str;
    }

    public void setPurchase_code_value(String str) {
        this.purchase_code_value = str;
    }

    public void setRebate_desc(String str) {
        this.rebate_desc = str;
    }

    public void setStack_coupon_value(String str) {
        this.stack_coupon_value = str;
    }

    public void setSuper_lowest(String str) {
        this.super_lowest = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
