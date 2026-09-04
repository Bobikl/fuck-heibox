package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends Drawable implements z.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f53102o = 8388661;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f53103p = 8388659;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f53104q = 8388693;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f53105r = 8388691;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f53106s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @e1
    private static final int f53107t = R.style.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @f
    private static final int f53108u = R.attr.badgeStyle;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f53109v = "+";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f53110w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f53111x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f53112y = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final WeakReference<Context> f53113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final k f53114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final z f53115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final Rect f53116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final BadgeState f53117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f53118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f53119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f53121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f53122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f53123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private WeakReference<View> f53124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private WeakReference<FrameLayout> f53125n;

    /* JADX INFO: renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BadgeDrawable.java */
    public class RunnableC0415a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f53126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout f53127c;

        RunnableC0415a(View view, FrameLayout frameLayout) {
            this.f53126b = view;
            this.f53127c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.n0(this.f53126b, this.f53127c);
        }
    }

    /* JADX INFO: compiled from: BadgeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a(@n0 Context context, @l1 int i10, @f int i11, @e1 int i12, @p0 BadgeState.State state) {
        this.f53113b = new WeakReference<>(context);
        c0.c(context);
        this.f53116e = new Rect();
        z zVar = new z(this);
        this.f53115d = zVar;
        zVar.e().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f53117f = badgeState;
        this.f53114c = new k(p.b(context, badgeState.y() ? badgeState.l() : badgeState.i(), badgeState.y() ? badgeState.k() : badgeState.h()).m());
        L();
    }

    private void C() {
        this.f53115d.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void D() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f53117f.f());
        if (this.f53114c.y() != colorStateListValueOf) {
            this.f53114c.o0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void E() {
        WeakReference<View> weakReference = this.f53124m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f53124m.get();
        WeakReference<FrameLayout> weakReference2 = this.f53125n;
        n0(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void F() {
        Context context = this.f53113b.get();
        if (context == null) {
            return;
        }
        this.f53114c.setShapeAppearanceModel(p.b(context, this.f53117f.y() ? this.f53117f.l() : this.f53117f.i(), this.f53117f.y() ? this.f53117f.k() : this.f53117f.h()).m());
        invalidateSelf();
    }

    private void G() {
        d dVar;
        Context context = this.f53113b.get();
        if (context == null || this.f53115d.d() == (dVar = new d(context, this.f53117f.v()))) {
            return;
        }
        this.f53115d.i(dVar, context);
        H();
        o0();
        invalidateSelf();
    }

    private void H() {
        this.f53115d.e().setColor(this.f53117f.j());
        invalidateSelf();
    }

    private void I() {
        p0();
        this.f53115d.j(true);
        o0();
        invalidateSelf();
    }

    private void J() {
        this.f53115d.j(true);
        F();
        o0();
        invalidateSelf();
    }

    private void K() {
        boolean z10 = this.f53117f.z();
        setVisible(z10, false);
        if (!com.google.android.material.badge.b.f53129a || p() == null || z10) {
            return;
        }
        ((ViewGroup) p().getParent()).invalidate();
    }

    private void L() {
        F();
        G();
        I();
        J();
        C();
        D();
        H();
        E();
        o0();
        K();
    }

    private void b(@n0 Rect rect, @n0 View view) {
        float f10 = !B() ? this.f53117f.f53067c : this.f53117f.f53068d;
        this.f53121j = f10;
        if (f10 != -1.0f) {
            this.f53123l = f10;
            this.f53122k = f10;
        } else {
            this.f53123l = Math.round((!B() ? this.f53117f.f53070f : this.f53117f.f53072h) / 2.0f);
            this.f53122k = Math.round((!B() ? this.f53117f.f53069e : this.f53117f.f53071g) / 2.0f);
        }
        if (u() > 9) {
            this.f53122k = Math.max(this.f53122k, (this.f53115d.f(m()) / 2.0f) + this.f53117f.f53073i);
        }
        int iX = x();
        int iG = this.f53117f.g();
        if (iG == 8388691 || iG == 8388693) {
            this.f53119h = rect.bottom - iX;
        } else {
            this.f53119h = rect.top + iX;
        }
        int iW = w();
        int iG2 = this.f53117f.g();
        if (iG2 == 8388659 || iG2 == 8388691) {
            this.f53118g = j1.Z(view) == 0 ? (rect.left - this.f53122k) + iW : (rect.right + this.f53122k) - iW;
        } else {
            this.f53118g = j1.Z(view) == 0 ? (rect.right + this.f53122k) - iW : (rect.left - this.f53122k) + iW;
        }
    }

    @n0
    public static a d(@n0 Context context) {
        return new a(context, 0, f53108u, f53107t, null);
    }

    @n0
    public static a e(@n0 Context context, @l1 int i10) {
        return new a(context, i10, f53108u, f53107t, null);
    }

    @n0
    static a f(@n0 Context context, @n0 BadgeState.State state) {
        return new a(context, 0, f53108u, f53107t, state);
    }

    private void g(Canvas canvas) {
        Rect rect = new Rect();
        String strM = m();
        this.f53115d.e().getTextBounds(strM, 0, strM.length(), rect);
        canvas.drawText(strM, this.f53118g, this.f53119h + (rect.height() / 2), this.f53115d.e());
    }

    private void j0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f53125n;
            if (weakReference == null || weakReference.get() != viewGroup) {
                k0(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f53125n = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0415a(view, frameLayout));
            }
        }
    }

    private static void k0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @n0
    private String m() {
        if (u() <= this.f53120i) {
            return NumberFormat.getInstance(this.f53117f.t()).format(u());
        }
        Context context = this.f53113b.get();
        return context == null ? "" : String.format(this.f53117f.t(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f53120i), f53109v);
    }

    private void o0() {
        Context context = this.f53113b.get();
        WeakReference<View> weakReference = this.f53124m;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f53116e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f53125n;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.b.f53129a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(rect2, view);
        com.google.android.material.badge.b.o(this.f53116e, this.f53118g, this.f53119h, this.f53122k, this.f53123l);
        float f10 = this.f53121j;
        if (f10 != -1.0f) {
            this.f53114c.k0(f10);
        }
        if (rect.equals(this.f53116e)) {
            return;
        }
        this.f53114c.setBounds(this.f53116e);
    }

    private void p0() {
        this.f53120i = ((int) Math.pow(10.0d, ((double) t()) - 1.0d)) - 1;
    }

    private int w() {
        int iP = B() ? this.f53117f.p() : this.f53117f.q();
        if (this.f53117f.f53076l == 1) {
            iP += B() ? this.f53117f.f53075k : this.f53117f.f53074j;
        }
        return iP + this.f53117f.c();
    }

    private int x() {
        int iW = B() ? this.f53117f.w() : this.f53117f.x();
        if (this.f53117f.f53076l == 0) {
            iW -= Math.round(this.f53123l);
        }
        return iW + this.f53117f.d();
    }

    @t0
    public int A() {
        return this.f53117f.x();
    }

    public boolean B() {
        return this.f53117f.y();
    }

    void M(int i10) {
        this.f53117f.B(i10);
        o0();
    }

    void N(@t0 int i10) {
        this.f53117f.C(i10);
        o0();
    }

    public void O(@l int i10) {
        this.f53117f.E(i10);
        D();
    }

    public void P(int i10) {
        if (this.f53117f.g() != i10) {
            this.f53117f.F(i10);
            E();
        }
    }

    public void Q(@n0 Locale locale) {
        if (locale.equals(this.f53117f.t())) {
            return;
        }
        this.f53117f.S(locale);
        invalidateSelf();
    }

    public void R(@l int i10) {
        if (this.f53115d.e().getColor() != i10) {
            this.f53117f.I(i10);
            H();
        }
    }

    public void S(@e1 int i10) {
        this.f53117f.K(i10);
        F();
    }

    public void T(@e1 int i10) {
        this.f53117f.J(i10);
        F();
    }

    public void U(@e1 int i10) {
        this.f53117f.H(i10);
        F();
    }

    public void V(@e1 int i10) {
        this.f53117f.G(i10);
        F();
    }

    public void W(@d1 int i10) {
        this.f53117f.L(i10);
    }

    public void X(CharSequence charSequence) {
        this.f53117f.M(charSequence);
    }

    public void Y(@s0 int i10) {
        this.f53117f.N(i10);
    }

    public void Z(int i10) {
        b0(i10);
        a0(i10);
    }

    @Override // com.google.android.material.internal.z.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void a0(@t0 int i10) {
        this.f53117f.O(i10);
        o0();
    }

    public void b0(@t0 int i10) {
        this.f53117f.P(i10);
        o0();
    }

    public void c() {
        if (B()) {
            this.f53117f.a();
            J();
        }
    }

    public void c0(int i10) {
        if (this.f53117f.r() != i10) {
            this.f53117f.Q(i10);
            I();
        }
    }

    public void d0(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f53117f.s() != iMax) {
            this.f53117f.R(iMax);
            J();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f53114c.draw(canvas);
        if (B()) {
            g(canvas);
        }
    }

    public void e0(@e1 int i10) {
        this.f53117f.T(i10);
        G();
    }

    public void f0(int i10) {
        h0(i10);
        g0(i10);
    }

    public void g0(@t0 int i10) {
        this.f53117f.U(i10);
        o0();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53117f.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53116e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53116e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    int h() {
        return this.f53117f.c();
    }

    public void h0(@t0 int i10) {
        this.f53117f.V(i10);
        o0();
    }

    @t0
    int i() {
        return this.f53117f.d();
    }

    public void i0(boolean z10) {
        this.f53117f.W(z10);
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @l
    public int j() {
        return this.f53114c.y().getDefaultColor();
    }

    public int k() {
        return this.f53117f.g();
    }

    @n0
    public Locale l() {
        return this.f53117f.t();
    }

    public void l0(@n0 View view) {
        n0(view, null);
    }

    @Deprecated
    public void m0(@n0 View view, @p0 ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        n0(view, (FrameLayout) viewGroup);
    }

    @l
    public int n() {
        return this.f53115d.e().getColor();
    }

    public void n0(@n0 View view, @p0 FrameLayout frameLayout) {
        this.f53124m = new WeakReference<>(view);
        boolean z10 = com.google.android.material.badge.b.f53129a;
        if (z10 && frameLayout == null) {
            j0(view);
        } else {
            this.f53125n = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            k0(view);
        }
        o0();
        invalidateSelf();
    }

    @p0
    public CharSequence o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!B()) {
            return this.f53117f.n();
        }
        if (this.f53117f.o() == 0 || (context = this.f53113b.get()) == null) {
            return null;
        }
        return u() <= this.f53120i ? context.getResources().getQuantityString(this.f53117f.o(), u(), Integer.valueOf(u())) : context.getString(this.f53117f.m(), Integer.valueOf(this.f53120i));
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.z.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @p0
    public FrameLayout p() {
        WeakReference<FrameLayout> weakReference = this.f53125n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int q() {
        return this.f53117f.q();
    }

    @t0
    public int r() {
        return this.f53117f.p();
    }

    @t0
    public int s() {
        return this.f53117f.q();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f53117f.D(i10);
        C();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int t() {
        return this.f53117f.r();
    }

    public int u() {
        if (B()) {
            return this.f53117f.s();
        }
        return 0;
    }

    @n0
    BadgeState.State v() {
        return this.f53117f.u();
    }

    public int y() {
        return this.f53117f.x();
    }

    @t0
    public int z() {
        return this.f53117f.w();
    }
}
