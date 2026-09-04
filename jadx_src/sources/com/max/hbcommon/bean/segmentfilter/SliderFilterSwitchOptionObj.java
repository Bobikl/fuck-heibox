package com.max.hbcommon.bean.segmentfilter;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SliderFilterSwitchObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SliderFilterSwitchOptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String desc;

    @e
    private String key;

    public SliderFilterSwitchOptionObj(@e String str, @e String str2, @e String str3) {
        this.key = str;
        this.desc = str2;
        this.color = str3;
    }

    public static /* synthetic */ SliderFilterSwitchOptionObj copy$default(SliderFilterSwitchOptionObj sliderFilterSwitchOptionObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sliderFilterSwitchOptionObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31110a6, new Class[]{SliderFilterSwitchOptionObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SliderFilterSwitchOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SliderFilterSwitchOptionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = sliderFilterSwitchOptionObj.key;
        }
        if ((i10 & 2) != 0) {
            str2 = sliderFilterSwitchOptionObj.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = sliderFilterSwitchOptionObj.color;
        }
        return sliderFilterSwitchOptionObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.color;
    }

    @d
    public final SliderFilterSwitchOptionObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.d.Z5, new Class[]{String.class, String.class, String.class}, SliderFilterSwitchOptionObj.class);
        return patchProxyResultProxy.isSupported ? (SliderFilterSwitchOptionObj) patchProxyResultProxy.result : new SliderFilterSwitchOptionObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.X5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(SliderFilterSwitchOptionObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.hbcommon.bean.segmentfilter.SliderFilterSwitchOptionObj");
        return f0.g(this.key, ((SliderFilterSwitchOptionObj) obj).key);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Y5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31133b6, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SliderFilterSwitchOptionObj(key=" + this.key + ", desc=" + this.desc + ", color=" + this.color + ')';
    }
}
