package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BgConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BgConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;

    @e
    private String color1;

    @e
    private String color2;

    @e
    private String color3;

    @e
    private String color4;

    @e
    private String pure_bg_color;

    public BgConfigObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.bg_color = str;
        this.color1 = str2;
        this.color2 = str3;
        this.color3 = str4;
        this.color4 = str5;
        this.pure_bg_color = str6;
    }

    public static /* synthetic */ BgConfigObj copy$default(BgConfigObj bgConfigObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bgConfigObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.FL, new Class[]{BgConfigObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, BgConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BgConfigObj) patchProxyResultProxy.result;
        }
        return bgConfigObj.copy((i10 & 1) != 0 ? bgConfigObj.bg_color : str, (i10 & 2) != 0 ? bgConfigObj.color1 : str2, (i10 & 4) != 0 ? bgConfigObj.color2 : str3, (i10 & 8) != 0 ? bgConfigObj.color3 : str4, (i10 & 16) != 0 ? bgConfigObj.color4 : str5, (i10 & 32) != 0 ? bgConfigObj.pure_bg_color : str6);
    }

    @e
    public final String component1() {
        return this.bg_color;
    }

    @e
    public final String component2() {
        return this.color1;
    }

    @e
    public final String component3() {
        return this.color2;
    }

    @e
    public final String component4() {
        return this.color3;
    }

    @e
    public final String component5() {
        return this.color4;
    }

    @e
    public final String component6() {
        return this.pure_bg_color;
    }

    @d
    public final BgConfigObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, c.m.EL, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, BgConfigObj.class);
        return patchProxyResultProxy.isSupported ? (BgConfigObj) patchProxyResultProxy.result : new BgConfigObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.IL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BgConfigObj)) {
            return false;
        }
        BgConfigObj bgConfigObj = (BgConfigObj) obj;
        return f0.g(this.bg_color, bgConfigObj.bg_color) && f0.g(this.color1, bgConfigObj.color1) && f0.g(this.color2, bgConfigObj.color2) && f0.g(this.color3, bgConfigObj.color3) && f0.g(this.color4, bgConfigObj.color4) && f0.g(this.pure_bg_color, bgConfigObj.pure_bg_color);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getColor1() {
        return this.color1;
    }

    @e
    public final String getColor2() {
        return this.color2;
    }

    @e
    public final String getColor3() {
        return this.color3;
    }

    @e
    public final String getColor4() {
        return this.color4;
    }

    @e
    public final String getPure_bg_color() {
        return this.pure_bg_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.HL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.bg_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.color3;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.color4;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pure_bg_color;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setColor1(@e String str) {
        this.color1 = str;
    }

    public final void setColor2(@e String str) {
        this.color2 = str;
    }

    public final void setColor3(@e String str) {
        this.color3 = str;
    }

    public final void setColor4(@e String str) {
        this.color4 = str;
    }

    public final void setPure_bg_color(@e String str) {
        this.pure_bg_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.GL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BgConfigObj(bg_color=" + this.bg_color + ", color1=" + this.color1 + ", color2=" + this.color2 + ", color3=" + this.color3 + ", color4=" + this.color4 + ", pure_bg_color=" + this.pure_bg_color + ')';
    }
}
