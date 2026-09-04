package com.uber.autodispose.android;

import androidx.annotation.p0;
import kh.e;

/* JADX INFO: compiled from: AutoDisposeAndroidPlugins.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static volatile e f104059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile boolean f104060b;

    private a() {
    }

    public static boolean a() {
        return f104060b;
    }

    public static void b() {
        f104060b = true;
    }

    public static boolean c(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("defaultChecker == null");
        }
        e eVar2 = f104059a;
        try {
            return eVar2 == null ? eVar.a() : eVar2.a();
        } catch (Exception e10) {
            throw io.reactivex.exceptions.a.a(e10);
        }
    }

    public static void d() {
        e(null);
    }

    public static void e(@p0 e eVar) {
        if (f104060b) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f104059a = eVar;
    }
}
