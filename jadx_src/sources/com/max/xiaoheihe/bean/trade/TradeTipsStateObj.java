package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeTipsStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeTipsStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bot_time;

    @e
    private String has_trading_report;

    @e
    private String me_tab_time;

    @e
    private String message_time;

    @e
    private String sms_push;

    @e
    private String trade_tab_time;

    @e
    private String wechat_push;

    public TradeTipsStateObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this.bot_time = str;
        this.message_time = str2;
        this.trade_tab_time = str3;
        this.me_tab_time = str4;
        this.has_trading_report = str5;
        this.wechat_push = str6;
        this.sms_push = str7;
    }

    public static /* synthetic */ TradeTipsStateObj copy$default(TradeTipsStateObj tradeTipsStateObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeTipsStateObj, str, str2, str3, str4, str5, str6, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 16212, new Class[]{TradeTipsStateObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeTipsStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeTipsStateObj) patchProxyResultProxy.result;
        }
        return tradeTipsStateObj.copy((i10 & 1) != 0 ? tradeTipsStateObj.bot_time : str, (i10 & 2) != 0 ? tradeTipsStateObj.message_time : str2, (i10 & 4) != 0 ? tradeTipsStateObj.trade_tab_time : str3, (i10 & 8) != 0 ? tradeTipsStateObj.me_tab_time : str4, (i10 & 16) != 0 ? tradeTipsStateObj.has_trading_report : str5, (i10 & 32) != 0 ? tradeTipsStateObj.wechat_push : str6, (i10 & 64) != 0 ? tradeTipsStateObj.sms_push : str7);
    }

    @e
    public final String component1() {
        return this.bot_time;
    }

    @e
    public final String component2() {
        return this.message_time;
    }

    @e
    public final String component3() {
        return this.trade_tab_time;
    }

    @e
    public final String component4() {
        return this.me_tab_time;
    }

    @e
    public final String component5() {
        return this.has_trading_report;
    }

    @e
    public final String component6() {
        return this.wechat_push;
    }

    @e
    public final String component7() {
        return this.sms_push;
    }

    @d
    public final TradeTipsStateObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 16211, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, TradeTipsStateObj.class);
        return patchProxyResultProxy.isSupported ? (TradeTipsStateObj) patchProxyResultProxy.result : new TradeTipsStateObj(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16215, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeTipsStateObj)) {
            return false;
        }
        TradeTipsStateObj tradeTipsStateObj = (TradeTipsStateObj) obj;
        return f0.g(this.bot_time, tradeTipsStateObj.bot_time) && f0.g(this.message_time, tradeTipsStateObj.message_time) && f0.g(this.trade_tab_time, tradeTipsStateObj.trade_tab_time) && f0.g(this.me_tab_time, tradeTipsStateObj.me_tab_time) && f0.g(this.has_trading_report, tradeTipsStateObj.has_trading_report) && f0.g(this.wechat_push, tradeTipsStateObj.wechat_push) && f0.g(this.sms_push, tradeTipsStateObj.sms_push);
    }

    @e
    public final String getBot_time() {
        return this.bot_time;
    }

    @e
    public final String getHas_trading_report() {
        return this.has_trading_report;
    }

    @e
    public final String getMe_tab_time() {
        return this.me_tab_time;
    }

    @e
    public final String getMessage_time() {
        return this.message_time;
    }

    @e
    public final String getSms_push() {
        return this.sms_push;
    }

    @e
    public final String getTrade_tab_time() {
        return this.trade_tab_time;
    }

    @e
    public final String getWechat_push() {
        return this.wechat_push;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16214, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.bot_time;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message_time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trade_tab_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.me_tab_time;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.has_trading_report;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.wechat_push;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sms_push;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setBot_time(@e String str) {
        this.bot_time = str;
    }

    public final void setHas_trading_report(@e String str) {
        this.has_trading_report = str;
    }

    public final void setMe_tab_time(@e String str) {
        this.me_tab_time = str;
    }

    public final void setMessage_time(@e String str) {
        this.message_time = str;
    }

    public final void setSms_push(@e String str) {
        this.sms_push = str;
    }

    public final void setTrade_tab_time(@e String str) {
        this.trade_tab_time = str;
    }

    public final void setWechat_push(@e String str) {
        this.wechat_push = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16213, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeTipsStateObj(bot_time=" + this.bot_time + ", message_time=" + this.message_time + ", trade_tab_time=" + this.trade_tab_time + ", me_tab_time=" + this.me_tab_time + ", has_trading_report=" + this.has_trading_report + ", wechat_push=" + this.wechat_push + ", sms_push=" + this.sms_push + ')';
    }
}
