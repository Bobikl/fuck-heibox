package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ButtonObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TypedButtonObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("bg_color")
    @e
    private GradientColorObj bgColor;

    @e
    private String img;

    @e
    private String protocol;

    @SerializedName("text_color")
    @e
    private String textColor;

    @e
    private String title;

    @e
    private String type;

    public TypedButtonObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e GradientColorObj gradientColorObj) {
        this.type = str;
        this.title = str2;
        this.protocol = str3;
        this.textColor = str4;
        this.img = str5;
        this.bgColor = gradientColorObj;
    }

    public static /* synthetic */ TypedButtonObj copy$default(TypedButtonObj typedButtonObj, String str, String str2, String str3, String str4, String str5, GradientColorObj gradientColorObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedButtonObj, str, str2, str3, str4, str5, gradientColorObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.tN, new Class[]{TypedButtonObj.class, String.class, String.class, String.class, String.class, String.class, GradientColorObj.class, Integer.TYPE, Object.class}, TypedButtonObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TypedButtonObj) patchProxyResultProxy.result;
        }
        return typedButtonObj.copy((i10 & 1) != 0 ? typedButtonObj.type : str, (i10 & 2) != 0 ? typedButtonObj.title : str2, (i10 & 4) != 0 ? typedButtonObj.protocol : str3, (i10 & 8) != 0 ? typedButtonObj.textColor : str4, (i10 & 16) != 0 ? typedButtonObj.img : str5, (i10 & 32) != 0 ? typedButtonObj.bgColor : gradientColorObj);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.protocol;
    }

    @e
    public final String component4() {
        return this.textColor;
    }

    @e
    public final String component5() {
        return this.img;
    }

    @e
    public final GradientColorObj component6() {
        return this.bgColor;
    }

    @d
    public final TypedButtonObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e GradientColorObj gradientColorObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, gradientColorObj}, this, changeQuickRedirect, false, c.m.sN, new Class[]{String.class, String.class, String.class, String.class, String.class, GradientColorObj.class}, TypedButtonObj.class);
        return patchProxyResultProxy.isSupported ? (TypedButtonObj) patchProxyResultProxy.result : new TypedButtonObj(str, str2, str3, str4, str5, gradientColorObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.wN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedButtonObj)) {
            return false;
        }
        TypedButtonObj typedButtonObj = (TypedButtonObj) obj;
        return f0.g(this.type, typedButtonObj.type) && f0.g(this.title, typedButtonObj.title) && f0.g(this.protocol, typedButtonObj.protocol) && f0.g(this.textColor, typedButtonObj.textColor) && f0.g(this.img, typedButtonObj.img) && f0.g(this.bgColor, typedButtonObj.bgColor);
    }

    @e
    public final GradientColorObj getBgColor() {
        return this.bgColor;
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
    public final String getTextColor() {
        return this.textColor;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.vN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protocol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GradientColorObj gradientColorObj = this.bgColor;
        return iHashCode5 + (gradientColorObj != null ? gradientColorObj.hashCode() : 0);
    }

    public final void setBgColor(@e GradientColorObj gradientColorObj) {
        this.bgColor = gradientColorObj;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTextColor(@e String str) {
        this.textColor = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.uN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TypedButtonObj(type=" + this.type + ", title=" + this.title + ", protocol=" + this.protocol + ", textColor=" + this.textColor + ", img=" + this.img + ", bgColor=" + this.bgColor + ')';
    }
}
