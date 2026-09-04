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

/* JADX INFO: compiled from: MiniProgramBoardObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramBoardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MiniProgramObj> modifiable_apps;

    @e
    private List<MiniProgramObj> not_modifiable_apps;

    public MiniProgramBoardObj(@e List<MiniProgramObj> list, @e List<MiniProgramObj> list2) {
        this.not_modifiable_apps = list;
        this.modifiable_apps = list2;
    }

    public static /* synthetic */ MiniProgramBoardObj copy$default(MiniProgramBoardObj miniProgramBoardObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramBoardObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.f33267n, new Class[]{MiniProgramBoardObj.class, List.class, List.class, Integer.TYPE, Object.class}, MiniProgramBoardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramBoardObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = miniProgramBoardObj.not_modifiable_apps;
        }
        if ((i10 & 2) != 0) {
            list2 = miniProgramBoardObj.modifiable_apps;
        }
        return miniProgramBoardObj.copy(list, list2);
    }

    @e
    public final List<MiniProgramObj> component1() {
        return this.not_modifiable_apps;
    }

    @e
    public final List<MiniProgramObj> component2() {
        return this.modifiable_apps;
    }

    @d
    public final MiniProgramBoardObj copy(@e List<MiniProgramObj> list, @e List<MiniProgramObj> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, c.h.f33265m, new Class[]{List.class, List.class}, MiniProgramBoardObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramBoardObj) patchProxyResultProxy.result : new MiniProgramBoardObj(list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.f33273q, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramBoardObj)) {
            return false;
        }
        MiniProgramBoardObj miniProgramBoardObj = (MiniProgramBoardObj) obj;
        return f0.g(this.not_modifiable_apps, miniProgramBoardObj.not_modifiable_apps) && f0.g(this.modifiable_apps, miniProgramBoardObj.modifiable_apps);
    }

    @e
    public final List<MiniProgramObj> getModifiable_apps() {
        return this.modifiable_apps;
    }

    @e
    public final List<MiniProgramObj> getNot_modifiable_apps() {
        return this.not_modifiable_apps;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33271p, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MiniProgramObj> list = this.not_modifiable_apps;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MiniProgramObj> list2 = this.modifiable_apps;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setModifiable_apps(@e List<MiniProgramObj> list) {
        this.modifiable_apps = list;
    }

    public final void setNot_modifiable_apps(@e List<MiniProgramObj> list) {
        this.not_modifiable_apps = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33269o, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramBoardObj(not_modifiable_apps=" + this.not_modifiable_apps + ", modifiable_apps=" + this.modifiable_apps + ')';
    }
}
