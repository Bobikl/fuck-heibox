package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DescObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String value;

    public DescObj(@e String str, @e String str2) {
        this.value = str;
        this.desc = str2;
    }

    public static /* synthetic */ DescObj copy$default(DescObj descObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{descObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Nj, new Class[]{DescObj.class, String.class, String.class, Integer.TYPE, Object.class}, DescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DescObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = descObj.value;
        }
        if ((i10 & 2) != 0) {
            str2 = descObj.desc;
        }
        return descObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.value;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final DescObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.b.Mj, new Class[]{String.class, String.class}, DescObj.class);
        return patchProxyResultProxy.isSupported ? (DescObj) patchProxyResultProxy.result : new DescObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Qj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescObj)) {
            return false;
        }
        DescObj descObj = (DescObj) obj;
        return f0.g(this.value, descObj.value) && f0.g(this.desc, descObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Pj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Oj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DescObj(value=" + this.value + ", desc=" + this.desc + ')';
    }
}
