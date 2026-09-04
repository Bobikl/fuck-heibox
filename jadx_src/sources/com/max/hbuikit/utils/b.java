package com.max.hbuikit.utils;

import androidx.core.view.j1;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: UiKitViewIdManager.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f73246b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private static b f73247c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final HashMap<String, Integer> f73248a;

    /* JADX INFO: compiled from: UiKitViewIdManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        @m
        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.ym, new Class[0], b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if (b.f73247c == null) {
                b.f73247c = new b(null);
            }
            b bVar = b.f73247c;
            f0.m(bVar);
            return bVar;
        }
    }

    private b() {
        this.f73248a = new HashMap<>();
    }

    public /* synthetic */ b(u uVar) {
        this();
    }

    @d
    @m
    public static final b d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.xm, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : f73246b.a();
    }

    public final int c(@d String idStr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{idStr}, this, changeQuickRedirect, false, c.k.wm, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(idStr, "idStr");
        if (!this.f73248a.containsKey(idStr)) {
            int iD = j1.D();
            this.f73248a.put(idStr, Integer.valueOf(iD));
            return iD;
        }
        Integer num = this.f73248a.get(idStr);
        f0.m(num);
        f0.m(num);
        return num.intValue();
    }

    @d
    public final HashMap<String, Integer> e() {
        return this.f73248a;
    }
}
