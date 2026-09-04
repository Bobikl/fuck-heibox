package com.max.hbcustomview.Shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class ShimmerLayout extends FrameLayout {
    private static final byte A = 0;
    private static final byte B = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68819u = 1500;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f68820v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte f68821w = -45;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte f68822x = 45;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte f68823y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte f68824z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f68826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f68827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f68828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f68829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f68830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Canvas f68831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f68832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f68839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f68840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f68842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f68843t;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32169bc, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ShimmerLayout.this.o();
            return true;
        }
    }

    public class b implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32216dc, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShimmerLayout.this.f68833j = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32192cc, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShimmerLayout.this.f68833j = true;
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f68846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f68847c;

        c(int i10, int i11) {
            this.f68846b = i10;
            this.f68847c = i11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32239ec, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShimmerLayout.this.f68825b = this.f68846b + ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (ShimmerLayout.this.f68825b + this.f68847c >= 0) {
                ShimmerLayout.this.invalidate();
            }
        }
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68841r = 0;
        this.f68842s = 0L;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.R2, 0, 0);
        try {
            this.f68838o = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_angle, 20);
            this.f68835l = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_animation_duration, 1500);
            this.f68836m = typedArrayObtainStyledAttributes.getColor(R.styleable.ShimmerLayout_shimmer_color, j(R.color.white_alpha30));
            this.f68837n = typedArrayObtainStyledAttributes.getColor(R.styleable.ShimmerLayout_shimmer_secondary_color, j(R.color.white_alpha20));
            this.f68834k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ShimmerLayout_shimmer_auto, false);
            this.f68841r = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_anim_repeat_count, -1);
            this.f68839p = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShimmerLayout_shimmer_mask_width, 0.5f);
            this.f68840q = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShimmerLayout_shimmer_gradient_center_color_width, 0.1f);
            this.f68832i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ShimmerLayout_shimmer_reverse_animation, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f68839p);
            setGradientCenterColorWidth(this.f68840q);
            setShimmerAngle(this.f68838o);
            if (this.f68834k && getVisibility() == 0) {
                o();
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private Rect d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Zb, new Class[0], Rect.class);
        return patchProxyResultProxy.isSupported ? (Rect) patchProxyResultProxy.result : new Rect(0, 0, e(), getHeight());
    }

    private int e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32146ac, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((((double) ((getWidth() / 2) * this.f68839p)) / Math.cos(Math.toRadians(Math.abs(this.f68838o)))) + (((double) getHeight()) * Math.tan(Math.toRadians(Math.abs(this.f68838o)))));
    }

    private Bitmap f(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Wb, new Class[]{cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    private void g() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ub, new Class[0], Void.TYPE).isSupported && this.f68827d == null) {
            int iK = k(this.f68836m);
            float width = (getWidth() / 2) * this.f68839p;
            float height = this.f68838o >= 0 ? getHeight() : 0.0f;
            LinearGradient linearGradient = new LinearGradient(0.0f, height, ((float) Math.cos(Math.toRadians(this.f68838o))) * width, height + (((float) Math.sin(Math.toRadians(this.f68838o))) * width), new int[]{iK, this.f68837n, this.f68836m, iK}, getGradientColorDistribution(), Shader.TileMode.CLAMP);
            Bitmap bitmap = this.f68829f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            ComposeShader composeShader = new ComposeShader(linearGradient, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.DST_IN);
            Paint paint = new Paint();
            this.f68827d = paint;
            paint.setAntiAlias(true);
            this.f68827d.setDither(true);
            this.f68827d.setFilterBitmap(true);
            this.f68827d.setShader(composeShader);
        }
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f10 = this.f68840q;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Tb, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (this.f68830g == null) {
            this.f68830g = f(this.f68826c.width(), getHeight());
        }
        return this.f68830g;
    }

    private Animator getShimmerAnimation() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Vb, new Class[0], Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        ValueAnimator valueAnimator = this.f68828e;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f68826c == null) {
            this.f68826c = d();
        }
        int width = getWidth();
        int i10 = getWidth() > this.f68826c.width() ? -width : -this.f68826c.width();
        int iWidth = this.f68826c.width();
        int i11 = width - i10;
        ValueAnimator valueAnimatorOfInt = this.f68832i ? ValueAnimator.ofInt(i11, 0) : ValueAnimator.ofInt(0, i11);
        this.f68828e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f68835l);
        this.f68828e.setRepeatCount(this.f68841r);
        this.f68828e.setStartDelay(this.f68842s);
        this.f68828e.setInterpolator(CubicBezierInterpolators.Type.EASE_OUT.create());
        this.f68828e.addUpdateListener(new c(i10, iWidth));
        return this.f68828e;
    }

    private void h(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Pb, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f68829f = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.f68831h == null) {
            this.f68831h = new Canvas(this.f68829f);
        }
        this.f68831h.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f68831h.save();
        this.f68831h.translate(-this.f68825b, 0.0f);
        super.dispatchDraw(this.f68831h);
        this.f68831h.restore();
        i(canvas);
        this.f68829f = null;
    }

    private void i(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Qb, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        g();
        canvas.save();
        canvas.translate(this.f68825b, 0.0f);
        Rect rect = this.f68826c;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f68826c.height(), this.f68827d);
        canvas.restore();
    }

    private int j(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Xb, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : getContext().getColor(i10);
    }

    private int k(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Yb, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(0, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    private void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Sb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68831h = null;
        Bitmap bitmap = this.f68830g;
        if (bitmap != null) {
            bitmap.recycle();
            this.f68830g = null;
        }
    }

    private void m() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ob, new Class[0], Void.TYPE).isSupported && this.f68833j) {
            n();
            o();
        }
    }

    private void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Rb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.f68828e;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f68828e.removeAllUpdateListeners();
        }
        this.f68828e = null;
        this.f68827d = null;
        this.f68833j = false;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Db, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f68833j || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            h(canvas);
        }
    }

    public void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fb, new Class[0], Void.TYPE).isSupported || this.f68833j) {
            return;
        }
        if (getWidth() == 0) {
            this.f68843t = new a();
            getViewTreeObserver().addOnPreDrawListener(this.f68843t);
        } else {
            Animator shimmerAnimation = getShimmerAnimation();
            shimmerAnimation.start();
            shimmerAnimation.addListener(new b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Cb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n();
        super.onDetachedFromWindow();
    }

    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Gb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f68843t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f68843t);
        }
        n();
    }

    public void setAnimDelay(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.Mb, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68842s = j10;
        m();
    }

    public void setAnimationReversed(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Jb, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68832i = z10;
        m();
    }

    public void setGradientCenterColorWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Nb, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 <= 0.0f || 1.0f <= f10) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", (byte) 0, (byte) 1));
        }
        this.f68840q = f10;
        m();
    }

    public void setMaskWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Lb, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 <= 0.0f || 1.0f < f10) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", (byte) 0, (byte) 1));
        }
        this.f68839p = f10;
        m();
    }

    public void setShimmerAngle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Kb, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < -45 || 45 < i10) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", Byte.valueOf(f68821w), Byte.valueOf(f68822x)));
        }
        this.f68838o = i10;
        m();
    }

    public void setShimmerAnimationDuration(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ib, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68835l = i10;
        m();
    }

    public void setShimmerColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Hb, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68836m = i10;
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Eb, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setVisibility(i10);
        if (i10 != 0) {
            p();
        } else if (this.f68834k) {
            o();
        }
    }
}
