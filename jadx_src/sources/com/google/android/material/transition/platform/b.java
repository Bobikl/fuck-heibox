package com.google.android.material.transition.platform;

import androidx.annotation.w0;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f55997a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f55998b = new C0435b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f55999c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f56000d = new d();

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.a(255, w.p(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class C0435b implements com.google.android.material.transition.platform.a {
        C0435b() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.b(w.p(255, 0, f11, f12, f10), 255);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.b(w.p(255, 0, f11, f12, f10), w.p(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return com.google.android.material.transition.platform.c.b(w.p(255, 0, f11, f14, f10), w.p(0, 255, f14, f12, f10));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.platform.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f55997a : f55998b;
        }
        if (i10 == 1) {
            return z10 ? f55998b : f55997a;
        }
        if (i10 == 2) {
            return f55999c;
        }
        if (i10 == 3) {
            return f56000d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
