package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposePlugins.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @jh.f
    private static volatile kh.g<? super OutsideScopeException> f104103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f104104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile boolean f104105c;

    private l() {
    }

    public static boolean a() {
        return f104104b;
    }

    @jh.f
    public static kh.g<? super OutsideScopeException> b() {
        return f104103a;
    }

    public static boolean c() {
        return f104105c;
    }

    public static void d() {
        f104105c = true;
    }

    public static void e() {
        g(null);
    }

    public static void f(boolean z10) {
        if (f104105c) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f104104b = z10;
    }

    public static void g(@jh.f kh.g<? super OutsideScopeException> gVar) {
        if (f104105c) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f104103a = gVar;
    }
}
