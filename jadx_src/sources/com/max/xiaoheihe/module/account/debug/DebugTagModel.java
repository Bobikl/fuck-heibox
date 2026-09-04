package com.max.xiaoheihe.module.account.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DebugTagConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DebugTagModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private String f78918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private String f78919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private ArrayList<DebugTagRoute> f78920d;

    public DebugTagModel(@d String tag, @d String desc, @e ArrayList<DebugTagRoute> arrayList) {
        f0.p(tag, "tag");
        f0.p(desc, "desc");
        this.f78918b = tag;
        this.f78919c = desc;
        this.f78920d = arrayList;
    }

    public /* synthetic */ DebugTagModel(String str, String str2, ArrayList arrayList, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, arrayList);
    }

    public static /* synthetic */ DebugTagModel e(DebugTagModel debugTagModel, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{debugTagModel, str, str2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 24952, new Class[]{DebugTagModel.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, DebugTagModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugTagModel) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = debugTagModel.f78918b;
        }
        if ((i10 & 2) != 0) {
            str2 = debugTagModel.f78919c;
        }
        if ((i10 & 4) != 0) {
            arrayList = debugTagModel.f78920d;
        }
        return debugTagModel.d(str, str2, arrayList);
    }

    @d
    public final String a() {
        return this.f78918b;
    }

    @d
    public final String b() {
        return this.f78919c;
    }

    @e
    public final ArrayList<DebugTagRoute> c() {
        return this.f78920d;
    }

    @d
    public final DebugTagModel d(@d String tag, @d String desc, @e ArrayList<DebugTagRoute> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tag, desc, arrayList}, this, changeQuickRedirect, false, 24951, new Class[]{String.class, String.class, ArrayList.class}, DebugTagModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugTagModel) patchProxyResultProxy.result;
        }
        f0.p(tag, "tag");
        f0.p(desc, "desc");
        return new DebugTagModel(tag, desc, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24955, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugTagModel)) {
            return false;
        }
        DebugTagModel debugTagModel = (DebugTagModel) obj;
        return f0.g(this.f78918b, debugTagModel.f78918b) && f0.g(this.f78919c, debugTagModel.f78919c) && f0.g(this.f78920d, debugTagModel.f78920d);
    }

    @d
    public final String f() {
        return this.f78919c;
    }

    @e
    public final ArrayList<DebugTagRoute> g() {
        return this.f78920d;
    }

    @d
    public final String h() {
        return this.f78918b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24954, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f78918b.hashCode() * 31) + this.f78919c.hashCode()) * 31;
        ArrayList<DebugTagRoute> arrayList = this.f78920d;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void i(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24950, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f78919c = str;
    }

    public final void j(@e ArrayList<DebugTagRoute> arrayList) {
        this.f78920d = arrayList;
    }

    public final void k(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24949, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f78918b = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24953, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DebugTagModel(tag=" + this.f78918b + ", desc=" + this.f78919c + ", routes=" + this.f78920d + ')';
    }
}
