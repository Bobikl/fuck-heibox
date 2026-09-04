package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f21707b = "WindowInsetsCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public static final n3 f21708c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f21709a;

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f21710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f21711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f21712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f21713d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f21710a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f21711b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f21712c = declaredField3;
                declaredField3.setAccessible(true);
                f21713d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w(n3.f21707b, "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        private a() {
        }

        @androidx.annotation.p0
        public static n3 a(@androidx.annotation.n0 View view) {
            if (f21713d && view.isAttachedToWindow()) {
                try {
                    Object obj = f21710a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f21711b.get(obj);
                        Rect rect2 = (Rect) f21712c.get(obj);
                        if (rect != null && rect2 != null) {
                            n3 n3VarA = new b().f(androidx.core.graphics.h0.e(rect)).h(androidx.core.graphics.h0.e(rect2)).a();
                            n3VarA.H(n3VarA);
                            n3VarA.d(view.getRootView());
                            return n3VarA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w(n3.f21707b, "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f21714a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f21714a = new e();
            } else if (i10 >= 29) {
                this.f21714a = new d();
            } else {
                this.f21714a = new c();
            }
        }

        public b(@androidx.annotation.n0 n3 n3Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f21714a = new e(n3Var);
            } else if (i10 >= 29) {
                this.f21714a = new d(n3Var);
            } else {
                this.f21714a = new c(n3Var);
            }
        }

        @androidx.annotation.n0
        public n3 a() {
            return this.f21714a.b();
        }

        @androidx.annotation.n0
        public b b(@androidx.annotation.p0 androidx.core.view.g gVar) {
            this.f21714a.c(gVar);
            return this;
        }

        @androidx.annotation.n0
        public b c(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.d(i10, h0Var);
            return this;
        }

        @androidx.annotation.n0
        public b d(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.e(i10, h0Var);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public b e(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.f(h0Var);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public b f(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.g(h0Var);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public b g(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.h(h0Var);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public b h(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.i(h0Var);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public b i(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21714a.j(h0Var);
            return this;
        }

        @androidx.annotation.n0
        public b j(int i10, boolean z10) {
            this.f21714a.k(i10, z10);
            return this;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(api = 20)
    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f21715e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f21716f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f21717g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f21718h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f21719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.h0 f21720d;

        c() {
            this.f21719c = l();
        }

        c(@androidx.annotation.n0 n3 n3Var) {
            super(n3Var);
            this.f21719c = n3Var.J();
        }

        @androidx.annotation.p0
        private static WindowInsets l() {
            if (!f21716f) {
                try {
                    f21715e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i(n3.f21707b, "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f21716f = true;
            }
            Field field = f21715e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i(n3.f21707b, "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f21718h) {
                try {
                    f21717g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i(n3.f21707b, "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f21718h = true;
            }
            Constructor<WindowInsets> constructor = f21717g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i(n3.f21707b, "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.n3.f
        @androidx.annotation.n0
        n3 b() {
            a();
            n3 n3VarK = n3.K(this.f21719c);
            n3VarK.F(this.f21723b);
            n3VarK.I(this.f21720d);
            return n3VarK;
        }

        @Override // androidx.core.view.n3.f
        void g(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var) {
            this.f21720d = h0Var;
        }

        @Override // androidx.core.view.n3.f
        void i(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            WindowInsets windowInsets = this.f21719c;
            if (windowInsets != null) {
                this.f21719c = windowInsets.replaceSystemWindowInsets(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d);
            }
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(api = 29)
    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets$Builder f21721c;

        d() {
            this.f21721c = new WindowInsets$Builder();
        }

        d(@androidx.annotation.n0 n3 n3Var) {
            super(n3Var);
            WindowInsets windowInsetsJ = n3Var.J();
            this.f21721c = windowInsetsJ != null ? new WindowInsets$Builder(windowInsetsJ) : new WindowInsets$Builder();
        }

        @Override // androidx.core.view.n3.f
        @androidx.annotation.n0
        n3 b() {
            a();
            n3 n3VarK = n3.K(this.f21721c.build());
            n3VarK.F(this.f21723b);
            return n3VarK;
        }

        @Override // androidx.core.view.n3.f
        void c(@androidx.annotation.p0 androidx.core.view.g gVar) {
            this.f21721c.setDisplayCutout(gVar != null ? gVar.h() : null);
        }

        @Override // androidx.core.view.n3.f
        void f(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setMandatorySystemGestureInsets(h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void g(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setStableInsets(h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void h(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setSystemGestureInsets(h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void i(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setSystemWindowInsets(h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void j(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setTappableElementInsets(h0Var.h());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(30)
    public static class e extends d {
        e() {
        }

        e(@androidx.annotation.n0 n3 n3Var) {
            super(n3Var);
        }

        @Override // androidx.core.view.n3.f
        void d(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setInsets(n.a(i10), h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void e(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21721c.setInsetsIgnoringVisibility(n.a(i10), h0Var.h());
        }

        @Override // androidx.core.view.n3.f
        void k(int i10, boolean z10) {
            this.f21721c.setVisible(n.a(i10), z10);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n3 f21722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.h0[] f21723b;

        f() {
            this(new n3((n3) null));
        }

        f(@androidx.annotation.n0 n3 n3Var) {
            this.f21722a = n3Var;
        }

        protected final void a() {
            androidx.core.graphics.h0[] h0VarArr = this.f21723b;
            if (h0VarArr != null) {
                androidx.core.graphics.h0 h0VarF = h0VarArr[m.e(1)];
                androidx.core.graphics.h0 h0VarF2 = this.f21723b[m.e(2)];
                if (h0VarF2 == null) {
                    h0VarF2 = this.f21722a.f(2);
                }
                if (h0VarF == null) {
                    h0VarF = this.f21722a.f(1);
                }
                i(androidx.core.graphics.h0.b(h0VarF, h0VarF2));
                androidx.core.graphics.h0 h0Var = this.f21723b[m.e(16)];
                if (h0Var != null) {
                    h(h0Var);
                }
                androidx.core.graphics.h0 h0Var2 = this.f21723b[m.e(32)];
                if (h0Var2 != null) {
                    f(h0Var2);
                }
                androidx.core.graphics.h0 h0Var3 = this.f21723b[m.e(64)];
                if (h0Var3 != null) {
                    j(h0Var3);
                }
            }
        }

        @androidx.annotation.n0
        n3 b() {
            a();
            return this.f21722a;
        }

        void c(@androidx.annotation.p0 androidx.core.view.g gVar) {
        }

        void d(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            if (this.f21723b == null) {
                this.f21723b = new androidx.core.graphics.h0[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f21723b[m.e(i11)] = h0Var;
                }
            }
        }

        void e(int i10, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            if (i10 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void g(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void h(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void i(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void j(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void k(int i10, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(20)
    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f21724h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f21725i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f21726j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f21727k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f21728l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.n0
        final WindowInsets f21729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.h0[] f21730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.h0 f21731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private n3 f21732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.h0 f21733g;

        g(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 WindowInsets windowInsets) {
            super(n3Var);
            this.f21731e = null;
            this.f21729c = windowInsets;
        }

        g(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 g gVar) {
            this(n3Var, new WindowInsets(gVar.f21729c));
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f21725i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f21726j = cls;
                f21727k = cls.getDeclaredField("mVisibleInsets");
                f21728l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f21727k.setAccessible(true);
                f21728l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e(n3.f21707b, "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f21724h = true;
        }

        @androidx.annotation.n0
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.h0 v(int i10, boolean z10) {
            androidx.core.graphics.h0 h0VarB = androidx.core.graphics.h0.f20741e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    h0VarB = androidx.core.graphics.h0.b(h0VarB, w(i11, z10));
                }
            }
            return h0VarB;
        }

        private androidx.core.graphics.h0 x() {
            n3 n3Var = this.f21732f;
            return n3Var != null ? n3Var.m() : androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.p0
        private androidx.core.graphics.h0 y(@androidx.annotation.n0 View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f21724h) {
                A();
            }
            Method method = f21725i;
            if (method != null && f21726j != null && f21727k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w(n3.f21707b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f21727k.get(f21728l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.h0.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e(n3.f21707b, "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.n3.l
        void d(@androidx.annotation.n0 View view) {
            androidx.core.graphics.h0 h0VarY = y(view);
            if (h0VarY == null) {
                h0VarY = androidx.core.graphics.h0.f20741e;
            }
            s(h0VarY);
        }

        @Override // androidx.core.view.n3.l
        void e(@androidx.annotation.n0 n3 n3Var) {
            n3Var.H(this.f21732f);
            n3Var.G(this.f21733g);
        }

        @Override // androidx.core.view.n3.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f21733g, ((g) obj).f21733g);
            }
            return false;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        public androidx.core.graphics.h0 g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        public androidx.core.graphics.h0 h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        final androidx.core.graphics.h0 l() {
            if (this.f21731e == null) {
                this.f21731e = androidx.core.graphics.h0.d(this.f21729c.getSystemWindowInsetLeft(), this.f21729c.getSystemWindowInsetTop(), this.f21729c.getSystemWindowInsetRight(), this.f21729c.getSystemWindowInsetBottom());
            }
            return this.f21731e;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        n3 n(int i10, int i11, int i12, int i13) {
            b bVar = new b(n3.K(this.f21729c));
            bVar.h(n3.z(l(), i10, i11, i12, i13));
            bVar.f(n3.z(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.n3.l
        boolean p() {
            return this.f21729c.isRound();
        }

        @Override // androidx.core.view.n3.l
        @SuppressLint({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.n3.l
        public void r(androidx.core.graphics.h0[] h0VarArr) {
            this.f21730d = h0VarArr;
        }

        @Override // androidx.core.view.n3.l
        void s(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
            this.f21733g = h0Var;
        }

        @Override // androidx.core.view.n3.l
        void t(@androidx.annotation.p0 n3 n3Var) {
            this.f21732f = n3Var;
        }

        @androidx.annotation.n0
        protected androidx.core.graphics.h0 w(int i10, boolean z10) {
            androidx.core.graphics.h0 h0VarM;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.h0.d(0, Math.max(x().f20743b, l().f20743b), 0, 0) : androidx.core.graphics.h0.d(0, l().f20743b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.h0 h0VarX = x();
                    androidx.core.graphics.h0 h0VarJ = j();
                    return androidx.core.graphics.h0.d(Math.max(h0VarX.f20742a, h0VarJ.f20742a), 0, Math.max(h0VarX.f20744c, h0VarJ.f20744c), Math.max(h0VarX.f20745d, h0VarJ.f20745d));
                }
                androidx.core.graphics.h0 h0VarL = l();
                n3 n3Var = this.f21732f;
                h0VarM = n3Var != null ? n3Var.m() : null;
                int iMin = h0VarL.f20745d;
                if (h0VarM != null) {
                    iMin = Math.min(iMin, h0VarM.f20745d);
                }
                return androidx.core.graphics.h0.d(h0VarL.f20742a, 0, h0VarL.f20744c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.h0.f20741e;
                }
                n3 n3Var2 = this.f21732f;
                androidx.core.view.g gVarE = n3Var2 != null ? n3Var2.e() : f();
                return gVarE != null ? androidx.core.graphics.h0.d(gVarE.d(), gVarE.f(), gVarE.e(), gVarE.c()) : androidx.core.graphics.h0.f20741e;
            }
            androidx.core.graphics.h0[] h0VarArr = this.f21730d;
            h0VarM = h0VarArr != null ? h0VarArr[m.e(8)] : null;
            if (h0VarM != null) {
                return h0VarM;
            }
            androidx.core.graphics.h0 h0VarL2 = l();
            androidx.core.graphics.h0 h0VarX2 = x();
            int i12 = h0VarL2.f20745d;
            if (i12 > h0VarX2.f20745d) {
                return androidx.core.graphics.h0.d(0, 0, 0, i12);
            }
            androidx.core.graphics.h0 h0Var = this.f21733g;
            return (h0Var == null || h0Var.equals(androidx.core.graphics.h0.f20741e) || (i11 = this.f21733g.f20745d) <= h0VarX2.f20745d) ? androidx.core.graphics.h0.f20741e : androidx.core.graphics.h0.d(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(androidx.core.graphics.h0.f20741e);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(21)
    public static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.h0 f21734m;

        h(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 WindowInsets windowInsets) {
            super(n3Var, windowInsets);
            this.f21734m = null;
        }

        h(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 h hVar) {
            super(n3Var, hVar);
            this.f21734m = null;
            this.f21734m = hVar.f21734m;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        n3 b() {
            return n3.K(this.f21729c.consumeStableInsets());
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        n3 c() {
            return n3.K(this.f21729c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        final androidx.core.graphics.h0 j() {
            if (this.f21734m == null) {
                this.f21734m = androidx.core.graphics.h0.d(this.f21729c.getStableInsetLeft(), this.f21729c.getStableInsetTop(), this.f21729c.getStableInsetRight(), this.f21729c.getStableInsetBottom());
            }
            return this.f21734m;
        }

        @Override // androidx.core.view.n3.l
        boolean o() {
            return this.f21729c.isConsumed();
        }

        @Override // androidx.core.view.n3.l
        public void u(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var) {
            this.f21734m = h0Var;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(28)
    public static class i extends h {
        i(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 WindowInsets windowInsets) {
            super(n3Var, windowInsets);
        }

        i(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 i iVar) {
            super(n3Var, iVar);
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        n3 a() {
            return n3.K(this.f21729c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f21729c, iVar.f21729c) && Objects.equals(this.f21733g, iVar.f21733g);
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.p0
        androidx.core.view.g f() {
            return androidx.core.view.g.i(this.f21729c.getDisplayCutout());
        }

        @Override // androidx.core.view.n3.l
        public int hashCode() {
            return this.f21729c.hashCode();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(29)
    public static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.h0 f21735n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.h0 f21736o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.h0 f21737p;

        j(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 WindowInsets windowInsets) {
            super(n3Var, windowInsets);
            this.f21735n = null;
            this.f21736o = null;
            this.f21737p = null;
        }

        j(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 j jVar) {
            super(n3Var, jVar);
            this.f21735n = null;
            this.f21736o = null;
            this.f21737p = null;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        androidx.core.graphics.h0 i() {
            if (this.f21736o == null) {
                this.f21736o = androidx.core.graphics.h0.g(this.f21729c.getMandatorySystemGestureInsets());
            }
            return this.f21736o;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        androidx.core.graphics.h0 k() {
            if (this.f21735n == null) {
                this.f21735n = androidx.core.graphics.h0.g(this.f21729c.getSystemGestureInsets());
            }
            return this.f21735n;
        }

        @Override // androidx.core.view.n3.l
        @androidx.annotation.n0
        androidx.core.graphics.h0 m() {
            if (this.f21737p == null) {
                this.f21737p = androidx.core.graphics.h0.g(this.f21729c.getTappableElementInsets());
            }
            return this.f21737p;
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        @androidx.annotation.n0
        n3 n(int i10, int i11, int i12, int i13) {
            return n3.K(this.f21729c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.n3.h, androidx.core.view.n3.l
        public void u(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(30)
    public static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @androidx.annotation.n0
        static final n3 f21738q = n3.K(WindowInsets.CONSUMED);

        k(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 WindowInsets windowInsets) {
            super(n3Var, windowInsets);
        }

        k(@androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 k kVar) {
            super(n3Var, kVar);
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        final void d(@androidx.annotation.n0 View view) {
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        @androidx.annotation.n0
        public androidx.core.graphics.h0 g(int i10) {
            return androidx.core.graphics.h0.g(this.f21729c.getInsets(n.a(i10)));
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        @androidx.annotation.n0
        public androidx.core.graphics.h0 h(int i10) {
            return androidx.core.graphics.h0.g(this.f21729c.getInsetsIgnoringVisibility(n.a(i10)));
        }

        @Override // androidx.core.view.n3.g, androidx.core.view.n3.l
        public boolean q(int i10) {
            return this.f21729c.isVisible(n.a(i10));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        static final n3 f21739b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n3 f21740a;

        l(@androidx.annotation.n0 n3 n3Var) {
            this.f21740a = n3Var;
        }

        @androidx.annotation.n0
        n3 a() {
            return this.f21740a;
        }

        @androidx.annotation.n0
        n3 b() {
            return this.f21740a;
        }

        @androidx.annotation.n0
        n3 c() {
            return this.f21740a;
        }

        void d(@androidx.annotation.n0 View view) {
        }

        void e(@androidx.annotation.n0 n3 n3Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && androidx.core.util.j.a(l(), lVar.l()) && androidx.core.util.j.a(j(), lVar.j()) && androidx.core.util.j.a(f(), lVar.f());
        }

        @androidx.annotation.p0
        androidx.core.view.g f() {
            return null;
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 g(int i10) {
            return androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 h(int i10) {
            if ((i10 & 8) == 0) {
                return androidx.core.graphics.h0.f20741e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return androidx.core.util.j.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 i() {
            return l();
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 j() {
            return androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 k() {
            return l();
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 l() {
            return androidx.core.graphics.h0.f20741e;
        }

        @androidx.annotation.n0
        androidx.core.graphics.h0 m() {
            return l();
        }

        @androidx.annotation.n0
        n3 n(int i10, int i11, int i12, int i13) {
            return f21739b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        public void r(androidx.core.graphics.h0[] h0VarArr) {
        }

        void s(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        }

        void t(@androidx.annotation.p0 n3 n3Var) {
        }

        public void u(androidx.core.graphics.h0 h0Var) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f21741a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f21742b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f21743c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f21744d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f21745e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f21746f = 16;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f21747g = 32;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f21748h = 64;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f21749i = 128;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f21750j = 256;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f21751k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f21752l = 256;

        /* JADX INFO: compiled from: WindowInsetsCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        private m() {
        }

        @SuppressLint({"WrongConstant"})
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    @androidx.annotation.w0(30)
    public static final class n {
        private n() {
        }

        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets$Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets$Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets$Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets$Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets$Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets$Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets$Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f21708c = k.f21738q;
        } else {
            f21708c = l.f21739b;
        }
    }

    @androidx.annotation.w0(20)
    private n3(@androidx.annotation.n0 WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f21709a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f21709a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f21709a = new i(this, windowInsets);
        } else {
            this.f21709a = new h(this, windowInsets);
        }
    }

    public n3(@androidx.annotation.p0 n3 n3Var) {
        if (n3Var == null) {
            this.f21709a = new l(this);
            return;
        }
        l lVar = n3Var.f21709a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && (lVar instanceof k)) {
            this.f21709a = new k(this, (k) lVar);
        } else if (i10 >= 29 && (lVar instanceof j)) {
            this.f21709a = new j(this, (j) lVar);
        } else if (i10 >= 28 && (lVar instanceof i)) {
            this.f21709a = new i(this, (i) lVar);
        } else if (lVar instanceof h) {
            this.f21709a = new h(this, (h) lVar);
        } else if (lVar instanceof g) {
            this.f21709a = new g(this, (g) lVar);
        } else {
            this.f21709a = new l(this);
        }
        lVar.e(this);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(20)
    public static n3 K(@androidx.annotation.n0 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(20)
    public static n3 L(@androidx.annotation.n0 WindowInsets windowInsets, @androidx.annotation.p0 View view) {
        n3 n3Var = new n3((WindowInsets) androidx.core.util.o.l(windowInsets));
        if (view != null && j1.O0(view)) {
            n3Var.H(j1.o0(view));
            n3Var.d(view.getRootView());
        }
        return n3Var;
    }

    static androidx.core.graphics.h0 z(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, h0Var.f20742a - i10);
        int iMax2 = Math.max(0, h0Var.f20743b - i11);
        int iMax3 = Math.max(0, h0Var.f20744c - i12);
        int iMax4 = Math.max(0, h0Var.f20745d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? h0Var : androidx.core.graphics.h0.d(iMax, iMax2, iMax3, iMax4);
    }

    public boolean A() {
        return this.f21709a.o();
    }

    public boolean B() {
        return this.f21709a.p();
    }

    public boolean C(int i10) {
        return this.f21709a.q(i10);
    }

    @androidx.annotation.n0
    @Deprecated
    public n3 D(int i10, int i11, int i12, int i13) {
        return new b(this).h(androidx.core.graphics.h0.d(i10, i11, i12, i13)).a();
    }

    @androidx.annotation.n0
    @Deprecated
    public n3 E(@androidx.annotation.n0 Rect rect) {
        return new b(this).h(androidx.core.graphics.h0.e(rect)).a();
    }

    void F(androidx.core.graphics.h0[] h0VarArr) {
        this.f21709a.r(h0VarArr);
    }

    void G(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        this.f21709a.s(h0Var);
    }

    void H(@androidx.annotation.p0 n3 n3Var) {
        this.f21709a.t(n3Var);
    }

    void I(@androidx.annotation.p0 androidx.core.graphics.h0 h0Var) {
        this.f21709a.u(h0Var);
    }

    @androidx.annotation.w0(20)
    @androidx.annotation.p0
    public WindowInsets J() {
        l lVar = this.f21709a;
        if (lVar instanceof g) {
            return ((g) lVar).f21729c;
        }
        return null;
    }

    @androidx.annotation.n0
    @Deprecated
    public n3 a() {
        return this.f21709a.a();
    }

    @androidx.annotation.n0
    @Deprecated
    public n3 b() {
        return this.f21709a.b();
    }

    @androidx.annotation.n0
    @Deprecated
    public n3 c() {
        return this.f21709a.c();
    }

    void d(@androidx.annotation.n0 View view) {
        this.f21709a.d(view);
    }

    @androidx.annotation.p0
    public androidx.core.view.g e() {
        return this.f21709a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3) {
            return androidx.core.util.j.a(this.f21709a, ((n3) obj).f21709a);
        }
        return false;
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 f(int i10) {
        return this.f21709a.g(i10);
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 g(int i10) {
        return this.f21709a.h(i10);
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.core.graphics.h0 h() {
        return this.f21709a.i();
    }

    public int hashCode() {
        l lVar = this.f21709a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f21709a.j().f20745d;
    }

    @Deprecated
    public int j() {
        return this.f21709a.j().f20742a;
    }

    @Deprecated
    public int k() {
        return this.f21709a.j().f20744c;
    }

    @Deprecated
    public int l() {
        return this.f21709a.j().f20743b;
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.core.graphics.h0 m() {
        return this.f21709a.j();
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.core.graphics.h0 n() {
        return this.f21709a.k();
    }

    @Deprecated
    public int o() {
        return this.f21709a.l().f20745d;
    }

    @Deprecated
    public int p() {
        return this.f21709a.l().f20742a;
    }

    @Deprecated
    public int q() {
        return this.f21709a.l().f20744c;
    }

    @Deprecated
    public int r() {
        return this.f21709a.l().f20743b;
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.core.graphics.h0 s() {
        return this.f21709a.l();
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.core.graphics.h0 t() {
        return this.f21709a.m();
    }

    public boolean u() {
        androidx.core.graphics.h0 h0VarF = f(m.a());
        androidx.core.graphics.h0 h0Var = androidx.core.graphics.h0.f20741e;
        return (h0VarF.equals(h0Var) && g(m.a() ^ m.d()).equals(h0Var) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f21709a.j().equals(androidx.core.graphics.h0.f20741e);
    }

    @Deprecated
    public boolean w() {
        return !this.f21709a.l().equals(androidx.core.graphics.h0.f20741e);
    }

    @androidx.annotation.n0
    public n3 x(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11, @androidx.annotation.f0(from = 0) int i12, @androidx.annotation.f0(from = 0) int i13) {
        return this.f21709a.n(i10, i11, i12, i13);
    }

    @androidx.annotation.n0
    public n3 y(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var) {
        return x(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d);
    }
}
