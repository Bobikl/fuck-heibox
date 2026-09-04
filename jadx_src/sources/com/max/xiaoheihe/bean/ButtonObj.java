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

/* JADX INFO: compiled from: ButtonObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ButtonObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;

    @e
    private String img;

    @e
    private String protocol;

    @e
    private String text_color;

    @e
    private String title;

    public ButtonObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.title = str;
        this.protocol = str2;
        this.text_color = str3;
        this.img = str4;
        this.bg_color = str5;
    }

    public static /* synthetic */ ButtonObj copy$default(ButtonObj buttonObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{buttonObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.KL, new Class[]{ButtonObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ButtonObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ButtonObj) patchProxyResultProxy.result;
        }
        return buttonObj.copy((i10 & 1) != 0 ? buttonObj.title : str, (i10 & 2) != 0 ? buttonObj.protocol : str2, (i10 & 4) != 0 ? buttonObj.text_color : str3, (i10 & 8) != 0 ? buttonObj.img : str4, (i10 & 16) != 0 ? buttonObj.bg_color : str5);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final String component3() {
        return this.text_color;
    }

    @e
    public final String component4() {
        return this.img;
    }

    @e
    public final String component5() {
        return this.bg_color;
    }

    @d
    public final ButtonObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, c.m.JL, new Class[]{String.class, String.class, String.class, String.class, String.class}, ButtonObj.class);
        return patchProxyResultProxy.isSupported ? (ButtonObj) patchProxyResultProxy.result : new ButtonObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.NL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonObj)) {
            return false;
        }
        ButtonObj buttonObj = (ButtonObj) obj;
        return f0.g(this.title, buttonObj.title) && f0.g(this.protocol, buttonObj.protocol) && f0.g(this.text_color, buttonObj.text_color) && f0.g(this.img, buttonObj.img) && f0.g(this.bg_color, buttonObj.bg_color);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.ML, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bg_color;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.LL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ButtonObj(title=" + this.title + ", protocol=" + this.protocol + ", text_color=" + this.text_color + ", img=" + this.img + ", bg_color=" + this.bg_color + ')';
    }
}
