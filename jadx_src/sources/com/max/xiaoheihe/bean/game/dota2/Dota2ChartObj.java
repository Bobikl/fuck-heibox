package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2ChartObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2ChartObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String icon;

    @e
    private String time;

    @e
    private String value;

    public Dota2ChartObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.time = str;
        this.value = str2;
        this.color = str3;
        this.icon = str4;
    }

    public static /* synthetic */ Dota2ChartObj copy$default(Dota2ChartObj dota2ChartObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2ChartObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15067, new Class[]{Dota2ChartObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2ChartObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2ChartObj) patchProxyResultProxy.result;
        }
        return dota2ChartObj.copy((i10 & 1) != 0 ? dota2ChartObj.time : str, (i10 & 2) != 0 ? dota2ChartObj.value : str2, (i10 & 4) != 0 ? dota2ChartObj.color : str3, (i10 & 8) != 0 ? dota2ChartObj.icon : str4);
    }

    @e
    public final String component1() {
        return this.time;
    }

    @e
    public final String component2() {
        return this.value;
    }

    @e
    public final String component3() {
        return this.color;
    }

    @e
    public final String component4() {
        return this.icon;
    }

    @d
    public final Dota2ChartObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15066, new Class[]{String.class, String.class, String.class, String.class}, Dota2ChartObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2ChartObj) patchProxyResultProxy.result : new Dota2ChartObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15070, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2ChartObj)) {
            return false;
        }
        Dota2ChartObj dota2ChartObj = (Dota2ChartObj) obj;
        return f0.g(this.time, dota2ChartObj.time) && f0.g(this.value, dota2ChartObj.value) && f0.g(this.color, dota2ChartObj.color) && f0.g(this.icon, dota2ChartObj.icon);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getTime() {
        return this.time;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15069, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.time;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setTime(@e String str) {
        this.time = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15068, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2ChartObj(time=" + this.time + ", value=" + this.value + ", color=" + this.color + ", icon=" + this.icon + ')';
    }
}
