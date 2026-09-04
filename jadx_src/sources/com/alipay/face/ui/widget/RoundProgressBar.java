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
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.fintech.base.R;

/* JADX INFO: loaded from: classes6.dex */
public class RoundProgressBar extends View {
    public static final int F = 0;
    public static final int G = 1;
    private int A;
    private Handler B;
    private int C;
    private Runnable D;
    int E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f39077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f39078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f39079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f39080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f39081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f39087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f39089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f39090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.alipay.face.ui.widget.a f39094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BitmapShader f39097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private SweepGradient f39098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Matrix f39099y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f39100z;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RoundProgressBar.this.f39076b) {
                RoundProgressBar.this.B.postDelayed(this, RoundProgressBar.this.C / RoundProgressBar.this.getMax());
                return;
            }
            int progress = RoundProgressBar.this.getProgress() + 1;
            if (RoundProgressBar.this.f39094t != null) {
                RoundProgressBar.this.f39094t.onProgress(RoundProgressBar.this.f39092r);
            }
            if (progress >= RoundProgressBar.this.getMax()) {
                progress = RoundProgressBar.this.getMax();
            }
            RoundProgressBar.this.setProgress(progress);
            if (progress < RoundProgressBar.this.getMax()) {
                RoundProgressBar.this.B.postDelayed(this, RoundProgressBar.this.C / RoundProgressBar.this.getMax());
            } else if (RoundProgressBar.this.f39094t != null) {
                RoundProgressBar.this.f39094t.onFinish();
                RoundProgressBar.this.i();
            }
        }
    }

    public RoundProgressBar(Context context) {
        this(context, null);
        this.f39077c = context;
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f39077c = context;
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39076b = false;
        this.f39095u = 0;
        this.f39096v = 0;
        this.C = -1;
        this.D = new a();
        this.E = 0;
        this.f39078d = new Paint();
        this.B = new Handler(Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f39316o);
        this.f39079e = typedArrayObtainStyledAttributes.getColor(R.styleable.f39324w, y1.a.f141526c);
        this.f39081g = typedArrayObtainStyledAttributes.getColor(R.styleable.f39325x, -16711936);
        this.f39082h = typedArrayObtainStyledAttributes.getColor(R.styleable.f39325x, -16711936);
        this.f39086l = typedArrayObtainStyledAttributes.getColor(R.styleable.B, -16711936);
        this.f39089o = typedArrayObtainStyledAttributes.getDimension(R.styleable.D, 15.0f);
        this.f39090p = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39326y, 5.0f);
        this.f39091q = typedArrayObtainStyledAttributes.getInteger(R.styleable.f39322u, 100);
        this.f39093s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.C, true);
        this.f39095u = typedArrayObtainStyledAttributes.getInt(R.styleable.A, 0);
        this.f39083i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39323v, false);
        this.f39080f = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39318q, 0.0f);
        this.f39084j = typedArrayObtainStyledAttributes.getColor(R.styleable.f39321t, 0);
        this.f39085k = typedArrayObtainStyledAttributes.getColor(R.styleable.f39320s, 0);
        this.f39087m = typedArrayObtainStyledAttributes.getInt(R.styleable.f39327z, 0);
        this.f39088n = typedArrayObtainStyledAttributes.getInt(R.styleable.f39319r, 360);
        this.A = typedArrayObtainStyledAttributes.getColor(R.styleable.f39317p, -1);
        if (this.f39080f > 0.0f && this.f39083i) {
            this.f39099y = new Matrix();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.f39290c);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f39097w = new BitmapShader(bitmapDecodeResource, tileMode, tileMode);
            this.f39100z = (int) this.f39080f;
            float fMin = (this.f39100z * 1.0f) / Math.min(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
            this.f39099y.setScale(fMin, fMin);
            this.f39097w.setLocalMatrix(this.f39099y);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void f(Canvas canvas, RectF rectF) {
        this.f39078d.setStyle(Paint.Style.STROKE);
        this.f39078d.setColor(this.f39079e);
        int i10 = this.f39087m;
        canvas.drawArc(rectF, i10, this.f39088n - i10, false, this.f39078d);
        BitmapShader bitmapShader = this.f39097w;
        if (bitmapShader != null) {
            this.f39078d.setShader(bitmapShader);
        }
        if (this.f39083i && this.f39084j != 0 && this.f39085k != 0 && this.f39098x == null) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            this.f39098x = new SweepGradient(fCenterX, fCenterY, new int[]{this.f39084j, this.f39085k}, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, fCenterX, fCenterY);
            this.f39098x.setLocalMatrix(matrix);
        }
        SweepGradient sweepGradient = this.f39098x;
        if (sweepGradient != null) {
            this.f39078d.setShader(sweepGradient);
        }
        this.f39078d.setColor(this.f39081g);
        canvas.drawArc(rectF, this.f39087m, (this.f39092r * (this.f39088n - this.f39087m)) / getMax(), false, this.f39078d);
        this.f39078d.setShader(null);
    }

    public void g(boolean z10) {
        this.f39076b = z10;
    }

    public int getCricleColor() {
        return this.f39079e;
    }

    public int getCricleProgressColor() {
        return this.f39081g;
    }

    public synchronized int getMax() {
        return this.f39091q;
    }

    public synchronized int getProgress() {
        return this.f39092r;
    }

    public int getRadius() {
        return this.f39096v;
    }

    public float getRoundWidth() {
        return this.f39090p;
    }

    public int getTextColor() {
        return this.f39086l;
    }

    public float getTextSize() {
        return this.f39089o;
    }

    public void h(int i10, com.alipay.face.ui.widget.a aVar) {
        this.f39094t = aVar;
        setProgress(0);
        this.C = i10;
        this.B.post(this.D);
    }

    public void i() {
        this.B.removeCallbacks(this.D);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f10 = width;
        this.f39096v = (int) (f10 - (this.f39090p / 2.0f));
        this.f39078d.setColor(this.f39079e);
        this.f39078d.setStyle(Paint.Style.STROKE);
        this.f39078d.setStrokeWidth(this.f39090p);
        this.f39078d.setAntiAlias(true);
        this.f39078d.setStrokeCap(Paint.Cap.ROUND);
        this.f39078d.setColor(this.A);
        this.f39078d.setStrokeWidth(0.0f);
        this.f39078d.setColor(this.f39086l);
        this.f39078d.setTextSize(this.f39089o);
        this.f39078d.setTypeface(Typeface.DEFAULT_BOLD);
        int i10 = (int) ((this.f39092r / this.f39091q) * 100.0f);
        float fMeasureText = this.f39078d.measureText(i10 + "%");
        this.f39078d.setShader(null);
        if (this.f39093s && i10 != 0 && this.f39095u == 0) {
            canvas.drawText(i10 + "%", f10 - (fMeasureText / 2.0f), f10 + (this.f39089o / 2.0f), this.f39078d);
        }
        this.f39078d.setStrokeWidth(this.f39090p);
        int i11 = this.f39096v;
        RectF rectF = new RectF(width - i11, width - i11, width + i11, width + i11);
        this.f39078d.setColor(this.f39079e);
        int i12 = this.f39095u;
        if (i12 == 0) {
            f(canvas, rectF);
            return;
        }
        if (i12 != 1) {
            return;
        }
        this.f39078d.setStyle(Paint.Style.FILL_AND_STROKE);
        int i13 = this.f39092r;
        if (i13 != 0) {
            int i14 = this.f39087m;
            canvas.drawArc(rectF, i14 + 90, ((this.f39088n - i14) * i13) / this.f39091q, true, this.f39078d);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.A = i10;
        postInvalidate();
    }

    public void setCricleColor(int i10) {
        this.f39079e = i10;
    }

    public void setCricleProgressColor(int i10) {
        this.f39081g = i10;
    }

    public void setGradientColor(int i10) {
        this.f39085k = i10;
    }

    public synchronized void setMax(int i10) {
        try {
            if (i10 < 0) {
                throw new IllegalArgumentException("max not less than 0");
            }
            this.f39091q = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setProgress(int i10) {
        try {
            if (i10 < 0) {
                throw new IllegalArgumentException("progress not less than 0");
            }
            int i11 = this.f39091q;
            if (i10 > i11) {
                i10 = i11;
            }
            if (i10 <= i11) {
                this.f39092r = i10;
                postInvalidate();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setProgressAngle(int i10) {
        this.E = i10;
        postInvalidate();
    }

    public void setRoundColor(int i10) {
        this.f39079e = i10;
        postInvalidate();
    }

    public void setRoundProgressColor(int i10) {
        this.f39081g = i10;
    }

    public void setRoundWidth(float f10) {
        this.f39090p = f10;
    }

    public void setTextColor(int i10) {
        this.f39086l = i10;
    }

    public void setTextSize(float f10) {
        this.f39089o = f10;
    }
}
