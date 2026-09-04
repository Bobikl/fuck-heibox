package com.google.android.material.transition;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.a f55885a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.a f55886b = new C0434b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.a f55887c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.a f55888d = new d();

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.a(255, v.p(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class C0434b implements com.google.android.material.transition.a {
        C0434b() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.b(v.p(255, 0, f11, f12, f10), 255);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.b(v.p(255, 0, f11, f12, f10), v.p(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return com.google.android.material.transition.c.b(v.p(255, 0, f11, f14, f10), v.p(0, 255, f14, f12, f10));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f55885a : f55886b;
        }
        if (i10 == 1) {
            return z10 ? f55886b : f55885a;
        }
        if (i10 == 2) {
            return f55887c;
        }
        if (i10 == 3) {
            return f55888d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
