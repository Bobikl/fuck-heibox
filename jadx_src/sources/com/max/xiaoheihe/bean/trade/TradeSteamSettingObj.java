package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeSteamSettingObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamSettingObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer has_api_key;

    @e
    private String has_api_key_desc;

    @e
    private Integer has_open_inventory;

    @e
    private Integer has_trade_url;

    @e
    private String has_trade_url_desc;

    @e
    private String message;

    @e
    private SteamIdInfoObj steam_id_info;

    @e
    private Integer trade_state;

    @e
    private String trade_state_desc;

    @e
    private String trade_url;

    public TradeSteamSettingObj(@e SteamIdInfoObj steamIdInfoObj, @e Integer num, @e Integer num2, @e String str, @e Integer num3, @e Integer num4, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.steam_id_info = steamIdInfoObj;
        this.has_open_inventory = num;
        this.has_trade_url = num2;
        this.trade_url = str;
        this.has_api_key = num3;
        this.trade_state = num4;
        this.trade_state_desc = str2;
        this.message = str3;
        this.has_trade_url_desc = str4;
        this.has_api_key_desc = str5;
    }

    public static /* synthetic */ TradeSteamSettingObj copy$default(TradeSteamSettingObj tradeSteamSettingObj, SteamIdInfoObj steamIdInfoObj, Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamSettingObj, steamIdInfoObj, num, num2, str, num3, num4, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 16203, new Class[]{TradeSteamSettingObj.class, SteamIdInfoObj.class, Integer.class, Integer.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeSteamSettingObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamSettingObj) patchProxyResultProxy.result;
        }
        return tradeSteamSettingObj.copy((i10 & 1) != 0 ? tradeSteamSettingObj.steam_id_info : steamIdInfoObj, (i10 & 2) != 0 ? tradeSteamSettingObj.has_open_inventory : num, (i10 & 4) != 0 ? tradeSteamSettingObj.has_trade_url : num2, (i10 & 8) != 0 ? tradeSteamSettingObj.trade_url : str, (i10 & 16) != 0 ? tradeSteamSettingObj.has_api_key : num3, (i10 & 32) != 0 ? tradeSteamSettingObj.trade_state : num4, (i10 & 64) != 0 ? tradeSteamSettingObj.trade_state_desc : str2, (i10 & 128) != 0 ? tradeSteamSettingObj.message : str3, (i10 & 256) != 0 ? tradeSteamSettingObj.has_trade_url_desc : str4, (i10 & 512) != 0 ? tradeSteamSettingObj.has_api_key_desc : str5);
    }

    @e
    public final SteamIdInfoObj component1() {
        return this.steam_id_info;
    }

    @e
    public final String component10() {
        return this.has_api_key_desc;
    }

    @e
    public final Integer component2() {
        return this.has_open_inventory;
    }

    @e
    public final Integer component3() {
        return this.has_trade_url;
    }

    @e
    public final String component4() {
        return this.trade_url;
    }

    @e
    public final Integer component5() {
        return this.has_api_key;
    }

    @e
    public final Integer component6() {
        return this.trade_state;
    }

    @e
    public final String component7() {
        return this.trade_state_desc;
    }

    @e
    public final String component8() {
        return this.message;
    }

    @e
    public final String component9() {
        return this.has_trade_url_desc;
    }

    @d
    public final TradeSteamSettingObj copy(@e SteamIdInfoObj steamIdInfoObj, @e Integer num, @e Integer num2, @e String str, @e Integer num3, @e Integer num4, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamIdInfoObj, num, num2, str, num3, num4, str2, str3, str4, str5}, this, changeQuickRedirect, false, 16202, new Class[]{SteamIdInfoObj.class, Integer.class, Integer.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class}, TradeSteamSettingObj.class);
        return patchProxyResultProxy.isSupported ? (TradeSteamSettingObj) patchProxyResultProxy.result : new TradeSteamSettingObj(steamIdInfoObj, num, num2, str, num3, num4, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16206, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSteamSettingObj)) {
            return false;
        }
        TradeSteamSettingObj tradeSteamSettingObj = (TradeSteamSettingObj) obj;
        return f0.g(this.steam_id_info, tradeSteamSettingObj.steam_id_info) && f0.g(this.has_open_inventory, tradeSteamSettingObj.has_open_inventory) && f0.g(this.has_trade_url, tradeSteamSettingObj.has_trade_url) && f0.g(this.trade_url, tradeSteamSettingObj.trade_url) && f0.g(this.has_api_key, tradeSteamSettingObj.has_api_key) && f0.g(this.trade_state, tradeSteamSettingObj.trade_state) && f0.g(this.trade_state_desc, tradeSteamSettingObj.trade_state_desc) && f0.g(this.message, tradeSteamSettingObj.message) && f0.g(this.has_trade_url_desc, tradeSteamSettingObj.has_trade_url_desc) && f0.g(this.has_api_key_desc, tradeSteamSettingObj.has_api_key_desc);
    }

    @e
    public final Integer getHas_api_key() {
        return this.has_api_key;
    }

    @e
    public final String getHas_api_key_desc() {
        return this.has_api_key_desc;
    }

    @e
    public final Integer getHas_open_inventory() {
        return this.has_open_inventory;
    }

    @e
    public final Integer getHas_trade_url() {
        return this.has_trade_url;
    }

    @e
    public final String getHas_trade_url_desc() {
        return this.has_trade_url_desc;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
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
    public final String getTrade_url() {
        return this.trade_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16205, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        SteamIdInfoObj steamIdInfoObj = this.steam_id_info;
        int iHashCode = (steamIdInfoObj == null ? 0 : steamIdInfoObj.hashCode()) * 31;
        Integer num = this.has_open_inventory;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.has_trade_url;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.trade_url;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.has_api_key;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.trade_state;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.trade_state_desc;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.has_trade_url_desc;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.has_api_key_desc;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setHas_api_key(@e Integer num) {
        this.has_api_key = num;
    }

    public final void setHas_api_key_desc(@e String str) {
        this.has_api_key_desc = str;
    }

    public final void setHas_open_inventory(@e Integer num) {
        this.has_open_inventory = num;
    }

    public final void setHas_trade_url(@e Integer num) {
        this.has_trade_url = num;
    }

    public final void setHas_trade_url_desc(@e String str) {
        this.has_trade_url_desc = str;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setSteam_id_info(@e SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public final void setTrade_state(@e Integer num) {
        this.trade_state = num;
    }

    public final void setTrade_state_desc(@e String str) {
        this.trade_state_desc = str;
    }

    public final void setTrade_url(@e String str) {
        this.trade_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16204, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamSettingObj(steam_id_info=" + this.steam_id_info + ", has_open_inventory=" + this.has_open_inventory + ", has_trade_url=" + this.has_trade_url + ", trade_url=" + this.trade_url + ", has_api_key=" + this.has_api_key + ", trade_state=" + this.trade_state + ", trade_state_desc=" + this.trade_state_desc + ", message=" + this.message + ", has_trade_url_desc=" + this.has_trade_url_desc + ", has_api_key_desc=" + this.has_api_key_desc + ')';
    }
}
