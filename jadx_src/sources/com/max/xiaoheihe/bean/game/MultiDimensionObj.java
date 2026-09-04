package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MultiDimensionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String dimension_name;

    @e
    private String user_label;

    @e
    private String user_star;

    public MultiDimensionObj(@e String str, @e String str2, @e String str3) {
        this.dimension_name = str;
        this.user_star = str2;
        this.user_label = str3;
    }

    public static /* synthetic */ MultiDimensionObj copy$default(MultiDimensionObj multiDimensionObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{multiDimensionObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14929, new Class[]{MultiDimensionObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MultiDimensionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = multiDimensionObj.dimension_name;
        }
        if ((i10 & 2) != 0) {
            str2 = multiDimensionObj.user_star;
        }
        if ((i10 & 4) != 0) {
            str3 = multiDimensionObj.user_label;
        }
        return multiDimensionObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.dimension_name;
    }

    @e
    public final String component2() {
        return this.user_star;
    }

    @e
    public final String component3() {
        return this.user_label;
    }

    @d
    public final MultiDimensionObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14928, new Class[]{String.class, String.class, String.class}, MultiDimensionObj.class);
        return patchProxyResultProxy.isSupported ? (MultiDimensionObj) patchProxyResultProxy.result : new MultiDimensionObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14932, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiDimensionObj)) {
            return false;
        }
        MultiDimensionObj multiDimensionObj = (MultiDimensionObj) obj;
        return f0.g(this.dimension_name, multiDimensionObj.dimension_name) && f0.g(this.user_star, multiDimensionObj.user_star) && f0.g(this.user_label, multiDimensionObj.user_label);
    }

    @e
    public final String getDimension_name() {
        return this.dimension_name;
    }

    @e
    public final String getUser_label() {
        return this.user_label;
    }

    @e
    public final String getUser_star() {
        return this.user_star;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14931, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.dimension_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.user_star;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user_label;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDimension_name(@e String str) {
        this.dimension_name = str;
    }

    public final void setUser_label(@e String str) {
        this.user_label = str;
    }

    public final void setUser_star(@e String str) {
        this.user_star = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14930, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MultiDimensionObj(dimension_name=" + this.dimension_name + ", user_star=" + this.user_star + ", user_label=" + this.user_label + ')';
    }
}
