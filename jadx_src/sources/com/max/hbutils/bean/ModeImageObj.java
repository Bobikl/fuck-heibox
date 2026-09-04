package com.max.hbutils.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModeImageObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class ModeImageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String dark;

    @e
    private String light;

    public ModeImageObj(@e String str, @e String str2) {
        this.light = str;
        this.dark = str2;
    }

    public static /* synthetic */ ModeImageObj copy$default(ModeImageObj modeImageObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{modeImageObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.In, new Class[]{ModeImageObj.class, String.class, String.class, Integer.TYPE, Object.class}, ModeImageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ModeImageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = modeImageObj.light;
        }
        if ((i10 & 2) != 0) {
            str2 = modeImageObj.dark;
        }
        return modeImageObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.light;
    }

    @e
    public final String component2() {
        return this.dark;
    }

    @d
    public final ModeImageObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.k.Hn, new Class[]{String.class, String.class}, ModeImageObj.class);
        return patchProxyResultProxy.isSupported ? (ModeImageObj) patchProxyResultProxy.result : new ModeImageObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Ln, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeImageObj)) {
            return false;
        }
        ModeImageObj modeImageObj = (ModeImageObj) obj;
        return f0.g(this.light, modeImageObj.light) && f0.g(this.dark, modeImageObj.dark);
    }

    @e
    public final String getDark() {
        return this.dark;
    }

    @e
    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Kn, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.light;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDark(@e String str) {
        this.dark = str;
    }

    public final void setLight(@e String str) {
        this.light = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Jn, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ModeImageObj(light=" + this.light + ", dark=" + this.dark + ')';
    }
}
