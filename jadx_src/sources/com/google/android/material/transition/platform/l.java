package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
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
import androidx.annotation.w0;
import androidx.core.view.j1;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: MaterialContainerTransform.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class l extends Transition {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    private static final f P;
    private static final f R;
    private static final float S = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d0
    private int f56038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d0
    private int f56039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d0
    private int f56040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.l
    private int f56041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.l
    private int f56042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.l
    private int f56043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.l
    private int f56044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f56045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f56046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f56047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private View f56048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private View f56049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.p f56050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.p f56051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private e f56052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private e f56053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private e f56054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private e f56055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f56056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f56057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f56058z;
    private static final String K = l.class.getSimpleName();
    private static final String L = "materialContainerTransition:bounds";
    private static final String M = "materialContainerTransition:shapeAppearance";
    private static final String[] N = {L, M};
    private static final f O = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f Q = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f56059b;

        a(h hVar) {
            this.f56059b = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f56059b.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f56061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f56062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f56063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f56064d;

        b(View view, h hVar, View view2, View view3) {
            this.f56061a = view;
            this.f56062b = hVar;
            this.f56063c = view2;
            this.f56064d = view3;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@n0 Transition transition) {
            l.this.removeListener(this);
            if (l.this.f56035c) {
                return;
            }
            this.f56063c.setAlpha(1.0f);
            this.f56064d.setAlpha(1.0f);
            j0.m(this.f56061a).a(this.f56062b);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@n0 Transition transition) {
            j0.m(this.f56061a).b(this.f56062b);
            this.f56063c.setAlpha(0.0f);
            this.f56064d.setAlpha(0.0f);
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
        @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        private final float f56066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        private final float f56067b;

        public e(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
            this.f56066a = f10;
            this.f56067b = f11;
        }

        @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float c() {
            return this.f56067b;
        }

        @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float d() {
            return this.f56066a;
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final e f56068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final e f56069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final e f56070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private final e f56071d;

        private f(@n0 e eVar, @n0 e eVar2, @n0 e eVar3, @n0 e eVar4) {
            this.f56068a = eVar;
            this.f56069b = eVar2;
            this.f56070c = eVar3;
            this.f56071d = eVar4;
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
        private final com.google.android.material.transition.platform.a B;
        private final com.google.android.material.transition.platform.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.platform.c G;
        private com.google.android.material.transition.platform.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f56072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f56073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.p f56074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f56075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f56076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f56077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.p f56078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f56079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f56080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f56081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f56082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f56083l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f56084m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f56085n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f56086o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f56087p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f56088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f56089r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f56090s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f56091t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f56092u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.k f56093v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f56094w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f56095x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f56096y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f56097z;

        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        public class a implements c9.a.InterfaceC0267a {
            a() {
            }

            @Override // c9.a.InterfaceC0267a
            public void a(Canvas canvas) {
                h.this.f56072a.draw(canvas);
            }
        }

        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        public class b implements c9.a.InterfaceC0267a {
            b() {
            }

            @Override // c9.a.InterfaceC0267a
            public void a(Canvas canvas) {
                h.this.f56076e.draw(canvas);
            }
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, @androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z12) {
            Paint paint = new Paint();
            this.f56080i = paint;
            Paint paint2 = new Paint();
            this.f56081j = paint2;
            Paint paint3 = new Paint();
            this.f56082k = paint3;
            this.f56083l = new Paint();
            Paint paint4 = new Paint();
            this.f56084m = paint4;
            this.f56085n = new j();
            this.f56088q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f56093v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f56072a = view;
            this.f56073b = rectF;
            this.f56074c = pVar;
            this.f56075d = f10;
            this.f56076e = view2;
            this.f56077f = rectF2;
            this.f56078g = pVar2;
            this.f56079h = f11;
            this.f56089r = z10;
            this.f56092u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f56090s = displayMetrics.widthPixels;
            this.f56091t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            kVar.o0(ColorStateList.valueOf(0));
            kVar.x0(2);
            kVar.u0(false);
            kVar.v0(N);
            RectF rectF3 = new RectF(rectF);
            this.f56094w = rectF3;
            this.f56095x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f56096y = rectF4;
            this.f56097z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f56086o = pathMeasure;
            this.f56087p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(w.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.p pVar, float f10, View view2, RectF rectF2, com.google.android.material.shape.p pVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z12, a aVar2) {
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
            canvas.clipPath(this.f56085n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.k kVar = this.f56093v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f56093v.n0(this.J);
            this.f56093v.B0((int) this.K);
            this.f56093v.setShapeAppearanceModel(this.f56085n.c());
            this.f56093v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.p pVarC = this.f56085n.c();
            if (!pVarC.u(this.I)) {
                canvas.drawPath(this.f56085n.d(), this.f56083l);
            } else {
                float fA = pVarC.r().a(this.I);
                canvas.drawRoundRect(this.I, fA, fA, this.f56083l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f56082k);
            Rect bounds = getBounds();
            RectF rectF = this.f56096y;
            w.y(canvas, bounds, rectF.left, rectF.top, this.H.f56024b, this.G.f56002b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f56081j);
            Rect bounds = getBounds();
            RectF rectF = this.f56094w;
            w.y(canvas, bounds, rectF.left, rectF.top, this.H.f56023a, this.G.f56001a, new a());
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
            this.f56084m.setAlpha((int) (this.f56089r ? w.m(0.0f, 255.0f, f10) : w.m(255.0f, 0.0f, f10)));
            this.f56086o.getPosTan(this.f56087p * f10, this.f56088q, null);
            float[] fArr = this.f56088q;
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
                this.f56086o.getPosTan(this.f56087p * f11, fArr, null);
                float[] fArr2 = this.f56088q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            com.google.android.material.transition.platform.h hVarA = this.C.a(f10, ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56069b.f56066a))).floatValue(), ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56069b.f56067b))).floatValue(), this.f56073b.width(), this.f56073b.height(), this.f56077f.width(), this.f56077f.height());
            this.H = hVarA;
            RectF rectF = this.f56094w;
            float f17 = hVarA.f56025c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, hVarA.f56026d + f16);
            RectF rectF2 = this.f56096y;
            com.google.android.material.transition.platform.h hVar = this.H;
            float f18 = hVar.f56027e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f56028f + f16);
            this.f56095x.set(this.f56094w);
            this.f56097z.set(this.f56096y);
            float fFloatValue = ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56070c.f56066a))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56070c.f56067b))).floatValue();
            boolean zB = this.C.b(this.H);
            RectF rectF3 = zB ? this.f56095x : this.f56097z;
            float fN = w.n(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zB) {
                fN = 1.0f - fN;
            }
            this.C.c(rectF3, fN, this.H);
            this.I = new RectF(Math.min(this.f56095x.left, this.f56097z.left), Math.min(this.f56095x.top, this.f56097z.top), Math.max(this.f56095x.right, this.f56097z.right), Math.max(this.f56095x.bottom, this.f56097z.bottom));
            this.f56085n.b(f10, this.f56074c, this.f56078g, this.f56094w, this.f56095x, this.f56097z, this.A.f56071d);
            this.J = w.m(this.f56075d, this.f56079h, f10);
            float fD = d(this.I, this.f56090s);
            float fE = e(this.I, this.f56091t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f56083l.setShadowLayer(f19, (int) (fD * f19), f20, M);
            this.G = this.B.a(f10, ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56068a.f56066a))).floatValue(), ((Float) androidx.core.util.o.l(Float.valueOf(this.A.f56068a.f56067b))).floatValue(), 0.35f);
            if (this.f56081j.getColor() != 0) {
                this.f56081j.setAlpha(this.G.f56001a);
            }
            if (this.f56082k.getColor() != 0) {
                this.f56082k.setAlpha(this.G.f56002b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@n0 Canvas canvas) {
            if (this.f56084m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f56084m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f56092u && this.J > 0.0f) {
                h(canvas);
            }
            this.f56085n.a(canvas);
            n(canvas, this.f56080i);
            if (this.G.f56003c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f56094w, this.F, -65281);
                g(canvas, this.f56095x, androidx.core.view.o.f21773u);
                g(canvas, this.f56094w, -16711936);
                g(canvas, this.f56097z, -16711681);
                g(canvas, this.f56096y, -16776961);
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
        P = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        R = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f56034b = false;
        this.f56035c = false;
        this.f56036d = false;
        this.f56037e = false;
        this.f56038f = R.id.content;
        this.f56039g = -1;
        this.f56040h = -1;
        this.f56041i = 0;
        this.f56042j = 0;
        this.f56043k = 0;
        this.f56044l = 1375731712;
        this.f56045m = 0;
        this.f56046n = 0;
        this.f56047o = 0;
        this.f56056x = Build.VERSION.SDK_INT >= 28;
        this.f56057y = -1.0f;
        this.f56058z = -1.0f;
    }

    public l(@n0 Context context, boolean z10) {
        this.f56034b = false;
        this.f56035c = false;
        this.f56036d = false;
        this.f56037e = false;
        this.f56038f = R.id.content;
        this.f56039g = -1;
        this.f56040h = -1;
        this.f56041i = 0;
        this.f56042j = 0;
        this.f56043k = 0;
        this.f56044l = 1375731712;
        this.f56045m = 0;
        this.f56046n = 0;
        this.f56047o = 0;
        this.f56056x = Build.VERSION.SDK_INT >= 28;
        this.f56057y = -1.0f;
        this.f56058z = -1.0f;
        J(context, z10);
        this.f56037e = true;
    }

    private f B(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        return new f((e) w.e(this.f56052t, fVar.f56068a), (e) w.e(this.f56053u, fVar.f56069b), (e) w.e(this.f56054v, fVar.f56070c), (e) w.e(this.f56055w, fVar.f56071d), null);
    }

    @e1
    private static int D(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean G(@n0 RectF rectF, @n0 RectF rectF2) {
        int i10 = this.f56045m;
        if (i10 == 0) {
            return w.b(rectF2) > w.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f56045m);
    }

    private void J(Context context, boolean z10) {
        w.t(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b);
        w.s(this, context, z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.f56036d) {
            return;
        }
        w.u(this, context, com.google.android.material.R.attr.motionPath);
    }

    private f b(boolean z10) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? B(z10, Q, R) : B(z10, O, P);
    }

    private static RectF c(View view, @p0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFH = w.h(view2);
        rectFH.offset(f10, f11);
        return rectFH;
    }

    private static com.google.android.material.shape.p d(@n0 View view, @n0 RectF rectF, @p0 com.google.android.material.shape.p pVar) {
        return w.c(t(view, pVar), rectF);
    }

    private static void e(@n0 TransitionValues transitionValues, @p0 View view, @d0 int i10, @p0 com.google.android.material.shape.p pVar) {
        if (i10 != -1) {
            transitionValues.view = w.g(transitionValues.view, i10);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i11 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i11) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i11);
                transitionValues.view.setTag(i11, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!j1.U0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF rectFI = view4.getParent() == null ? w.i(view4) : w.h(view4);
        transitionValues.values.put(L, rectFI);
        transitionValues.values.put(M, d(view4, rectFI, pVar));
    }

    private static float h(float f10, View view) {
        return f10 != -1.0f ? f10 : j1.R(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.p t(@n0 View view, @p0 com.google.android.material.shape.p pVar) {
        if (pVar != null) {
            return pVar;
        }
        int i10 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i10) instanceof com.google.android.material.shape.p) {
            return (com.google.android.material.shape.p) view.getTag(i10);
        }
        Context context = view.getContext();
        int iD = D(context);
        if (iD != -1) {
            return com.google.android.material.shape.p.b(context, iD, 0).m();
        }
        return view instanceof com.google.android.material.shape.t ? ((com.google.android.material.shape.t) view).getShapeAppearanceModel() : com.google.android.material.shape.p.a().m();
    }

    public int C() {
        return this.f56045m;
    }

    public boolean E() {
        return this.f56034b;
    }

    public boolean F() {
        return this.f56056x;
    }

    public boolean H() {
        return this.f56035c;
    }

    public void K(@androidx.annotation.l int i10) {
        this.f56041i = i10;
        this.f56042j = i10;
        this.f56043k = i10;
    }

    public void M(@androidx.annotation.l int i10) {
        this.f56041i = i10;
    }

    public void O(boolean z10) {
        this.f56034b = z10;
    }

    public void P(@d0 int i10) {
        this.f56038f = i10;
    }

    public void Q(boolean z10) {
        this.f56056x = z10;
    }

    public void R(@androidx.annotation.l int i10) {
        this.f56043k = i10;
    }

    public void S(float f10) {
        this.f56058z = f10;
    }

    public void T(@p0 com.google.android.material.shape.p pVar) {
        this.f56051s = pVar;
    }

    public void U(@p0 View view) {
        this.f56049q = view;
    }

    public void V(@d0 int i10) {
        this.f56040h = i10;
    }

    public void X(int i10) {
        this.f56046n = i10;
    }

    public void Y(@p0 e eVar) {
        this.f56052t = eVar;
    }

    public void Z(int i10) {
        this.f56047o = i10;
    }

    public void b0(boolean z10) {
        this.f56035c = z10;
    }

    public void c0(@p0 e eVar) {
        this.f56054v = eVar;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@n0 TransitionValues transitionValues) {
        e(transitionValues, this.f56049q, this.f56040h, this.f56051s);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@n0 TransitionValues transitionValues) {
        e(transitionValues, this.f56048p, this.f56039g, this.f56050r);
    }

    @Override // android.transition.Transition
    @p0
    public Animator createAnimator(@n0 ViewGroup viewGroup, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        View viewF;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(L);
            com.google.android.material.shape.p pVar = (com.google.android.material.shape.p) transitionValues.values.get(M);
            if (rectF != null && pVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(L);
                com.google.android.material.shape.p pVar2 = (com.google.android.material.shape.p) transitionValues2.values.get(M);
                if (rectF2 == null || pVar2 == null) {
                    Log.w(K, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f56038f == view4.getId()) {
                    viewF = (View) view4.getParent();
                    view = view4;
                } else {
                    viewF = w.f(view4, this.f56038f);
                    view = null;
                }
                RectF rectFH = w.h(viewF);
                float f10 = -rectFH.left;
                float f11 = -rectFH.top;
                RectF rectFC = c(viewF, view, f10, f11);
                rectF.offset(f10, f11);
                rectF2.offset(f10, f11);
                boolean zG = G(rectF, rectF2);
                if (!this.f56037e) {
                    J(view4.getContext(), zG);
                }
                h hVar = new h(getPathMotion(), view2, rectF, pVar, h(this.f56057y, view2), view3, rectF2, pVar2, h(this.f56058z, view3), this.f56041i, this.f56042j, this.f56043k, this.f56044l, zG, this.f56056x, com.google.android.material.transition.platform.b.a(this.f56046n, zG), com.google.android.material.transition.platform.g.a(this.f56047o, zG, rectF, rectF2), b(zG), this.f56034b, null);
                hVar.setBounds(Math.round(rectFC.left), Math.round(rectFC.top), Math.round(rectFC.right), Math.round(rectFC.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                addListener(new b(viewF, hVar, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(K, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public void d0(@p0 e eVar) {
        this.f56053u = eVar;
    }

    public void e0(@androidx.annotation.l int i10) {
        this.f56044l = i10;
    }

    @androidx.annotation.l
    public int f() {
        return this.f56041i;
    }

    public void f0(@p0 e eVar) {
        this.f56055w = eVar;
    }

    @d0
    public int g() {
        return this.f56038f;
    }

    public void g0(@androidx.annotation.l int i10) {
        this.f56042j = i10;
    }

    @Override // android.transition.Transition
    @p0
    public String[] getTransitionProperties() {
        return N;
    }

    public void h0(float f10) {
        this.f56057y = f10;
    }

    @androidx.annotation.l
    public int i() {
        return this.f56043k;
    }

    public void i0(@p0 com.google.android.material.shape.p pVar) {
        this.f56050r = pVar;
    }

    public float j() {
        return this.f56058z;
    }

    public void j0(@p0 View view) {
        this.f56048p = view;
    }

    @p0
    public com.google.android.material.shape.p k() {
        return this.f56051s;
    }

    public void k0(@d0 int i10) {
        this.f56039g = i10;
    }

    @p0
    public View l() {
        return this.f56049q;
    }

    public void l0(int i10) {
        this.f56045m = i10;
    }

    @d0
    public int m() {
        return this.f56040h;
    }

    public int n() {
        return this.f56046n;
    }

    @p0
    public e o() {
        return this.f56052t;
    }

    public int p() {
        return this.f56047o;
    }

    @p0
    public e q() {
        return this.f56054v;
    }

    @p0
    public e r() {
        return this.f56053u;
    }

    @androidx.annotation.l
    public int s() {
        return this.f56044l;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@p0 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f56036d = true;
    }

    @p0
    public e u() {
        return this.f56055w;
    }

    @androidx.annotation.l
    public int v() {
        return this.f56042j;
    }

    public float w() {
        return this.f56057y;
    }

    @p0
    public com.google.android.material.shape.p x() {
        return this.f56050r;
    }

    @p0
    public View y() {
        return this.f56048p;
    }

    @d0
    public int z() {
        return this.f56039g;
    }
}
