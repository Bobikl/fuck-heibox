package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.util.o;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Drawable implements Animatable {
    private static final float A = 0.20999998f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27561j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f27562k = 11.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f27563l = 3.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f27564m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27565n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f27566o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f27567p = 7.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f27568q = 2.5f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f27569r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f27570s = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f27572u = 0.75f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f27573v = 0.5f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f27574w = 1332;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f27575x = 216.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f27576y = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f27577z = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f27578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Resources f27580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f27581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f27582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f27583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f27559h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Interpolator f27560i = new androidx.interpolator.view.animation.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f27571t = {j1.f21601t};

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    public class C0219a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f27584b;

        C0219a(d dVar) {
            this.f27584b = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.G(fFloatValue, this.f27584b);
            a.this.d(fFloatValue, this.f27584b, false);
            a.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f27586b;

        b(d dVar) {
            this.f27586b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            a.this.d(1.0f, this.f27586b, true);
            this.f27586b.M();
            this.f27586b.v();
            a aVar = a.this;
            if (!aVar.f27583g) {
                aVar.f27582f += 1.0f;
                return;
            }
            aVar.f27583g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f27586b.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27582f = 0.0f;
        }
    }

    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f27588a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f27589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f27590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f27591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f27592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f27593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f27594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f27595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f27596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f27597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f27598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f27599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f27600m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f27601n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f27602o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f27603p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f27604q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f27605r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f27606s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f27607t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27608u;

        d() {
            Paint paint = new Paint();
            this.f27589b = paint;
            Paint paint2 = new Paint();
            this.f27590c = paint2;
            Paint paint3 = new Paint();
            this.f27591d = paint3;
            this.f27592e = 0.0f;
            this.f27593f = 0.0f;
            this.f27594g = 0.0f;
            this.f27595h = 5.0f;
            this.f27603p = 1.0f;
            this.f27607t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A(int i10) {
            this.f27591d.setColor(i10);
        }

        void B(float f10) {
            this.f27604q = f10;
        }

        void C(int i10) {
            this.f27608u = i10;
        }

        void D(ColorFilter colorFilter) {
            this.f27589b.setColorFilter(colorFilter);
        }

        void E(int i10) {
            this.f27597j = i10;
            this.f27608u = this.f27596i[i10];
        }

        void F(@n0 int[] iArr) {
            this.f27596i = iArr;
            E(0);
        }

        void G(float f10) {
            this.f27593f = f10;
        }

        void H(float f10) {
            this.f27594g = f10;
        }

        void I(boolean z10) {
            if (this.f27601n != z10) {
                this.f27601n = z10;
            }
        }

        void J(float f10) {
            this.f27592e = f10;
        }

        void K(Paint.Cap cap) {
            this.f27589b.setStrokeCap(cap);
        }

        void L(float f10) {
            this.f27595h = f10;
            this.f27589b.setStrokeWidth(f10);
        }

        void M() {
            this.f27598k = this.f27592e;
            this.f27599l = this.f27593f;
            this.f27600m = this.f27594g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f27588a;
            float f10 = this.f27604q;
            float fMin = (this.f27595h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f27605r * this.f27603p) / 2.0f, this.f27595h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f27592e;
            float f12 = this.f27594g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f27593f + f12) * 360.0f) - f13;
            this.f27589b.setColor(this.f27608u);
            this.f27589b.setAlpha(this.f27607t);
            float f15 = this.f27595h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f27591d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f27589b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f27601n) {
                Path path = this.f27602o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f27602o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f27605r * this.f27603p) / 2.0f;
                this.f27602o.moveTo(0.0f, 0.0f);
                this.f27602o.lineTo(this.f27605r * this.f27603p, 0.0f);
                Path path3 = this.f27602o;
                float f13 = this.f27605r;
                float f14 = this.f27603p;
                path3.lineTo((f13 * f14) / 2.0f, this.f27606s * f14);
                this.f27602o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f27595h / 2.0f));
                this.f27602o.close();
                this.f27590c.setColor(this.f27608u);
                this.f27590c.setAlpha(this.f27607t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f27602o, this.f27590c);
                canvas.restore();
            }
        }

        int c() {
            return this.f27607t;
        }

        float d() {
            return this.f27606s;
        }

        float e() {
            return this.f27603p;
        }

        float f() {
            return this.f27605r;
        }

        int g() {
            return this.f27591d.getColor();
        }

        float h() {
            return this.f27604q;
        }

        int[] i() {
            return this.f27596i;
        }

        float j() {
            return this.f27593f;
        }

        int k() {
            return this.f27596i[l()];
        }

        int l() {
            return (this.f27597j + 1) % this.f27596i.length;
        }

        float m() {
            return this.f27594g;
        }

        boolean n() {
            return this.f27601n;
        }

        float o() {
            return this.f27592e;
        }

        int p() {
            return this.f27596i[this.f27597j];
        }

        float q() {
            return this.f27599l;
        }

        float r() {
            return this.f27600m;
        }

        float s() {
            return this.f27598k;
        }

        Paint.Cap t() {
            return this.f27589b.getStrokeCap();
        }

        float u() {
            return this.f27595h;
        }

        void v() {
            E(l());
        }

        void w() {
            this.f27598k = 0.0f;
            this.f27599l = 0.0f;
            this.f27600m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        void x(int i10) {
            this.f27607t = i10;
        }

        void y(float f10, float f11) {
            this.f27605r = (int) f10;
            this.f27606s = (int) f11;
        }

        void z(float f10) {
            if (f10 != this.f27603p) {
                this.f27603p = f10;
            }
        }
    }

    public a(@n0 Context context) {
        this.f27580d = ((Context) o.l(context)).getResources();
        d dVar = new d();
        this.f27578b = dVar;
        dVar.F(f27571t);
        D(f27568q);
        F();
    }

    private void A(float f10, float f11, float f12, float f13) {
        d dVar = this.f27578b;
        float f14 = this.f27580d.getDisplayMetrics().density;
        dVar.L(f11 * f14);
        dVar.B(f10 * f14);
        dVar.E(0);
        dVar.y(f12 * f14, f13 * f14);
    }

    private void F() {
        d dVar = this.f27578b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0219a(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f27559h);
        valueAnimatorOfFloat.addListener(new b(dVar));
        this.f27581e = valueAnimatorOfFloat;
    }

    private void a(float f10, d dVar) {
        G(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.r() / f27576y) + 1.0d);
        dVar.J(dVar.s() + (((dVar.q() - 0.01f) - dVar.s()) * f10));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((fFloor - dVar.r()) * f10));
    }

    private int e(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private float o() {
        return this.f27579c;
    }

    private void z(float f10) {
        this.f27579c = f10;
    }

    public void B(float f10, float f11) {
        this.f27578b.J(f10);
        this.f27578b.G(f11);
        invalidateSelf();
    }

    public void C(@n0 Paint.Cap cap) {
        this.f27578b.K(cap);
        invalidateSelf();
    }

    public void D(float f10) {
        this.f27578b.L(f10);
        invalidateSelf();
    }

    public void E(int i10) {
        if (i10 == 0) {
            A(f27562k, f27563l, 12.0f, 6.0f);
        } else {
            A(f27567p, f27568q, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void G(float f10, d dVar) {
        if (f10 > 0.75f) {
            dVar.C(e((f10 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    void d(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f27583g) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fR = dVar.r();
            if (f10 < 0.5f) {
                interpolation = dVar.s();
                interpolation2 = (f27560i.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fS = dVar.s() + 0.79f;
                interpolation = fS - (((1.0f - f27560i.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fS;
            }
            float f11 = fR + (A * f10);
            float f12 = (f10 + this.f27582f) * f27575x;
            dVar.J(interpolation);
            dVar.G(interpolation2);
            dVar.H(f11);
            z(f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f27579c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f27578b.a(canvas, bounds);
        canvas.restore();
    }

    public boolean f() {
        return this.f27578b.n();
    }

    public float g() {
        return this.f27578b.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27578b.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f27578b.e();
    }

    public float i() {
        return this.f27578b.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f27581e.isRunning();
    }

    public int j() {
        return this.f27578b.g();
    }

    public float k() {
        return this.f27578b.h();
    }

    @n0
    public int[] l() {
        return this.f27578b.i();
    }

    public float m() {
        return this.f27578b.j();
    }

    public float n() {
        return this.f27578b.m();
    }

    public float p() {
        return this.f27578b.o();
    }

    @n0
    public Paint.Cap q() {
        return this.f27578b.t();
    }

    public float r() {
        return this.f27578b.u();
    }

    public void s(float f10, float f11) {
        this.f27578b.y(f10, f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27578b.x(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27578b.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f27581e.cancel();
        this.f27578b.M();
        if (this.f27578b.j() != this.f27578b.o()) {
            this.f27583g = true;
            this.f27581e.setDuration(666L);
            this.f27581e.start();
        } else {
            this.f27578b.E(0);
            this.f27578b.w();
            this.f27581e.setDuration(1332L);
            this.f27581e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f27581e.cancel();
        z(0.0f);
        this.f27578b.I(false);
        this.f27578b.E(0);
        this.f27578b.w();
        invalidateSelf();
    }

    public void t(boolean z10) {
        this.f27578b.I(z10);
        invalidateSelf();
    }

    public void u(float f10) {
        this.f27578b.z(f10);
        invalidateSelf();
    }

    public void v(int i10) {
        this.f27578b.A(i10);
        invalidateSelf();
    }

    public void w(float f10) {
        this.f27578b.B(f10);
        invalidateSelf();
    }

    public void x(@n0 int... iArr) {
        this.f27578b.F(iArr);
        this.f27578b.E(0);
        invalidateSelf();
    }

    public void y(float f10) {
        this.f27578b.H(f10);
        invalidateSelf();
    }
}
