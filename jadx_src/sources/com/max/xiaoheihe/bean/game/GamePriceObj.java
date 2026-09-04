package com.max.xiaoheihe.bean.game;

import android.util.Log;
import com.max.hbwallet.bean.MallCouponGuideObj;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GamePriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2567997887293192692L;
    private String cc_value;
    private String cost;
    private String cost_coin;
    private String cost_rmb;
    private MallCouponGuideObj coupon_info;
    private String current;
    private String current_price;
    private String deadline_date;
    private String deadline_timestamp;
    private String discount;
    private transient String discount_desc;
    private String final_price;
    private String image;
    private String initial;
    private String initial_price;
    private boolean is_free;
    private String is_lowest;
    private String lowest_discount;
    private String lowest_price;
    private String name;
    private String new_lowest;
    private String original_coin;
    private List<RichAttributeModelObj> price_tips;
    private String rebate_desc;
    private String region_name;
    private boolean super_lowest;
    private String value;

    private boolean selfEquals(Object obj, Object obj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 14846, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zEquals = Objects.equals(obj, obj2);
        if (!zEquals) {
            g.x("GamePriceObj, selfEquals a = " + obj + ", b = " + obj2 + obj2 + Log.getStackTraceString(new Throwable()));
        }
        return zEquals;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14845, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamePriceObj)) {
            return false;
        }
        GamePriceObj gamePriceObj = (GamePriceObj) obj;
        return isIs_free() == gamePriceObj.isIs_free() && isSuper_lowest() == gamePriceObj.isSuper_lowest() && selfEquals(getCc_value(), gamePriceObj.getCc_value()) && selfEquals(getCurrent(), gamePriceObj.getCurrent()) && selfEquals(getDeadline_date(), gamePriceObj.getDeadline_date()) && selfEquals(getDiscount(), gamePriceObj.getDiscount()) && selfEquals(getImage(), gamePriceObj.getImage()) && selfEquals(getInitial(), gamePriceObj.getInitial()) && selfEquals(getName(), gamePriceObj.getName()) && selfEquals(getValue(), gamePriceObj.getValue()) && selfEquals(getLowest_discount(), gamePriceObj.getLowest_discount()) && selfEquals(getLowest_price(), gamePriceObj.getLowest_price()) && selfEquals(getCost(), gamePriceObj.getCost()) && selfEquals(getCost_coin(), gamePriceObj.getCost_coin()) && selfEquals(getOriginal_coin(), gamePriceObj.getOriginal_coin()) && selfEquals(getCost_rmb(), gamePriceObj.getCost_rmb()) && selfEquals(getIs_lowest(), gamePriceObj.getIs_lowest()) && selfEquals(getFinal_price(), gamePriceObj.getFinal_price()) && selfEquals(getInitial_price(), gamePriceObj.getInitial_price()) && selfEquals(getCurrent_price(), gamePriceObj.getCurrent_price()) && selfEquals(getRebate_desc(), gamePriceObj.getRebate_desc()) && selfEquals(getNew_lowest(), gamePriceObj.getNew_lowest()) && selfEquals(getRegion_name(), gamePriceObj.getRegion_name()) && selfEquals(getDeadline_timestamp(), gamePriceObj.getDeadline_timestamp()) && selfEquals(getPrice_tips(), gamePriceObj.getPrice_tips()) && selfEquals(getCoupon_info(), gamePriceObj.getCoupon_info());
    }

    public String getCc_value() {
        return this.cc_value;
    }

    public String getCost() {
        return this.cost;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getCost_rmb() {
        return this.cost_rmb;
    }

    public MallCouponGuideObj getCoupon_info() {
        return this.coupon_info;
    }

    public String getCurrent() {
        return this.current;
    }

    public String getCurrent_price() {
        return this.current_price;
    }

    public String getDeadline_date() {
        return this.deadline_date;
    }

    public String getDeadline_timestamp() {
        return this.deadline_timestamp;
    }

    public String getDiscount() {
        return this.discount;
    }

    public String getDiscount_desc() {
        return this.discount_desc;
    }

    public String getFinal_price() {
        return this.final_price;
    }

    public String getImage() {
        return this.image;
    }

    public String getInitial() {
        return this.initial;
    }

    public String getInitial_price() {
        return this.initial_price;
    }

    public String getIs_lowest() {
        return this.is_lowest;
    }

    public String getLowest_discount() {
        return this.lowest_discount;
    }

    public String getLowest_price() {
        return this.lowest_price;
    }

    public String getName() {
        return this.name;
    }

    public String getNew_lowest() {
        return this.new_lowest;
    }

    public String getOriginal_coin() {
        return this.original_coin;
    }

    public List<RichAttributeModelObj> getPrice_tips() {
        return this.price_tips;
    }

    public String getRebate_desc() {
        return this.rebate_desc;
    }

    public String getRegion_name() {
        return this.region_name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14847, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getCc_value(), getCurrent(), getDeadline_date(), getDiscount(), getDiscount_desc(), getImage(), getInitial(), getName(), getValue(), getLowest_discount(), getLowest_price(), getCost(), getCost_coin(), getOriginal_coin(), getCost_rmb(), Boolean.valueOf(isIs_free()), getIs_lowest(), getFinal_price(), getInitial_price(), getCurrent_price(), getRebate_desc(), getNew_lowest(), getRegion_name(), Boolean.valueOf(isSuper_lowest()), getDeadline_timestamp(), getPrice_tips(), getCoupon_info());
    }

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean isSuper_lowest() {
        return this.super_lowest;
    }

    public void setCc_value(String str) {
        this.cc_value = str;
    }

    public void setCost(String str) {
        this.cost = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setCost_rmb(String str) {
        this.cost_rmb = str;
    }

    public void setCoupon_info(MallCouponGuideObj mallCouponGuideObj) {
        this.coupon_info = mallCouponGuideObj;
    }

    public void setCurrent(String str) {
        this.current = str;
    }

    public void setCurrent_price(String str) {
        this.current_price = str;
    }

    public void setDeadline_date(String str) {
        this.deadline_date = str;
    }

    public void setDeadline_timestamp(String str) {
        this.deadline_timestamp = str;
    }

    public void setDiscount(String str) {
        this.discount = str;
    }

    public void setDiscount_desc(String str) {
        this.discount_desc = str;
    }

    public void setFinal_price(String str) {
        this.final_price = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setInitial(String str) {
        this.initial = str;
    }

    public void setInitial_price(String str) {
        this.initial_price = str;
    }

    public void setIs_free(boolean z10) {
        this.is_free = z10;
    }

    public void setIs_lowest(String str) {
        this.is_lowest = str;
    }

    public void setLowest_discount(String str) {
        this.lowest_discount = str;
    }

    public void setLowest_price(String str) {
        this.lowest_price = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNew_lowest(String str) {
        this.new_lowest = str;
    }

    public void setOriginal_coin(String str) {
        this.original_coin = str;
    }

    public void setPrice_tips(List<RichAttributeModelObj> list) {
        this.price_tips = list;
    }

    public void setRebate_desc(String str) {
        this.rebate_desc = str;
    }

    public void setRegion_name(String str) {
        this.region_name = str;
    }

    public void setSuper_lowest(boolean z10) {
        this.super_lowest = z10;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
