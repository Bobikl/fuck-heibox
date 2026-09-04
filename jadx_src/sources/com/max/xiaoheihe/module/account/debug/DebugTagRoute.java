package com.max.xiaoheihe.module.account.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DebugTagConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DebugTagRoute implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private String f78921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private String f78922c;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugTagRoute() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DebugTagRoute(@d String host, @d String path) {
        f0.p(host, "host");
        f0.p(path, "path");
        this.f78921b = host;
        this.f78922c = path;
    }

    public /* synthetic */ DebugTagRoute(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ DebugTagRoute d(DebugTagRoute debugTagRoute, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{debugTagRoute, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 24959, new Class[]{DebugTagRoute.class, String.class, String.class, Integer.TYPE, Object.class}, DebugTagRoute.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugTagRoute) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = debugTagRoute.f78921b;
        }
        if ((i10 & 2) != 0) {
            str2 = debugTagRoute.f78922c;
        }
        return debugTagRoute.c(str, str2);
    }

    @d
    public final String a() {
        return this.f78921b;
    }

    @d
    public final String b() {
        return this.f78922c;
    }

    @d
    public final DebugTagRoute c(@d String host, @d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{host, path}, this, changeQuickRedirect, false, 24958, new Class[]{String.class, String.class}, DebugTagRoute.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugTagRoute) patchProxyResultProxy.result;
        }
        f0.p(host, "host");
        f0.p(path, "path");
        return new DebugTagRoute(host, path);
    }

    @d
    public final String e() {
        return this.f78921b;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24962, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugTagRoute)) {
            return false;
        }
        DebugTagRoute debugTagRoute = (DebugTagRoute) obj;
        return f0.g(this.f78921b, debugTagRoute.f78921b) && f0.g(this.f78922c, debugTagRoute.f78922c);
    }

    @d
    public final String f() {
        return this.f78922c;
    }

    public final void g(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24956, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f78921b = str;
    }

    public final void h(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24957, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f78922c = str;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24961, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f78921b.hashCode() * 31) + this.f78922c.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24960, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DebugTagRoute(host=" + this.f78921b + ", path=" + this.f78922c + ')';
    }
}
