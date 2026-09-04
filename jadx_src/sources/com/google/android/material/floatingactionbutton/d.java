package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.o;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.x;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    static final long E = 100;
    static final long F = 100;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final float J = 1.5f;
    private static final float K = 0.0f;
    private static final float L = 0.4f;
    private static final float M = 0.4f;
    private static final float N = 1.0f;
    private static final float O = 1.0f;
    private static final float P = 1.0f;
    private static final float Q = 0.0f;
    private static final float R = 0.0f;

    @p0
    private ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    p f54291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    com.google.android.material.shape.k f54292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    Drawable f54293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    com.google.android.material.floatingactionbutton.c f54294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    Drawable f54295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f54296f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f54298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f54299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f54300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f54301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    private final x f54302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Animator f54303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private com.google.android.material.animation.i f54304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.google.android.material.animation.i f54305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f54306p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54308r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f54310t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f54311u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<j> f54312v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final FloatingActionButton f54313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final com.google.android.material.shadow.c f54314x;
    static final TimeInterpolator D = com.google.android.material.animation.b.f52898c;
    private static final int S = R.attr.motionDurationLong2;
    private static final int T = R.attr.motionEasingEmphasizedInterpolator;
    private static final int U = R.attr.motionDurationMedium1;
    private static final int V = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] W = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] X = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] Y = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] Z = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final int[] f54289a0 = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int[] f54290b0 = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f54297g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f54307q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f54309s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Rect f54315y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f54316z = new RectF();
    private final RectF A = new RectF();
    private final Matrix B = new Matrix();

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f54317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f54318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f54319d;

        a(boolean z10, k kVar) {
            this.f54318c = z10;
            this.f54319d = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f54317b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f54309s = 0;
            d.this.f54303m = null;
            if (this.f54317b) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f54313w;
            boolean z10 = this.f54318c;
            floatingActionButton.c(z10 ? 8 : 4, z10);
            k kVar = this.f54319d;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f54313w.c(0, this.f54318c);
            d.this.f54309s = 1;
            d.this.f54303m = animator;
            this.f54317b = false;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f54322c;

        b(boolean z10, k kVar) {
            this.f54321b = z10;
            this.f54322c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f54309s = 0;
            d.this.f54303m = null;
            k kVar = this.f54322c;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f54313w.c(0, this.f54321b);
            d.this.f54309s = 2;
            d.this.f54303m = animator;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class c extends com.google.android.material.animation.h {
        c() {
        }

        @Override // com.google.android.material.animation.h, android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a */
        public Matrix evaluate(float f10, @n0 Matrix matrix, @n0 Matrix matrix2) {
            d.this.f54307q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class C0424d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f54325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f54329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f54330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f54331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Matrix f54332i;

        C0424d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f54325b = f10;
            this.f54326c = f11;
            this.f54327d = f12;
            this.f54328e = f13;
            this.f54329f = f14;
            this.f54330g = f15;
            this.f54331h = f16;
            this.f54332i = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f54313w.setAlpha(com.google.android.material.animation.b.b(this.f54325b, this.f54326c, 0.0f, 0.2f, fFloatValue));
            d.this.f54313w.setScaleX(com.google.android.material.animation.b.a(this.f54327d, this.f54328e, fFloatValue));
            d.this.f54313w.setScaleY(com.google.android.material.animation.b.a(this.f54329f, this.f54328e, fFloatValue));
            d.this.f54307q = com.google.android.material.animation.b.a(this.f54330g, this.f54331h, fFloatValue);
            d.this.h(com.google.android.material.animation.b.a(this.f54330g, this.f54331h, fFloatValue), this.f54332i);
            d.this.f54313w.setImageMatrix(this.f54332i);
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        FloatEvaluator f54334a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f54334a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class g extends m {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class h extends m {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f54298h + dVar.f54299i;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class i extends m {
        i() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f54298h + dVar.f54300j;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface j {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface k {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class l extends m {
        l() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return d.this.f54298h;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f54341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f54342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f54343d;

        private m() {
        }

        /* synthetic */ m(d dVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.j0((int) this.f54343d);
            this.f54341b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            if (!this.f54341b) {
                com.google.android.material.shape.k kVar = d.this.f54292b;
                this.f54342c = kVar == null ? 0.0f : kVar.x();
                this.f54343d = a();
                this.f54341b = true;
            }
            d dVar = d.this;
            float f10 = this.f54342c;
            dVar.j0((int) (f10 + ((this.f54343d - f10) * valueAnimator.getAnimatedFraction())));
        }
    }

    d(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        this.f54313w = floatingActionButton;
        this.f54314x = cVar;
        x xVar = new x();
        this.f54302l = xVar;
        xVar.a(W, k(new i()));
        xVar.a(X, k(new h()));
        xVar.a(Y, k(new h()));
        xVar.a(Z, k(new h()));
        xVar.a(f54289a0, k(new l()));
        xVar.a(f54290b0, k(new g()));
        this.f54306p = floatingActionButton.getRotation();
    }

    private boolean d0() {
        return j1.U0(this.f54313w) && !this.f54313w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, @n0 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f54313w.getDrawable();
        if (drawable == null || this.f54308r == 0) {
            return;
        }
        RectF rectF = this.f54316z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f54308r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f54308r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    @n0
    private AnimatorSet i(@n0 com.google.android.material.animation.i iVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f54313w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        iVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f54313w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        iVar.h("scale").a(objectAnimatorOfFloat2);
        k0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f54313w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        iVar.h("scale").a(objectAnimatorOfFloat3);
        k0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f54313w, new com.google.android.material.animation.g(), new c(), new Matrix(this.B));
        iVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0424d(this.f54313w.getAlpha(), f10, this.f54313w.getScaleX(), f11, this.f54313w.getScaleY(), this.f54307q, f12, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        animatorSet.setDuration(i9.a.f(this.f54313w.getContext(), i10, this.f54313w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(i9.a.g(this.f54313w.getContext(), i11, com.google.android.material.animation.b.f52897b));
        return animatorSet;
    }

    @n0
    private ValueAnimator k(@n0 m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @n0
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    void A() {
        this.f54302l.c();
    }

    void B() {
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            com.google.android.material.shape.l.f(this.f54313w, kVar);
        }
        if (N()) {
            this.f54313w.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    void C() {
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f54313w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    void E(int[] iArr) {
        this.f54302l.d(iArr);
    }

    void F(float f10, float f11, float f12) {
        i0();
        j0(f10);
    }

    void G(@n0 Rect rect) {
        o.m(this.f54295e, "Didn't initialize content background");
        if (!c0()) {
            this.f54314x.a(this.f54295e);
        } else {
            this.f54314x.a(new InsetDrawable(this.f54295e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f54313w.getRotation();
        if (this.f54306p != rotation) {
            this.f54306p = rotation;
            g0();
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f54312v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void J() {
        ArrayList<j> arrayList = this.f54312v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void K(@n0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f54311u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void L(@n0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f54310t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void M(@n0 j jVar) {
        ArrayList<j> arrayList = this.f54312v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    boolean N() {
        return true;
    }

    void O(@p0 ColorStateList colorStateList) {
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            kVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f54294d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    void P(@p0 PorterDuff.Mode mode) {
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            kVar.setTintMode(mode);
        }
    }

    final void Q(float f10) {
        if (this.f54298h != f10) {
            this.f54298h = f10;
            F(f10, this.f54299i, this.f54300j);
        }
    }

    void R(boolean z10) {
        this.f54296f = z10;
    }

    final void S(@p0 com.google.android.material.animation.i iVar) {
        this.f54305o = iVar;
    }

    final void T(float f10) {
        if (this.f54299i != f10) {
            this.f54299i = f10;
            F(this.f54298h, f10, this.f54300j);
        }
    }

    final void U(float f10) {
        this.f54307q = f10;
        Matrix matrix = this.B;
        h(f10, matrix);
        this.f54313w.setImageMatrix(matrix);
    }

    final void V(int i10) {
        if (this.f54308r != i10) {
            this.f54308r = i10;
            h0();
        }
    }

    void W(int i10) {
        this.f54301k = i10;
    }

    final void X(float f10) {
        if (this.f54300j != f10) {
            this.f54300j = f10;
            F(this.f54298h, this.f54299i, f10);
        }
    }

    void Y(@p0 ColorStateList colorStateList) {
        Drawable drawable = this.f54293c;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, com.google.android.material.ripple.b.e(colorStateList));
        }
    }

    void Z(boolean z10) {
        this.f54297g = z10;
        i0();
    }

    final void a0(@n0 p pVar) {
        this.f54291a = pVar;
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        Object obj = this.f54293c;
        if (obj instanceof t) {
            ((t) obj).setShapeAppearanceModel(pVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f54294d;
        if (cVar != null) {
            cVar.g(pVar);
        }
    }

    final void b0(@p0 com.google.android.material.animation.i iVar) {
        this.f54304n = iVar;
    }

    boolean c0() {
        return true;
    }

    public void e(@n0 Animator.AnimatorListener animatorListener) {
        if (this.f54311u == null) {
            this.f54311u = new ArrayList<>();
        }
        this.f54311u.add(animatorListener);
    }

    final boolean e0() {
        return !this.f54296f || this.f54313w.getSizeDimension() >= this.f54301k;
    }

    void f(@n0 Animator.AnimatorListener animatorListener) {
        if (this.f54310t == null) {
            this.f54310t = new ArrayList<>();
        }
        this.f54310t.add(animatorListener);
    }

    void f0(@p0 k kVar, boolean z10) {
        if (z()) {
            return;
        }
        Animator animator = this.f54303m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f54304n == null;
        if (!d0()) {
            this.f54313w.c(0, z10);
            this.f54313w.setAlpha(1.0f);
            this.f54313w.setScaleY(1.0f);
            this.f54313w.setScaleX(1.0f);
            U(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f54313w.getVisibility() != 0) {
            this.f54313w.setAlpha(0.0f);
            this.f54313w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f54313w.setScaleX(z11 ? 0.4f : 0.0f);
            U(z11 ? 0.4f : 0.0f);
        }
        com.google.android.material.animation.i iVar = this.f54304n;
        AnimatorSet animatorSetI = iVar != null ? i(iVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f, S, T);
        animatorSetI.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f54310t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void g(@n0 j jVar) {
        if (this.f54312v == null) {
            this.f54312v = new ArrayList<>();
        }
        this.f54312v.add(jVar);
    }

    void g0() {
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            kVar.w0((int) this.f54306p);
        }
    }

    final void h0() {
        U(this.f54307q);
    }

    final void i0() {
        Rect rect = this.f54315y;
        s(rect);
        G(rect);
        this.f54314x.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    void j0(float f10) {
        com.google.android.material.shape.k kVar = this.f54292b;
        if (kVar != null) {
            kVar.n0(f10);
        }
    }

    com.google.android.material.shape.k l() {
        return new com.google.android.material.shape.k((p) o.l(this.f54291a));
    }

    @p0
    final Drawable m() {
        return this.f54295e;
    }

    float n() {
        return this.f54298h;
    }

    boolean o() {
        return this.f54296f;
    }

    @p0
    final com.google.android.material.animation.i p() {
        return this.f54305o;
    }

    float q() {
        return this.f54299i;
    }

    void s(@n0 Rect rect) {
        int sizeDimension = this.f54296f ? (this.f54301k - this.f54313w.getSizeDimension()) / 2 : 0;
        float fN = this.f54297g ? n() + this.f54300j : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fN));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fN * J));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float t() {
        return this.f54300j;
    }

    @p0
    final p u() {
        return this.f54291a;
    }

    @p0
    final com.google.android.material.animation.i v() {
        return this.f54304n;
    }

    void w(@p0 k kVar, boolean z10) {
        if (y()) {
            return;
        }
        Animator animator = this.f54303m;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.f54313w.c(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        com.google.android.material.animation.i iVar = this.f54305o;
        AnimatorSet animatorSetI = iVar != null ? i(iVar, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f, U, V);
        animatorSetI.addListener(new a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f54311u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void x(ColorStateList colorStateList, @p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        com.google.android.material.shape.k kVarL = l();
        this.f54292b = kVarL;
        kVarL.setTintList(colorStateList);
        if (mode != null) {
            this.f54292b.setTintMode(mode);
        }
        this.f54292b.v0(-12303292);
        this.f54292b.Z(this.f54313w.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f54292b.getShapeAppearanceModel());
        aVar.setTintList(com.google.android.material.ripple.b.e(colorStateList2));
        this.f54293c = aVar;
        this.f54295e = new LayerDrawable(new Drawable[]{(Drawable) o.l(this.f54292b), aVar});
    }

    boolean y() {
        if (this.f54313w.getVisibility() == 0) {
            return this.f54309s == 1;
        }
        return this.f54309s != 2;
    }

    boolean z() {
        if (this.f54313w.getVisibility() != 0) {
            return this.f54309s == 2;
        }
        return this.f54309s != 1;
    }
}
