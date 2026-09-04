package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UCropKeyDescObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UCropKeyDescObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String desc;

    @e
    private final String key;

    public UCropKeyDescObj(@e String str, @e String str2) {
        this.key = str;
        this.desc = str2;
    }

    public static /* synthetic */ UCropKeyDescObj copy$default(UCropKeyDescObj uCropKeyDescObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uCropKeyDescObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 50145, new Class[]{UCropKeyDescObj.class, String.class, String.class, Integer.TYPE, Object.class}, UCropKeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropKeyDescObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = uCropKeyDescObj.key;
        }
        if ((i10 & 2) != 0) {
            str2 = uCropKeyDescObj.desc;
        }
        return uCropKeyDescObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final UCropKeyDescObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 50144, new Class[]{String.class, String.class}, UCropKeyDescObj.class);
        return patchProxyResultProxy.isSupported ? (UCropKeyDescObj) patchProxyResultProxy.result : new UCropKeyDescObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50148, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UCropKeyDescObj)) {
            return false;
        }
        UCropKeyDescObj uCropKeyDescObj = (UCropKeyDescObj) obj;
        return f0.g(this.key, uCropKeyDescObj.key) && f0.g(this.desc, uCropKeyDescObj.desc);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50147, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50146, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UCropKeyDescObj(key=" + this.key + ", desc=" + this.desc + ')';
    }
}
