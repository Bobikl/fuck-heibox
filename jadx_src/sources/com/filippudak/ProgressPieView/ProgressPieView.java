package com.filippudak.ProgressPieView;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.collection.z0;

/* JADX INFO: loaded from: classes6.dex */
public class ProgressPieView extends View {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 50;
    public static final int D = 25;
    public static final int E = 1;
    private static final int F = 100;
    private static final int G = 0;
    private static final int H = -90;
    private static final float I = 3.0f;
    private static final float J = 14.0f;
    private static final int K = 96;
    private static z0<String, Typeface> L = new z0<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f42966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DisplayMetrics f42967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f42974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f42976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f42977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f42980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f42981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f42982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Paint f42983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Paint f42984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f42985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RectF f42986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f42989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f42990z;

    public class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42991a;

        private b() {
        }

        public void a(int i10) {
            this.f42991a = i10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (ProgressPieView.this.f42969e > this.f42991a) {
                ProgressPieView progressPieView = ProgressPieView.this;
                progressPieView.setProgress(progressPieView.f42969e - 1);
                sendEmptyMessageDelayed(0, ProgressPieView.this.f42988x);
            } else {
                if (ProgressPieView.this.f42969e >= this.f42991a) {
                    removeMessages(0);
                    return;
                }
                ProgressPieView progressPieView2 = ProgressPieView.this;
                progressPieView2.setProgress(progressPieView2.f42969e + 1);
                sendEmptyMessageDelayed(0, ProgressPieView.this.f42988x);
            }
        }
    }

    public interface c {
        void a();

        void b(int i10, int i11);
    }

    public ProgressPieView(Context context) {
        this(context, null);
    }

    public ProgressPieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressPieView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42968d = 100;
        this.f42969e = 0;
        this.f42970f = H;
        this.f42971g = false;
        this.f42972h = false;
        this.f42973i = true;
        this.f42974j = I;
        this.f42975k = true;
        this.f42976l = J;
        this.f42979o = true;
        this.f42987w = 0;
        this.f42988x = 25;
        this.f42989y = new b();
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f42967c = displayMetrics;
        this.f42974j *= displayMetrics.density;
        this.f42976l *= displayMetrics.scaledDensity;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f42993a);
        Resources resources = getResources();
        this.f42968d = typedArrayObtainStyledAttributes.getInteger(R.styleable.ProgressPieView_ppvMax, this.f42968d);
        this.f42969e = typedArrayObtainStyledAttributes.getInteger(R.styleable.ProgressPieView_ppvProgress, this.f42969e);
        this.f42970f = typedArrayObtainStyledAttributes.getInt(R.styleable.ProgressPieView_ppvStartAngle, this.f42970f);
        this.f42971g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ProgressPieView_ppvInverted, this.f42971g);
        this.f42972h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ProgressPieView_ppvCounterclockwise, this.f42972h);
        this.f42974j = typedArrayObtainStyledAttributes.getDimension(R.styleable.ProgressPieView_ppvStrokeWidth, this.f42974j);
        this.f42978n = typedArrayObtainStyledAttributes.getString(R.styleable.ProgressPieView_ppvTypeface);
        this.f42976l = typedArrayObtainStyledAttributes.getDimension(R.styleable.ProgressPieView_android_textSize, this.f42976l);
        this.f42977m = typedArrayObtainStyledAttributes.getString(R.styleable.ProgressPieView_android_text);
        this.f42973i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ProgressPieView_ppvShowStroke, this.f42973i);
        this.f42975k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ProgressPieView_ppvShowText, this.f42975k);
        this.f42980p = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ProgressPieView_ppvImage);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressPieView_ppvBackgroundColor, resources.getColor(R.color.default_background_color));
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressPieView_ppvProgressColor, resources.getColor(R.color.default_progress_color));
        int color3 = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressPieView_ppvStrokeColor, resources.getColor(R.color.default_stroke_color));
        int color4 = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressPieView_android_textColor, resources.getColor(R.color.default_text_color));
        this.f42987w = typedArrayObtainStyledAttributes.getInteger(R.styleable.ProgressPieView_ppvProgressFillType, this.f42987w);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f42985u = paint;
        paint.setColor(color);
        this.f42985u.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f42984t = paint2;
        paint2.setColor(color2);
        this.f42984t.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f42982r = paint3;
        paint3.setColor(color3);
        this.f42982r.setStyle(Paint.Style.STROKE);
        this.f42982r.setStrokeWidth(this.f42974j);
        Paint paint4 = new Paint(1);
        this.f42983s = paint4;
        paint4.setColor(color4);
        this.f42983s.setTextSize(this.f42976l);
        this.f42983s.setTextAlign(Paint.Align.CENTER);
        this.f42986v = new RectF();
        this.f42981q = new Rect();
    }

    public void c() {
        this.f42989y.removeMessages(0);
        this.f42989y.a(this.f42968d);
        this.f42989y.sendEmptyMessage(0);
        invalidate();
    }

    public void d(int i10) {
        this.f42989y.removeMessages(0);
        if (i10 > this.f42968d || i10 < 0) {
            throw new IllegalArgumentException(String.format("Animation progress (%d) is greater than the max progress (%d) or lower than 0 ", Integer.valueOf(i10), Integer.valueOf(this.f42968d)));
        }
        this.f42989y.a(i10);
        this.f42989y.sendEmptyMessage(0);
        invalidate();
    }

    public boolean f() {
        return this.f42972h;
    }

    public boolean g() {
        return this.f42979o;
    }

    public int getAnimationSpeed() {
        return this.f42988x;
    }

    public int getBackgroundColor() {
        return this.f42985u.getColor();
    }

    public Drawable getImageDrawable() {
        return this.f42980p;
    }

    public int getMax() {
        return this.f42968d;
    }

    public int getProgress() {
        return this.f42969e;
    }

    public int getProgressColor() {
        return this.f42984t.getColor();
    }

    public int getProgressFillType() {
        return this.f42987w;
    }

    public int getStartAngle() {
        return this.f42970f;
    }

    public int getStrokeColor() {
        return this.f42982r.getColor();
    }

    public float getStrokeWidth() {
        return this.f42974j;
    }

    public String getText() {
        return this.f42977m;
    }

    public int getTextColor() {
        return this.f42983s.getColor();
    }

    public float getTextSize() {
        return this.f42976l;
    }

    public String getTypeface() {
        return this.f42978n;
    }

    public boolean h() {
        return this.f42971g;
    }

    public boolean i() {
        return this.f42973i;
    }

    public boolean j() {
        return this.f42975k;
    }

    public void k() {
        this.f42989y.removeMessages(0);
        this.f42989y.a(this.f42969e);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AssetManager assets;
        super.onDraw(canvas);
        RectF rectF = this.f42986v;
        int i10 = this.f42990z;
        rectF.set(0.0f, 0.0f, i10, i10);
        this.f42986v.offset((getWidth() - this.f42990z) / 2, (getHeight() - this.f42990z) / 2);
        if (this.f42973i) {
            float strokeWidth = (int) ((this.f42982r.getStrokeWidth() / 2.0f) + 0.5f);
            this.f42986v.inset(strokeWidth, strokeWidth);
        }
        float fCenterX = this.f42986v.centerX();
        float fCenterY = this.f42986v.centerY();
        canvas.drawArc(this.f42986v, 0.0f, 360.0f, true, this.f42985u);
        int i11 = this.f42987w;
        if (i11 == 0) {
            float f10 = (this.f42969e * 360) / this.f42968d;
            if (this.f42971g) {
                f10 -= 360.0f;
            }
            if (this.f42972h) {
                f10 = -f10;
            }
            canvas.drawArc(this.f42986v, this.f42970f, f10, true, this.f42984t);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Invalid Progress Fill = " + this.f42987w);
            }
            float strokeWidth2 = (this.f42990z / 2) * (this.f42969e / this.f42968d);
            if (this.f42973i) {
                strokeWidth2 = (strokeWidth2 + 0.5f) - this.f42982r.getStrokeWidth();
            }
            canvas.drawCircle(fCenterX, fCenterY, strokeWidth2, this.f42984t);
        }
        if (!TextUtils.isEmpty(this.f42977m) && this.f42975k) {
            if (!TextUtils.isEmpty(this.f42978n)) {
                Typeface typefaceF = L.f(this.f42978n);
                if (typefaceF == null && getResources() != null && (assets = getResources().getAssets()) != null) {
                    typefaceF = Typeface.createFromAsset(assets, this.f42978n);
                    L.j(this.f42978n, typefaceF);
                }
                this.f42983s.setTypeface(typefaceF);
            }
            canvas.drawText(this.f42977m, (int) fCenterX, (int) (fCenterY - ((this.f42983s.descent() + this.f42983s.ascent()) / 2.0f)), this.f42983s);
        }
        Drawable drawable = this.f42980p;
        if (drawable != null && this.f42979o) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            this.f42981q.set(0, 0, intrinsicWidth, intrinsicWidth);
            this.f42981q.offset((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicWidth) / 2);
            this.f42980p.setBounds(this.f42981q);
            this.f42980p.draw(canvas);
        }
        if (this.f42973i) {
            canvas.drawOval(this.f42986v, this.f42982r);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iResolveSize = View.resolveSize(96, i10);
        int iResolveSize2 = View.resolveSize(96, i11);
        this.f42990z = Math.min(iResolveSize, iResolveSize2);
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    public void setAnimationSpeed(int i10) {
        this.f42988x = i10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f42985u.setColor(i10);
        invalidate();
    }

    public void setCounterclockwise(boolean z10) {
        this.f42972h = z10;
    }

    public void setImageDrawable(Drawable drawable) {
        this.f42980p = drawable;
        invalidate();
    }

    public void setImageResource(int i10) {
        if (getResources() != null) {
            this.f42980p = getResources().getDrawable(i10);
            invalidate();
        }
    }

    public void setInverted(boolean z10) {
        this.f42971g = z10;
    }

    public void setMax(int i10) {
        if (i10 <= 0 || i10 < this.f42969e) {
            throw new IllegalArgumentException(String.format("Max (%d) must be > 0 and >= %d", Integer.valueOf(i10), Integer.valueOf(this.f42969e)));
        }
        this.f42968d = i10;
        invalidate();
    }

    public void setOnProgressListener(c cVar) {
        this.f42966b = cVar;
    }

    public void setProgress(int i10) {
        int i11 = this.f42968d;
        if (i10 > i11 || i10 < 0) {
            throw new IllegalArgumentException(String.format("Progress (%d) must be between %d and %d", Integer.valueOf(i10), 0, Integer.valueOf(this.f42968d)));
        }
        this.f42969e = i10;
        c cVar = this.f42966b;
        if (cVar != null) {
            if (i10 == i11) {
                cVar.a();
            } else {
                cVar.b(i10, i11);
            }
        }
        invalidate();
    }

    public void setProgressColor(int i10) {
        this.f42984t.setColor(i10);
        invalidate();
    }

    public void setProgressFillType(int i10) {
        this.f42987w = i10;
    }

    public void setShowImage(boolean z10) {
        this.f42979o = z10;
        invalidate();
    }

    public void setShowStroke(boolean z10) {
        this.f42973i = z10;
        invalidate();
    }

    public void setShowText(boolean z10) {
        this.f42975k = z10;
        invalidate();
    }

    public void setStartAngle(int i10) {
        this.f42970f = i10;
    }

    public void setStrokeColor(int i10) {
        this.f42982r.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        float f10 = i10 * this.f42967c.density;
        this.f42974j = f10;
        this.f42982r.setStrokeWidth(f10);
        invalidate();
    }

    public void setText(String str) {
        this.f42977m = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f42983s.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        float f10 = i10 * this.f42967c.scaledDensity;
        this.f42976l = f10;
        this.f42983s.setTextSize(f10);
        invalidate();
    }

    public void setTypeface(String str) {
        this.f42978n = str;
        invalidate();
    }
}
