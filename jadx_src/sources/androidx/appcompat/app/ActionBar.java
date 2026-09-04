package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.v;
import androidx.appcompat.R;
import androidx.fragment.app.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f1594a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f1595b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f1596c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1597d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1598e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1599f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1600g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1601h = 16;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1602a;

        public LayoutParams(int i10) {
            this(-2, -1, i10);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f1602a = 8388627;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11);
            this.f1602a = i12;
        }

        public LayoutParams(@n0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1602a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f1569b);
            this.f1602a = typedArrayObtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1602a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f1602a = 0;
            this.f1602a = layoutParams.f1602a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    public interface c {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public interface d {
        boolean onNavigationItemSelected(int i10, long j10);
    }

    @Deprecated
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f1603a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract e h(@d1 int i10);

        public abstract e i(CharSequence charSequence);

        public abstract e j(int i10);

        public abstract e k(View view);

        public abstract e l(@v int i10);

        public abstract e m(Drawable drawable);

        public abstract e n(f fVar);

        public abstract e o(Object obj);

        public abstract e p(int i10);

        public abstract e q(CharSequence charSequence);
    }

    @Deprecated
    public interface f {
        void a(e eVar, p0 p0Var);

        void b(e eVar, p0 p0Var);

        void c(e eVar, p0 p0Var);
    }

    @androidx.annotation.p0
    public abstract CharSequence A();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void A0(CharSequence charSequence) {
    }

    public abstract void B();

    public abstract void B0();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean C() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.b C0(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract e G();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void H(Configuration configuration) {
    }

    void I() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean J(int i10, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(c cVar);

    @Deprecated
    public abstract void O(e eVar);

    @Deprecated
    public abstract void P(int i10);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(e eVar);

    public abstract void S(@androidx.annotation.p0 Drawable drawable);

    public abstract void T(int i10);

    public abstract void U(View view);

    public abstract void V(View view, LayoutParams layoutParams);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void W(boolean z10) {
    }

    public abstract void X(boolean z10);

    public abstract void Y(int i10);

    public abstract void Z(int i10, int i11);

    public abstract void a0(boolean z10);

    public abstract void b0(boolean z10);

    public abstract void c0(boolean z10);

    public abstract void d0(boolean z10);

    public void e0(float f10) {
        if (f10 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void f(c cVar);

    public void f0(int i10) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void g(e eVar);

    public void g0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(e eVar, int i10);

    public void h0(@d1 int i10) {
    }

    @Deprecated
    public abstract void i(e eVar, int i10, boolean z10);

    public void i0(@androidx.annotation.p0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void j(e eVar, boolean z10);

    public void j0(@v int i10) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return false;
    }

    public void k0(@androidx.annotation.p0 Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(boolean z10) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
    }

    public abstract void m0(@v int i10);

    public abstract View n();

    public abstract void n0(Drawable drawable);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter spinnerAdapter, d dVar);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(@v int i10);

    public abstract int q();

    public abstract void q0(Drawable drawable);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int i10);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int i10);

    @Deprecated
    public abstract int t();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t0(boolean z10) {
    }

    @Deprecated
    public abstract int u();

    public void u0(Drawable drawable) {
    }

    @androidx.annotation.p0
    @Deprecated
    public abstract e v();

    public void v0(Drawable drawable) {
    }

    @androidx.annotation.p0
    public abstract CharSequence w();

    public abstract void w0(int i10);

    @Deprecated
    public abstract e x(int i10);

    public abstract void x0(CharSequence charSequence);

    @Deprecated
    public abstract int y();

    public abstract void y0(@d1 int i10);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence charSequence);
}
