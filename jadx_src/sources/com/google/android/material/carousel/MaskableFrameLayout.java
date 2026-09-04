package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import com.google.android.material.shape.t;

/* JADX INFO: loaded from: classes7.dex */
public class MaskableFrameLayout extends FrameLayout implements com.google.android.material.carousel.e, t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f53475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f53476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private j f53477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private p f53478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f53479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Boolean f53480g;

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f53481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        p f53482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RectF f53483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Path f53484d;

        private b() {
            this.f53481a = false;
            this.f53483c = new RectF();
            this.f53484d = new Path();
        }

        private void h() {
            if (this.f53483c.isEmpty() || this.f53482b == null) {
                return;
            }
            q.k().d(this.f53482b, 1.0f, this.f53483c, this.f53484d);
        }

        abstract void a(View view);

        boolean b() {
            return this.f53481a;
        }

        void c(Canvas canvas, c9.a.InterfaceC0267a interfaceC0267a) {
            if (!g() || this.f53484d.isEmpty()) {
                interfaceC0267a.a(canvas);
                return;
            }
            canvas.save();
            canvas.clipPath(this.f53484d);
            interfaceC0267a.a(canvas);
            canvas.restore();
        }

        void d(View view, RectF rectF) {
            this.f53483c = rectF;
            h();
            a(view);
        }

        void e(View view, @n0 p pVar) {
            this.f53482b = pVar;
            h();
            a(view);
        }

        void f(View view, boolean z10) {
            if (z10 != this.f53481a) {
                this.f53481a = z10;
                a(view);
            }
        }

        abstract boolean g();
    }

    public static class c extends b {
        private c() {
            super();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        void a(View view) {
            if (this.f53482b == null || this.f53483c.isEmpty() || !g()) {
                return;
            }
            view.invalidate();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        boolean g() {
            return true;
        }
    }

    @w0(22)
    public static class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f53485e;

        public class a extends ViewOutlineProvider {
            a() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                d dVar = d.this;
                if (dVar.f53482b == null || dVar.f53483c.isEmpty()) {
                    return;
                }
                d dVar2 = d.this;
                RectF rectF = dVar2.f53483c;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, dVar2.j(dVar2.f53482b, rectF));
            }
        }

        d(View view) {
            super();
            this.f53485e = false;
            k(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j(@n0 p pVar, @n0 RectF rectF) {
            return pVar.t().a(rectF);
        }

        @u
        private void k(View view) {
            view.setOutlineProvider(new a());
        }

        private void l() {
            p pVar;
            if (this.f53483c.isEmpty() || (pVar = this.f53482b) == null) {
                return;
            }
            this.f53485e = pVar.u(this.f53483c);
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        void a(View view) {
            l();
            view.setClipToOutline(!g());
            if (g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        public boolean g() {
            return !this.f53485e || this.f53481a;
        }
    }

    @w0(33)
    public static class e extends b {

        public class a extends ViewOutlineProvider {
            a() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (e.this.f53484d.isEmpty()) {
                    return;
                }
                outline.setPath(e.this.f53484d);
            }
        }

        e(View view) {
            super();
            i(view);
        }

        @u
        private void i(View view) {
            view.setOutlineProvider(new a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        void a(View view) {
            view.setClipToOutline(!g());
            if (g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.b
        public boolean g() {
            return this.f53481a;
        }
    }

    public MaskableFrameLayout(@n0 Context context) {
        this(context, null);
    }

    public MaskableFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53475b = 0.0f;
        this.f53476c = new RectF();
        this.f53479f = c();
        this.f53480g = null;
        setShapeAppearanceModel(p.f(context, attributeSet, i10, 0, 0).m());
    }

    private b c() {
        return Build.VERSION.SDK_INT >= 33 ? new e(this) : new d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.material.shape.e e(com.google.android.material.shape.e eVar) {
        return eVar instanceof com.google.android.material.shape.a ? com.google.android.material.shape.c.b((com.google.android.material.shape.a) eVar) : eVar;
    }

    private void f() {
        if (getWidth() == 0) {
            return;
        }
        float fB = com.google.android.material.animation.b.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f53475b);
        this.f53476c.set(fB, 0.0f, getWidth() - fB, getHeight());
        this.f53479f.d(this, this.f53476c);
        j jVar = this.f53477d;
        if (jVar != null) {
            jVar.a(this.f53476c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f53479f.c(canvas, new c9.a.InterfaceC0267a() { // from class: com.google.android.material.carousel.f
            @Override // c9.a.InterfaceC0267a
            public final void a(Canvas canvas2) {
                this.f53513a.d(canvas2);
            }
        });
    }

    @Override // com.google.android.material.carousel.e
    @n0
    public RectF getMaskRectF() {
        return this.f53476c;
    }

    @Override // com.google.android.material.carousel.e
    public float getMaskXPercentage() {
        return this.f53475b;
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return this.f53478e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f53480g;
        if (bool != null) {
            this.f53479f.f(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f53480g = Boolean.valueOf(this.f53479f.b());
        this.f53479f.f(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f53476c.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f53476c.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceCompatClipping(boolean z10) {
        this.f53479f.f(this, z10);
    }

    @Override // com.google.android.material.carousel.e
    public void setMaskXPercentage(float f10) {
        float fD = a2.a.d(f10, 0.0f, 1.0f);
        if (this.f53475b != fD) {
            this.f53475b = fD;
            f();
        }
    }

    @Override // com.google.android.material.carousel.e
    public void setOnMaskChangedListener(@p0 j jVar) {
        this.f53477d = jVar;
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        p pVarY = pVar.y(new p.c() { // from class: com.google.android.material.carousel.g
            @Override // com.google.android.material.shape.p.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                return MaskableFrameLayout.e(eVar);
            }
        });
        this.f53478e = pVarY;
        this.f53479f.e(this, pVarY);
    }
}
