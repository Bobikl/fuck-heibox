package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MaxMinLimitObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MaxMinLimitObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String max;

    @e
    private String min;

    public MaxMinLimitObj(@e String str, @e String str2) {
        this.max = str;
        this.min = str2;
    }

    public static /* synthetic */ MaxMinLimitObj copy$default(MaxMinLimitObj maxMinLimitObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{maxMinLimitObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14346, new Class[]{MaxMinLimitObj.class, String.class, String.class, Integer.TYPE, Object.class}, MaxMinLimitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MaxMinLimitObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = maxMinLimitObj.max;
        }
        if ((i10 & 2) != 0) {
            str2 = maxMinLimitObj.min;
        }
        return maxMinLimitObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.max;
    }

    @e
    public final String component2() {
        return this.min;
    }

    @d
    public final MaxMinLimitObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14345, new Class[]{String.class, String.class}, MaxMinLimitObj.class);
        return patchProxyResultProxy.isSupported ? (MaxMinLimitObj) patchProxyResultProxy.result : new MaxMinLimitObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14349, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxMinLimitObj)) {
            return false;
        }
        MaxMinLimitObj maxMinLimitObj = (MaxMinLimitObj) obj;
        return f0.g(this.max, maxMinLimitObj.max) && f0.g(this.min, maxMinLimitObj.min);
    }

    @e
    public final String getMax() {
        return this.max;
    }

    @e
    public final String getMin() {
        return this.min;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14348, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.max;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.min;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMax(@e String str) {
        this.max = str;
    }

    public final void setMin(@e String str) {
        this.min = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14347, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MaxMinLimitObj(max=" + this.max + ", min=" + this.min + ')';
    }
}
