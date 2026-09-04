package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f21621b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21622c = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f21623a;

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.h0 f21624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.h0 f21625b;

        @androidx.annotation.w0(30)
        private a(@androidx.annotation.n0 WindowInsetsAnimation.Bounds bounds) {
            this.f21624a = d.k(bounds);
            this.f21625b = d.j(bounds);
        }

        public a(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var2) {
            this.f21624a = h0Var;
            this.f21625b = h0Var2;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(30)
        public static a e(@androidx.annotation.n0 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @androidx.annotation.n0
        public androidx.core.graphics.h0 a() {
            return this.f21624a;
        }

        @androidx.annotation.n0
        public androidx.core.graphics.h0 b() {
            return this.f21625b;
        }

        @androidx.annotation.n0
        public a c(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            return new a(n3.z(this.f21624a, h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d), n3.z(this.f21625b, h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d));
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f21624a + " upper=" + this.f21625b + z5.g.f141884d;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21626d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f21627e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WindowInsets f21628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21629c;

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        public b(int i10) {
            this.f21629c = i10;
        }

        public final int b() {
            return this.f21629c;
        }

        public void c(@androidx.annotation.n0 j3 j3Var) {
        }

        public void d(@androidx.annotation.n0 j3 j3Var) {
        }

        @androidx.annotation.n0
        public abstract n3 e(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 List<j3> list);

        @androidx.annotation.n0
        public a f(@androidx.annotation.n0 j3 j3Var, @androidx.annotation.n0 a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.w0(21)
    public static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f21630f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f21631g = new androidx.interpolator.view.animation.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f21632h = new DecelerateInterpolator();

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.w0(21)
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f21633c = 160;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f21634a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private n3 f21635b;

            /* JADX INFO: renamed from: androidx.core.view.j3$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class C0149a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j3 f21636b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ n3 f21637c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ n3 f21638d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f21639e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ View f21640f;

                C0149a(j3 j3Var, n3 n3Var, n3 n3Var2, int i10, View view) {
                    this.f21636b = j3Var;
                    this.f21637c = n3Var;
                    this.f21638d = n3Var2;
                    this.f21639e = i10;
                    this.f21640f = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f21636b.i(valueAnimator.getAnimatedFraction());
                    c.o(this.f21640f, c.s(this.f21637c, this.f21638d, this.f21636b.d(), this.f21639e), Collections.singletonList(this.f21636b));
                }
            }

            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j3 f21642b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ View f21643c;

                b(j3 j3Var, View view) {
                    this.f21642b = j3Var;
                    this.f21643c = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f21642b.i(1.0f);
                    c.m(this.f21643c, this.f21642b);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.j3$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class RunnableC0150c implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f21645b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j3 f21646c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f21647d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f21648e;

                RunnableC0150c(View view, j3 j3Var, a aVar, ValueAnimator valueAnimator) {
                    this.f21645b = view;
                    this.f21646c = j3Var;
                    this.f21647d = aVar;
                    this.f21648e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.p(this.f21645b, this.f21646c, this.f21647d);
                    this.f21648e.start();
                }
            }

            a(@androidx.annotation.n0 View view, @androidx.annotation.n0 b bVar) {
                this.f21634a = bVar;
                n3 n3VarO0 = j1.o0(view);
                this.f21635b = n3VarO0 != null ? new n3.b(n3VarO0).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int i10;
                if (!view.isLaidOut()) {
                    this.f21635b = n3.L(windowInsets, view);
                    return c.q(view, windowInsets);
                }
                n3 n3VarL = n3.L(windowInsets, view);
                if (this.f21635b == null) {
                    this.f21635b = j1.o0(view);
                }
                if (this.f21635b == null) {
                    this.f21635b = n3VarL;
                    return c.q(view, windowInsets);
                }
                b bVarR = c.r(view);
                if ((bVarR == null || !Objects.equals(bVarR.f21628b, windowInsets)) && (i10 = c.i(n3VarL, this.f21635b)) != 0) {
                    n3 n3Var = this.f21635b;
                    j3 j3Var = new j3(i10, c.k(i10, n3VarL, n3Var), 160L);
                    j3Var.i(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j3Var.b());
                    a aVarJ = c.j(n3VarL, n3Var, i10);
                    c.n(view, j3Var, windowInsets, false);
                    duration.addUpdateListener(new C0149a(j3Var, n3VarL, n3Var, i10, view));
                    duration.addListener(new b(j3Var, view));
                    c1.a(view, new RunnableC0150c(view, j3Var, aVarJ, duration));
                    this.f21635b = n3VarL;
                    return c.q(view, windowInsets);
                }
                return c.q(view, windowInsets);
            }
        }

        c(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        static int i(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 n3 n3Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!n3Var.f(i11).equals(n3Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        @androidx.annotation.n0
        static a j(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 n3 n3Var2, int i10) {
            androidx.core.graphics.h0 h0VarF = n3Var.f(i10);
            androidx.core.graphics.h0 h0VarF2 = n3Var2.f(i10);
            return new a(androidx.core.graphics.h0.d(Math.min(h0VarF.f20742a, h0VarF2.f20742a), Math.min(h0VarF.f20743b, h0VarF2.f20743b), Math.min(h0VarF.f20744c, h0VarF2.f20744c), Math.min(h0VarF.f20745d, h0VarF2.f20745d)), androidx.core.graphics.h0.d(Math.max(h0VarF.f20742a, h0VarF2.f20742a), Math.max(h0VarF.f20743b, h0VarF2.f20743b), Math.max(h0VarF.f20744c, h0VarF2.f20744c), Math.max(h0VarF.f20745d, h0VarF2.f20745d)));
        }

        static Interpolator k(int i10, n3 n3Var, n3 n3Var2) {
            if ((i10 & 8) != 0) {
                return n3Var.f(n3.m.d()).f20745d > n3Var2.f(n3.m.d()).f20745d ? f21630f : f21631g;
            }
            return f21632h;
        }

        @androidx.annotation.n0
        private static View.OnApplyWindowInsetsListener l(@androidx.annotation.n0 View view, @androidx.annotation.n0 b bVar) {
            return new a(view, bVar);
        }

        static void m(@androidx.annotation.n0 View view, @androidx.annotation.n0 j3 j3Var) {
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.c(j3Var);
                if (bVarR.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m(viewGroup.getChildAt(i10), j3Var);
                }
            }
        }

        static void n(View view, j3 j3Var, WindowInsets windowInsets, boolean z10) {
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.f21628b = windowInsets;
                if (!z10) {
                    bVarR.d(j3Var);
                    z10 = bVarR.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    n(viewGroup.getChildAt(i10), j3Var, windowInsets, z10);
                }
            }
        }

        static void o(@androidx.annotation.n0 View view, @androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 List<j3> list) {
            b bVarR = r(view);
            if (bVarR != null) {
                n3Var = bVarR.e(n3Var, list);
                if (bVarR.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    o(viewGroup.getChildAt(i10), n3Var, list);
                }
            }
        }

        static void p(View view, j3 j3Var, a aVar) {
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.f(j3Var, aVar);
                if (bVarR.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    p(viewGroup.getChildAt(i10), j3Var, aVar);
                }
            }
        }

        @androidx.annotation.n0
        static WindowInsets q(@androidx.annotation.n0 View view, @androidx.annotation.n0 WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.p0
        static b r(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f21634a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static n3 s(n3 n3Var, n3 n3Var2, float f10, int i10) {
            n3.b bVar = new n3.b(n3Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.c(i11, n3Var.f(i11));
                } else {
                    androidx.core.graphics.h0 h0VarF = n3Var.f(i11);
                    androidx.core.graphics.h0 h0VarF2 = n3Var2.f(i11);
                    float f11 = 1.0f - f10;
                    bVar.c(i11, n3.z(h0VarF, (int) (((double) ((h0VarF.f20742a - h0VarF2.f20742a) * f11)) + 0.5d), (int) (((double) ((h0VarF.f20743b - h0VarF2.f20743b) * f11)) + 0.5d), (int) (((double) ((h0VarF.f20744c - h0VarF2.f20744c) * f11)) + 0.5d), (int) (((double) ((h0VarF.f20745d - h0VarF2.f20745d) * f11)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void t(@androidx.annotation.n0 View view, @androidx.annotation.p0 b bVar) {
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerL = l(view, bVar);
            view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListenerL);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerL);
            }
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.w0(30)
    public static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.n0
        private final WindowInsetsAnimation f21650f;

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.w0(30)
        public static class a extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f21651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<j3> f21652b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList<j3> f21653c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, j3> f21654d;

            a(@androidx.annotation.n0 b bVar) {
                super(bVar.b());
                this.f21654d = new HashMap<>();
                this.f21651a = bVar;
            }

            @androidx.annotation.n0
            private j3 a(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation) {
                j3 j3Var = this.f21654d.get(windowInsetsAnimation);
                if (j3Var != null) {
                    return j3Var;
                }
                j3 j3VarJ = j3.j(windowInsetsAnimation);
                this.f21654d.put(windowInsetsAnimation, j3VarJ);
                return j3VarJ;
            }

            public void onEnd(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f21651a.c(a(windowInsetsAnimation));
                this.f21654d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f21651a.d(a(windowInsetsAnimation));
            }

            @androidx.annotation.n0
            public WindowInsets onProgress(@androidx.annotation.n0 WindowInsets windowInsets, @androidx.annotation.n0 List<WindowInsetsAnimation> list) {
                ArrayList<j3> arrayList = this.f21653c;
                if (arrayList == null) {
                    ArrayList<j3> arrayList2 = new ArrayList<>(list.size());
                    this.f21653c = arrayList2;
                    this.f21652b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    j3 j3VarA = a(windowInsetsAnimation);
                    j3VarA.i(windowInsetsAnimation.getFraction());
                    this.f21653c.add(j3VarA);
                }
                return this.f21651a.e(n3.K(windowInsets), this.f21652b).J();
            }

            @androidx.annotation.n0
            public WindowInsetsAnimation.Bounds onStart(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation, @androidx.annotation.n0 WindowInsetsAnimation.Bounds bounds) {
                return this.f21651a.f(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(new WindowInsetsAnimation(i10, interpolator, j10));
        }

        d(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f21650f = windowInsetsAnimation;
        }

        @androidx.annotation.n0
        public static WindowInsetsAnimation.Bounds i(@androidx.annotation.n0 a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().h(), aVar.b().h());
        }

        @androidx.annotation.n0
        public static androidx.core.graphics.h0 j(@androidx.annotation.n0 WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.h0.g(bounds.getUpperBound());
        }

        @androidx.annotation.n0
        public static androidx.core.graphics.h0 k(@androidx.annotation.n0 WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.h0.g(bounds.getLowerBound());
        }

        public static void l(@androidx.annotation.n0 View view, @androidx.annotation.p0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.j3.e
        public long b() {
            return this.f21650f.getDurationMillis();
        }

        @Override // androidx.core.view.j3.e
        public float c() {
            return this.f21650f.getFraction();
        }

        @Override // androidx.core.view.j3.e
        public float d() {
            return this.f21650f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.j3.e
        @androidx.annotation.p0
        public Interpolator e() {
            return this.f21650f.getInterpolator();
        }

        @Override // androidx.core.view.j3.e
        public int f() {
            return this.f21650f.getTypeMask();
        }

        @Override // androidx.core.view.j3.e
        public void h(float f10) {
            this.f21650f.setFraction(f10);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final Interpolator f21657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f21658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f21659e;

        e(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
            this.f21655a = i10;
            this.f21657c = interpolator;
            this.f21658d = j10;
        }

        public float a() {
            return this.f21659e;
        }

        public long b() {
            return this.f21658d;
        }

        public float c() {
            return this.f21656b;
        }

        public float d() {
            Interpolator interpolator = this.f21657c;
            return interpolator != null ? interpolator.getInterpolation(this.f21656b) : this.f21656b;
        }

        @androidx.annotation.p0
        public Interpolator e() {
            return this.f21657c;
        }

        public int f() {
            return this.f21655a;
        }

        public void g(float f10) {
            this.f21659e = f10;
        }

        public void h(float f10) {
            this.f21656b = f10;
        }
    }

    public j3(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21623a = new d(i10, interpolator, j10);
        } else {
            this.f21623a = new c(i10, interpolator, j10);
        }
    }

    @androidx.annotation.w0(30)
    private j3(@androidx.annotation.n0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21623a = new d(windowInsetsAnimation);
        }
    }

    static void h(@androidx.annotation.n0 View view, @androidx.annotation.p0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.t(view, bVar);
        }
    }

    @androidx.annotation.w0(30)
    static j3 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new j3(windowInsetsAnimation);
    }

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float a() {
        return this.f21623a.a();
    }

    public long b() {
        return this.f21623a.b();
    }

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float c() {
        return this.f21623a.c();
    }

    public float d() {
        return this.f21623a.d();
    }

    @androidx.annotation.p0
    public Interpolator e() {
        return this.f21623a.e();
    }

    public int f() {
        return this.f21623a.f();
    }

    public void g(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f21623a.g(f10);
    }

    public void i(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f21623a.h(f10);
    }
}
