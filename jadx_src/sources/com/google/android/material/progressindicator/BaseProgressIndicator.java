package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;
import com.google.android.material.progressindicator.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseProgressIndicator<S extends com.google.android.material.progressindicator.b> extends ProgressBar {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f54703p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f54704q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f54705r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f54706s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f54707t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f54708u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f54709v = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final float f54710w = 0.2f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f54711x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f54712y = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    S f54713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f54717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f54718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.google.android.material.progressindicator.a f54720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f54723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f54724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f54725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f54726o;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.l();
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.k();
            BaseProgressIndicator.this.f54719h = -1L;
        }
    }

    public class c extends androidx.vectordrawable.graphics.drawable.b.a {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f54714c, BaseProgressIndicator.this.f54715d);
        }
    }

    public class d extends androidx.vectordrawable.graphics.drawable.b.a {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            if (BaseProgressIndicator.this.f54721j) {
                return;
            }
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setVisibility(baseProgressIndicator.f54722k);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    protected BaseProgressIndicator(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        super(j9.a.c(context, attributeSet, i10, f54709v), attributeSet, i10);
        this.f54719h = -1L;
        this.f54721j = false;
        this.f54722k = 4;
        this.f54723l = new a();
        this.f54724m = new b();
        this.f54725n = new c();
        this.f54726o = new d();
        Context context2 = getContext();
        this.f54713b = (S) i(context2, attributeSet);
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52878u, i10, i11, new int[0]);
        this.f54717f = typedArrayK.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f54718g = Math.min(typedArrayK.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayK.recycle();
        this.f54720i = new com.google.android.material.progressindicator.a();
        this.f54716e = true;
    }

    @p0
    private g<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ((com.google.android.material.progressindicator.f) getCurrentDrawable()).v(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f54718g > 0) {
            this.f54719h = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean n() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void o() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().d(this.f54725n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.f54726o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.f54726o);
        }
    }

    private void q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.f54726o);
            getIndeterminateDrawable().z().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.f54726o);
        }
    }

    @Override // android.widget.ProgressBar
    @p0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f54713b.f54745f;
    }

    @Override // android.widget.ProgressBar
    @p0
    public i<S> getIndeterminateDrawable() {
        return (i) super.getIndeterminateDrawable();
    }

    @n0
    public int[] getIndicatorColor() {
        return this.f54713b.f54742c;
    }

    @Override // android.widget.ProgressBar
    @p0
    public com.google.android.material.progressindicator.e<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.e) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f54713b.f54744e;
    }

    @androidx.annotation.l
    public int getTrackColor() {
        return this.f54713b.f54743d;
    }

    @t0
    public int getTrackCornerRadius() {
        return this.f54713b.f54741b;
    }

    @t0
    public int getTrackThickness() {
        return this.f54713b.f54740a;
    }

    protected void h(boolean z10) {
        if (this.f54716e) {
            ((com.google.android.material.progressindicator.f) getCurrentDrawable()).v(r(), false, z10);
        }
    }

    abstract S i(@n0 Context context, @n0 AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f54723l);
            return;
        }
        removeCallbacks(this.f54724m);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f54719h;
        int i10 = this.f54718g;
        if (jUptimeMillis >= ((long) i10)) {
            this.f54724m.run();
        } else {
            postDelayed(this.f54724m, ((long) i10) - jUptimeMillis);
        }
    }

    boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (r()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f54724m);
        removeCallbacks(this.f54723l);
        ((com.google.android.material.progressindicator.f) getCurrentDrawable()).l();
        q();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@n0 Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        g<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@n0 View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    public void p() {
        if (this.f54717f <= 0) {
            this.f54723l.run();
        } else {
            removeCallbacks(this.f54723l);
            postDelayed(this.f54723l, this.f54717f);
        }
    }

    boolean r() {
        return j1.O0(this) && getWindowVisibility() == 0 && m();
    }

    @androidx.annotation.j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@n0 com.google.android.material.progressindicator.a aVar) {
        this.f54720i = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f54787d = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f54787d = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f54713b.f54745f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        com.google.android.material.progressindicator.f fVar = (com.google.android.material.progressindicator.f) getCurrentDrawable();
        if (fVar != null) {
            fVar.l();
        }
        super.setIndeterminate(z10);
        com.google.android.material.progressindicator.f fVar2 = (com.google.android.material.progressindicator.f) getCurrentDrawable();
        if (fVar2 != null) {
            fVar2.v(r(), false, false);
        }
        if ((fVar2 instanceof i) && r()) {
            ((i) fVar2).z().g();
        }
        this.f54721j = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@p0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof i)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((com.google.android.material.progressindicator.f) drawable).l();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@androidx.annotation.l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{m.b(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f54713b.f54742c = iArr;
        getIndeterminateDrawable().z().c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i10, false);
    }

    public void setProgressCompat(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f54714c = i10;
            this.f54715d = z10;
            this.f54721j = true;
            if (!getIndeterminateDrawable().isVisible() || this.f54720i.a(getContext().getContentResolver()) == 0.0f) {
                this.f54725n.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().z().f();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@p0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.e)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            com.google.android.material.progressindicator.e eVar = (com.google.android.material.progressindicator.e) drawable;
            eVar.l();
            super.setProgressDrawable(eVar);
            eVar.H(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f54713b.f54744e = i10;
        invalidate();
    }

    public void setTrackColor(@androidx.annotation.l int i10) {
        S s10 = this.f54713b;
        if (s10.f54743d != i10) {
            s10.f54743d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@t0 int i10) {
        S s10 = this.f54713b;
        if (s10.f54741b != i10) {
            s10.f54741b = Math.min(i10, s10.f54740a / 2);
        }
    }

    public void setTrackThickness(@t0 int i10) {
        S s10 = this.f54713b;
        if (s10.f54740a != i10) {
            s10.f54740a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f54722k = i10;
    }
}
