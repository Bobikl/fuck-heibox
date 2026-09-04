package com.max.hbminiprogram.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramGroupObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramGroupObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MiniProgramObj> apps;

    @e
    private String title;

    public MiniProgramGroupObj(@e String str, @e List<MiniProgramObj> list) {
        this.title = str;
        this.apps = list;
    }

    public static /* synthetic */ MiniProgramGroupObj copy$default(MiniProgramGroupObj miniProgramGroupObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramGroupObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.f33275s, new Class[]{MiniProgramGroupObj.class, String.class, List.class, Integer.TYPE, Object.class}, MiniProgramGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramGroupObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = miniProgramGroupObj.title;
        }
        if ((i10 & 2) != 0) {
            list = miniProgramGroupObj.apps;
        }
        return miniProgramGroupObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final List<MiniProgramObj> component2() {
        return this.apps;
    }

    @d
    public final MiniProgramGroupObj copy(@e String str, @e List<MiniProgramObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.h.f33274r, new Class[]{String.class, List.class}, MiniProgramGroupObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramGroupObj) patchProxyResultProxy.result : new MiniProgramGroupObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.f33278v, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramGroupObj)) {
            return false;
        }
        MiniProgramGroupObj miniProgramGroupObj = (MiniProgramGroupObj) obj;
        return f0.g(this.title, miniProgramGroupObj.title) && f0.g(this.apps, miniProgramGroupObj.apps);
    }

    @e
    public final List<MiniProgramObj> getApps() {
        return this.apps;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33277u, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MiniProgramObj> list = this.apps;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setApps(@e List<MiniProgramObj> list) {
        this.apps = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33276t, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramGroupObj(title=" + this.title + ", apps=" + this.apps + ')';
    }
}
