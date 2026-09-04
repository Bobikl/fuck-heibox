package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ClockHandView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f55730w = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f55732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ValueAnimator f55733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f55735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f55736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f55738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<c> f55740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f55741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f55742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f55743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f55744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @t0
    private final int f55745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f55746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f55747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f55748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f55749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f55751v;

    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(@x(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public interface c {
        void d(@x(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f55733d = new ValueAnimator();
        this.f55740k = new ArrayList();
        Paint paint = new Paint();
        this.f55743n = paint;
        this.f55744o = new RectF();
        this.f55751v = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.G, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f55731b = i9.a.f(context, R.attr.motionDurationLong2, 200);
        this.f55732c = i9.a.g(context, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b);
        this.f55750u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f55741l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f55745p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f55742m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.f55738i = ViewConfiguration.get(context).getScaledTouchSlop();
        j1.R1(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(float f10, float f11) {
        this.f55751v = h9.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) f(2)) + j0.g(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iF = f(this.f55751v);
        float f10 = width;
        float f11 = iF;
        float fCos = (((float) Math.cos(this.f55749t)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f55749t))) + f12;
        this.f55743n.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f55741l, this.f55743n);
        double dSin = Math.sin(this.f55749t);
        double dCos = Math.cos(this.f55749t);
        double d10 = iF - this.f55741l;
        this.f55743n.setStrokeWidth(this.f55745p);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f55743n);
        canvas.drawCircle(f10, f12, this.f55742m, this.f55743n);
    }

    private int e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    @r
    private int f(int i10) {
        return i10 == 2 ? Math.round(this.f55750u * 0.66f) : this.f55750u;
    }

    private Pair<Float, Float> g(float f10) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f10) > 180.0f) {
            if (handRotation > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (handRotation < 180.0f && f10 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f10));
    }

    private boolean h(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fE = e(f10, f11);
        boolean z13 = false;
        boolean z14 = getHandRotation() != fE;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f55734e) {
            z13 = true;
        }
        setHandRotation(fE, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ValueAnimator valueAnimator) {
        j(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void j(@x(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f55746q = f11;
        this.f55749t = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f12 = f(this.f55751v);
        float fCos = width + (((float) Math.cos(this.f55749t)) * f12);
        float fSin = height + (f12 * ((float) Math.sin(this.f55749t)));
        RectF rectF = this.f55744o;
        int i10 = this.f55741l;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<c> it = this.f55740k.iterator();
        while (it.hasNext()) {
            it.next().d(f11, z10);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.f55740k.add(cVar);
    }

    int getCurrentLevel() {
        return this.f55751v;
    }

    public RectF getCurrentSelectorBox() {
        return this.f55744o;
    }

    @x(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.f55746q;
    }

    public int getSelectorRadius() {
        return this.f55741l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f55733d.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f55735f = x10;
            this.f55736g = y10;
            this.f55737h = true;
            this.f55747r = false;
            z10 = false;
            z11 = false;
            z12 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f55735f);
            int i11 = (int) (y10 - this.f55736g);
            this.f55737h = (i10 * i10) + (i11 * i11) > this.f55738i;
            boolean z13 = this.f55747r;
            z10 = actionMasked == 1;
            if (this.f55739j) {
                c(x10, y10);
            }
            z12 = false;
            z11 = z13;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        boolean zH = h(x10, y10, z11, z12, z10) | this.f55747r;
        this.f55747r = zH;
        if (zH && z10 && (bVar = this.f55748s) != null) {
            bVar.a(e(x10, y10), this.f55737h);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f55734e = z10;
    }

    public void setCircleRadius(@r int i10) {
        this.f55750u = i10;
        invalidate();
    }

    void setCurrentLevel(int i10) {
        this.f55751v = i10;
        invalidate();
    }

    public void setHandRotation(@x(from = 0.0d, to = 360.0d) float f10) {
        setHandRotation(f10, false);
    }

    public void setHandRotation(@x(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f55733d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            j(f10, false);
            return;
        }
        Pair<Float, Float> pairG = g(f10);
        this.f55733d.setFloatValues(((Float) pairG.first).floatValue(), ((Float) pairG.second).floatValue());
        this.f55733d.setDuration(this.f55731b);
        this.f55733d.setInterpolator(this.f55732c);
        this.f55733d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f55767b.i(valueAnimator2);
            }
        });
        this.f55733d.addListener(new a());
        this.f55733d.start();
    }

    void setMultiLevel(boolean z10) {
        if (this.f55739j && !z10) {
            this.f55751v = 1;
        }
        this.f55739j = z10;
        invalidate();
    }

    public void setOnActionUpListener(b bVar) {
        this.f55748s = bVar;
    }
}
