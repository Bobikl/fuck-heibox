package com.max.hbmmkv;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MMKVManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final String f71416a;

    public b(@d String mmkvId) {
        f0.p(mmkvId, "mmkvId");
        this.f71416a = mmkvId;
    }

    private final boolean g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.I1, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : MMKV.mmkvWithID(MMKVManager.f71332d).containsKey(str);
    }

    @e
    public final String[] a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.K1, new Class[0], String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : MMKV.mmkvWithID(MMKVManager.f71332d).allKeys();
    }

    public final boolean b(@d String key, boolean z10, boolean z11) {
        Object[] objArr = {key, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.D1, new Class[]{String.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.d(this.f71416a, key, z10, z11);
    }

    public final float c(@d String key, float f10, boolean z10) {
        Object[] objArr = {key, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.F1, new Class[]{String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.e(this.f71416a, key, f10, z10);
    }

    public final int d(@d String key, int i10, boolean z10) {
        Object[] objArr = {key, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.B1, new Class[]{String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.f(this.f71416a, key, i10, z10);
    }

    public final long e(@d String key, long j10, boolean z10) {
        Object[] objArr = {key, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.H1, new Class[]{String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.g(this.f71416a, key, j10, z10);
    }

    @e
    public final String f(@d String key, @e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.f33416z1, new Class[]{String.class, String.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.i(this.f71416a, key, str, z10);
    }

    public final void h(@d String mmkvId) {
        if (PatchProxy.proxy(new Object[]{mmkvId}, this, changeQuickRedirect, false, bb.c.i.J1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mmkvId, "mmkvId");
        if (g(mmkvId)) {
            return;
        }
        if (!f0.g(mmkvId, "default")) {
            MMKV.mmkvWithID(mmkvId);
        }
        MMKV.mmkvWithID(MMKVManager.f71332d).putBoolean(mmkvId, true);
    }

    public final void i(@d String key, boolean z10, boolean z11) {
        Object[] objArr = {key, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.C1, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.k(this.f71416a, key, z10, z11);
    }

    public final void j(@d String key, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.E1, new Class[]{String.class, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.l(this.f71416a, key, f10, z10);
    }

    public final void k(@d String key, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.A1, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.m(this.f71416a, key, i10, z10);
    }

    public final void l(@d String key, long j10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.G1, new Class[]{String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.n(this.f71416a, key, j10, z10);
    }

    public final void m(@d String key, @e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.f33411y1, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.o(this.f71416a, key, str, z10);
    }
}
