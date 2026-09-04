package com.scwang.smartrefresh.layout.header;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.core.content.d;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import ng.g;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public class BezierRadarHeader extends InternalAbstract implements g {
    protected static final byte A = 0;
    protected static final byte B = 1;
    protected static final byte C = 2;
    protected static final byte D = 3;
    protected static final byte E = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f96705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f96706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f96707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f96708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f96709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f96710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Path f96711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Paint f96712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f96713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f96714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f96715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f96716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f96717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f96718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f96719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected float f96720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f96721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected float f96722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected float f96723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected float f96724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected Animator f96725y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected RectF f96726z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96727a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96727a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96727a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte f96728b;

        b(byte b10) {
            this.f96728b = b10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            byte b10 = this.f96728b;
            if (b10 == 0) {
                BezierRadarHeader.this.f96724x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b10) {
                BezierRadarHeader bezierRadarHeader = BezierRadarHeader.this;
                if (bezierRadarHeader.f96709i) {
                    valueAnimator.cancel();
                    return;
                }
                bezierRadarHeader.f96714n = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b10) {
                BezierRadarHeader.this.f96717q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b10) {
                BezierRadarHeader.this.f96720t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b10) {
                BezierRadarHeader.this.f96721u = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            BezierRadarHeader.this.invalidate();
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f96710j = false;
        this.f96715o = -1;
        this.f96716p = 0;
        this.f96721u = 0;
        this.f96722v = 0.0f;
        this.f96723w = 0.0f;
        this.f96724x = 0.0f;
        this.f96726z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f96765c = og.b.f132312f;
        this.f96711k = new Path();
        Paint paint = new Paint();
        this.f96712l = paint;
        paint.setAntiAlias(true);
        this.f96719s = com.scwang.smartrefresh.layout.util.b.d(7.0f);
        this.f96722v = com.scwang.smartrefresh.layout.util.b.d(20.0f);
        this.f96723w = com.scwang.smartrefresh.layout.util.b.d(7.0f);
        this.f96712l.setStrokeWidth(com.scwang.smartrefresh.layout.util.b.d(3.0f));
        setMinimumHeight(com.scwang.smartrefresh.layout.util.b.d(100.0f));
        if (isInEditMode()) {
            this.f96713m = 1000;
            this.f96724x = 1.0f;
            this.f96721u = 270;
        } else {
            this.f96724x = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96574b);
        this.f96710j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BezierRadarHeader_srlEnableHorizontalDrag, this.f96710j);
        int i10 = R.styleable.BezierRadarHeader_srlAccentColor;
        u(typedArrayObtainStyledAttributes.getColor(i10, -1));
        int i11 = R.styleable.BezierRadarHeader_srlPrimaryColor;
        x(typedArrayObtainStyledAttributes.getColor(i11, -14540254));
        this.f96708h = typedArrayObtainStyledAttributes.hasValue(i10);
        this.f96707g = typedArrayObtainStyledAttributes.hasValue(i11);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = isInEditMode() ? getHeight() : this.f96716p;
        t(canvas, width);
        f(canvas, width, height);
        k(canvas, width, height);
        s(canvas, width, height);
        super.dispatchDraw(canvas);
    }

    protected void f(Canvas canvas, int i10, int i11) {
        if (this.f96717q > 0.0f) {
            this.f96712l.setColor(this.f96705e);
            float fJ = com.scwang.smartrefresh.layout.util.b.j(i11);
            float f10 = i10;
            float f11 = 7.0f;
            float f12 = (f10 * 1.0f) / 7.0f;
            float f13 = this.f96718r;
            float f14 = (f12 * f13) - (f13 > 1.0f ? ((f13 - 1.0f) * f12) / f13 : 0.0f);
            float f15 = i11;
            float f16 = f15 - (f13 > 1.0f ? (((f13 - 1.0f) * f15) / 2.0f) / f13 : 0.0f);
            int i12 = 0;
            while (i12 < 7) {
                float f17 = (i12 + 1.0f) - 4.0f;
                this.f96712l.setAlpha((int) (((double) (this.f96717q * (1.0f - ((Math.abs(f17) / f11) * 2.0f)) * 255.0f)) * (1.0d - (1.0d / Math.pow((((double) fJ) / 800.0d) + 1.0d, 15.0d)))));
                float f18 = this.f96719s * (1.0f - (1.0f / ((fJ / 10.0f) + 1.0f)));
                canvas.drawCircle(((f10 / 2.0f) - (f18 / 2.0f)) + (f14 * f17), f16 / 2.0f, f18, this.f96712l);
                i12++;
                f11 = 7.0f;
            }
            this.f96712l.setAlpha(255);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public int g(@n0 j jVar, boolean z10) {
        Animator animator = this.f96725y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f96725y.end();
            this.f96725y = null;
        }
        int width = getWidth();
        int i10 = this.f96716p;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f96722v, (float) Math.sqrt((width * width) + (i10 * i10)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new b((byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void h(float f10, int i10, int i11) {
        this.f96715o = i10;
        invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public boolean j() {
        return this.f96710j;
    }

    protected void k(Canvas canvas, int i10, int i11) {
        if (this.f96725y != null || isInEditMode()) {
            float f10 = this.f96722v;
            float f11 = this.f96724x;
            float f12 = f10 * f11;
            float f13 = this.f96723w * f11;
            this.f96712l.setColor(this.f96705e);
            this.f96712l.setStyle(Paint.Style.FILL);
            float f14 = i10 / 2.0f;
            float f15 = i11 / 2.0f;
            canvas.drawCircle(f14, f15, f12, this.f96712l);
            this.f96712l.setStyle(Paint.Style.STROKE);
            float f16 = f13 + f12;
            canvas.drawCircle(f14, f15, f16, this.f96712l);
            this.f96712l.setColor((this.f96706f & 16777215) | 1426063360);
            this.f96712l.setStyle(Paint.Style.FILL);
            this.f96726z.set(f14 - f12, f15 - f12, f14 + f12, f12 + f15);
            canvas.drawArc(this.f96726z, 270.0f, this.f96721u, true, this.f96712l);
            this.f96712l.setStyle(Paint.Style.STROKE);
            this.f96726z.set(f14 - f16, f15 - f16, f14 + f16, f15 + f16);
            canvas.drawArc(this.f96726z, 270.0f, this.f96721u, false, this.f96712l);
            this.f96712l.setStyle(Paint.Style.FILL);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void o(@n0 j jVar, int i10, int i11) {
        this.f96713m = i10 - 1;
        this.f96709i = false;
        com.scwang.smartrefresh.layout.util.b bVar = new com.scwang.smartrefresh.layout.util.b(com.scwang.smartrefresh.layout.util.b.f96794c);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(bVar);
        valueAnimatorOfFloat.addUpdateListener(new b((byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(bVar);
        valueAnimatorOfFloat2.addUpdateListener(new b((byte) 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new b((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i12 = this.f96714n;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i12, 0, -((int) (i12 * 0.8f)), 0, -((int) (i12 * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new b((byte) 1));
        valueAnimatorOfInt2.setInterpolator(new com.scwang.smartrefresh.layout.util.b(com.scwang.smartrefresh.layout.util.b.f96794c));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.f96725y = animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f96725y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f96725y.end();
            this.f96725y = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, pg.f
    public void q(@n0 j jVar, @n0 RefreshState refreshState, @n0 RefreshState refreshState2) {
        int i10 = a.f96727a[refreshState2.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f96717q = 1.0f;
            this.f96724x = 0.0f;
            this.f96720t = 0.0f;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void r(boolean z10, float f10, int i10, int i11, int i12) {
        this.f96716p = i10;
        if (z10 || this.f96709i) {
            this.f96709i = true;
            this.f96713m = Math.min(i11, i10);
            this.f96714n = (int) (Math.max(0, i10 - i11) * 1.9f);
            this.f96718r = f10;
            invalidate();
        }
    }

    protected void s(Canvas canvas, int i10, int i11) {
        if (this.f96720t > 0.0f) {
            this.f96712l.setColor(this.f96705e);
            canvas.drawCircle(i10 / 2.0f, i11 / 2.0f, this.f96720t, this.f96712l);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    @Deprecated
    public void setPrimaryColors(@l int... iArr) {
        if (iArr.length > 0 && !this.f96707g) {
            x(iArr[0]);
            this.f96707g = false;
        }
        if (iArr.length <= 1 || this.f96708h) {
            return;
        }
        u(iArr[1]);
        this.f96708h = false;
    }

    protected void t(Canvas canvas, int i10) {
        this.f96711k.reset();
        this.f96711k.lineTo(0.0f, this.f96713m);
        Path path = this.f96711k;
        int i11 = this.f96715o;
        float f10 = i11 >= 0 ? i11 : i10 / 2.0f;
        int i12 = this.f96713m;
        float f11 = i10;
        path.quadTo(f10, this.f96714n + i12, f11, i12);
        this.f96711k.lineTo(f11, 0.0f);
        this.f96712l.setColor(this.f96706f);
        canvas.drawPath(this.f96711k, this.f96712l);
    }

    public BezierRadarHeader u(@l int i10) {
        this.f96705e = i10;
        this.f96708h = true;
        return this;
    }

    public BezierRadarHeader v(@n int i10) {
        u(d.f(getContext(), i10));
        return this;
    }

    public BezierRadarHeader w(boolean z10) {
        this.f96710j = z10;
        if (!z10) {
            this.f96715o = -1;
        }
        return this;
    }

    public BezierRadarHeader x(@l int i10) {
        this.f96706f = i10;
        this.f96707g = true;
        return this;
    }

    public BezierRadarHeader y(@n int i10) {
        x(d.f(getContext(), i10));
        return this;
    }
}
