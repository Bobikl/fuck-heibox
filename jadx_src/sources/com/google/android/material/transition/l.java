package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.j1;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.z;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: MaterialContainerTransform.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l extends Transition {
    public static final int S3 = 0;
    public static final int T3 = 1;
    public static final int U3 = 2;
    public static final int V3 = 0;
    public static final int W3 = 1;
    public static final int X3 = 2;
    public static final int Y3 = 3;
    public static final int Z3 = 0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f55922a4 = 1;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final int f55923b4 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final f f55929h4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final f f55931j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final float f55932k4 = -1.0f;
    private int G2;

    @p0
    private View G3;

    @p0
    private com.google.android.material.shape.p J3;

    @p0
    private com.google.android.material.shape.p K3;

    @p0
    private e L3;

    @p0
    private e M3;

    @p0
    private e N3;

    @p0
    private e O3;
    private boolean P3;
    private float Q3;
    private float R3;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @d0
    private int f55933a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @d0
    private int f55934b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @d0
    private int f55935c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.l
    private int f55936p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.l
    private int f55937p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @p0
    private View f55938p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @androidx.annotation.l
    private int f55939x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f55940x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @androidx.annotation.l
    private int f55941y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f55942y2;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f55924c4 = l.class.getSimpleName();

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f55925d4 = "materialContainerTransition:bounds";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f55926e4 = "materialContainerTransition:shapeAppearance";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String[] f55927f4 = {f55925d4, f55926e4};

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final f f55928g4 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final f f55930i4 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f55943b;

        a(h hVar) {
            this.f55943b = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f55943b.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public class b extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f55946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f55947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f55948e;

        b(View view, h hVar, View view2, View view3) {
            this.f55945b = view;
            this.f55946c = hVar;
            this.f55947d = view2;
            this.f55948e = view3;
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void b(@n0 Transition transition) {
            j0.m(this.f55945b).b(this.f55946c);
            this.f55947d.setAlpha(0.0f);
            this.f55948e.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void d(@n0 Transition transition) {
            l.this.n0(this);
            if (l.this.X) {
                return;
            }
            this.f55947d.setAlpha(1.0f);
            this.f55948e.setAlpha(1.0f);
            j0.m(this.f55945b).a(this.f55946c);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface d {
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        private final float f55950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        private final float f55951b;

        public e(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
            this.f55950a = f10;
            this.f55951b = f11;
        }

        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float c() {
            return this.f55951b;
        }

        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float d() {
            return this.f55950a;
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final e f55952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final e f55953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final e f55954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private final e f55955d;

        private f(@n0 e eVar, @n0 e eVar2, @n0 e eVar3, @n0 e eVar4) {
            this.f55952a = eVar;
            this.f55953b = eVar2;
            this.f55954c = eVar3;
            this.f55955d = eVar4;
        }

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface g {
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static final class h extends Drawable {
        private static final int M = 754974720;
        private static final int N = -7829368;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final f A;
        private final com.google.android.material.transition.a B;
        private final com.google.android.material.transition.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.c G;
        private com.google.android.material.transition.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f55956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f55957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.p f55958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f55960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f55961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.p f55962g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f55963h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f55964i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f55965j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f55966k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f55967l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f55968m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f55969n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f55970o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f55971p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f55972q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f55973r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f55974s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f55975t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f55976u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.k f55977v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f55978w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f55979x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f55980y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f55981z;

        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        public class a implements c9.a.InterfaceC0267a {
            a() {
            }

            @Override // c9.a.InterfaceC0267a
            public void a(Canvas canvas) {
                h.this.f55956a.draw(canvas);
            }
        }

        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        public class b implements c9.a.InterfaceC0267a {
            b() {
            }

            @Override // c9.a.InterfaceC0267a
            public void a(Canvas canvas) {
                h.this.f55960e.draw(canvas);
            }
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, @androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z12) {
            Paint paint = new Paint();
            this.f55964i = paint;
            Paint paint2 = new Paint();
            this.f55965j = paint2;
            Paint paint3 = new Paint();
            this.f55966k = paint3;
            this.f55967l = new Paint();
            Paint paint4 = new Paint();
            this.f55968m = paint4;
            this.f55969n = new j();
            this.f55972q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f55977v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f55956a = view;
            this.f55957b = rectF;
            this.f55958c = pVar;
            this.f55959d = f10;
            this.f55960e = view2;
            this.f55961f = rectF2;
            this.f55962g = pVar2;
            this.f55963h = f11;
            this.f55973r = z10;
            this.f55976u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f55974s = displayMetrics.widthPixels;
            this.f55975t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            kVar.o0(ColorStateList.valueOf(0));
            kVar.x0(2);
            kVar.u0(false);
            kVar.v0(N);
            RectF rectF3 = new RectF(rectF);
            this.f55978w = rectF3;
            this.f55979x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f55980y = rectF4;
            this.f55981z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.a(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f55970o = pathMeasure;
            this.f55971p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z12, a aVar2) {
            this(pathMotion, view, rectF, pVar, f10, view2, rectF2, pVar2, f11, i10, i11, i12, i13, z10, z11, aVar, fVar, fVar2, z12);
        }

        private static float d(RectF rectF, float f10) {
            return ((rectF.centerX() / (f10 / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float e(RectF rectF, float f10) {
            return (rectF.centerY() / f10) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.l int i10) {
            PointF pointFM = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(pointFM.x, pointFM.y);
            } else {
                path.lineTo(pointFM.x, pointFM.y);
                this.E.setColor(i10);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @androidx.annotation.l int i10) {
            this.E.setColor(i10);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f55969n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.k kVar = this.f55977v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f55977v.n0(this.J);
            this.f55977v.B0((int) this.K);
            this.f55977v.setShapeAppearanceModel(this.f55969n.c());
            this.f55977v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.p pVarC = this.f55969n.c();
            if (!pVarC.u(this.I)) {
                canvas.drawPath(this.f55969n.d(), this.f55967l);
            } else {
                float fA = pVarC.r().a(this.I);
                canvas.drawRoundRect(this.I, fA, fA, this.f55967l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f55966k);
            Rect bounds = getBounds();
            RectF rectF = this.f55980y;
            v.y(canvas, bounds, rectF.left, rectF.top, this.H.f55912b, this.G.f55890b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f55965j);
            Rect bounds = getBounds();
            RectF rectF = this.f55978w;
            v.y(canvas, bounds, rectF.left, rectF.top, this.H.f55911a, this.G.f55889a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f10) {
            if (this.L != f10) {
                p(f10);
            }
        }

        private void p(float f10) {
            float f11;
            float f12;
            this.L = f10;
            this.f55968m.setAlpha((int) (this.f55973r ? v.m(0.0f, 255.0f, f10) : v.m(255.0f, 0.0f, f10)));
            this.f55970o.getPosTan(this.f55971p * f10, this.f55972q, null);
            float[] fArr = this.f55972q;
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (f10 > 1.0f || f10 < 0.0f) {
                if (f10 > 1.0f) {
                    f11 = 0.99f;
                    f12 = (f10 - 1.0f) / 0.00999999f;
                } else {
                    f11 = 0.01f;
                    f12 = (f10 / 0.01f) * (-1.0f);
                }
                this.f55970o.getPosTan(this.f55971p * f11, fArr, null);
                float[] fArr2 = this.f55972q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            com.google.android.material.transition.h hVarA = this.C.a(f10, ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55953b.f55950a))).floatValue(), ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55953b.f55951b))).floatValue(), this.f55957b.width(), this.f55957b.height(), this.f55961f.width(), this.f55961f.height());
            this.H = hVarA;
            RectF rectF = this.f55978w;
            float f17 = hVarA.f55913c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, hVarA.f55914d + f16);
            RectF rectF2 = this.f55980y;
            com.google.android.material.transition.h hVar = this.H;
            float f18 = hVar.f55915e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f55916f + f16);
            this.f55979x.set(this.f55978w);
            this.f55981z.set(this.f55980y);
            float fFloatValue = ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55954c.f55950a))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55954c.f55951b))).floatValue();
            boolean zB = this.C.b(this.H);
            RectF rectF3 = zB ? this.f55979x : this.f55981z;
            float fN = v.n(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zB) {
                fN = 1.0f - fN;
            }
            this.C.c(rectF3, fN, this.H);
            this.I = new RectF(Math.min(this.f55979x.left, this.f55981z.left), Math.min(this.f55979x.top, this.f55981z.top), Math.max(this.f55979x.right, this.f55981z.right), Math.max(this.f55979x.bottom, this.f55981z.bottom));
            this.f55969n.b(f10, this.f55958c, this.f55962g, this.f55978w, this.f55979x, this.f55981z, this.A.f55955d);
            this.J = v.m(this.f55959d, this.f55963h, f10);
            float fD = d(this.I, this.f55974s);
            float fE = e(this.I, this.f55975t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f55967l.setShadowLayer(f19, (int) (fD * f19), f20, M);
            this.G = this.B.a(f10, ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55952a.f55950a))).floatValue(), ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f55952a.f55951b))).floatValue(), 0.35f);
            if (this.f55965j.getColor() != 0) {
                this.f55965j.setAlpha(this.G.f55889a);
            }
            if (this.f55966k.getColor() != 0) {
                this.f55966k.setAlpha(this.G.f55890b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@n0 Canvas canvas) {
            if (this.f55968m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f55968m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f55976u && this.J > 0.0f) {
                h(canvas);
            }
            this.f55969n.a(canvas);
            n(canvas, this.f55964i);
            if (this.G.f55891c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f55978w, this.F, -65281);
                g(canvas, this.f55979x, androidx.core.view.o.f21773u);
                g(canvas, this.f55978w, -16711936);
                g(canvas, this.f55981z, -16711681);
                g(canvas, this.f55980y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@p0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    static {
        a aVar = null;
        f55929h4 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        f55931j4 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f55933a0 = R.id.content;
        this.f55934b0 = -1;
        this.f55935c0 = -1;
        this.f55936p1 = 0;
        this.f55939x1 = 0;
        this.f55941y1 = 0;
        this.f55937p2 = 1375731712;
        this.f55940x2 = 0;
        this.f55942y2 = 0;
        this.G2 = 0;
        this.P3 = Build.VERSION.SDK_INT >= 28;
        this.Q3 = -1.0f;
        this.R3 = -1.0f;
    }

    public l(@n0 Context context, boolean z10) {
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f55933a0 = R.id.content;
        this.f55934b0 = -1;
        this.f55935c0 = -1;
        this.f55936p1 = 0;
        this.f55939x1 = 0;
        this.f55941y1 = 0;
        this.f55937p2 = 1375731712;
        this.f55940x2 = 0;
        this.f55942y2 = 0;
        this.G2 = 0;
        this.P3 = Build.VERSION.SDK_INT >= 28;
        this.Q3 = -1.0f;
        this.R3 = -1.0f;
        t1(context, z10);
        this.Z = true;
    }

    private f J0(boolean z10) {
        PathMotion pathMotionP = P();
        return ((pathMotionP instanceof ArcMotion) || (pathMotionP instanceof k)) ? m1(z10, f55930i4, f55931j4) : m1(z10, f55928g4, f55929h4);
    }

    private static RectF K0(View view, @p0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFH = v.h(view2);
        rectFH.offset(f10, f11);
        return rectFH;
    }

    private static com.google.android.material.shape.p L0(@n0 View view, @n0 RectF rectF, @p0 com.google.android.material.shape.p pVar) {
        return v.c(d1(view, pVar), rectF);
    }

    private static void M0(@n0 z zVar, @p0 View view, @d0 int i10, @p0 com.google.android.material.shape.p pVar) {
        if (i10 != -1) {
            zVar.f27974b = v.g(zVar.f27974b, i10);
        } else if (view != null) {
            zVar.f27974b = view;
        } else {
            View view2 = zVar.f27974b;
            int i11 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i11) instanceof View) {
                View view3 = (View) zVar.f27974b.getTag(i11);
                zVar.f27974b.setTag(i11, null);
                zVar.f27974b = view3;
            }
        }
        View view4 = zVar.f27974b;
        if (!j1.U0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF rectFI = view4.getParent() == null ? v.i(view4) : v.h(view4);
        zVar.f27973a.put(f55925d4, rectFI);
        zVar.f27973a.put(f55926e4, L0(view4, rectFI, pVar));
    }

    private static float P0(float f10, View view) {
        return f10 != -1.0f ? f10 : j1.R(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.p d1(@n0 View view, @p0 com.google.android.material.shape.p pVar) {
        if (pVar != null) {
            return pVar;
        }
        int i10 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i10) instanceof com.google.android.material.shape.p) {
            return (com.google.android.material.shape.p) view.getTag(i10);
        }
        Context context = view.getContext();
        int iO1 = o1(context);
        if (iO1 != -1) {
            return com.google.android.material.shape.p.b(context, iO1, 0).m();
        }
        return view instanceof com.google.android.material.shape.t ? ((com.google.android.material.shape.t) view).getShapeAppearanceModel() : com.google.android.material.shape.p.a().m();
    }

    private f m1(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        return new f((e) v.e(this.L3, fVar.f55952a), (e) v.e(this.M3, fVar.f55953b), (e) v.e(this.N3, fVar.f55954c), (e) v.e(this.O3, fVar.f55955d), null);
    }

    @e1
    private static int o1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean r1(@n0 RectF rectF, @n0 RectF rectF2) {
        int i10 = this.f55940x2;
        if (i10 == 0) {
            return v.b(rectF2) > v.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f55940x2);
    }

    private void t1(Context context, boolean z10) {
        v.t(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b);
        v.s(this, context, z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.Y) {
            return;
        }
        v.u(this, context, com.google.android.material.R.attr.motionPath);
    }

    @Override // androidx.transition.Transition
    public void A0(@p0 PathMotion pathMotion) {
        super.A0(pathMotion);
        this.Y = true;
    }

    public void A1(@androidx.annotation.l int i10) {
        this.f55941y1 = i10;
    }

    public void B1(float f10) {
        this.R3 = f10;
    }

    public void C1(@p0 com.google.android.material.shape.p pVar) {
        this.K3 = pVar;
    }

    public void D1(@p0 View view) {
        this.G3 = view;
    }

    public void E1(@d0 int i10) {
        this.f55935c0 = i10;
    }

    public void F1(int i10) {
        this.f55942y2 = i10;
    }

    public void G1(@p0 e eVar) {
        this.L3 = eVar;
    }

    public void H1(int i10) {
        this.G2 = i10;
    }

    public void I1(boolean z10) {
        this.X = z10;
    }

    public void J1(@p0 e eVar) {
        this.N3 = eVar;
    }

    public void K1(@p0 e eVar) {
        this.M3 = eVar;
    }

    public void L1(@androidx.annotation.l int i10) {
        this.f55937p2 = i10;
    }

    @androidx.annotation.l
    public int N0() {
        return this.f55936p1;
    }

    public void N1(@p0 e eVar) {
        this.O3 = eVar;
    }

    @d0
    public int O0() {
        return this.f55933a0;
    }

    public void O1(@androidx.annotation.l int i10) {
        this.f55939x1 = i10;
    }

    @androidx.annotation.l
    public int Q0() {
        return this.f55941y1;
    }

    public void Q1(float f10) {
        this.Q3 = f10;
    }

    public float R0() {
        return this.R3;
    }

    public void R1(@p0 com.google.android.material.shape.p pVar) {
        this.J3 = pVar;
    }

    @p0
    public com.google.android.material.shape.p S0() {
        return this.K3;
    }

    public void S1(@p0 View view) {
        this.f55938p3 = view;
    }

    @p0
    public View T0() {
        return this.G3;
    }

    public void T1(@d0 int i10) {
        this.f55934b0 = i10;
    }

    @d0
    public int U0() {
        return this.f55935c0;
    }

    public void U1(int i10) {
        this.f55940x2 = i10;
    }

    public int V0() {
        return this.f55942y2;
    }

    @p0
    public e W0() {
        return this.L3;
    }

    public int X0() {
        return this.G2;
    }

    @Override // androidx.transition.Transition
    @p0
    public String[] Y() {
        return f55927f4;
    }

    @p0
    public e Y0() {
        return this.N3;
    }

    @p0
    public e Z0() {
        return this.M3;
    }

    @androidx.annotation.l
    public int c1() {
        return this.f55937p2;
    }

    @p0
    public e e1() {
        return this.O3;
    }

    @androidx.annotation.l
    public int g1() {
        return this.f55939x1;
    }

    public float i1() {
        return this.Q3;
    }

    @Override // androidx.transition.Transition
    public void j(@n0 z zVar) {
        M0(zVar, this.G3, this.f55935c0, this.K3);
    }

    @p0
    public com.google.android.material.shape.p j1() {
        return this.J3;
    }

    @p0
    public View k1() {
        return this.f55938p3;
    }

    @d0
    public int l1() {
        return this.f55934b0;
    }

    @Override // androidx.transition.Transition
    public void m(@n0 z zVar) {
        M0(zVar, this.f55938p3, this.f55934b0, this.J3);
    }

    public int n1() {
        return this.f55940x2;
    }

    public boolean p1() {
        return this.W;
    }

    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        View viewF;
        View view;
        if (zVar != null && zVar2 != null) {
            RectF rectF = (RectF) zVar.f27973a.get(f55925d4);
            com.google.android.material.shape.p pVar = (com.google.android.material.shape.p) zVar.f27973a.get(f55926e4);
            if (rectF != null && pVar != null) {
                RectF rectF2 = (RectF) zVar2.f27973a.get(f55925d4);
                com.google.android.material.shape.p pVar2 = (com.google.android.material.shape.p) zVar2.f27973a.get(f55926e4);
                if (rectF2 == null || pVar2 == null) {
                    Log.w(f55924c4, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = zVar.f27974b;
                View view3 = zVar2.f27974b;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f55933a0 == view4.getId()) {
                    viewF = (View) view4.getParent();
                    view = view4;
                } else {
                    viewF = v.f(view4, this.f55933a0);
                    view = null;
                }
                RectF rectFH = v.h(viewF);
                float f10 = -rectFH.left;
                float f11 = -rectFH.top;
                RectF rectFK0 = K0(viewF, view, f10, f11);
                rectF.offset(f10, f11);
                rectF2.offset(f10, f11);
                boolean zR1 = r1(rectF, rectF2);
                if (!this.Z) {
                    t1(view4.getContext(), zR1);
                }
                h hVar = new h(P(), view2, rectF, pVar, P0(this.Q3, view2), view3, rectF2, pVar2, P0(this.R3, view3), this.f55936p1, this.f55939x1, this.f55941y1, this.f55937p2, zR1, this.P3, com.google.android.material.transition.b.a(this.f55942y2, zR1), com.google.android.material.transition.g.a(this.G2, zR1, rectF, rectF2), J0(zR1), this.W, null);
                hVar.setBounds(Math.round(rectFK0.left), Math.round(rectFK0.top), Math.round(rectFK0.right), Math.round(rectFK0.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                a(new b(viewF, hVar, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(f55924c4, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public boolean q1() {
        return this.P3;
    }

    public boolean s1() {
        return this.X;
    }

    public void u1(@androidx.annotation.l int i10) {
        this.f55936p1 = i10;
        this.f55939x1 = i10;
        this.f55941y1 = i10;
    }

    public void w1(@androidx.annotation.l int i10) {
        this.f55936p1 = i10;
    }

    public void x1(boolean z10) {
        this.W = z10;
    }

    public void y1(@d0 int i10) {
        this.f55933a0 = i10;
    }

    public void z1(boolean z10) {
        this.P3 = z10;
    }
}
