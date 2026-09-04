package com.previewlibrary.wight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import com.previewlibrary.R;

/* JADX INFO: loaded from: classes6.dex */
public class BezierBannerView extends View implements ViewPager.i {
    public static int M = 1;
    public static int N = 2;
    private static final String O = BezierBannerView.class.getName();
    private int A;
    private int B;
    private int C;
    private int D;
    float E;
    float F;
    float G;
    float H;
    float I;
    float J;
    private int K;
    Interpolator L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f96358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f96359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Path f96360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f96361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f96364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f96365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f96366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f96367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f96368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f96369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f96370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f96371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f96372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f96373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f96374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f96375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f96376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f96377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f96378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f96379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f96380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f96381y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f96382z;

    public BezierBannerView(Context context) {
        this(context, null);
    }

    public BezierBannerView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierBannerView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f96360d = new Path();
        this.f96361e = new Path();
        this.f96364h = 80.0f;
        this.f96365i = 30.0f;
        this.f96367k = 20.0f;
        this.f96379w = false;
        this.f96380x = 0.0f;
        this.f96381y = 0.0f;
        this.A = 0;
        this.C = 1;
        this.D = 2;
        this.L = new AccelerateDecelerateInterpolator();
        h(attributeSet);
        g();
    }

    private float c(int i10) {
        if (i10 == 0) {
            return this.f96365i;
        }
        float f10 = this.f96364h;
        float f11 = this.f96367k;
        return (i10 * (f10 + (2.0f * f11))) + f11 + (this.f96365i - f11);
    }

    private void g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f96362f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f96358b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f96363g);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f96359c = paint2;
    }

    private void h(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f96320p);
        this.f96362f = typedArrayObtainStyledAttributes.getColor(R.styleable.BezierBannerView_selectedColor, -1);
        this.f96363g = typedArrayObtainStyledAttributes.getColor(R.styleable.BezierBannerView_unSelectedColor, -5592406);
        this.f96365i = typedArrayObtainStyledAttributes.getDimension(R.styleable.BezierBannerView_selectedRaduis, this.f96365i);
        this.f96367k = typedArrayObtainStyledAttributes.getDimension(R.styleable.BezierBannerView_unSelectedRaduis, this.f96367k);
        this.f96364h = typedArrayObtainStyledAttributes.getDimension(R.styleable.BezierBannerView_spacing, this.f96364h);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void i() {
        this.f96360d.reset();
        this.f96361e.reset();
        float interpolation = this.L.getInterpolation(this.f96382z);
        this.f96371o = e(c(this.A), c(this.A + 1) - this.f96365i, this.D);
        float f10 = this.f96365i;
        this.f96372p = f10;
        this.f96366j = d(f10, 0.0f, interpolation);
        double radians = Math.toRadians(e(45.0f, 0.0f, this.C));
        float fSin = (float) (Math.sin(radians) * ((double) this.f96366j));
        float fCos = (float) (Math.cos(radians) * ((double) this.f96366j));
        this.f96373q = e(c(this.A) + this.f96365i, c(this.A + 1), this.C);
        float f11 = this.f96365i;
        this.f96374r = f11;
        this.f96369m = d(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(e(0.0f, 45.0f, this.D));
        float fSin2 = (float) (Math.sin(radians2) * ((double) this.f96369m));
        float fCos2 = (float) (Math.cos(radians2) * ((double) this.f96369m));
        this.G = this.f96371o + fSin;
        this.H = this.f96372p - fCos;
        this.I = this.f96373q - fSin2;
        this.J = this.f96365i - fCos2;
        this.E = f(c(this.A) + this.f96365i, c(this.A + 1) - this.f96365i);
        this.F = this.f96365i;
        this.f96360d.moveTo(this.G, this.H);
        this.f96360d.quadTo(this.E, this.F, this.I, this.J);
        this.f96360d.lineTo(this.I, this.f96365i + fCos2);
        this.f96360d.quadTo(this.E, this.f96365i, this.G, this.H + (fCos * 2.0f));
        this.f96360d.lineTo(this.G, this.H);
        this.f96377u = e(c(this.A + 1), c(this.A) + this.f96367k, this.D);
        this.f96378v = this.f96365i;
        this.f96368l = d(this.f96367k, 0.0f, interpolation);
        double radians3 = Math.toRadians(e(45.0f, 0.0f, this.C));
        float fSin3 = (float) (Math.sin(radians3) * ((double) this.f96368l));
        float fCos3 = (float) (Math.cos(radians3) * ((double) this.f96368l));
        this.f96375s = e(c(this.A + 1) - this.f96367k, c(this.A), this.C);
        this.f96376t = this.f96365i;
        this.f96370n = d(0.0f, this.f96367k, interpolation);
        double radians4 = Math.toRadians(e(0.0f, 45.0f, this.D));
        float fSin4 = (float) (Math.sin(radians4) * ((double) this.f96370n));
        float fCos4 = (float) (Math.cos(radians4) * ((double) this.f96370n));
        float f12 = this.f96377u - fSin3;
        float f13 = this.f96378v - fCos3;
        float f14 = this.f96375s + fSin4;
        float f15 = this.f96376t - fCos4;
        float f16 = f(c(this.A + 1) - this.f96367k, c(this.A) + this.f96367k);
        float f17 = this.f96365i;
        this.f96361e.moveTo(f12, f13);
        this.f96361e.quadTo(f16, f17, f14, f15);
        this.f96361e.lineTo(f14, this.f96365i + fCos4);
        this.f96361e.quadTo(f16, f17, f12, (fCos3 * 2.0f) + f13);
        this.f96361e.lineTo(f12, f13);
    }

    private void j() {
        this.f96360d.reset();
        this.f96361e.reset();
        float interpolation = this.L.getInterpolation(this.f96382z);
        this.f96371o = e(c(this.A), c(this.A - 1) + this.f96365i, this.D);
        float f10 = this.f96365i;
        this.f96372p = f10;
        this.f96366j = d(f10, 0.0f, interpolation);
        double radians = Math.toRadians(e(45.0f, 0.0f, this.C));
        float fSin = (float) (Math.sin(radians) * ((double) this.f96366j));
        float fCos = (float) (Math.cos(radians) * ((double) this.f96366j));
        this.f96373q = e(c(this.A) - this.f96365i, c(this.A - 1), this.C);
        float f11 = this.f96365i;
        this.f96374r = f11;
        this.f96369m = d(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(e(0.0f, 45.0f, this.D));
        float fSin2 = (float) (Math.sin(radians2) * ((double) this.f96369m));
        float fCos2 = (float) (Math.cos(radians2) * ((double) this.f96369m));
        this.G = this.f96371o - fSin;
        this.H = this.f96372p - fCos;
        this.I = this.f96373q + fSin2;
        this.J = this.f96365i - fCos2;
        this.E = f(c(this.A) - this.f96365i, c(this.A - 1) + this.f96365i);
        this.F = this.f96365i;
        this.f96360d.moveTo(this.G, this.H);
        this.f96360d.quadTo(this.E, this.F, this.I, this.J);
        this.f96360d.lineTo(this.I, this.f96365i + fCos2);
        this.f96360d.quadTo(this.E, this.f96365i, this.G, this.H + (fCos * 2.0f));
        this.f96360d.lineTo(this.G, this.H);
        this.f96377u = e(c(this.A - 1), c(this.A) - this.f96367k, this.D);
        this.f96378v = this.f96365i;
        this.f96368l = d(this.f96367k, 0.0f, interpolation);
        double radians3 = Math.toRadians(e(45.0f, 0.0f, this.C));
        float fSin3 = (float) (Math.sin(radians3) * ((double) this.f96368l));
        float fCos3 = (float) (Math.cos(radians3) * ((double) this.f96368l));
        this.f96375s = e(c(this.A - 1) + this.f96367k, c(this.A), this.C);
        this.f96376t = this.f96365i;
        this.f96370n = d(0.0f, this.f96367k, interpolation);
        double radians4 = Math.toRadians(e(0.0f, 45.0f, this.D));
        float fSin4 = (float) (Math.sin(radians4) * ((double) this.f96370n));
        float fCos4 = (float) (Math.cos(radians4) * ((double) this.f96370n));
        float f12 = this.f96377u + fSin3;
        float f13 = this.f96378v - fCos3;
        float f14 = this.f96375s - fSin4;
        float f15 = this.f96376t - fCos4;
        float f16 = f(c(this.A - 1) + this.f96367k, c(this.A) - this.f96367k);
        float f17 = this.f96365i;
        this.f96361e.moveTo(f12, f13);
        this.f96361e.quadTo(f16, f17, f14, f15);
        this.f96361e.lineTo(f14, this.f96365i + fCos4);
        this.f96361e.quadTo(f16, f17, f12, (fCos3 * 2.0f) + f13);
        this.f96361e.lineTo(f12, f13);
    }

    public void b(ViewPager viewPager) {
        viewPager.c(this);
        this.B = viewPager.getAdapter().getCount();
        this.A = viewPager.getCurrentItem();
        i();
        this.K = N;
        invalidate();
    }

    public float d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float e(float f10, float f11, int i10) {
        float f12;
        float f13;
        if (i10 == this.C) {
            f12 = f11 - f10;
            f13 = this.f96380x;
        } else {
            f12 = f11 - f10;
            f13 = this.f96381y;
        }
        return f10 + (f12 * f13);
    }

    public float f(float f10, float f11) {
        return f10 + ((f11 - f10) * this.f96382z);
    }

    public void k() {
        this.f96380x = 0.0f;
        this.f96381y = 0.0f;
        this.f96382z = 0.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i11 = 0; i11 < this.B; i11++) {
            int i12 = this.K;
            if (i12 == N) {
                int i13 = this.A;
                if (i11 != i13 && i11 != i13 + 1) {
                    canvas.drawCircle(c(i11), this.f96365i, this.f96367k, this.f96359c);
                }
            } else if (i12 == M && i11 != (i10 = this.A) && i11 != i10 - 1) {
                canvas.drawCircle(c(i11), this.f96365i, this.f96367k, this.f96359c);
            }
        }
        canvas.drawCircle(this.f96375s, this.f96376t, this.f96370n, this.f96359c);
        canvas.drawCircle(this.f96377u, this.f96378v, this.f96368l, this.f96359c);
        canvas.drawPath(this.f96361e, this.f96359c);
        canvas.drawCircle(this.f96373q, this.f96374r, this.f96369m, this.f96358b);
        canvas.drawCircle(this.f96371o, this.f96372p, this.f96366j, this.f96358b);
        canvas.drawPath(this.f96360d, this.f96358b);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f96367k;
        int i12 = this.B;
        int paddingLeft = (int) ((f10 * 2.0f * i12) + ((this.f96365i - f10) * 2.0f) + ((i12 - 1) * this.f96364h) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f96365i * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
        if (f10 == 0.0f) {
            this.A = i10;
            Log.d(O, "到达");
            k();
        }
        float f11 = i10 + f10;
        int i12 = this.A;
        if (f11 - i12 > 0.0f) {
            this.K = N;
            if (f11 <= i12 + 1) {
                setProgress(f10);
                return;
            } else {
                this.A = i10;
                Log.d(O, "向左快速滑动");
                return;
            }
        }
        if (f11 - i12 < 0.0f) {
            this.K = M;
            if (f11 >= i12 - 1) {
                setProgress(1.0f - f10);
            } else {
                this.A = i10;
                Log.d(O, "向右快速滑动");
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
    }

    public void setDirection(int i10) {
        this.K = i10;
    }

    public void setProgress(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        this.f96382z = f10;
        if (f10 <= 0.5d) {
            this.f96380x = f10 / 0.5f;
            this.f96381y = 0.0f;
        } else {
            this.f96381y = (f10 - 0.5f) / 0.5f;
            this.f96380x = 1.0f;
        }
        if (this.K == N) {
            i();
        } else {
            j();
        }
        invalidate();
    }
}
