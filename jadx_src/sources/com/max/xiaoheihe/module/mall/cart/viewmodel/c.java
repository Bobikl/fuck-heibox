package com.max.xiaoheihe.module.mall.cart.viewmodel;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CartViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90521c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final String f90522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final String f90523b;

    public c(@d String cartId, @e String str) {
        f0.p(cartId, "cartId");
        this.f90522a = cartId;
        this.f90523b = str;
    }

    public static /* synthetic */ c d(c cVar, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 41827, new Class[]{c.class, String.class, String.class, Integer.TYPE, Object.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = cVar.f90522a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f90523b;
        }
        return cVar.c(str, str2);
    }

    @d
    public final String a() {
        return this.f90522a;
    }

    @e
    public final String b() {
        return this.f90523b;
    }

    @d
    public final c c(@d String cartId, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartId, str}, this, changeQuickRedirect, false, 41826, new Class[]{String.class, String.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(cartId, "cartId");
        return new c(cartId, str);
    }

    @d
    public final String e() {
        return this.f90522a;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41830, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f0.g(this.f90522a, cVar.f90522a) && f0.g(this.f90523b, cVar.f90523b);
    }

    @e
    public final String f() {
        return this.f90523b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41829, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.f90522a.hashCode() * 31;
        String str = this.f90523b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41828, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ManageItem(cartId=" + this.f90522a + ", skuId=" + this.f90523b + ')';
    }
}
