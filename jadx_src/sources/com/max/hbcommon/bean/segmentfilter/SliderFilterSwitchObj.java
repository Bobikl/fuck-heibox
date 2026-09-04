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
public final class SliderFilterSwitchObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String key;

    public SliderFilterSwitchObj(@e String str) {
        this.key = str;
    }

    public static /* synthetic */ SliderFilterSwitchObj copy$default(SliderFilterSwitchObj sliderFilterSwitchObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sliderFilterSwitchObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.T5, new Class[]{SliderFilterSwitchObj.class, String.class, Integer.TYPE, Object.class}, SliderFilterSwitchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SliderFilterSwitchObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = sliderFilterSwitchObj.key;
        }
        return sliderFilterSwitchObj.copy(str);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @d
    public final SliderFilterSwitchObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.S5, new Class[]{String.class}, SliderFilterSwitchObj.class);
        return patchProxyResultProxy.isSupported ? (SliderFilterSwitchObj) patchProxyResultProxy.result : new SliderFilterSwitchObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.W5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SliderFilterSwitchObj) && f0.g(this.key, ((SliderFilterSwitchObj) obj).key);
    }

    @e
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.V5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.U5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SliderFilterSwitchObj(key=" + this.key + ')';
    }
}
