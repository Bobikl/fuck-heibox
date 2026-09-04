package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f21460b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21461c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f21462d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21463e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f21464a;

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.w0(20)
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        protected final Window f21465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        private final View f21466b;

        a(@androidx.annotation.n0 Window window, @androidx.annotation.n0 View view) {
            this.f21465a = window;
            this.f21466b = view;
        }

        private void m(int i10) {
            if (i10 == 1) {
                o(4);
            } else if (i10 == 2) {
                o(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                ((InputMethodManager) this.f21465a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f21465a.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void q(int i10) {
            if (i10 == 1) {
                r(4);
                s(1024);
                return;
            }
            if (i10 == 2) {
                r(2);
                return;
            }
            if (i10 != 8) {
                return;
            }
            final View viewFindViewById = this.f21466b;
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = this.f21465a.getCurrentFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f21465a.findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.a4
                @Override // java.lang.Runnable
                public final void run() {
                    b4.a.n(viewFindViewById);
                }
            });
        }

        @Override // androidx.core.view.b4.e
        void a(f fVar) {
        }

        @Override // androidx.core.view.b4.e
        void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, l3 l3Var) {
        }

        @Override // androidx.core.view.b4.e
        int c() {
            return 0;
        }

        @Override // androidx.core.view.b4.e
        void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    m(i11);
                }
            }
        }

        @Override // androidx.core.view.b4.e
        void g(@androidx.annotation.n0 f fVar) {
        }

        @Override // androidx.core.view.b4.e
        void j(int i10) {
            if (i10 == 0) {
                r(bb.c.f.Jw);
                return;
            }
            if (i10 == 1) {
                r(4096);
                o(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                r(2048);
                o(4096);
            }
        }

        @Override // androidx.core.view.b4.e
        void k(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    q(i11);
                }
            }
        }

        protected void o(int i10) {
            View decorView = this.f21465a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void p(int i10) {
            this.f21465a.addFlags(i10);
        }

        protected void r(int i10) {
            View decorView = this.f21465a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void s(int i10) {
            this.f21465a.clearFlags(i10);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.w0(23)
    public static class b extends a {
        b(@androidx.annotation.n0 Window window, @androidx.annotation.p0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.b4.e
        public boolean f() {
            return (this.f21465a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.b4.e
        public void i(boolean z10) {
            if (!z10) {
                r(8192);
                return;
            }
            s(67108864);
            p(Integer.MIN_VALUE);
            o(8192);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.w0(26)
    public static class c extends b {
        c(@androidx.annotation.n0 Window window, @androidx.annotation.p0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.b4.e
        public boolean e() {
            return (this.f21465a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.b4.e
        public void h(boolean z10) {
            if (!z10) {
                r(16);
                return;
            }
            s(134217728);
            p(Integer.MIN_VALUE);
            o(16);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.w0(30)
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b4 f21467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f21468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.collection.j2<f, WindowInsetsController.OnControllableInsetsChangedListener> f21469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected Window f21470d;

        /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
        public class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private m3 f21471b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l3 f21472c;

            a(l3 l3Var) {
                this.f21472c = l3Var;
            }

            public void onCancelled(@androidx.annotation.p0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f21472c.a(windowInsetsAnimationController == null ? null : this.f21471b);
            }

            public void onFinished(@androidx.annotation.n0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f21472c.c(this.f21471b);
            }

            public void onReady(@androidx.annotation.n0 WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                m3 m3Var = new m3(windowInsetsAnimationController);
                this.f21471b = m3Var;
                this.f21472c.b(m3Var, i10);
            }
        }

        d(@androidx.annotation.n0 Window window, @androidx.annotation.n0 b4 b4Var) {
            this(window.getInsetsController(), b4Var);
            this.f21470d = window;
        }

        d(@androidx.annotation.n0 WindowInsetsController windowInsetsController, @androidx.annotation.n0 b4 b4Var) {
            this.f21469c = new androidx.collection.j2<>();
            this.f21468b = windowInsetsController;
            this.f21467a = b4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(f fVar, WindowInsetsController windowInsetsController, int i10) {
            if (this.f21468b == windowInsetsController) {
                fVar.a(this.f21467a, i10);
            }
        }

        @Override // androidx.core.view.b4.e
        void a(@androidx.annotation.n0 final f fVar) {
            if (this.f21469c.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.d4
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
                    this.f21513a.m(fVar, windowInsetsController, i10);
                }
            };
            this.f21469c.put(fVar, onControllableInsetsChangedListener);
            this.f21468b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.b4.e
        void b(int i10, long j10, @androidx.annotation.p0 Interpolator interpolator, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 l3 l3Var) {
            this.f21468b.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(l3Var));
        }

        @Override // androidx.core.view.b4.e
        @SuppressLint({"WrongConstant"})
        int c() {
            return this.f21468b.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.b4.e
        void d(int i10) {
            this.f21468b.hide(i10);
        }

        @Override // androidx.core.view.b4.e
        public boolean e() {
            return (this.f21468b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.b4.e
        public boolean f() {
            return (this.f21468b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.b4.e
        void g(@androidx.annotation.n0 f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerRemove = this.f21469c.remove(fVar);
            if (onControllableInsetsChangedListenerRemove != null) {
                this.f21468b.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerRemove);
            }
        }

        @Override // androidx.core.view.b4.e
        public void h(boolean z10) {
            if (z10) {
                if (this.f21470d != null) {
                    n(16);
                }
                this.f21468b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f21470d != null) {
                    o(16);
                }
                this.f21468b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.b4.e
        public void i(boolean z10) {
            if (z10) {
                if (this.f21470d != null) {
                    n(8192);
                }
                this.f21468b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f21470d != null) {
                    o(8192);
                }
                this.f21468b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.b4.e
        void j(int i10) {
            this.f21468b.setSystemBarsBehavior(i10);
        }

        @Override // androidx.core.view.b4.e
        void k(int i10) {
            Window window = this.f21470d;
            if (window != null && (i10 & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f21468b.show(i10);
        }

        protected void n(int i10) {
            View decorView = this.f21470d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void o(int i10) {
            View decorView = this.f21470d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class e {
        e() {
        }

        void a(f fVar) {
        }

        void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, l3 l3Var) {
        }

        int c() {
            return 0;
        }

        void d(int i10) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(@androidx.annotation.n0 f fVar) {
        }

        public void h(boolean z10) {
        }

        public void i(boolean z10) {
        }

        void j(int i10) {
        }

        void k(int i10) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public interface f {
        void a(@androidx.annotation.n0 b4 b4Var, int i10);
    }

    public b4(@androidx.annotation.n0 Window window, @androidx.annotation.n0 View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f21464a = new d(window, this);
        } else if (i10 >= 26) {
            this.f21464a = new c(window, view);
        } else {
            this.f21464a = new b(window, view);
        }
    }

    @androidx.annotation.w0(30)
    @Deprecated
    private b4(@androidx.annotation.n0 WindowInsetsController windowInsetsController) {
        this.f21464a = new d(windowInsetsController, this);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(30)
    @Deprecated
    public static b4 l(@androidx.annotation.n0 WindowInsetsController windowInsetsController) {
        return new b4(windowInsetsController);
    }

    public void a(@androidx.annotation.n0 f fVar) {
        this.f21464a.a(fVar);
    }

    public void b(int i10, long j10, @androidx.annotation.p0 Interpolator interpolator, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 l3 l3Var) {
        this.f21464a.b(i10, j10, interpolator, cancellationSignal, l3Var);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f21464a.c();
    }

    public void d(int i10) {
        this.f21464a.d(i10);
    }

    public boolean e() {
        return this.f21464a.e();
    }

    public boolean f() {
        return this.f21464a.f();
    }

    public void g(@androidx.annotation.n0 f fVar) {
        this.f21464a.g(fVar);
    }

    public void h(boolean z10) {
        this.f21464a.h(z10);
    }

    public void i(boolean z10) {
        this.f21464a.i(z10);
    }

    public void j(int i10) {
        this.f21464a.j(i10);
    }

    public void k(int i10) {
        this.f21464a.k(i10);
    }
}
