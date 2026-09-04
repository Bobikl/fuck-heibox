package com.max.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBComponentManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static f f65492b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f65491a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, g> f65493c = new HashMap<>();

    /* JADX INFO: compiled from: HBComponentManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final f a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Mk, new Class[0], f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            if (f.f65492b == null) {
                f.f65492b = new f(null);
            }
            f fVar = f.f65492b;
            f0.m(fVar);
            return fVar;
        }
    }

    private f() {
        e();
    }

    public /* synthetic */ f(u uVar) {
        this();
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator it = ServiceLoader.load(g.class).iterator();
        f0.o(it, "iterator(...)");
        while (it.hasNext()) {
            g gVar = (g) it.next();
            HashMap<String, g> map = f65493c;
            if (!map.containsKey(gVar.c())) {
                String strC = gVar.c();
                f0.m(gVar);
                map.put(strC, gVar);
            }
        }
    }

    @dl.d
    public final HashMap<String, g> c() {
        return f65493c;
    }

    @dl.e
    public final g d(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Lk, new Class[]{String.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        if (str != null) {
            return f65493c.get(str);
        }
        return null;
    }
}
