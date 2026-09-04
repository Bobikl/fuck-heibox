package com.max.hbwallet.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponObj implements Serializable {
    public static final String STATE_REFUNDABLE = "2";
    public static final String STATE_SUPPORTED = "0";
    public static final String STATE_UNSUPPORTED = "1";
    public static final String TYPE_CDKEY_REDEEM = "2";
    public static final String TYPE_COUPON = "0";
    public static final String TYPE_CSGO_SKIN_REDEEM = "6";
    public static final String TYPE_DISCOUNT_COUPON = "9";
    public static final String TYPE_DISCOUNT_COUPON_NO_LIMIT = "8";
    public static final String TYPE_EXCHANGE = "exchange";
    public static final String TYPE_EXPIRED = "2";
    public static final String TYPE_GIFT_REDEEM = "3";
    public static final String TYPE_MONEYOFF = "moneyoff";
    public static final String TYPE_PROFIT_BALANCE_REDEEM = "5";
    public static final String TYPE_RECORD = "3";
    public static final String TYPE_REDEEM_CARD = "1";
    public static final String TYPE_STACK = "11";
    public static final String TYPE_STACK_NO_LIMIT = "10";
    public static final String TYPE_UNRESTRICTED_COUPON = "4";
    public static final String TYPE_UNUSED = "0";
    public static final String TYPE_USED = "1";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2658927590950355385L;

    /* JADX INFO: renamed from: cat, reason: collision with root package name */
    private String f74165cat;
    private boolean checked;
    private String coupon_id;
    private String coupon_pool_id;
    private String coupon_type;
    private String description;
    private String end_time;
    private String game_bg;
    private String game_img;
    private String game_name;
    private CouponPriceObj heybox_price;
    private String image_url;

    @SerializedName("new")
    private boolean is_new;
    private String name;
    private String num;
    private String present_desc;
    private CouponPresentInfoObj present_info;
    private String price;
    private String protocol;
    private String short_description;
    private String state;
    private String state_color;
    private String state_desc;
    private String time_desc;
    private String type;
    private String value;

    public String getCat() {
        return this.f74165cat;
    }

    public String getCoupon_id() {
        return this.coupon_id;
    }

    public String getCoupon_pool_id() {
        return this.coupon_pool_id;
    }

    public String getCoupon_type() {
        return this.coupon_type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEnd_time() {
        return this.end_time;
    }

    public String getGame_bg() {
        return this.game_bg;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public CouponPriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getName() {
        return this.name;
    }

    public String getNum() {
        return this.num;
    }

    public String getPresent_desc() {
        return this.present_desc;
    }

    public CouponPresentInfoObj getPresent_info() {
        return this.present_info;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getShort_description() {
        return this.short_description;
    }

    public String getState() {
        return this.state;
    }

    public String getState_color() {
        return this.state_color;
    }

    public String getState_desc() {
        return this.state_desc;
    }

    public String getTime_desc() {
        return this.time_desc;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isIs_new() {
        return this.is_new;
    }

    public void setCat(String str) {
        this.f74165cat = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setCoupon_id(String str) {
        this.coupon_id = str;
    }

    public void setCoupon_pool_id(String str) {
        this.coupon_pool_id = str;
    }

    public void setCoupon_type(String str) {
        this.coupon_type = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnd_time(String str) {
        this.end_time = str;
    }

    public void setGame_bg(String str) {
        this.game_bg = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setHeybox_price(CouponPriceObj couponPriceObj) {
        this.heybox_price = couponPriceObj;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setIs_new(boolean z10) {
        this.is_new = z10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNum(String str) {
        this.num = str;
    }

    public void setPresent_desc(String str) {
        this.present_desc = str;
    }

    public void setPresent_info(CouponPresentInfoObj couponPresentInfoObj) {
        this.present_info = couponPresentInfoObj;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setShort_description(String str) {
        this.short_description = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setState_color(String str) {
        this.state_color = str;
    }

    public void setState_desc(String str) {
        this.state_desc = str;
    }

    public void setTime_desc(String str) {
        this.time_desc = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
