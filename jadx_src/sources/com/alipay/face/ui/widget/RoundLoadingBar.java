package com.alipay.face.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.fintech.base.R;

/* JADX INFO: loaded from: classes6.dex */
public class RoundLoadingBar extends View {
    public static final int A = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f39050z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f39052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f39053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f39055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f39059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f39061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f39062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BitmapShader f39068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Matrix f39069t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39070u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Handler f39072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Runnable f39073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f39074y;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RoundLoadingBar roundLoadingBar = RoundLoadingBar.this;
            int i10 = roundLoadingBar.f39074y + 5;
            roundLoadingBar.f39074y = i10;
            int i11 = i10 % 360;
            roundLoadingBar.f39074y = i11;
            roundLoadingBar.setProgressAngle(i11);
            RoundLoadingBar.this.f39072w.postDelayed(this, 80L);
        }
    }

    public RoundLoadingBar(Context context) {
        this(context, null);
        this.f39051b = context;
    }

    public RoundLoadingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f39051b = context;
    }

    public RoundLoadingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39066q = 0;
        this.f39067r = 0;
        this.f39073x = new a();
        this.f39074y = 0;
        this.f39052c = new Paint();
        this.f39072w = new Handler(Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f39316o);
        this.f39053d = typedArrayObtainStyledAttributes.getColor(R.styleable.f39324w, y1.a.f141526c);
        this.f39055f = typedArrayObtainStyledAttributes.getColor(R.styleable.f39325x, -16711936);
        this.f39056g = typedArrayObtainStyledAttributes.getColor(R.styleable.f39325x, -16711936);
        this.f39058i = typedArrayObtainStyledAttributes.getColor(R.styleable.B, -16711936);
        this.f39061l = typedArrayObtainStyledAttributes.getDimension(R.styleable.D, 15.0f);
        this.f39062m = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39326y, 5.0f);
        this.f39063n = typedArrayObtainStyledAttributes.getInteger(R.styleable.f39322u, 100);
        this.f39065p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.C, true);
        this.f39066q = typedArrayObtainStyledAttributes.getInt(R.styleable.A, 0);
        this.f39057h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39323v, false);
        this.f39054e = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39318q, 0.0f);
        this.f39059j = typedArrayObtainStyledAttributes.getInt(R.styleable.f39327z, 0);
        this.f39060k = typedArrayObtainStyledAttributes.getInt(R.styleable.f39319r, 360);
        this.f39071v = typedArrayObtainStyledAttributes.getColor(R.styleable.f39317p, -1);
        if (this.f39054e > 0.0f && this.f39057h) {
            this.f39069t = new Matrix();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.f39290c);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f39068s = new BitmapShader(bitmapDecodeResource, tileMode, tileMode);
            this.f39070u = (int) this.f39054e;
            float fMin = (this.f39070u * 1.0f) / Math.min(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
            this.f39069t.setScale(fMin, fMin);
            this.f39068s.setLocalMatrix(this.f39069t);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(Canvas canvas, RectF rectF) {
        this.f39052c.setStyle(Paint.Style.STROKE);
        BitmapShader bitmapShader = this.f39068s;
        if (bitmapShader != null) {
            this.f39052c.setShader(bitmapShader);
        }
        this.f39052c.setColor(this.f39053d);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f39052c);
        this.f39052c.setColor(this.f39055f);
        canvas.drawArc(rectF, this.f39074y, 50.0f, false, this.f39052c);
        canvas.drawArc(rectF, (this.f39074y + 180) % 360, 50.0f, false, this.f39052c);
        this.f39052c.setShader(null);
    }

    public void c() {
        this.f39074y = 0;
        this.f39072w.post(this.f39073x);
    }

    public void d() {
        this.f39072w.removeCallbacks(this.f39073x);
    }

    public int getCricleColor() {
        return this.f39053d;
    }

    public int getCricleProgressColor() {
        return this.f39055f;
    }

    public synchronized int getMax() {
        return this.f39063n;
    }

    public synchronized int getProgress() {
        return this.f39064o;
    }

    public int getRadius() {
        return this.f39067r;
    }

    public float getRoundWidth() {
        return this.f39062m;
    }

    public int getTextColor() {
        return this.f39058i;
    }

    public float getTextSize() {
        return this.f39061l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f10 = width;
        this.f39067r = (int) (f10 - (this.f39062m / 2.0f));
        this.f39052c.setColor(this.f39053d);
        this.f39052c.setStyle(Paint.Style.STROKE);
        this.f39052c.setStrokeWidth(this.f39062m);
        this.f39052c.setAntiAlias(true);
        this.f39052c.setStrokeCap(Paint.Cap.ROUND);
        this.f39052c.setColor(this.f39071v);
        this.f39052c.setStrokeWidth(0.0f);
        this.f39052c.setColor(this.f39058i);
        this.f39052c.setTextSize(this.f39061l);
        this.f39052c.setTypeface(Typeface.DEFAULT_BOLD);
        int i10 = (int) ((this.f39064o / this.f39063n) * 100.0f);
        float fMeasureText = this.f39052c.measureText(i10 + "%");
        this.f39052c.setShader(null);
        if (this.f39065p && i10 != 0 && this.f39066q == 0) {
            canvas.drawText(i10 + "%", f10 - (fMeasureText / 2.0f), f10 + (this.f39061l / 2.0f), this.f39052c);
        }
        this.f39052c.setStrokeWidth(this.f39062m);
        int i11 = this.f39067r;
        RectF rectF = new RectF(width - i11, width - i11, width + i11, width + i11);
        this.f39052c.setColor(this.f39053d);
        int i12 = this.f39066q;
        if (i12 == 0) {
            b(canvas, rectF);
            return;
        }
        if (i12 != 1) {
            return;
        }
        this.f39052c.setStyle(Paint.Style.FILL_AND_STROKE);
        int i13 = this.f39064o;
        if (i13 != 0) {
            int i14 = this.f39059j;
            canvas.drawArc(rectF, i14 + 90, ((this.f39060k - i14) * i13) / this.f39063n, true, this.f39052c);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f39071v = i10;
        postInvalidate();
    }

    public void setCricleColor(int i10) {
        this.f39053d = i10;
    }

    public void setCricleProgressColor(int i10) {
        this.f39055f = i10;
    }

    public synchronized void setMax(int i10) {
        try {
            if (i10 < 0) {
                throw new IllegalArgumentException("max not less than 0");
            }
            this.f39063n = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setProgress(int i10) {
        try {
            if (i10 < 0) {
                throw new IllegalArgumentException("progress not less than 0");
            }
            int i11 = this.f39063n;
            if (i10 > i11) {
                i10 = i11;
            }
            if (i10 <= i11) {
                this.f39064o = i10;
                postInvalidate();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setProgressAngle(int i10) {
        this.f39074y = i10;
        postInvalidate();
    }

    public void setRoundColor(int i10) {
        this.f39053d = i10;
        postInvalidate();
    }

    public void setRoundProgressColor(int i10) {
        this.f39055f = i10;
    }

    public void setRoundWidth(float f10) {
        this.f39062m = f10;
    }

    public void setTextColor(int i10) {
        this.f39058i = i10;
    }

    public void setTextSize(float f10) {
        this.f39061l = f10;
    }
}
