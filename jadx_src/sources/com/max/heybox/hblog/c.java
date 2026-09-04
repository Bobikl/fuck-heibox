package com.max.heybox.hblog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: FileMaxSizeAndLastModifiedCleanStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements c8.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f74505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f74502b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static ArrayList<String> f74503c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static ConcurrentHashMap<String, Long> f74504d = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: FileMaxSizeAndLastModifiedCleanStrategy.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @m
        public static /* synthetic */ void d() {
        }

        @dl.d
        public final ArrayList<String> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Z6, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : c.f74503c;
        }

        @dl.d
        public final ConcurrentHashMap<String, Long> c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34040b7, new Class[0], ConcurrentHashMap.class);
            return patchProxyResultProxy.isSupported ? (ConcurrentHashMap) patchProxyResultProxy.result : c.f74504d;
        }

        public final void e(@dl.d ArrayList<String> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34017a7, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(arrayList, "<set-?>");
            c.f74503c = arrayList;
        }

        public final void f(@dl.d ConcurrentHashMap<String, Long> concurrentHashMap) {
            if (PatchProxy.proxy(new Object[]{concurrentHashMap}, this, changeQuickRedirect, false, bb.c.l.f34063c7, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(concurrentHashMap, "<set-?>");
            c.f74504d = concurrentHashMap;
        }
    }

    public c(long j10) {
        this.f74505a = j10;
    }

    @dl.d
    public static final ArrayList<String> f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.V6, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : f74502b.a();
    }

    @dl.d
    public static final ConcurrentHashMap<String, Long> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.X6, new Class[0], ConcurrentHashMap.class);
        return patchProxyResultProxy.isSupported ? (ConcurrentHashMap) patchProxyResultProxy.result : f74502b.c();
    }

    public static final void h(@dl.d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, bb.c.l.W6, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f74502b.e(arrayList);
    }

    public static final void i(@dl.d ConcurrentHashMap<String, Long> concurrentHashMap) {
        if (PatchProxy.proxy(new Object[]{concurrentHashMap}, null, changeQuickRedirect, true, bb.c.l.Y6, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f74502b.f(concurrentHashMap);
    }

    @Override // c8.a
    public boolean a(@dl.e File file) {
        File parentFile;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.l.U6, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String path = (file == null || (parentFile = file.getParentFile()) == null) ? null : parentFile.getPath();
        if (path == null) {
            return false;
        }
        if (!f74503c.contains(path)) {
            f74503c.add(path);
            f74504d.put(path, 0L);
        }
        long length = file.length();
        Long l10 = f74504d.get(path);
        if (l10 == null) {
            l10 = 0L;
        }
        if (l10.longValue() + length >= this.f74505a) {
            return true;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = f74504d;
        Long l11 = concurrentHashMap.get(path);
        if (l11 == null) {
            l11 = 0L;
        }
        concurrentHashMap.put(path, Long.valueOf(length + l11.longValue()));
        return false;
    }
}
