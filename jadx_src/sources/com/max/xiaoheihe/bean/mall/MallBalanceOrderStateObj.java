package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallBalanceOrderStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallBalanceOrderStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccProxyObj acc_proxy;

    @e
    private String alert;

    @e
    private String bottom_color;

    @e
    private String bottom_msg;

    @e
    private String error_code;

    @e
    private String error_msg;

    @e
    private String faq;

    @e
    private String interval;

    @e
    private String redirect_url;

    @d
    private String state;

    @e
    private String tips;

    public MallBalanceOrderStateObj(@d String state, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e AccProxyObj accProxyObj, @e String str9) {
        f0.p(state, "state");
        this.state = state;
        this.error_code = str;
        this.error_msg = str2;
        this.interval = str3;
        this.faq = str4;
        this.tips = str5;
        this.alert = str6;
        this.bottom_msg = str7;
        this.bottom_color = str8;
        this.acc_proxy = accProxyObj;
        this.redirect_url = str9;
    }

    public static /* synthetic */ MallBalanceOrderStateObj copy$default(MallBalanceOrderStateObj mallBalanceOrderStateObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AccProxyObj accProxyObj, String str10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj, str, str2, str3, str4, str5, str6, str7, str8, str9, accProxyObj, str10, new Integer(i10), obj}, null, changeQuickRedirect, true, 15482, new Class[]{MallBalanceOrderStateObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, AccProxyObj.class, String.class, Integer.TYPE, Object.class}, MallBalanceOrderStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallBalanceOrderStateObj) patchProxyResultProxy.result;
        }
        return mallBalanceOrderStateObj.copy((i10 & 1) != 0 ? mallBalanceOrderStateObj.state : str, (i10 & 2) != 0 ? mallBalanceOrderStateObj.error_code : str2, (i10 & 4) != 0 ? mallBalanceOrderStateObj.error_msg : str3, (i10 & 8) != 0 ? mallBalanceOrderStateObj.interval : str4, (i10 & 16) != 0 ? mallBalanceOrderStateObj.faq : str5, (i10 & 32) != 0 ? mallBalanceOrderStateObj.tips : str6, (i10 & 64) != 0 ? mallBalanceOrderStateObj.alert : str7, (i10 & 128) != 0 ? mallBalanceOrderStateObj.bottom_msg : str8, (i10 & 256) != 0 ? mallBalanceOrderStateObj.bottom_color : str9, (i10 & 512) != 0 ? mallBalanceOrderStateObj.acc_proxy : accProxyObj, (i10 & 1024) != 0 ? mallBalanceOrderStateObj.redirect_url : str10);
    }

    @d
    public final String component1() {
        return this.state;
    }

    @e
    public final AccProxyObj component10() {
        return this.acc_proxy;
    }

    @e
    public final String component11() {
        return this.redirect_url;
    }

    @e
    public final String component2() {
        return this.error_code;
    }

    @e
    public final String component3() {
        return this.error_msg;
    }

    @e
    public final String component4() {
        return this.interval;
    }

    @e
    public final String component5() {
        return this.faq;
    }

    @e
    public final String component6() {
        return this.tips;
    }

    @e
    public final String component7() {
        return this.alert;
    }

    @e
    public final String component8() {
        return this.bottom_msg;
    }

    @e
    public final String component9() {
        return this.bottom_color;
    }

    @d
    public final MallBalanceOrderStateObj copy(@d String state, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e AccProxyObj accProxyObj, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{state, str, str2, str3, str4, str5, str6, str7, str8, accProxyObj, str9}, this, changeQuickRedirect, false, 15481, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, AccProxyObj.class, String.class}, MallBalanceOrderStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallBalanceOrderStateObj) patchProxyResultProxy.result;
        }
        f0.p(state, "state");
        return new MallBalanceOrderStateObj(state, str, str2, str3, str4, str5, str6, str7, str8, accProxyObj, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15485, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallBalanceOrderStateObj)) {
            return false;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObj = (MallBalanceOrderStateObj) obj;
        return f0.g(this.state, mallBalanceOrderStateObj.state) && f0.g(this.error_code, mallBalanceOrderStateObj.error_code) && f0.g(this.error_msg, mallBalanceOrderStateObj.error_msg) && f0.g(this.interval, mallBalanceOrderStateObj.interval) && f0.g(this.faq, mallBalanceOrderStateObj.faq) && f0.g(this.tips, mallBalanceOrderStateObj.tips) && f0.g(this.alert, mallBalanceOrderStateObj.alert) && f0.g(this.bottom_msg, mallBalanceOrderStateObj.bottom_msg) && f0.g(this.bottom_color, mallBalanceOrderStateObj.bottom_color) && f0.g(this.acc_proxy, mallBalanceOrderStateObj.acc_proxy) && f0.g(this.redirect_url, mallBalanceOrderStateObj.redirect_url);
    }

    @e
    public final AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    @e
    public final String getAlert() {
        return this.alert;
    }

    @e
    public final String getBottom_color() {
        return this.bottom_color;
    }

    @e
    public final String getBottom_msg() {
        return this.bottom_msg;
    }

    @e
    public final String getError_code() {
        return this.error_code;
    }

    @e
    public final String getError_msg() {
        return this.error_msg;
    }

    @e
    public final String getFaq() {
        return this.faq;
    }

    @e
    public final String getInterval() {
        return this.interval;
    }

    @e
    public final String getRedirect_url() {
        return this.redirect_url;
    }

    @d
    public final String getState() {
        return this.state;
    }

    @e
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15484, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.state.hashCode() * 31;
        String str = this.error_code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_msg;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.interval;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.faq;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tips;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.alert;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bottom_msg;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bottom_color;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AccProxyObj accProxyObj = this.acc_proxy;
        int iHashCode10 = (iHashCode9 + (accProxyObj == null ? 0 : accProxyObj.hashCode())) * 31;
        String str9 = this.redirect_url;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setAcc_proxy(@e AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public final void setAlert(@e String str) {
        this.alert = str;
    }

    public final void setBottom_color(@e String str) {
        this.bottom_color = str;
    }

    public final void setBottom_msg(@e String str) {
        this.bottom_msg = str;
    }

    public final void setError_code(@e String str) {
        this.error_code = str;
    }

    public final void setError_msg(@e String str) {
        this.error_msg = str;
    }

    public final void setFaq(@e String str) {
        this.faq = str;
    }

    public final void setInterval(@e String str) {
        this.interval = str;
    }

    public final void setRedirect_url(@e String str) {
        this.redirect_url = str;
    }

    public final void setState(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15480, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.state = str;
    }

    public final void setTips(@e String str) {
        this.tips = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15483, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallBalanceOrderStateObj(state=" + this.state + ", error_code=" + this.error_code + ", error_msg=" + this.error_msg + ", interval=" + this.interval + ", faq=" + this.faq + ", tips=" + this.tips + ", alert=" + this.alert + ", bottom_msg=" + this.bottom_msg + ", bottom_color=" + this.bottom_color + ", acc_proxy=" + this.acc_proxy + ", redirect_url=" + this.redirect_url + ')';
    }
}
