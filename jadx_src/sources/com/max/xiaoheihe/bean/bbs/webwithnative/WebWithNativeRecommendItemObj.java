package com.max.xiaoheihe.bean.bbs.webwithnative;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebWithNativeRecommendItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebWithNativeRecommendItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_check_color;

    @e
    private String bg_uncheck_color;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String text_check_color;

    @e
    private String text_uncheck_color;

    public WebWithNativeRecommendItemObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.bg_check_color = str;
        this.bg_uncheck_color = str2;
        this.text_uncheck_color = str3;
        this.text_check_color = str4;
        this.icon = str5;
        this.desc = str6;
    }

    public static /* synthetic */ WebWithNativeRecommendItemObj copy$default(WebWithNativeRecommendItemObj webWithNativeRecommendItemObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webWithNativeRecommendItemObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 14586, new Class[]{WebWithNativeRecommendItemObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WebWithNativeRecommendItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebWithNativeRecommendItemObj) patchProxyResultProxy.result;
        }
        return webWithNativeRecommendItemObj.copy((i10 & 1) != 0 ? webWithNativeRecommendItemObj.bg_check_color : str, (i10 & 2) != 0 ? webWithNativeRecommendItemObj.bg_uncheck_color : str2, (i10 & 4) != 0 ? webWithNativeRecommendItemObj.text_uncheck_color : str3, (i10 & 8) != 0 ? webWithNativeRecommendItemObj.text_check_color : str4, (i10 & 16) != 0 ? webWithNativeRecommendItemObj.icon : str5, (i10 & 32) != 0 ? webWithNativeRecommendItemObj.desc : str6);
    }

    @e
    public final String component1() {
        return this.bg_check_color;
    }

    @e
    public final String component2() {
        return this.bg_uncheck_color;
    }

    @e
    public final String component3() {
        return this.text_uncheck_color;
    }

    @e
    public final String component4() {
        return this.text_check_color;
    }

    @e
    public final String component5() {
        return this.icon;
    }

    @e
    public final String component6() {
        return this.desc;
    }

    @d
    public final WebWithNativeRecommendItemObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 14585, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, WebWithNativeRecommendItemObj.class);
        return patchProxyResultProxy.isSupported ? (WebWithNativeRecommendItemObj) patchProxyResultProxy.result : new WebWithNativeRecommendItemObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14589, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebWithNativeRecommendItemObj)) {
            return false;
        }
        WebWithNativeRecommendItemObj webWithNativeRecommendItemObj = (WebWithNativeRecommendItemObj) obj;
        return f0.g(this.bg_check_color, webWithNativeRecommendItemObj.bg_check_color) && f0.g(this.bg_uncheck_color, webWithNativeRecommendItemObj.bg_uncheck_color) && f0.g(this.text_uncheck_color, webWithNativeRecommendItemObj.text_uncheck_color) && f0.g(this.text_check_color, webWithNativeRecommendItemObj.text_check_color) && f0.g(this.icon, webWithNativeRecommendItemObj.icon) && f0.g(this.desc, webWithNativeRecommendItemObj.desc);
    }

    @e
    public final String getBg_check_color() {
        return this.bg_check_color;
    }

    @e
    public final String getBg_uncheck_color() {
        return this.bg_uncheck_color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getText_check_color() {
        return this.text_check_color;
    }

    @e
    public final String getText_uncheck_color() {
        return this.text_uncheck_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14588, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.bg_check_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bg_uncheck_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text_uncheck_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text_check_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBg_check_color(@e String str) {
        this.bg_check_color = str;
    }

    public final void setBg_uncheck_color(@e String str) {
        this.bg_uncheck_color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setText_check_color(@e String str) {
        this.text_check_color = str;
    }

    public final void setText_uncheck_color(@e String str) {
        this.text_uncheck_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14587, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebWithNativeRecommendItemObj(bg_check_color=" + this.bg_check_color + ", bg_uncheck_color=" + this.bg_uncheck_color + ", text_uncheck_color=" + this.text_uncheck_color + ", text_check_color=" + this.text_check_color + ", icon=" + this.icon + ", desc=" + this.desc + ')';
    }
}
