package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GradientColorObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GradientColorObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String direction;

    @e
    private String end_color;

    @e
    private String start_color;

    public GradientColorObj(@e String str, @e String str2, @e String str3) {
        this.start_color = str;
        this.end_color = str2;
        this.direction = str3;
    }

    public static /* synthetic */ GradientColorObj copy$default(GradientColorObj gradientColorObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientColorObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15384, new Class[]{GradientColorObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GradientColorObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientColorObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = gradientColorObj.start_color;
        }
        if ((i10 & 2) != 0) {
            str2 = gradientColorObj.end_color;
        }
        if ((i10 & 4) != 0) {
            str3 = gradientColorObj.direction;
        }
        return gradientColorObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.start_color;
    }

    @e
    public final String component2() {
        return this.end_color;
    }

    @e
    public final String component3() {
        return this.direction;
    }

    @d
    public final GradientColorObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15383, new Class[]{String.class, String.class, String.class}, GradientColorObj.class);
        return patchProxyResultProxy.isSupported ? (GradientColorObj) patchProxyResultProxy.result : new GradientColorObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15387, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorObj)) {
            return false;
        }
        GradientColorObj gradientColorObj = (GradientColorObj) obj;
        return f0.g(this.start_color, gradientColorObj.start_color) && f0.g(this.end_color, gradientColorObj.end_color) && f0.g(this.direction, gradientColorObj.direction);
    }

    @e
    public final String getDirection() {
        return this.direction;
    }

    @e
    public final String getEnd_color() {
        return this.end_color;
    }

    @e
    public final String getStart_color() {
        return this.start_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15386, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.start_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.direction;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDirection(@e String str) {
        this.direction = str;
    }

    public final void setEnd_color(@e String str) {
        this.end_color = str;
    }

    public final void setStart_color(@e String str) {
        this.start_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15385, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GradientColorObj(start_color=" + this.start_color + ", end_color=" + this.end_color + ", direction=" + this.direction + ')';
    }
}
