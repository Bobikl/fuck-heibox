package com.max.xiaoheihe.module.account.utils;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBSteamInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79291c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f79292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f79293b;

    public a(@dl.d String value, long j10) {
        f0.p(value, "value");
        this.f79292a = value;
        this.f79293b = j10;
    }

    public static /* synthetic */ a d(a aVar, String str, long j10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, new Long(j10), new Integer(i10), obj}, null, changeQuickRedirect, true, 25355, new Class[]{a.class, String.class, Long.TYPE, Integer.TYPE, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = aVar.f79292a;
        }
        if ((i10 & 2) != 0) {
            j10 = aVar.f79293b;
        }
        return aVar.c(str, j10);
    }

    @dl.d
    public final String a() {
        return this.f79292a;
    }

    public final long b() {
        return this.f79293b;
    }

    @dl.d
    public final a c(@dl.d String value, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{value, new Long(j10)}, this, changeQuickRedirect, false, 25354, new Class[]{String.class, Long.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(value, "value");
        return new a(value, j10);
    }

    public final long e() {
        return this.f79293b;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25358, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.g(this.f79292a, aVar.f79292a) && this.f79293b == aVar.f79293b;
    }

    @dl.d
    public final String f() {
        return this.f79292a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25357, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f79292a.hashCode() * 31) + androidx.collection.k.a(this.f79293b);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25356, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ExpirableValue(value=" + this.f79292a + ", expirationTime=" + this.f79293b + ')';
    }
}
