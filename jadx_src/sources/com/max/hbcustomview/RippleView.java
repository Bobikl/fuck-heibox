package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class RippleView extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f68757u = "RippleView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f68758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f68759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f68760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f68761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<b> f68762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<b> f68763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f68764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f68765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f68768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f68771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f68772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f68773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Timer f68775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TimerTask f68776t;

    public class a extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.T9, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            try {
                RippleView.a(RippleView.this);
            } catch (Exception e10) {
                Log.e(RippleView.f68757u, e10.getMessage());
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f68778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f68779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f68780c;

        b(float f10, int i10, float f11) {
            this.f68778a = f10;
            this.f68779b = i10;
            this.f68780c = f11;
        }
    }

    public RippleView(Context context) {
        this(context, null);
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68760d = 0.0f;
        this.f68761e = 0.0f;
        this.f68762f = new ArrayList();
        this.f68763g = new ArrayList();
        this.f68758b = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.F2);
        this.f68766j = typedArrayObtainStyledAttributes.getColor(R.styleable.RippleView_ripColor, this.f68758b.getResources().getColor(R.color.divider_primary_1_color));
        this.f68769m = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleView_ripDuration, 9000);
        this.f68770n = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleView_ripNap, 500);
        this.f68767k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RippleView_ripIsFill, false);
        this.f68768l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RippleView_ripIsAlpha, true);
        this.f68772p = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleView_ripMinCircleWidth, 0.0f);
        this.f68771o = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleView_ripStokeWidth, c(this.f68758b, 0.3f));
        this.f68773q = Math.max(0.0f, Math.min(1.0f, typedArrayObtainStyledAttributes.getFloat(R.styleable.RippleView_ripFirstPercent, 0.0f)));
        this.f68774r = Math.max(0, Math.min(255, typedArrayObtainStyledAttributes.getInt(R.styleable.RippleView_ripMaxColorAlpha, 255)));
        typedArrayObtainStyledAttributes.recycle();
        f();
    }

    static /* synthetic */ void a(RippleView rippleView) {
        if (PatchProxy.proxy(new Object[]{rippleView}, null, changeQuickRedirect, true, bb.c.f.S9, new Class[]{RippleView.class}, Void.TYPE).isSupported) {
            return;
        }
        rippleView.b();
    }

    private void b() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.N9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        while (i10 < this.f68762f.size()) {
            b bVar = this.f68762f.get(i10);
            float f10 = bVar.f68780c;
            float f11 = this.f68760d;
            float f12 = this.f68772p;
            if (f10 < f11 - f12 || f11 <= 0.0f) {
                if (this.f68768l) {
                    int i11 = this.f68774r;
                    bVar.f68779b = (int) (i11 - ((i11 * f10) / (f11 - f12)));
                }
                float f13 = f10 + this.f68764h;
                bVar.f68780c = f13;
                bVar.f68778a = e(f13, f11 - f12) + this.f68772p;
            } else {
                this.f68762f.remove(i10);
                i10--;
            }
            i10++;
        }
        if (this.f68762f.size() > 0) {
            List<b> list = this.f68762f;
            if (list.get(list.size() - 1).f68780c > this.f68765i) {
                this.f68762f.add(new b(this.f68772p, this.f68774r, 0.0f));
            }
        }
        postInvalidate();
    }

    private static int c(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.R9, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private synchronized void d(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.O9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            canvas.save();
            this.f68763g.clear();
            this.f68763g.addAll(this.f68762f);
            for (int i10 = 0; i10 < this.f68763g.size(); i10++) {
                this.f68759c.setAlpha(this.f68763g.get(i10).f68779b);
                canvas.drawCircle(this.f68760d / 2.0f, this.f68761e / 2.0f, (this.f68763g.get(i10).f68778a - this.f68759c.getStrokeWidth()) / 2.0f, this.f68759c);
            }
            canvas.restore();
        } catch (Exception e10) {
            Log.e(f68757u, e10.getMessage());
        }
    }

    private float e(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Q9, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : f11 * ((float) ((Math.cos(((double) ((f10 / f11) + 1.0f)) * 3.141592653589793d) / 2.0d) + 0.5d));
    }

    private void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.J9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        this.f68759c = paint;
        paint.setColor(this.f68766j);
        this.f68759c.setStrokeWidth(this.f68771o);
        if (this.f68767k) {
            this.f68759c.setStyle(Paint.Style.FILL);
        } else {
            this.f68759c.setStyle(Paint.Style.STROKE);
        }
        this.f68759c.setStrokeCap(Paint.Cap.ROUND);
        this.f68759c.setAntiAlias(true);
        setBackgroundColor(0);
        this.f68776t = new a();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.M9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        try {
            TimerTask timerTask = this.f68776t;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.f68775s;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            Log.e(f68757u, e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.L9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.P9, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            this.f68760d = size;
        } else {
            this.f68760d = c(this.f68758b, 126.0f);
        }
        if (mode2 == 1073741824) {
            this.f68761e = size2;
        } else {
            this.f68761e = c(this.f68758b, 126.0f);
        }
        setMeasuredDimension((int) this.f68760d, (int) this.f68761e);
        try {
            if (this.f68775s == null) {
                float f10 = this.f68760d;
                float f11 = this.f68772p;
                int i12 = this.f68769m;
                this.f68765i = ((f10 - f11) / i12) * this.f68770n;
                this.f68764h = ((f10 - f11) / i12) * 15.0f;
                this.f68762f = new ArrayList();
                int iMax = (int) Math.max(1.0f, (this.f68769m / this.f68770n) * this.f68773q);
                int i13 = this.f68774r;
                int i14 = 0;
                for (int i15 = 0; i15 < iMax; i15++) {
                    if (this.f68768l) {
                        int i16 = this.f68774r;
                        i13 = (int) (i16 - ((i16 * i14) / (this.f68760d - this.f68772p)));
                    }
                    float f12 = i14;
                    this.f68762f.add(new b(e(f12, this.f68760d - this.f68772p) + this.f68772p, i13, f12));
                    i14 = (int) (f12 + this.f68765i);
                }
                Timer timer = new Timer();
                this.f68775s = timer;
                timer.schedule(this.f68776t, 0L, 15L);
            }
        } catch (Exception e10) {
            Log.d(f68757u, e10.getMessage());
        }
    }

    public void setBorderColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.K9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68766j = i10;
        this.f68759c.setColor(i10);
        invalidate();
    }
}
