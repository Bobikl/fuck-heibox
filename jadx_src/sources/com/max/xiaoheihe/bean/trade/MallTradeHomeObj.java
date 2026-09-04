package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallTradeHomeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallTradeHomeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bargain_buyer;

    @e
    private String bargain_seller;

    @e
    private String btn_desc;

    @e
    private String btn_state;

    @e
    private String buy_orders;

    @e
    private String delivering;

    @e
    private String favour_num;

    @e
    private String follow_num;

    @e
    private AccountDetailObj profile;

    @e
    private String purchasing;

    @e
    private String receiving;

    @e
    private String sale_setting;

    @e
    private String sell_orders;

    @e
    private String selling;

    @e
    private SteamIdInfoObj steam_id_info;

    @e
    private String trade_check_message;

    @e
    private Integer trade_state;

    @e
    private String trade_state_desc;

    @e
    private String wallet_value;

    @e
    private String wechat_notification;

    public MallTradeHomeObj(@e AccountDetailObj accountDetailObj, @e SteamIdInfoObj steamIdInfoObj, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e Integer num, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16, @e String str17) {
        this.profile = accountDetailObj;
        this.steam_id_info = steamIdInfoObj;
        this.buy_orders = str;
        this.favour_num = str2;
        this.follow_num = str3;
        this.sell_orders = str4;
        this.selling = str5;
        this.trade_state = num;
        this.trade_state_desc = str6;
        this.wallet_value = str7;
        this.btn_desc = str8;
        this.btn_state = str9;
        this.trade_check_message = str10;
        this.purchasing = str11;
        this.receiving = str12;
        this.delivering = str13;
        this.bargain_buyer = str14;
        this.bargain_seller = str15;
        this.wechat_notification = str16;
        this.sale_setting = str17;
    }

    public static /* synthetic */ MallTradeHomeObj copy$default(MallTradeHomeObj mallTradeHomeObj, AccountDetailObj accountDetailObj, SteamIdInfoObj steamIdInfoObj, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallTradeHomeObj, accountDetailObj, steamIdInfoObj, str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, new Integer(i10), obj}, null, changeQuickRedirect, true, 16029, new Class[]{MallTradeHomeObj.class, AccountDetailObj.class, SteamIdInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallTradeHomeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallTradeHomeObj) patchProxyResultProxy.result;
        }
        return mallTradeHomeObj.copy((i10 & 1) != 0 ? mallTradeHomeObj.profile : accountDetailObj, (i10 & 2) != 0 ? mallTradeHomeObj.steam_id_info : steamIdInfoObj, (i10 & 4) != 0 ? mallTradeHomeObj.buy_orders : str, (i10 & 8) != 0 ? mallTradeHomeObj.favour_num : str2, (i10 & 16) != 0 ? mallTradeHomeObj.follow_num : str3, (i10 & 32) != 0 ? mallTradeHomeObj.sell_orders : str4, (i10 & 64) != 0 ? mallTradeHomeObj.selling : str5, (i10 & 128) != 0 ? mallTradeHomeObj.trade_state : num, (i10 & 256) != 0 ? mallTradeHomeObj.trade_state_desc : str6, (i10 & 512) != 0 ? mallTradeHomeObj.wallet_value : str7, (i10 & 1024) != 0 ? mallTradeHomeObj.btn_desc : str8, (i10 & 2048) != 0 ? mallTradeHomeObj.btn_state : str9, (i10 & 4096) != 0 ? mallTradeHomeObj.trade_check_message : str10, (i10 & 8192) != 0 ? mallTradeHomeObj.purchasing : str11, (i10 & 16384) != 0 ? mallTradeHomeObj.receiving : str12, (i10 & 32768) != 0 ? mallTradeHomeObj.delivering : str13, (i10 & 65536) != 0 ? mallTradeHomeObj.bargain_buyer : str14, (i10 & 131072) != 0 ? mallTradeHomeObj.bargain_seller : str15, (i10 & 262144) != 0 ? mallTradeHomeObj.wechat_notification : str16, (i10 & 524288) != 0 ? mallTradeHomeObj.sale_setting : str17);
    }

    @e
    public final AccountDetailObj component1() {
        return this.profile;
    }

    @e
    public final String component10() {
        return this.wallet_value;
    }

    @e
    public final String component11() {
        return this.btn_desc;
    }

    @e
    public final String component12() {
        return this.btn_state;
    }

    @e
    public final String component13() {
        return this.trade_check_message;
    }

    @e
    public final String component14() {
        return this.purchasing;
    }

    @e
    public final String component15() {
        return this.receiving;
    }

    @e
    public final String component16() {
        return this.delivering;
    }

    @e
    public final String component17() {
        return this.bargain_buyer;
    }

    @e
    public final String component18() {
        return this.bargain_seller;
    }

    @e
    public final String component19() {
        return this.wechat_notification;
    }

    @e
    public final SteamIdInfoObj component2() {
        return this.steam_id_info;
    }

    @e
    public final String component20() {
        return this.sale_setting;
    }

    @e
    public final String component3() {
        return this.buy_orders;
    }

    @e
    public final String component4() {
        return this.favour_num;
    }

    @e
    public final String component5() {
        return this.follow_num;
    }

    @e
    public final String component6() {
        return this.sell_orders;
    }

    @e
    public final String component7() {
        return this.selling;
    }

    @e
    public final Integer component8() {
        return this.trade_state;
    }

    @e
    public final String component9() {
        return this.trade_state_desc;
    }

    @d
    public final MallTradeHomeObj copy(@e AccountDetailObj accountDetailObj, @e SteamIdInfoObj steamIdInfoObj, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e Integer num, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16, @e String str17) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDetailObj, steamIdInfoObj, str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17}, this, changeQuickRedirect, false, 16028, new Class[]{AccountDetailObj.class, SteamIdInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, MallTradeHomeObj.class);
        return patchProxyResultProxy.isSupported ? (MallTradeHomeObj) patchProxyResultProxy.result : new MallTradeHomeObj(accountDetailObj, steamIdInfoObj, str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16032, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallTradeHomeObj)) {
            return false;
        }
        MallTradeHomeObj mallTradeHomeObj = (MallTradeHomeObj) obj;
        return f0.g(this.profile, mallTradeHomeObj.profile) && f0.g(this.steam_id_info, mallTradeHomeObj.steam_id_info) && f0.g(this.buy_orders, mallTradeHomeObj.buy_orders) && f0.g(this.favour_num, mallTradeHomeObj.favour_num) && f0.g(this.follow_num, mallTradeHomeObj.follow_num) && f0.g(this.sell_orders, mallTradeHomeObj.sell_orders) && f0.g(this.selling, mallTradeHomeObj.selling) && f0.g(this.trade_state, mallTradeHomeObj.trade_state) && f0.g(this.trade_state_desc, mallTradeHomeObj.trade_state_desc) && f0.g(this.wallet_value, mallTradeHomeObj.wallet_value) && f0.g(this.btn_desc, mallTradeHomeObj.btn_desc) && f0.g(this.btn_state, mallTradeHomeObj.btn_state) && f0.g(this.trade_check_message, mallTradeHomeObj.trade_check_message) && f0.g(this.purchasing, mallTradeHomeObj.purchasing) && f0.g(this.receiving, mallTradeHomeObj.receiving) && f0.g(this.delivering, mallTradeHomeObj.delivering) && f0.g(this.bargain_buyer, mallTradeHomeObj.bargain_buyer) && f0.g(this.bargain_seller, mallTradeHomeObj.bargain_seller) && f0.g(this.wechat_notification, mallTradeHomeObj.wechat_notification) && f0.g(this.sale_setting, mallTradeHomeObj.sale_setting);
    }

    @e
    public final String getBargain_buyer() {
        return this.bargain_buyer;
    }

    @e
    public final String getBargain_seller() {
        return this.bargain_seller;
    }

    @e
    public final String getBtn_desc() {
        return this.btn_desc;
    }

    @e
    public final String getBtn_state() {
        return this.btn_state;
    }

    @e
    public final String getBuy_orders() {
        return this.buy_orders;
    }

    @e
    public final String getDelivering() {
        return this.delivering;
    }

    @e
    public final String getFavour_num() {
        return this.favour_num;
    }

    @e
    public final String getFollow_num() {
        return this.follow_num;
    }

    @e
    public final AccountDetailObj getProfile() {
        return this.profile;
    }

    @e
    public final String getPurchasing() {
        return this.purchasing;
    }

    @e
    public final String getReceiving() {
        return this.receiving;
    }

    @e
    public final String getSale_setting() {
        return this.sale_setting;
    }

    @e
    public final String getSell_orders() {
        return this.sell_orders;
    }

    @e
    public final String getSelling() {
        return this.selling;
    }

    @e
    public final SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
    }

    @e
    public final String getTrade_check_message() {
        return this.trade_check_message;
    }

    @e
    public final Integer getTrade_state() {
        return this.trade_state;
    }

    @e
    public final String getTrade_state_desc() {
        return this.trade_state_desc;
    }

    @e
    public final String getWallet_value() {
        return this.wallet_value;
    }

    @e
    public final String getWechat_notification() {
        return this.wechat_notification;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16031, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        AccountDetailObj accountDetailObj = this.profile;
        int iHashCode = (accountDetailObj == null ? 0 : accountDetailObj.hashCode()) * 31;
        SteamIdInfoObj steamIdInfoObj = this.steam_id_info;
        int iHashCode2 = (iHashCode + (steamIdInfoObj == null ? 0 : steamIdInfoObj.hashCode())) * 31;
        String str = this.buy_orders;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.favour_num;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.follow_num;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sell_orders;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.selling;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.trade_state;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.trade_state_desc;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.wallet_value;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.btn_desc;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.btn_state;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.trade_check_message;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.purchasing;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.receiving;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.delivering;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bargain_buyer;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bargain_seller;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.wechat_notification;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.sale_setting;
        return iHashCode19 + (str17 != null ? str17.hashCode() : 0);
    }

    public final void setBargain_buyer(@e String str) {
        this.bargain_buyer = str;
    }

    public final void setBargain_seller(@e String str) {
        this.bargain_seller = str;
    }

    public final void setBtn_desc(@e String str) {
        this.btn_desc = str;
    }

    public final void setBtn_state(@e String str) {
        this.btn_state = str;
    }

    public final void setBuy_orders(@e String str) {
        this.buy_orders = str;
    }

    public final void setDelivering(@e String str) {
        this.delivering = str;
    }

    public final void setFavour_num(@e String str) {
        this.favour_num = str;
    }

    public final void setFollow_num(@e String str) {
        this.follow_num = str;
    }

    public final void setProfile(@e AccountDetailObj accountDetailObj) {
        this.profile = accountDetailObj;
    }

    public final void setPurchasing(@e String str) {
        this.purchasing = str;
    }

    public final void setReceiving(@e String str) {
        this.receiving = str;
    }

    public final void setSale_setting(@e String str) {
        this.sale_setting = str;
    }

    public final void setSell_orders(@e String str) {
        this.sell_orders = str;
    }

    public final void setSelling(@e String str) {
        this.selling = str;
    }

    public final void setSteam_id_info(@e SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public final void setTrade_check_message(@e String str) {
        this.trade_check_message = str;
    }

    public final void setTrade_state(@e Integer num) {
        this.trade_state = num;
    }

    public final void setTrade_state_desc(@e String str) {
        this.trade_state_desc = str;
    }

    public final void setWallet_value(@e String str) {
        this.wallet_value = str;
    }

    public final void setWechat_notification(@e String str) {
        this.wechat_notification = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16030, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallTradeHomeObj(profile=" + this.profile + ", steam_id_info=" + this.steam_id_info + ", buy_orders=" + this.buy_orders + ", favour_num=" + this.favour_num + ", follow_num=" + this.follow_num + ", sell_orders=" + this.sell_orders + ", selling=" + this.selling + ", trade_state=" + this.trade_state + ", trade_state_desc=" + this.trade_state_desc + ", wallet_value=" + this.wallet_value + ", btn_desc=" + this.btn_desc + ", btn_state=" + this.btn_state + ", trade_check_message=" + this.trade_check_message + ", purchasing=" + this.purchasing + ", receiving=" + this.receiving + ", delivering=" + this.delivering + ", bargain_buyer=" + this.bargain_buyer + ", bargain_seller=" + this.bargain_seller + ", wechat_notification=" + this.wechat_notification + ", sale_setting=" + this.sale_setting + ')';
    }
}
