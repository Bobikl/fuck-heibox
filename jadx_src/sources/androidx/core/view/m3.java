package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;

/* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f21698a;

    /* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
    @androidx.annotation.w0(30)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f21699a;

        a(@androidx.annotation.n0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f21699a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.m3.b
        void a(boolean z10) {
            this.f21699a.finish(z10);
        }

        @Override // androidx.core.view.m3.b
        public float b() {
            return this.f21699a.getCurrentAlpha();
        }

        @Override // androidx.core.view.m3.b
        public float c() {
            return this.f21699a.getCurrentFraction();
        }

        @Override // androidx.core.view.m3.b
        @androidx.annotation.n0
        public androidx.core.graphics.h0 d() {
            return androidx.core.graphics.h0.g(this.f21699a.getCurrentInsets());
        }

        @Override // androidx.core.view.m3.b
        @androidx.annotation.n0
        public androidx.core.graphics.h0 e() {
            return androidx.core.graphics.h0.g(this.f21699a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.m3.b
        @androidx.annotation.n0
        public androidx.core.graphics.h0 f() {
            return androidx.core.graphics.h0.g(this.f21699a.getShownStateInsets());
        }

        @Override // androidx.core.view.m3.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            return this.f21699a.getTypes();
        }

        @Override // androidx.core.view.m3.b
        boolean h() {
            return this.f21699a.isCancelled();
        }

        @Override // androidx.core.view.m3.b
        boolean i() {
            return this.f21699a.isFinished();
        }

        @Override // androidx.core.view.m3.b
        public void j(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var, float f10, float f11) {
            this.f21699a.setInsetsAndAlpha(h0Var == null ? null : h0Var.h(), f10, f11);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationControllerCompat.java */
    public static class b {
        b() {
        }

        void a(boolean z10) {
        }

        public float b() {
            return 0.0f;
        }

        @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float c() {
            return 0.0f;
        }

        @androidx.annotation.n0
        public androidx.core.graphics.h0 d() {
            return androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.n0
        public androidx.core.graphics.h0 e() {
            return androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.n0
        public androidx.core.graphics.h0 f() {
            return androidx.core.graphics.h0.f20741e;
        }

        public int g() {
            return 0;
        }

        boolean h() {
            return true;
        }

        boolean i() {
            return false;
        }

        public void j(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
        }
    }

    @androidx.annotation.w0(30)
    m3(@androidx.annotation.n0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f21698a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f21698a.a(z10);
    }

    public float b() {
        return this.f21698a.b();
    }

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float c() {
        return this.f21698a.c();
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 d() {
        return this.f21698a.d();
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 e() {
        return this.f21698a.e();
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 f() {
        return this.f21698a.f();
    }

    public int g() {
        return this.f21698a.g();
    }

    public boolean h() {
        return this.f21698a.h();
    }

    public boolean i() {
        return this.f21698a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
        this.f21698a.j(h0Var, f10, f11);
    }
}
