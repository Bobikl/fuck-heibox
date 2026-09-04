package com.max.xiaoheihe.bean.game;

import com.max.hbwallet.bean.MallCouponGuideObj;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePurchaseParamsObj implements Serializable {
    public static final String BUY_TYPE_CDKEY_COUPON = "cdkey_coupon";
    public static final String BUY_TYPE_CD_KEY = "cdkey";
    public static final String BUY_TYPE_GIFT = "gift";
    public static final String BUY_TYPE_GIFT_COUPON = "gift_coupon";
    public static final String BUY_TYPE_MARKET_BALANCE = "market_balance";
    public static final String BUY_TYPE_STEAM = "steam";
    public static final String BUY_TYPE_STEAM_DIRECT_PURCHASE = "steam_purchase";
    public static final String PRODUCT_TYPE_BUNDLE = "bundle";
    public static final String PRODUCT_TYPE_PRESELL = "presell";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1268641282328194566L;
    private String cart_count;
    private String coin;
    private String cost_coin;
    private String cost_rmb;
    private String coupon_count;
    private MallCouponGuideObj coupon_info;
    private List<MallDiscountParamsObj> discount_params;
    private String final_cost_coin;
    private String final_cost_rmb;
    private String game_img;
    private String game_name;
    private boolean is_steam;
    private GamePurchaseParamObj params;
    private String session;
    private String steam_card_discount;
    private String toast_msg;

    public String getCart_count() {
        return this.cart_count;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getCost_rmb() {
        return this.cost_rmb;
    }

    public String getCoupon_count() {
        return this.coupon_count;
    }

    public MallCouponGuideObj getCoupon_info() {
        return this.coupon_info;
    }

    public List<MallDiscountParamsObj> getDiscount_params() {
        return this.discount_params;
    }

    public String getFinal_cost_coin() {
        return this.final_cost_coin;
    }

    public String getFinal_cost_rmb() {
        return this.final_cost_rmb;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public GamePurchaseParamObj getParams() {
        return this.params;
    }

    public String getSession() {
        return this.session;
    }

    public String getSteam_card_discount() {
        return this.steam_card_discount;
    }

    public String getToast_msg() {
        return this.toast_msg;
    }

    public boolean isIs_steam() {
        return this.is_steam;
    }

    public void setCart_count(String str) {
        this.cart_count = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setCost_rmb(String str) {
        this.cost_rmb = str;
    }

    public void setCoupon_count(String str) {
        this.coupon_count = str;
    }

    public void setCoupon_info(MallCouponGuideObj mallCouponGuideObj) {
        this.coupon_info = mallCouponGuideObj;
    }

    public void setDiscount_params(List<MallDiscountParamsObj> list) {
        this.discount_params = list;
    }

    public void setFinal_cost_coin(String str) {
        this.final_cost_coin = str;
    }

    public void setFinal_cost_rmb(String str) {
        this.final_cost_rmb = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setIs_steam(boolean z10) {
        this.is_steam = z10;
    }

    public void setParams(GamePurchaseParamObj gamePurchaseParamObj) {
        this.params = gamePurchaseParamObj;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSteam_card_discount(String str) {
        this.steam_card_discount = str;
    }

    public void setToast_msg(String str) {
        this.toast_msg = str;
    }
}
