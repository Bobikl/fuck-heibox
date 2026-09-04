package com.max.hbview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AutoRotatingView.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class AutoRotatingView extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @d
    public static final b f73719t = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f73720u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f73721v = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f73722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f73723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f73724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f73725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f73726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f73727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f73728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Matrix f73729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private Drawable f73730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private Bitmap f73731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f73732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f73733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f73734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e
    private RectF f73735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    private final PorterDuffXfermode f73736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    private final PorterDuffXfermode f73737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @d
    private final PorterDuffXfermode f73738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f73739s;

    /* JADX INFO: compiled from: AutoRotatingView.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final WeakReference<AutoRotatingView> f73740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d Looper looper, @d AutoRotatingView autoView) {
            super(looper);
            f0.p(looper, "looper");
            f0.p(autoView, "autoView");
            this.f73740a = new WeakReference<>(autoView);
        }

        @Override // android.os.Handler
        public void handleMessage(@d Message msg) {
            AutoRotatingView autoRotatingView;
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, c.k.px, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (msg.what != 1 || (autoRotatingView = this.f73740a.get()) == null) {
                return;
            }
            if (autoRotatingView.f73722b) {
                if (autoRotatingView.f73726f) {
                    autoRotatingView.f73739s -= autoRotatingView.f73727g;
                } else {
                    autoRotatingView.f73739s += autoRotatingView.f73727g;
                }
                autoRotatingView.invalidate();
            }
            a aVar = autoRotatingView.f73723c;
            a aVar2 = null;
            if (aVar == null) {
                f0.S("handler");
                aVar = null;
            }
            aVar.removeCallbacksAndMessages(null);
            a aVar3 = autoRotatingView.f73723c;
            if (aVar3 == null) {
                f0.S("handler");
            } else {
                aVar2 = aVar3;
            }
            aVar2.sendEmptyMessageDelayed(1, AutoRotatingView.f73721v);
        }
    }

    /* JADX INFO: compiled from: AutoRotatingView.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoRotatingView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoRotatingView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRotatingView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73727g = 4.5d;
        this.f73736p = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f73737q = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        this.f73738r = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        h(context, attributeSet, i10);
    }

    private final void g() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.fx, new Class[0], Void.TYPE).isSupported && getWidth() > 0 && getHeight() > 0) {
            this.f73735o = new RectF(new Rect(0, 0, getWidth(), getHeight()));
        }
    }

    private final void h(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, c.k.ex, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f73818u, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f73726f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AutoRotatingBackgroundLayout_reverse, false);
        setSpeed(typedArrayObtainStyledAttributes.getFloat(R.styleable.AutoRotatingBackgroundLayout_rotateSpeed, 90.0f));
        this.f73730j = typedArrayObtainStyledAttributes.getDrawable(R.styleable.AutoRotatingBackgroundLayout_rotationDrawable);
        this.f73725e = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoRotatingBackgroundLayout_itemWidth, 0.0f);
        this.f73724d = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoRotatingBackgroundLayout_itemHeight, 0.0f);
        this.f73732l = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoRotatingBackgroundLayout_offsetX, 0.0f);
        this.f73733m = typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoRotatingBackgroundLayout_offsetY, 0.0f);
        setRoundRadius(typedArrayObtainStyledAttributes.getDimension(R.styleable.AutoRotatingBackgroundLayout_roundRect, 0.0f));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AutoRotatingBackgroundLayout_autoStart, false);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f73728h = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f73728h;
        if (paint2 == null) {
            f0.S("mPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.FILL);
        this.f73729i = new Matrix();
        Looper mainLooper = Looper.getMainLooper();
        f0.o(mainLooper, "getMainLooper(...)");
        a aVar = new a(mainLooper, this);
        this.f73723c = aVar;
        aVar.sendEmptyMessageDelayed(1, f73721v);
        this.f73722b = z10;
    }

    private final Bitmap i(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, c.k.ox, new Class[]{Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f10 = this.f73724d;
        if (!(f10 == 0.0f)) {
            float f11 = this.f73725e;
            if (!(f11 == 0.0f)) {
                height = (int) f10;
                width = (int) f11;
            }
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    private final void setRoundRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.k.dx, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f73734n = f10;
        g();
    }

    private final void setSpeed(double d10) {
        this.f73727g = (d10 * f73721v) / 1000.0d;
    }

    public final void j() {
        this.f73722b = true;
    }

    public final void k() {
        this.f73722b = false;
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.k.nx, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.f73731k;
        if (bitmap != null) {
            float width = this.f73732l + (getWidth() / 2.0f);
            float height = this.f73733m + (getHeight() / 2.0f);
            RectF rectF = this.f73735o;
            if (rectF != null && this.f73734n > 0.0f) {
                f0.m(rectF);
                Paint paint = this.f73728h;
                if (paint == null) {
                    f0.S("mPaint");
                    paint = null;
                }
                canvas.saveLayer(rectF, paint, 31);
                RectF rectF2 = this.f73735o;
                f0.m(rectF2);
                float f10 = this.f73734n;
                Paint paint2 = this.f73728h;
                if (paint2 == null) {
                    f0.S("mPaint");
                    paint2 = null;
                }
                canvas.drawRoundRect(rectF2, f10, f10, paint2);
                Paint paint3 = this.f73728h;
                if (paint3 == null) {
                    f0.S("mPaint");
                    paint3 = null;
                }
                paint3.setXfermode(this.f73736p);
            }
            Matrix matrix = this.f73729i;
            if (matrix == null) {
                f0.S("mMatrix");
                matrix = null;
            }
            matrix.reset();
            Matrix matrix2 = this.f73729i;
            if (matrix2 == null) {
                f0.S("mMatrix");
                matrix2 = null;
            }
            matrix2.setTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
            Matrix matrix3 = this.f73729i;
            if (matrix3 == null) {
                f0.S("mMatrix");
                matrix3 = null;
            }
            matrix3.postRotate((float) (this.f73739s % ((double) 360.0f)));
            Matrix matrix4 = this.f73729i;
            if (matrix4 == null) {
                f0.S("mMatrix");
                matrix4 = null;
            }
            matrix4.postTranslate(width, height);
            Bitmap bitmap2 = this.f73731k;
            f0.m(bitmap2);
            Matrix matrix5 = this.f73729i;
            if (matrix5 == null) {
                f0.S("mMatrix");
                matrix5 = null;
            }
            Paint paint4 = this.f73728h;
            if (paint4 == null) {
                f0.S("mPaint");
                paint4 = null;
            }
            canvas.drawBitmap(bitmap2, matrix5, paint4);
            Paint paint5 = this.f73728h;
            if (paint5 == null) {
                f0.S("mPaint");
                paint5 = null;
            }
            paint5.setXfermode(null);
            if (this.f73735o == null || this.f73734n <= 0.0f) {
                return;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.mx, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f73731k == null && ((drawable = this.f73730j) == null || !(drawable instanceof BitmapDrawable) || getVisibility() == 8 || i10 == 0 || i11 == 0)) {
            return;
        }
        g();
        if (this.f73731k == null) {
            Drawable drawable2 = this.f73730j;
            f0.n(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
            f0.m(bitmap);
            this.f73731k = i(bitmap);
        }
    }

    public final void setDisplayRoundRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.k.jx, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setRoundRadius(f10);
    }

    public final void setRotateBitmap(@e Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, c.k.kx, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f73722b) {
            k();
        }
        this.f73731k = bitmap == null ? null : i(bitmap);
    }

    public final void setRotateDrawable(@e BitmapDrawable bitmapDrawable) {
        if (PatchProxy.proxy(new Object[]{bitmapDrawable}, this, changeQuickRedirect, false, c.k.lx, new Class[]{BitmapDrawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f73730j = bitmapDrawable;
        setRotateBitmap(bitmapDrawable != null ? bitmapDrawable.getBitmap() : null);
    }

    public final void setRotateItemSize(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.ix, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f73724d = f11;
        this.f73725e = f10;
        Bitmap bitmap = this.f73731k;
        if (bitmap != null) {
            this.f73731k = i(bitmap);
        }
    }

    public final void setRotateItemSize(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.hx, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setRotateItemSize(i10, i11);
    }

    public final void setRotateSpeed(double d10) {
        if (PatchProxy.proxy(new Object[]{new Double(d10)}, this, changeQuickRedirect, false, c.k.gx, new Class[]{Double.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setSpeed(d10);
    }
}
