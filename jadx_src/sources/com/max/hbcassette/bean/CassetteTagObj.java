package com.max.hbcassette.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CassetteTagObj.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class CassetteTagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String value;

    public CassetteTagObj(@e String str, @e String str2) {
        this.value = str;
        this.color = str2;
    }

    public static /* synthetic */ CassetteTagObj copy$default(CassetteTagObj cassetteTagObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cassetteTagObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Ip, new Class[]{CassetteTagObj.class, String.class, String.class, Integer.TYPE, Object.class}, CassetteTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CassetteTagObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = cassetteTagObj.value;
        }
        if ((i10 & 2) != 0) {
            str2 = cassetteTagObj.color;
        }
        return cassetteTagObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.value;
    }

    @e
    public final String component2() {
        return this.color;
    }

    @d
    public final CassetteTagObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.b.Hp, new Class[]{String.class, String.class}, CassetteTagObj.class);
        return patchProxyResultProxy.isSupported ? (CassetteTagObj) patchProxyResultProxy.result : new CassetteTagObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Lp, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CassetteTagObj)) {
            return false;
        }
        CassetteTagObj cassetteTagObj = (CassetteTagObj) obj;
        return f0.g(this.value, cassetteTagObj.value) && f0.g(this.color, cassetteTagObj.color);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Kp, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Jp, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CassetteTagObj(value=" + this.value + ", color=" + this.color + ')';
    }
}
