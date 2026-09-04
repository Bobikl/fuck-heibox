package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ColorObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String end;

    @e
    private String opacity;

    @e
    private String start;

    public ColorObj(@e String str, @e String str2, @e String str3) {
        this.start = str;
        this.end = str2;
        this.opacity = str3;
    }

    public static /* synthetic */ ColorObj copy$default(ColorObj colorObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15024, new Class[]{ColorObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ColorObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = colorObj.start;
        }
        if ((i10 & 2) != 0) {
            str2 = colorObj.end;
        }
        if ((i10 & 4) != 0) {
            str3 = colorObj.opacity;
        }
        return colorObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.start;
    }

    @e
    public final String component2() {
        return this.end;
    }

    @e
    public final String component3() {
        return this.opacity;
    }

    @d
    public final ColorObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15023, new Class[]{String.class, String.class, String.class}, ColorObj.class);
        return patchProxyResultProxy.isSupported ? (ColorObj) patchProxyResultProxy.result : new ColorObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15027, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorObj)) {
            return false;
        }
        ColorObj colorObj = (ColorObj) obj;
        return f0.g(this.start, colorObj.start) && f0.g(this.end, colorObj.end) && f0.g(this.opacity, colorObj.opacity);
    }

    @e
    public final String getEnd() {
        return this.end;
    }

    @e
    public final String getOpacity() {
        return this.opacity;
    }

    @e
    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15026, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.start;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.opacity;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setEnd(@e String str) {
        this.end = str;
    }

    public final void setOpacity(@e String str) {
        this.opacity = str;
    }

    public final void setStart(@e String str) {
        this.start = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15025, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ColorObj(start=" + this.start + ", end=" + this.end + ", opacity=" + this.opacity + ')';
    }
}
