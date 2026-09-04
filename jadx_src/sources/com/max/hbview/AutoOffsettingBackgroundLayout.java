package com.max.hbview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AutoOffsettingBackgroundLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class AutoOffsettingBackgroundLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    public static final b f73693x = new b(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f73694y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f73695z = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f73696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f73697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f73698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f73699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f73700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f73701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f73702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Matrix f73703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private Drawable f73704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private Bitmap f73705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f73706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final ArrayList<Pair<Integer, Integer>> f73707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f73709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f73710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f73711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f73712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f73713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f73714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private double f73715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f73716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f73717w;

    /* JADX INFO: compiled from: AutoOffsettingBackgroundLayout.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final WeakReference<AutoOffsettingBackgroundLayout> f73718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d Looper looper, @d AutoOffsettingBackgroundLayout autoView) {
            super(looper);
            f0.p(looper, "looper");
            f0.p(autoView, "autoView");
            this.f73718a = new WeakReference<>(autoView);
        }

        @Override // android.os.Handler
        public void handleMessage(@d Message msg) {
            AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout;
            Bitmap bitmap;
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, c.k.cx, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (msg.what != 1 || (autoOffsettingBackgroundLayout = this.f73718a.get()) == null) {
                return;
            }
            if (autoOffsettingBackgroundLayout.f73706l == 1) {
                if (autoOffsettingBackgroundLayout.f73705k != null) {
                    if (autoOffsettingBackgroundLayout.f73710p > autoOffsettingBackgroundLayout.getLimitX() - autoOffsettingBackgroundLayout.f73696b || autoOffsettingBackgroundLayout.f73710p < (-autoOffsettingBackgroundLayout.getLimitX())) {
                        autoOffsettingBackgroundLayout.f73710p = 0.0f;
                    }
                    if (autoOffsettingBackgroundLayout.f73711q > autoOffsettingBackgroundLayout.getLimitY() - autoOffsettingBackgroundLayout.f73697c || autoOffsettingBackgroundLayout.f73711q < (-autoOffsettingBackgroundLayout.getLimitY())) {
                        autoOffsettingBackgroundLayout.f73711q = 0.0f;
                    }
                }
            } else if (autoOffsettingBackgroundLayout.f73716v && (bitmap = autoOffsettingBackgroundLayout.f73705k) != null) {
                float width = autoOffsettingBackgroundLayout.f73710p - bitmap.getWidth();
                float height = autoOffsettingBackgroundLayout.f73711q - bitmap.getHeight();
                if (width < (-bitmap.getWidth()) || width >= (-autoOffsettingBackgroundLayout.f73696b)) {
                    autoOffsettingBackgroundLayout.f73710p = 0.0f;
                }
                if (height < (-bitmap.getHeight()) || width >= (-autoOffsettingBackgroundLayout.f73697c)) {
                    autoOffsettingBackgroundLayout.f73711q = 0.0f;
                }
            }
            autoOffsettingBackgroundLayout.f73711q += (float) autoOffsettingBackgroundLayout.f73697c;
            autoOffsettingBackgroundLayout.f73710p += (float) autoOffsettingBackgroundLayout.f73696b;
            autoOffsettingBackgroundLayout.invalidate();
            a aVar = autoOffsettingBackgroundLayout.f73717w;
            a aVar2 = null;
            if (aVar == null) {
                f0.S("handler");
                aVar = null;
            }
            aVar.removeCallbacksAndMessages(null);
            a aVar3 = autoOffsettingBackgroundLayout.f73717w;
            if (aVar3 == null) {
                f0.S("handler");
            } else {
                aVar2 = aVar3;
            }
            aVar2.sendEmptyMessageDelayed(1, 5L);
        }
    }

    /* JADX INFO: compiled from: AutoOffsettingBackgroundLayout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoOffsettingBackgroundLayout(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoOffsettingBackgroundLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOffsettingBackgroundLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73707m = new ArrayList<>();
        this.f73708n = 1;
        this.f73709o = 1;
        this.f73713s = 0.7853981633974483d;
        n(context, attributeSet, i10);
    }

    private final boolean k(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Xw, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (Pair<Integer, Integer> pair : this.f73707m) {
            if (pair.e().intValue() == i10 && pair.f().intValue() == i11) {
                return true;
            }
        }
        return false;
    }

    private final int l(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, c.k.bx, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final void m(Canvas canvas, float f10, float f11, float f12, float f13, int i10, int i11) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Yw, new Class[]{Canvas.class, cls, cls, cls, cls, cls2, cls2}, Void.TYPE).isSupported) {
            return;
        }
        float f14 = f12 + f10;
        float f15 = f13 + f11;
        if (k(i10, i11)) {
            return;
        }
        this.f73707m.add(new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11)));
        double d10 = f14;
        double d11 = 2;
        if (d10 <= ((double) getMeasuredWidth()) + (this.f73714t / d11)) {
            double d12 = f15;
            double measuredHeight = getMeasuredHeight();
            double d13 = this.f73715u;
            if (d12 <= measuredHeight + (d13 / d11)) {
                double d14 = ((double) f11) - (d13 / d11);
                Bitmap bitmap = this.f73705k;
                f0.m(bitmap);
                if (d12 >= d14 - ((double) bitmap.getHeight())) {
                    double d15 = ((double) f10) - (this.f73714t / d11);
                    Bitmap bitmap2 = this.f73705k;
                    f0.m(bitmap2);
                    if (d10 >= d15 - ((double) bitmap2.getWidth())) {
                        Bitmap bitmap3 = this.f73705k;
                        f0.m(bitmap3);
                        m(canvas, f10, f11, f12, (bitmap3.getHeight() + f13) - 0.5f, i10, i11 + 1);
                        Bitmap bitmap4 = this.f73705k;
                        f0.m(bitmap4);
                        m(canvas, f10, f11, f12, (f13 - bitmap4.getHeight()) + 0.5f, i10, i11 - 1);
                        Bitmap bitmap5 = this.f73705k;
                        f0.m(bitmap5);
                        m(canvas, f10, f11, (bitmap5.getWidth() + f12) - 0.5f, f13, i10 + 1, i11);
                        Bitmap bitmap6 = this.f73705k;
                        f0.m(bitmap6);
                        m(canvas, f10, f11, (f12 - bitmap6.getWidth()) + 0.5f, f13, i10 - 1, i11);
                        Matrix matrix = this.f73703i;
                        Paint paint = null;
                        if (matrix == null) {
                            f0.S("mMatrix");
                            matrix = null;
                        }
                        matrix.reset();
                        Matrix matrix2 = this.f73703i;
                        if (matrix2 == null) {
                            f0.S("mMatrix");
                            matrix2 = null;
                        }
                        matrix2.preRotate((float) ((this.f73699e / 3.141592653589793d) * ((double) 180.0f)));
                        Matrix matrix3 = this.f73703i;
                        if (matrix3 == null) {
                            f0.S("mMatrix");
                            matrix3 = null;
                        }
                        matrix3.preTranslate(f14, f15);
                        if (canvas != null) {
                            Bitmap bitmap7 = this.f73705k;
                            f0.m(bitmap7);
                            Matrix matrix4 = this.f73703i;
                            if (matrix4 == null) {
                                f0.S("mMatrix");
                                matrix4 = null;
                            }
                            Paint paint2 = this.f73702h;
                            if (paint2 == null) {
                                f0.S("mPaint");
                            } else {
                                paint = paint2;
                            }
                            canvas.drawBitmap(bitmap7, matrix4, paint);
                        }
                    }
                }
            }
        }
    }

    private final void n(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, c.k.Rw, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f73815t, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setDirection((((double) typedArrayObtainStyledAttributes.getFloat(R.styleable.AutoOffsettingBackgroundLayout_speedDirection, 0.0f)) / 180.0d) * 3.141592653589793d);
        setSpeed(l(context, typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoOffsettingBackgroundLayout_speed, 2.0f)));
        setItemRotation((((double) typedArrayObtainStyledAttributes.getFloat(R.styleable.AutoOffsettingBackgroundLayout_itemRotation, 0.0f)) / 180.0d) * 3.141592653589793d);
        this.f73704j = typedArrayObtainStyledAttributes.getDrawable(R.styleable.AutoOffsettingBackgroundLayout_loopDrawable);
        this.f73706l = typedArrayObtainStyledAttributes.getInteger(R.styleable.AutoOffsettingBackgroundLayout_bitmapMode, 0);
        this.f73700f = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoOffsettingBackgroundLayout_itemWidth, 0.0f);
        this.f73701g = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoOffsettingBackgroundLayout_itemHeight, 0.0f);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AutoOffsettingBackgroundLayout_autoStart, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        this.f73702h = new Paint();
        this.f73703i = new Matrix();
        Looper mainLooper = Looper.getMainLooper();
        f0.o(mainLooper, "getMainLooper(...)");
        a aVar = new a(mainLooper, this);
        this.f73717w = aVar;
        aVar.sendEmptyMessageDelayed(1, 5L);
        this.f73716v = z10;
    }

    private final Bitmap o(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, c.k.ax, new Class[]{Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double d10 = measuredWidth;
        double d11 = measuredHeight;
        double d12 = d10 / d11;
        double d13 = ((double) width) / ((double) height);
        if (this.f73706l == 1) {
            float f10 = this.f73701g;
            if (!(f10 == 0.0f)) {
                float f11 = this.f73700f;
                if (!(f11 == 0.0f)) {
                    height = (int) f10;
                    width = (int) f11;
                }
            }
        } else if (d12 < d13) {
            height = (int) (d10 / d13);
            width = measuredWidth;
        } else {
            width = (int) (d11 * d13);
            height = measuredHeight;
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    private final void setDirection(double d10) {
        this.f73698d = d10 % 6.283185307179586d;
    }

    private final void setItemRotation(double d10) {
        this.f73699e = d10 % 6.283185307179586d;
    }

    public final double getLimitX() {
        return this.f73714t;
    }

    public final double getLimitY() {
        return this.f73715u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Tw, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.f73717w;
        if (aVar == null) {
            f0.S("handler");
            aVar = null;
        }
        aVar.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.k.Zw, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.f73705k;
        if (bitmap != null) {
            if (this.f73706l == 1) {
                this.f73707m.clear();
                m(canvas, this.f73710p - (bitmap.getWidth() / 2), this.f73711q - (bitmap.getHeight() / 2), -bitmap.getWidth(), -bitmap.getHeight(), 100, 100);
                return;
            }
            int width = ((int) this.f73710p) - bitmap.getWidth();
            int height = ((int) this.f73711q) - bitmap.getHeight();
            if (width < (-bitmap.getWidth()) || height < (-bitmap.getHeight())) {
                return;
            }
            int i10 = this.f73708n;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f73709o;
                for (int i13 = 0; i13 < i12; i13++) {
                    Matrix matrix = this.f73703i;
                    Paint paint = null;
                    if (matrix == null) {
                        f0.S("mMatrix");
                        matrix = null;
                    }
                    matrix.reset();
                    Matrix matrix2 = this.f73703i;
                    if (matrix2 == null) {
                        f0.S("mMatrix");
                        matrix2 = null;
                    }
                    matrix2.postTranslate(width, height);
                    Matrix matrix3 = this.f73703i;
                    if (matrix3 == null) {
                        f0.S("mMatrix");
                        matrix3 = null;
                    }
                    matrix3.postTranslate(bitmap.getWidth() * i11, bitmap.getHeight() * i13);
                    if (canvas != null) {
                        Matrix matrix4 = this.f73703i;
                        if (matrix4 == null) {
                            f0.S("mMatrix");
                            matrix4 = null;
                        }
                        Paint paint2 = this.f73702h;
                        if (paint2 == null) {
                            f0.S("mPaint");
                        } else {
                            paint = paint2;
                        }
                        canvas.drawBitmap(bitmap, matrix4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Ww, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f73704j;
        if (drawable == null || !(drawable instanceof BitmapDrawable) || getVisibility() == 8 || i10 == 0 || i11 == 0 || this.f73705k != null) {
            return;
        }
        Drawable drawable2 = this.f73704j;
        f0.n(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
        f0.m(bitmap);
        this.f73705k = o(bitmap);
        int measuredWidth = getMeasuredWidth();
        Bitmap bitmap2 = this.f73705k;
        f0.m(bitmap2);
        this.f73708n = (measuredWidth / bitmap2.getWidth()) + 1;
        int measuredHeight = getMeasuredHeight();
        Bitmap bitmap3 = this.f73705k;
        f0.m(bitmap3);
        this.f73709o = (measuredHeight / bitmap3.getHeight()) + 1;
        Bitmap bitmap4 = this.f73705k;
        f0.m(bitmap4);
        double dPow = Math.pow(bitmap4.getHeight(), 2.0d);
        Bitmap bitmap5 = this.f73705k;
        f0.m(bitmap5);
        this.f73712r = (float) Math.sqrt(dPow + Math.pow(bitmap5.getWidth(), 2.0d));
        Bitmap bitmap6 = this.f73705k;
        f0.m(bitmap6);
        double height = bitmap6.getHeight();
        Bitmap bitmap7 = this.f73705k;
        f0.m(bitmap7);
        this.f73713s = Math.atan(height / ((double) bitmap7.getWidth()));
        Bitmap bitmap8 = this.f73705k;
        f0.m(bitmap8);
        this.f73714t = bitmap8.getWidth();
        Bitmap bitmap9 = this.f73705k;
        f0.m(bitmap9);
        this.f73715u = bitmap9.getHeight();
    }

    public final void p() {
        this.f73716v = true;
    }

    public final void q() {
        this.f73716v = false;
    }

    public final void setBitmap(@d Bitmap srcBitmap) {
        if (PatchProxy.proxy(new Object[]{srcBitmap}, this, changeQuickRedirect, false, c.k.Sw, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(srcBitmap, "srcBitmap");
        if (this.f73716v) {
            q();
        }
        this.f73705k = o(srcBitmap);
        int measuredWidth = getMeasuredWidth();
        Bitmap bitmap = this.f73705k;
        f0.m(bitmap);
        this.f73708n = (measuredWidth / bitmap.getWidth()) + 1;
        int measuredHeight = getMeasuredHeight();
        Bitmap bitmap2 = this.f73705k;
        f0.m(bitmap2);
        this.f73709o = (measuredHeight / bitmap2.getHeight()) + 1;
        Bitmap bitmap3 = this.f73705k;
        f0.m(bitmap3);
        this.f73714t = bitmap3.getWidth();
        Bitmap bitmap4 = this.f73705k;
        f0.m(bitmap4);
        this.f73715u = bitmap4.getHeight();
    }

    public final void setBitmap(@d BitmapDrawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.k.Uw, new Class[]{BitmapDrawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        this.f73704j = drawable;
        Bitmap bitmap = drawable.getBitmap();
        f0.o(bitmap, "getBitmap(...)");
        setBitmap(bitmap);
    }

    public final void setLimitX(double d10) {
        this.f73714t = d10;
    }

    public final void setLimitY(double d10) {
        this.f73715u = d10;
    }

    public final void setSpeed(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Vw, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        double d10 = i10;
        this.f73696b = Math.cos(this.f73698d) * d10 * 0.005d;
        double dSin = Math.sin(this.f73698d) * d10 * 0.005d;
        this.f73697c = dSin;
        double d11 = this.f73698d;
        if (d11 > 3.141592653589793d) {
            this.f73696b *= -1.0d;
        }
        if (d11 <= 1.5707963267948966d || d11 >= 6.283185307179586d) {
            return;
        }
        this.f73697c = dSin * (-1.0d);
    }
}
