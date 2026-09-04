package com.max.xiaoheihe.router.serviceimpl;

import androidx.compose.runtime.internal.o;
import com.max.hbmmkv.MMKVManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MMKVServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
@RouterService(interfaces = {pb.f.class}, key = {ob.b.f132265q})
public final class g implements pb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95182a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.f
    public void a(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48375, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ad.a.f(str);
    }

    @Override // pb.f
    public boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48374, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.d();
    }

    @Override // pb.f
    public void c(@dl.e String str, @dl.e String str2, long j10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48367, new Class[]{String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.n(str, str2, j10, z10);
    }

    @Override // pb.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48369, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.b();
    }

    @Override // pb.f
    public int e(@dl.e String str, @dl.e String str2, int i10, boolean z10) {
        Object[] objArr = {str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48362, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : MMKVManager.f71329a.f(str, str2, i10, z10);
    }

    @Override // pb.f
    public void f(@dl.d String key, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48370, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        ad.a.e(key, z10);
    }

    @Override // pb.f
    public void g(@dl.e String str, @dl.e String str2, @dl.e String str3, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48359, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.o(str, str2, str3, z10);
    }

    @Override // pb.f
    public void h(@dl.e String str, @dl.e String str2, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48365, new Class[]{String.class, String.class, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.l(str, str2, f10, z10);
    }

    @Override // pb.f
    public long i(@dl.e String str, @dl.e String str2, long j10, boolean z10) {
        Object[] objArr = {str, str2, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48368, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : MMKVManager.f71329a.g(str, str2, j10, z10);
    }

    @Override // pb.f
    public boolean j(@dl.d String key, boolean z10) {
        Object[] objArr = {key, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48371, new Class[]{String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(key, "key");
        return ad.a.a(key, z10);
    }

    @Override // pb.f
    @dl.e
    public String k(@dl.e String str, @dl.e String str2, @dl.e String str3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48360, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : MMKVManager.f71329a.i(str, str2, str3, z10);
    }

    @Override // pb.f
    public float l(@dl.e String str, @dl.e String str2, float f10, boolean z10) {
        Object[] objArr = {str, str2, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48366, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : MMKVManager.f71329a.e(str, str2, f10, z10);
    }

    @Override // pb.f
    public void m(@dl.e String str, @dl.e String str2, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48361, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.m(str, str2, i10, z10);
    }

    @Override // pb.f
    public void n(@dl.e String str, @dl.e String str2, boolean z10, boolean z11) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48363, new Class[]{String.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.k(str, str2, z10, z11);
    }

    @Override // pb.f
    public void o(@dl.d String testOperationKey, boolean z10) {
        if (PatchProxy.proxy(new Object[]{testOperationKey, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48372, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(testOperationKey, "testOperationKey");
        f("improve_ab_test" + testOperationKey, z10);
    }

    @Override // pb.f
    public boolean p(@dl.d String testOperationKey, boolean z10) {
        Object[] objArr = {testOperationKey, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48373, new Class[]{String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(testOperationKey, "testOperationKey");
        return j("improve_ab_test" + testOperationKey, z10);
    }

    @Override // pb.f
    public boolean q(@dl.e String str, @dl.e String str2, boolean z10, boolean z11) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48364, new Class[]{String.class, String.class, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : MMKVManager.f71329a.d(str, str2, z10, z11);
    }

    @Override // pb.f
    public int r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48376, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ad.a.c();
    }
}
