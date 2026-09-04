package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.core.graphics.f0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;

/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f54271q = 1.3333f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Paint f54273b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @r
    float f54279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    private int f54280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    private int f54281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l
    private int f54282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l
    private int f54283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    private int f54284m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p f54286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private ColorStateList f54287p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f54272a = q.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f54274c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f54275d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f54276e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f54277f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f54278g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f54285n = true;

    /* JADX INFO: compiled from: BorderDrawable.java */
    public class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(p pVar) {
        this.f54286o = pVar;
        Paint paint = new Paint(1);
        this.f54273b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @n0
    private Shader a() {
        Rect rect = this.f54275d;
        copyBounds(rect);
        float fHeight = this.f54279h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{f0.t(this.f54280i, this.f54284m), f0.t(this.f54281j, this.f54284m), f0.t(f0.B(this.f54281j, 0), this.f54284m), f0.t(f0.B(this.f54283l, 0), this.f54284m), f0.t(this.f54283l, this.f54284m), f0.t(this.f54282k, this.f54284m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @n0
    protected RectF b() {
        this.f54277f.set(getBounds());
        return this.f54277f;
    }

    public p c() {
        return this.f54286o;
    }

    void d(@p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f54284m = colorStateList.getColorForState(getState(), this.f54284m);
        }
        this.f54287p = colorStateList;
        this.f54285n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        if (this.f54285n) {
            this.f54273b.setShader(a());
            this.f54285n = false;
        }
        float strokeWidth = this.f54273b.getStrokeWidth() / 2.0f;
        copyBounds(this.f54275d);
        this.f54276e.set(this.f54275d);
        float fMin = Math.min(this.f54286o.r().a(b()), this.f54276e.width() / 2.0f);
        if (this.f54286o.u(b())) {
            this.f54276e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f54276e, fMin, fMin, this.f54273b);
        }
    }

    public void e(@r float f10) {
        if (this.f54279h != f10) {
            this.f54279h = f10;
            this.f54273b.setStrokeWidth(f10 * f54271q);
            this.f54285n = true;
            invalidateSelf();
        }
    }

    void f(@l int i10, @l int i11, @l int i12, @l int i13) {
        this.f54280i = i10;
        this.f54281j = i11;
        this.f54282k = i12;
        this.f54283l = i13;
    }

    public void g(p pVar) {
        this.f54286o = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f54278g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f54279h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@n0 Outline outline) {
        if (this.f54286o.u(b())) {
            outline.setRoundRect(getBounds(), this.f54286o.r().a(b()));
        } else {
            copyBounds(this.f54275d);
            this.f54276e.set(this.f54275d);
            this.f54272a.d(this.f54286o, 1.0f, this.f54276e, this.f54274c);
            e9.a.h(outline, this.f54274c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        if (!this.f54286o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f54279h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f54287p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f54285n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f54287p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f54284m)) != this.f54284m) {
            this.f54285n = true;
            this.f54284m = colorForState;
        }
        if (this.f54285n) {
            invalidateSelf();
        }
        return this.f54285n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@androidx.annotation.f0(from = 0, to = 255) int i10) {
        this.f54273b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f54273b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
