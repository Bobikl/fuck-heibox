package com.max.hbimage.bean.common;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BackimageObj.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BackimageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String backup;

    @e
    private String normal;

    public BackimageObj(@e String str, @e String str2) {
        this.normal = str;
        this.backup = str2;
    }

    public static /* synthetic */ BackimageObj copy$default(BackimageObj backimageObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{backimageObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.g.f33168w6, new Class[]{BackimageObj.class, String.class, String.class, Integer.TYPE, Object.class}, BackimageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BackimageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = backimageObj.normal;
        }
        if ((i10 & 2) != 0) {
            str2 = backimageObj.backup;
        }
        return backimageObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.normal;
    }

    @e
    public final String component2() {
        return this.backup;
    }

    @d
    public final BackimageObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.g.f33148v6, new Class[]{String.class, String.class}, BackimageObj.class);
        return patchProxyResultProxy.isSupported ? (BackimageObj) patchProxyResultProxy.result : new BackimageObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.g.f33228z6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackimageObj)) {
            return false;
        }
        BackimageObj backimageObj = (BackimageObj) obj;
        return f0.g(this.normal, backimageObj.normal) && f0.g(this.backup, backimageObj.backup);
    }

    @e
    public final String getBackup() {
        return this.backup;
    }

    @e
    public final String getNormal() {
        return this.normal;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33208y6, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.normal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backup;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBackup(@e String str) {
        this.backup = str;
    }

    public final void setNormal(@e String str) {
        this.normal = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33188x6, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BackimageObj(normal=" + this.normal + ", backup=" + this.backup + ')';
    }
}
