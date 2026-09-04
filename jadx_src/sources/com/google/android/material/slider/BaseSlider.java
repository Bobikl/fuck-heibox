package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.f0;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.i0;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {
    private static final String J3 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String K3 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String L3 = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String M3 = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final String N3 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String O3 = "minSeparation(%s) must be greater or equal to 0";
    private static final String P3 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String Q3 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String R3 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final int S3 = 200;
    private static final int T3 = 63;
    private static final double U3 = 1.0E-4d;
    static final int W3 = 1;
    static final int X3 = 0;
    private static final int Y3 = 83;
    private static final int Z3 = 117;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @r
    private static final int f55270e4 = 48;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float G2;
    private MotionEvent H;
    private com.google.android.material.slider.d I;
    private boolean J;
    private float K;
    private float L;
    private ArrayList<Float> M;
    private int N;
    private int O;
    private float P;
    private float[] Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f55271a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Paint f55272b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @n0
    private ColorStateList f55273b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Paint f55274c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @n0
    private ColorStateList f55275c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final Paint f55276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final Paint f55277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final Paint f55278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final Paint f55279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final d f55280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f55281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BaseSlider<S, L, T>.c f55282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    private final List<com.google.android.material.tooltip.a> f55284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    private final List<L> f55285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    private final List<T> f55286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f55287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueAnimator f55288p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @n0
    private ColorStateList f55289p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @n0
    private final k f55290p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f55291p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f55292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f55293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f55294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f55297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f55298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @r(unit = 1)
    private int f55299x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @n0
    private ColorStateList f55300x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @p0
    private Drawable f55301x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f55302y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @n0
    private ColorStateList f55303y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @n0
    private List<Drawable> f55304y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f55305z;
    private static final String G3 = BaseSlider.class.getSimpleName();
    static final int V3 = R.style.Widget_MaterialComponents_Slider;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f55266a4 = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f55267b4 = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f55268c4 = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final int f55269d4 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f55306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f55307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Float> f55308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f55309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f55310f;

        public class a implements Parcelable.Creator<SliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@n0 Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        private SliderState(@n0 Parcel parcel) {
            super(parcel);
            this.f55306b = parcel.readFloat();
            this.f55307c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f55308d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f55309e = parcel.readFloat();
            this.f55310f = parcel.createBooleanArray()[0];
        }

        /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f55306b);
            parcel.writeFloat(this.f55307c);
            parcel.writeList(this.f55308d);
            parcel.writeFloat(this.f55309e);
            parcel.writeBooleanArray(new boolean[]{this.f55310f});
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f55284l.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.tooltip.a) it.next()).l1(fFloatValue);
            }
            j1.n1(BaseSlider.this);
        }
    }

    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            i0 i0VarK = j0.k(BaseSlider.this);
            Iterator it = BaseSlider.this.f55284l.iterator();
            while (it.hasNext()) {
                i0VarK.a((com.google.android.material.tooltip.a) it.next());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f55313b;

        private c() {
            this.f55313b = -1;
        }

        /* synthetic */ c(BaseSlider baseSlider, a aVar) {
            this();
        }

        void a(int i10) {
            this.f55313b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f55280h.L(this.f55313b, 4);
        }
    }

    public static class d extends androidx.customview.widget.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final BaseSlider<?, ?, ?> f55315q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Rect f55316r;

        d(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f55316r = new Rect();
            this.f55315q = baseSlider;
        }

        @n0
        private String N(int i10) {
            if (i10 == this.f55315q.getValues().size() - 1) {
                return this.f55315q.getContext().getString(R.string.material_slider_range_end);
            }
            return i10 == 0 ? this.f55315q.getContext().getString(R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.a
        protected boolean A(int i10, int i11, Bundle bundle) {
            if (!this.f55315q.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey(a0.Z)) {
                    if (this.f55315q.o0(i10, bundle.getFloat(a0.Z))) {
                        this.f55315q.r0();
                        this.f55315q.postInvalidate();
                        t(i10);
                        return true;
                    }
                }
                return false;
            }
            float fM = this.f55315q.m(20);
            if (i11 == 8192) {
                fM = -fM;
            }
            if (this.f55315q.P()) {
                fM = -fM;
            }
            if (!this.f55315q.o0(i10, a2.a.d(this.f55315q.getValues().get(i10).floatValue() + fM, this.f55315q.getValueFrom(), this.f55315q.getValueTo()))) {
                return false;
            }
            this.f55315q.r0();
            this.f55315q.postInvalidate();
            t(i10);
            return true;
        }

        @Override // androidx.customview.widget.a
        protected void E(int i10, a0 a0Var) {
            a0Var.b(a0.a.M);
            List<Float> values = this.f55315q.getValues();
            float fFloatValue = values.get(i10).floatValue();
            float valueFrom = this.f55315q.getValueFrom();
            float valueTo = this.f55315q.getValueTo();
            if (this.f55315q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    a0Var.a(8192);
                }
                if (fFloatValue < valueTo) {
                    a0Var.a(4096);
                }
            }
            a0Var.I1(a0.f.e(1, valueFrom, valueTo, fFloatValue));
            a0Var.b1(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f55315q.getContentDescription() != null) {
                sb2.append(this.f55315q.getContentDescription());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            String strE = this.f55315q.E(fFloatValue);
            String string = this.f55315q.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = N(i10);
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, strE));
            a0Var.f1(sb2.toString());
            this.f55315q.q0(i10, this.f55316r);
            a0Var.W0(this.f55316r);
        }

        @Override // androidx.customview.widget.a
        protected int p(float f10, float f11) {
            for (int i10 = 0; i10 < this.f55315q.getValues().size(); i10++) {
                this.f55315q.q0(i10, this.f55316r);
                if (this.f55316r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        protected void q(List<Integer> list) {
            for (int i10 = 0; i10 < this.f55315q.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }
    }

    public BaseSlider(@n0 Context context) {
        this(context, null);
    }

    public BaseSlider(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(j9.a.c(context, attributeSet, i10, V3), attributeSet, i10);
        this.f55284l = new ArrayList();
        this.f55285m = new ArrayList();
        this.f55286n = new ArrayList();
        this.f55287o = false;
        this.J = false;
        this.M = new ArrayList<>();
        this.N = -1;
        this.O = -1;
        this.P = 0.0f;
        this.R = true;
        this.W = false;
        k kVar = new k();
        this.f55290p2 = kVar;
        this.f55304y2 = Collections.emptyList();
        this.f55291p3 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f55272b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f55274c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f55276d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f55277e = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f55278f = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f55279g = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        R(context2.getResources());
        f0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        kVar.x0(2);
        this.f55293r = ViewConfiguration.get(context2).getScaledTouchSlop();
        d dVar = new d(this);
        this.f55280h = dVar;
        j1.B1(this, dVar);
        this.f55281i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void A() {
        if (this.A == 2) {
            return;
        }
        if (!this.f55287o) {
            this.f55287o = true;
            ValueAnimator valueAnimatorQ = q(true);
            this.f55288p = valueAnimatorQ;
            this.f55292q = null;
            valueAnimatorQ.start();
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f55284l.iterator();
        for (int i10 = 0; i10 < this.M.size() && it.hasNext(); i10++) {
            if (i10 != this.O) {
                j0(it.next(), this.M.get(i10).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f55284l.size()), Integer.valueOf(this.M.size())));
        }
        j0(it.next(), this.M.get(this.O).floatValue());
    }

    private boolean A0(float f10) {
        return N(f10 - this.K);
    }

    private void B() {
        if (this.f55287o) {
            this.f55287o = false;
            ValueAnimator valueAnimatorQ = q(false);
            this.f55292q = valueAnimatorQ;
            this.f55288p = null;
            valueAnimatorQ.addListener(new b());
            this.f55292q.start();
        }
    }

    private float B0(float f10) {
        return (Z(f10) * this.U) + this.C;
    }

    private void C(int i10) {
        if (i10 == 1) {
            X(Integer.MAX_VALUE);
            return;
        }
        if (i10 == 2) {
            X(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            Y(Integer.MAX_VALUE);
        } else {
            if (i10 != 66) {
                return;
            }
            Y(Integer.MIN_VALUE);
        }
    }

    private void C0() {
        float f10 = this.P;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            Log.w(G3, String.format(R3, "stepSize", Float.valueOf(f10)));
        }
        float f11 = this.K;
        if (((int) f11) != f11) {
            Log.w(G3, String.format(R3, "valueFrom", Float.valueOf(f11)));
        }
        float f12 = this.L;
        if (((int) f12) != f12) {
            Log.w(G3, String.format(R3, "valueTo", Float.valueOf(f12)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String E(float f10) {
        if (I()) {
            return this.I.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    private static float F(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private float G(int i10, float f10) {
        float minSeparation = getMinSeparation();
        if (this.f55291p3 == 0) {
            minSeparation = t(minSeparation);
        }
        if (P()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return a2.a.d(f10, i12 < 0 ? this.K : this.M.get(i12).floatValue() + minSeparation, i11 >= this.M.size() ? this.L : this.M.get(i11).floatValue() - minSeparation);
    }

    @l
    private int H(@n0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private Drawable J(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        i(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void K() {
        this.f55272b.setStrokeWidth(this.B);
        this.f55274c.setStrokeWidth(this.B);
    }

    private boolean L() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    private static boolean M(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean N(float f10) {
        double dDoubleValue = new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.P)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < U3;
    }

    private boolean O(MotionEvent motionEvent) {
        return !M(motionEvent) && L();
    }

    private void R(@n0 Resources resources) {
        this.f55302y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f55294s = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.f55295t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f55296u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i10 = R.dimen.mtrl_slider_tick_radius;
        this.f55297v = resources.getDimensionPixelSize(i10);
        this.f55298w = resources.getDimensionPixelSize(i10);
        this.F = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void S() {
        if (this.P <= 0.0f) {
            return;
        }
        u0();
        int iMin = Math.min((int) (((this.L - this.K) / this.P) + 1.0f), (this.U / (this.B * 2)) + 1);
        float[] fArr = this.Q;
        if (fArr == null || fArr.length != iMin * 2) {
            this.Q = new float[iMin * 2];
        }
        float f10 = this.U / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.Q;
            fArr2[i10] = this.C + ((i10 / 2.0f) * f10);
            fArr2[i10 + 1] = n();
        }
    }

    private void T(@n0 Canvas canvas, int i10, int i11) {
        if (l0()) {
            int iZ = (int) (this.C + (Z(this.M.get(this.O).floatValue()) * i10));
            if (Build.VERSION.SDK_INT < 28) {
                int i12 = this.E;
                canvas.clipRect(iZ - i12, i11 - i12, iZ + i12, i12 + i11, Region.Op.UNION);
            }
            canvas.drawCircle(iZ, i11, this.E, this.f55277e);
        }
    }

    private void U(@n0 Canvas canvas) {
        if (!this.R || this.P <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iE0 = e0(this.Q, activeRange[0]);
        int iE1 = e0(this.Q, activeRange[1]);
        int i10 = iE0 * 2;
        canvas.drawPoints(this.Q, 0, i10, this.f55278f);
        int i11 = iE1 * 2;
        canvas.drawPoints(this.Q, i10, i11 - i10, this.f55279g);
        float[] fArr = this.Q;
        canvas.drawPoints(fArr, i11, fArr.length - i11, this.f55278f);
    }

    private boolean V() {
        int iMax = this.f55294s + Math.max(Math.max(Math.max(this.D - this.f55295t, 0), Math.max((this.B - this.f55296u) / 2, 0)), Math.max(Math.max(this.S - this.f55297v, 0), Math.max(this.T - this.f55298w, 0)));
        if (this.C == iMax) {
            return false;
        }
        this.C = iMax;
        if (!j1.U0(this)) {
            return true;
        }
        s0(getWidth());
        return true;
    }

    private boolean W() {
        int iMax = Math.max(this.f55302y, Math.max(this.B + getPaddingTop() + getPaddingBottom(), (this.D * 2) + getPaddingTop() + getPaddingBottom()));
        if (iMax == this.f55305z) {
            return false;
        }
        this.f55305z = iMax;
        return true;
    }

    private boolean X(int i10) {
        int i11 = this.O;
        int iF = (int) a2.a.f(((long) i11) + ((long) i10), 0L, this.M.size() - 1);
        this.O = iF;
        if (iF == i11) {
            return false;
        }
        if (this.N != -1) {
            this.N = iF;
        }
        r0();
        postInvalidate();
        return true;
    }

    private boolean Y(int i10) {
        if (P()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return X(i10);
    }

    private float Z(float f10) {
        float f11 = this.K;
        float f12 = (f10 - f11) / (this.L - f11);
        return P() ? 1.0f - f12 : f12;
    }

    @p0
    private Boolean a0(int i10, @n0 KeyEvent keyEvent) {
        if (i10 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(X(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(X(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    X(-1);
                    return Boolean.TRUE;
                }
                if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            Y(-1);
                            return Boolean.TRUE;
                        case 22:
                            Y(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            X(1);
            return Boolean.TRUE;
        }
        this.N = this.O;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void b0() {
        Iterator<T> it = this.f55286n.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void c0() {
        Iterator<T> it = this.f55286n.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private static int e0(float[] fArr, float f10) {
        return Math.round(f10 * ((fArr.length / 2) - 1));
    }

    private void f0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52859n1, i10, V3, new int[0]);
        this.f55283k = typedArrayK.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.K = typedArrayK.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.L = typedArrayK.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.K));
        this.P = typedArrayK.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f55299x = (int) Math.ceil(typedArrayK.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(j0.g(getContext(), 48))));
        int i11 = R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayK.hasValue(i11);
        int i12 = zHasValue ? i11 : R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i11 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayK, i12);
        if (colorStateListA == null) {
            colorStateListA = b0.a.a(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateListA);
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayK, i11);
        if (colorStateListA2 == null) {
            colorStateListA2 = b0.a.a(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateListA2);
        this.f55290p2.o0(com.google.android.material.resources.c.a(context, typedArrayK, R.styleable.Slider_thumbColor));
        int i13 = R.styleable.Slider_thumbStrokeColor;
        if (typedArrayK.hasValue(i13)) {
            setThumbStrokeColor(com.google.android.material.resources.c.a(context, typedArrayK, i13));
        }
        setThumbStrokeWidth(typedArrayK.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListA3 = com.google.android.material.resources.c.a(context, typedArrayK, R.styleable.Slider_haloColor);
        if (colorStateListA3 == null) {
            colorStateListA3 = b0.a.a(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateListA3);
        this.R = typedArrayK.getBoolean(R.styleable.Slider_tickVisible, true);
        int i14 = R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayK.hasValue(i14);
        int i15 = zHasValue2 ? i14 : R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i14 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateListA4 = com.google.android.material.resources.c.a(context, typedArrayK, i15);
        if (colorStateListA4 == null) {
            colorStateListA4 = b0.a.a(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateListA4);
        ColorStateList colorStateListA5 = com.google.android.material.resources.c.a(context, typedArrayK, i14);
        if (colorStateListA5 == null) {
            colorStateListA5 = b0.a.a(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateListA5);
        setThumbRadius(typedArrayK.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayK.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayK.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayK.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayK.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, 0));
        setTickInactiveRadius(typedArrayK.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, 0));
        setLabelBehavior(typedArrayK.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayK.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayK.recycle();
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.M.size() == 1) {
            fFloatValue2 = this.K;
        }
        float fZ = Z(fFloatValue2);
        float fZ2 = Z(fFloatValue);
        return P() ? new float[]{fZ2, fZ} : new float[]{fZ, fZ2};
    }

    private float getValueOfTouchPosition() {
        double dN0 = n0(this.G2);
        if (P()) {
            dN0 = 1.0d - dN0;
        }
        float f10 = this.L;
        float f11 = this.K;
        return (float) ((dN0 * ((double) (f10 - f11))) + ((double) f11));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.G2;
        if (P()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.L;
        float f12 = this.K;
        return (f10 * (f11 - f12)) + f12;
    }

    private void i(Drawable drawable) {
        int i10 = this.D * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
        } else {
            float fMax = i10 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void i0(int i10) {
        BaseSlider<S, L, T>.c cVar = this.f55282j;
        if (cVar == null) {
            this.f55282j = new c(this, null);
        } else {
            removeCallbacks(cVar);
        }
        this.f55282j.a(i10);
        postDelayed(this.f55282j, 200L);
    }

    private void j(com.google.android.material.tooltip.a aVar) {
        aVar.k1(j0.j(this));
    }

    private void j0(com.google.android.material.tooltip.a aVar, float f10) {
        aVar.m1(E(f10));
        int iZ = (this.C + ((int) (Z(f10) * this.U))) - (aVar.getIntrinsicWidth() / 2);
        int iN = n() - (this.F + this.D);
        aVar.setBounds(iZ, iN - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + iZ, iN);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.d.c(j0.j(this), this, rect);
        aVar.setBounds(rect);
        j0.k(this).b(aVar);
    }

    @p0
    private Float k(int i10) {
        float fM = this.W ? m(20) : l();
        if (i10 == 21) {
            if (!P()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (i10 == 22) {
            if (P()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (i10 == 69) {
            return Float.valueOf(-fM);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(fM);
        }
        return null;
    }

    private boolean k0() {
        return this.A == 3;
    }

    private float l() {
        float f10 = this.P;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private boolean l0() {
        return this.V || !(getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m(int i10) {
        float fL = l();
        float f10 = (this.L - this.K) / fL;
        float f11 = i10;
        return f10 <= f11 ? fL : Math.round(f10 / f11) * fL;
    }

    private boolean m0(float f10) {
        return o0(this.N, f10);
    }

    private int n() {
        return (this.f55305z / 2) + ((this.A == 1 || k0()) ? this.f55284l.get(0).getIntrinsicHeight() : 0);
    }

    private double n0(float f10) {
        float f11 = this.P;
        if (f11 <= 0.0f) {
            return f10;
        }
        int i10 = (int) ((this.L - this.K) / f11);
        return ((double) Math.round(f10 * i10)) / ((double) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o0(int i10, float f10) {
        this.O = i10;
        if (Math.abs(f10 - this.M.get(i10).floatValue()) < U3) {
            return false;
        }
        this.M.set(i10, Float.valueOf(G(i10, f10)));
        u(i10);
        return true;
    }

    private boolean p0() {
        return m0(getValueOfTouchPosition());
    }

    private ValueAnimator q(boolean z10) {
        int iF;
        TimeInterpolator timeInterpolatorG;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(F(z10 ? this.f55292q : this.f55288p, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            iF = i9.a.f(getContext(), f55266a4, 83);
            timeInterpolatorG = i9.a.g(getContext(), f55268c4, com.google.android.material.animation.b.f52900e);
        } else {
            iF = i9.a.f(getContext(), f55267b4, 117);
            timeInterpolatorG = i9.a.g(getContext(), f55269d4, com.google.android.material.animation.b.f52898c);
        }
        valueAnimatorOfFloat.setDuration(iF);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorG);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    private void r() {
        if (this.f55284l.size() > this.M.size()) {
            List<com.google.android.material.tooltip.a> listSubList = this.f55284l.subList(this.M.size(), this.f55284l.size());
            for (com.google.android.material.tooltip.a aVar : listSubList) {
                if (j1.O0(this)) {
                    s(aVar);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f55284l.size() >= this.M.size()) {
                break;
            }
            com.google.android.material.tooltip.a aVarV0 = com.google.android.material.tooltip.a.V0(getContext(), null, 0, this.f55283k);
            this.f55284l.add(aVarV0);
            if (j1.O0(this)) {
                j(aVarV0);
            }
        }
        int i10 = this.f55284l.size() != 1 ? 1 : 0;
        Iterator<com.google.android.material.tooltip.a> it = this.f55284l.iterator();
        while (it.hasNext()) {
            it.next().I0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        if (l0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iZ = (int) ((Z(this.M.get(this.O).floatValue()) * this.U) + this.C);
            int iN = n();
            int i10 = this.E;
            androidx.core.graphics.drawable.d.l(background, iZ - i10, iN - i10, iZ + i10, iN + i10);
        }
    }

    private void s(com.google.android.material.tooltip.a aVar) {
        i0 i0VarK = j0.k(this);
        if (i0VarK != null) {
            i0VarK.a(aVar);
            aVar.X0(j0.j(this));
        }
    }

    private void s0(int i10) {
        this.U = Math.max(i10 - (this.C * 2), 0);
        S();
    }

    private void setValuesInternal(@n0 ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.M.size() == arrayList.size() && this.M.equals(arrayList)) {
            return;
        }
        this.M = arrayList;
        this.f55271a0 = true;
        this.O = 0;
        r0();
        r();
        v();
        postInvalidate();
    }

    private float t(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.C) / this.U;
        float f12 = this.K;
        return (f11 * (f12 - this.L)) + f12;
    }

    private void t0() {
        boolean zW = W();
        boolean zV = V();
        if (zW) {
            requestLayout();
        } else if (zV) {
            postInvalidate();
        }
    }

    private void u(int i10) {
        Iterator<L> it = this.f55285m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.M.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f55281i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        i0(i10);
    }

    private void u0() {
        if (this.f55271a0) {
            x0();
            y0();
            w0();
            z0();
            v0();
            C0();
            this.f55271a0 = false;
        }
    }

    private void v() {
        for (L l10 : this.f55285m) {
            Iterator<Float> it = this.M.iterator();
            while (it.hasNext()) {
                l10.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void v0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format(O3, Float.valueOf(minSeparation)));
        }
        float f10 = this.P;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f55291p3 != 1) {
            throw new IllegalStateException(String.format(P3, Float.valueOf(minSeparation), Float.valueOf(this.P)));
        }
        if (minSeparation < f10 || !N(minSeparation)) {
            throw new IllegalStateException(String.format(Q3, Float.valueOf(minSeparation), Float.valueOf(this.P), Float.valueOf(this.P)));
        }
    }

    private void w(@n0 Canvas canvas, int i10, int i11) {
        float[] activeRange = getActiveRange();
        int i12 = this.C;
        float f10 = i10;
        float f11 = i11;
        canvas.drawLine(i12 + (activeRange[0] * f10), f11, i12 + (activeRange[1] * f10), f11, this.f55274c);
    }

    private void w0() {
        if (this.P > 0.0f && !A0(this.L)) {
            throw new IllegalStateException(String.format(N3, Float.valueOf(this.P), Float.valueOf(this.K), Float.valueOf(this.L)));
        }
    }

    private void x(@n0 Canvas canvas, int i10, int i11) {
        float[] activeRange = getActiveRange();
        int i12 = this.C;
        float f10 = i10;
        float f11 = i12 + (activeRange[1] * f10);
        if (f11 < i12 + i10) {
            float f12 = i11;
            canvas.drawLine(f11, f12, i12 + i10, f12, this.f55272b);
        }
        int i13 = this.C;
        float f13 = i13 + (activeRange[0] * f10);
        if (f13 > i13) {
            float f14 = i11;
            canvas.drawLine(i13, f14, f13, f14, this.f55272b);
        }
    }

    private void x0() {
        if (this.K >= this.L) {
            throw new IllegalStateException(String.format(L3, Float.valueOf(this.K), Float.valueOf(this.L)));
        }
    }

    private void y(@n0 Canvas canvas, int i10, int i11, float f10, @n0 Drawable drawable) {
        canvas.save();
        canvas.translate((this.C + ((int) (Z(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void y0() {
        if (this.L <= this.K) {
            throw new IllegalStateException(String.format(M3, Float.valueOf(this.L), Float.valueOf(this.K)));
        }
    }

    private void z(@n0 Canvas canvas, int i10, int i11) {
        for (int i12 = 0; i12 < this.M.size(); i12++) {
            float fFloatValue = this.M.get(i12).floatValue();
            Drawable drawable = this.f55301x2;
            if (drawable != null) {
                y(canvas, i10, i11, fFloatValue, drawable);
            } else if (i12 < this.f55304y2.size()) {
                y(canvas, i10, i11, fFloatValue, this.f55304y2.get(i12));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.C + (Z(fFloatValue) * i10), i11, this.D, this.f55276d);
                }
                y(canvas, i10, i11, fFloatValue, this.f55290p2);
            }
        }
    }

    private void z0() {
        for (Float f10 : this.M) {
            if (f10.floatValue() < this.K || f10.floatValue() > this.L) {
                throw new IllegalStateException(String.format(J3, f10, Float.valueOf(this.K), Float.valueOf(this.L)));
            }
            if (this.P > 0.0f && !A0(f10.floatValue())) {
                throw new IllegalStateException(String.format(K3, f10, Float.valueOf(this.K), Float.valueOf(this.P), Float.valueOf(this.P)));
            }
        }
    }

    @androidx.annotation.j1
    void D(boolean z10) {
        this.V = z10;
    }

    public boolean I() {
        return this.I != null;
    }

    final boolean P() {
        return j1.Z(this) == 1;
    }

    public boolean Q() {
        return this.R;
    }

    protected boolean d0() {
        if (this.N != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fB0 = B0(valueOfTouchPositionAbsolute);
        this.N = 0;
        float fAbs = Math.abs(this.M.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.M.size(); i10++) {
            float fAbs2 = Math.abs(this.M.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float fB1 = B0(this.M.get(i10).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z10 = !P() ? fB1 - fB0 >= 0.0f : fB1 - fB0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.N = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fB1 - fB0) < this.f55293r) {
                        this.N = -1;
                        return false;
                    }
                    if (z10) {
                        this.N = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.N != -1;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@n0 MotionEvent motionEvent) {
        return this.f55280h.i(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f55272b.setColor(H(this.f55303y1));
        this.f55274c.setColor(H(this.f55300x1));
        this.f55278f.setColor(H(this.f55289p1));
        this.f55279g.setColor(H(this.f55275c0));
        for (com.google.android.material.tooltip.a aVar : this.f55284l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f55290p2.isStateful()) {
            this.f55290p2.setState(getDrawableState());
        }
        this.f55277e.setColor(H(this.f55273b0));
        this.f55277e.setAlpha(63);
    }

    public void g(@n0 L l10) {
        this.f55285m.add(l10);
    }

    public void g0(@n0 L l10) {
        this.f55285m.remove(l10);
    }

    @Override // android.view.View
    @n0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @androidx.annotation.j1
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f55280h.k();
    }

    public int getActiveThumbIndex() {
        return this.N;
    }

    public int getFocusedThumbIndex() {
        return this.O;
    }

    @r
    public int getHaloRadius() {
        return this.E;
    }

    @n0
    public ColorStateList getHaloTintList() {
        return this.f55273b0;
    }

    public int getLabelBehavior() {
        return this.A;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.P;
    }

    public float getThumbElevation() {
        return this.f55290p2.x();
    }

    @r
    public int getThumbRadius() {
        return this.D;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f55290p2.N();
    }

    public float getThumbStrokeWidth() {
        return this.f55290p2.Q();
    }

    @n0
    public ColorStateList getThumbTintList() {
        return this.f55290p2.y();
    }

    @r
    public int getTickActiveRadius() {
        return this.S;
    }

    @n0
    public ColorStateList getTickActiveTintList() {
        return this.f55275c0;
    }

    @r
    public int getTickInactiveRadius() {
        return this.T;
    }

    @n0
    public ColorStateList getTickInactiveTintList() {
        return this.f55289p1;
    }

    @n0
    public ColorStateList getTickTintList() {
        if (this.f55289p1.equals(this.f55275c0)) {
            return this.f55275c0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @n0
    public ColorStateList getTrackActiveTintList() {
        return this.f55300x1;
    }

    @r
    public int getTrackHeight() {
        return this.B;
    }

    @n0
    public ColorStateList getTrackInactiveTintList() {
        return this.f55303y1;
    }

    @r
    public int getTrackSidePadding() {
        return this.C;
    }

    @n0
    public ColorStateList getTrackTintList() {
        if (this.f55303y1.equals(this.f55300x1)) {
            return this.f55300x1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @r
    public int getTrackWidth() {
        return this.U;
    }

    public float getValueFrom() {
        return this.K;
    }

    public float getValueTo() {
        return this.L;
    }

    @n0
    List<Float> getValues() {
        return new ArrayList(this.M);
    }

    public void h(@n0 T t10) {
        this.f55286n.add(t10);
    }

    public void h0(@n0 T t10) {
        this.f55286n.remove(t10);
    }

    public void o() {
        this.f55285m.clear();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<com.google.android.material.tooltip.a> it = this.f55284l.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.c cVar = this.f55282j;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        this.f55287o = false;
        Iterator<com.google.android.material.tooltip.a> it = this.f55284l.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@n0 Canvas canvas) {
        if (this.f55271a0) {
            u0();
            S();
        }
        super.onDraw(canvas);
        int iN = n();
        x(canvas, this.U, iN);
        if (((Float) Collections.max(getValues())).floatValue() > this.K) {
            w(canvas, this.U, iN);
        }
        U(canvas);
        if ((this.J || isFocused()) && isEnabled()) {
            T(canvas, this.U, iN);
        }
        if ((this.N != -1 || k0()) && isEnabled()) {
            A();
        } else {
            B();
        }
        z(canvas, this.U, iN);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @p0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            C(i10);
            this.f55280h.K(this.O);
        } else {
            this.N = -1;
            this.f55280h.b(this.O);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @n0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.M.size() == 1) {
            this.N = 0;
        }
        if (this.N == -1) {
            Boolean boolA0 = a0(i10, keyEvent);
            return boolA0 != null ? boolA0.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        this.W |= keyEvent.isLongPress();
        Float fK = k(i10);
        if (fK != null) {
            if (m0(this.M.get(this.N).floatValue() + fK.floatValue())) {
                r0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return X(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return X(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.N = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @n0 KeyEvent keyEvent) {
        this.W = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f55305z + ((this.A == 1 || k0()) ? this.f55284l.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.K = sliderState.f55306b;
        this.L = sliderState.f55307c;
        setValuesInternal(sliderState.f55308d);
        this.P = sliderState.f55309e;
        if (sliderState.f55310f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f55306b = this.K;
        sliderState.f55307c = this.L;
        sliderState.f55308d = new ArrayList<>(this.M);
        sliderState.f55309e = this.P;
        sliderState.f55310f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        s0(i10);
        r0();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    @Override // android.view.View
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (!isEnabled()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float f10 = (x10 - this.C) / this.U;
        this.G2 = f10;
        float fMax = Math.max(0.0f, f10);
        this.G2 = fMax;
        this.G2 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = x10;
            if (!O(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (d0()) {
                    requestFocus();
                    this.J = true;
                    p0();
                    r0();
                    invalidate();
                    b0();
                }
            }
        } else if (actionMasked == 1) {
            this.J = false;
            motionEvent2 = this.H;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.H.getX() - motionEvent.getX()) <= this.f55293r && Math.abs(this.H.getY() - motionEvent.getY()) <= this.f55293r && d0()) {
                b0();
            }
            if (this.N != -1) {
                p0();
                r0();
                this.N = -1;
                c0();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.J) {
                if (O(motionEvent) && Math.abs(x10 - this.G) < this.f55293r) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                b0();
            }
            if (d0()) {
                this.J = true;
                p0();
                r0();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.J = false;
            motionEvent2 = this.H;
            if (motionEvent2 != null) {
                b0();
            }
            if (this.N != -1) {
                p0();
                r0();
                this.N = -1;
                c0();
            }
            invalidate();
        }
        setPressed(this.J);
        this.H = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@n0 View view, int i10) {
        i0 i0VarK;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (i0VarK = j0.k(this)) == null) {
            return;
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f55284l.iterator();
        while (it.hasNext()) {
            i0VarK.a(it.next());
        }
    }

    public void p() {
        this.f55286n.clear();
    }

    void q0(int i10, Rect rect) {
        int iZ = this.C + ((int) (Z(getValues().get(i10).floatValue()) * this.U));
        int iN = n();
        int i11 = this.D;
        int i12 = this.f55299x;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(iZ - i13, iN - i13, iZ + i13, iN + i13);
    }

    protected void setActiveThumbIndex(int i10) {
        this.N = i10;
    }

    void setCustomThumbDrawable(@v int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    void setCustomThumbDrawable(@n0 Drawable drawable) {
        this.f55301x2 = J(drawable);
        this.f55304y2.clear();
        postInvalidate();
    }

    void setCustomThumbDrawablesForValues(@n0 @v int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    void setCustomThumbDrawablesForValues(@n0 Drawable... drawableArr) {
        this.f55301x2 = null;
        this.f55304y2 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f55304y2.add(J(drawable));
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.M.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.O = i10;
        this.f55280h.K(i10);
        postInvalidate();
    }

    public void setHaloRadius(@f0(from = 0) @r int i10) {
        if (i10 == this.E) {
            return;
        }
        this.E = i10;
        Drawable background = getBackground();
        if (l0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            e9.a.i((RippleDrawable) background, this.E);
        }
    }

    public void setHaloRadiusResource(@q int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55273b0)) {
            return;
        }
        this.f55273b0 = colorStateList;
        Drawable background = getBackground();
        if (!l0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f55277e.setColor(H(colorStateList));
        this.f55277e.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.A != i10) {
            this.A = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(@p0 com.google.android.material.slider.d dVar) {
        this.I = dVar;
    }

    protected void setSeparationUnit(int i10) {
        this.f55291p3 = i10;
        this.f55271a0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(N3, Float.valueOf(f10), Float.valueOf(this.K), Float.valueOf(this.L)));
        }
        if (this.P != f10) {
            this.P = f10;
            this.f55271a0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.f55290p2.n0(f10);
    }

    public void setThumbElevationResource(@q int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(@f0(from = 0) @r int i10) {
        if (i10 == this.D) {
            return;
        }
        this.D = i10;
        this.f55290p2.setShapeAppearanceModel(p.a().q(0, this.D).m());
        k kVar = this.f55290p2;
        int i11 = this.D;
        kVar.setBounds(0, 0, i11 * 2, i11 * 2);
        Drawable drawable = this.f55301x2;
        if (drawable != null) {
            i(drawable);
        }
        Iterator<Drawable> it = this.f55304y2.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        t0();
    }

    public void setThumbRadiusResource(@q int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(@p0 ColorStateList colorStateList) {
        this.f55290p2.F0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@n int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(b0.a.a(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.f55290p2.I0(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@q int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55290p2.y())) {
            return;
        }
        this.f55290p2.o0(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(@f0(from = 0) @r int i10) {
        if (this.S != i10) {
            this.S = i10;
            this.f55279g.setStrokeWidth(i10 * 2);
            t0();
        }
    }

    public void setTickActiveTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55275c0)) {
            return;
        }
        this.f55275c0 = colorStateList;
        this.f55279g.setColor(H(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@f0(from = 0) @r int i10) {
        if (this.T != i10) {
            this.T = i10;
            this.f55278f.setStrokeWidth(i10 * 2);
            t0();
        }
    }

    public void setTickInactiveTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55289p1)) {
            return;
        }
        this.f55289p1 = colorStateList;
        this.f55278f.setColor(H(colorStateList));
        invalidate();
    }

    public void setTickTintList(@n0 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55300x1)) {
            return;
        }
        this.f55300x1 = colorStateList;
        this.f55274c.setColor(H(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@f0(from = 0) @r int i10) {
        if (this.B != i10) {
            this.B = i10;
            K();
            t0();
        }
    }

    public void setTrackInactiveTintList(@n0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f55303y1)) {
            return;
        }
        this.f55303y1 = colorStateList;
        this.f55272b.setColor(H(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@n0 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.K = f10;
        this.f55271a0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.L = f10;
        this.f55271a0 = true;
        postInvalidate();
    }

    void setValues(@n0 List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    void setValues(@n0 Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }
}
