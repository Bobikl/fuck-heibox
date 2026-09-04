package com.alipay.face.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.alipay.fintech.base.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class RectMaskView extends ImageView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Xfermode f39036o = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f39037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f39038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f39039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Bitmap> f39040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f39041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f39044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39049n;

    public RectMaskView(Context context) {
        super(context);
        this.f39041f = -1.0f;
        this.f39042g = -1.0f;
        this.f39043h = -1.0f;
        this.f39044i = -1.0f;
        this.f39045j = false;
        this.f39046k = false;
        this.f39047l = -1;
        this.f39048m = 5;
        this.f39049n = 35;
        c();
    }

    public RectMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39041f = -1.0f;
        this.f39042g = -1.0f;
        this.f39043h = -1.0f;
        this.f39044i = -1.0f;
        this.f39045j = false;
        this.f39046k = false;
        this.f39047l = -1;
        this.f39048m = 5;
        this.f39049n = 35;
        b(context, attributeSet);
        c();
    }

    public RectMaskView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39041f = -1.0f;
        this.f39042g = -1.0f;
        this.f39043h = -1.0f;
        this.f39044i = -1.0f;
        this.f39045j = false;
        this.f39046k = false;
        this.f39047l = -1;
        this.f39048m = 5;
        this.f39049n = 35;
        b(context, attributeSet);
        c();
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f39309h);
        if (typedArrayObtainStyledAttributes != null) {
            this.f39041f = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39312k, 0.0f);
            this.f39042g = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39313l, 0.0f);
            this.f39043h = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39315n, 0.0f);
            this.f39044i = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39311j, 0.0f);
            this.f39045j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39310i, false);
            this.f39046k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39314m, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void c() {
        this.f39038c = new Paint(1);
        this.f39039d = new Paint(1);
    }

    public Bitmap a() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float width = getWidth();
        float height = getHeight();
        float f10 = this.f39041f;
        if (f10 <= -1.0f) {
            f10 = 0.0f;
        }
        if (this.f39045j) {
            f10 = (width / 2.0f) - (this.f39043h / 2.0f);
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f39041f = f10;
        }
        float f11 = (height - width) / 2.0f;
        float f12 = this.f39042g;
        if (f12 > -1.0f) {
            f11 = f12;
        }
        if (this.f39046k) {
            float f13 = (height / 2.0f) - (this.f39044i / 2.0f);
            float f14 = f13 >= 0.0f ? f13 : 0.0f;
            this.f39042g = f14;
            f11 = f14;
        }
        float f15 = this.f39043h;
        float f16 = f15 > -1.0f ? f15 + f10 : width;
        float f17 = width + f11;
        float f18 = this.f39044i;
        if (f18 > -1.0f) {
            f17 = f11 + f18;
        }
        RectF rectF = new RectF(f10, f11, f16, f17);
        int i10 = this.f39049n;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        return bitmapCreateBitmap;
    }

    public int getRectColor() {
        return this.f39047l;
    }

    public float getRectHeigth() {
        return this.f39044i;
    }

    public float getRectLeft() {
        return this.f39041f;
    }

    public int getRectRoundCx() {
        return this.f39049n;
    }

    public float getRectTop() {
        return this.f39042g;
    }

    public float getRectWidth() {
        return this.f39043h;
    }

    public int getStrokeWidth() {
        return this.f39048m;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f39040e = null;
        Bitmap bitmap = this.f39037b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            WeakReference<Bitmap> weakReference = this.f39040e;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            float f10 = 0.0f;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f39037b;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f39037b = a();
                    }
                    this.f39038c.reset();
                    this.f39038c.setFilterBitmap(false);
                    this.f39038c.setXfermode(f39036o);
                    canvas2.drawBitmap(this.f39037b, 0.0f, 0.0f, this.f39038c);
                    this.f39040e = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f39038c.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f39038c);
                if (-1 != this.f39047l) {
                    float f11 = this.f39042g;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    float f12 = this.f39041f;
                    if (f12 >= 0.0f) {
                        f10 = f12;
                    }
                    RectF rectF = new RectF(f10, f11, this.f39043h + f10, this.f39044i + f11);
                    this.f39039d.setColor(this.f39047l);
                    this.f39039d.setStrokeWidth(this.f39048m);
                    this.f39039d.setStyle(Paint.Style.STROKE);
                    int i10 = this.f39049n;
                    canvas.drawRoundRect(rectF, i10, i10, this.f39039d);
                }
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            canvas.restoreToCount(iSaveLayer);
            throw th2;
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public void setRectColor(int i10) {
        this.f39047l = i10;
    }

    public void setRectHeight(int i10) {
        this.f39044i = i10;
    }

    public void setRectLeft(int i10) {
        this.f39041f = i10;
    }

    public void setRectRoundCx(int i10) {
        this.f39049n = i10;
    }

    public void setRectTop(int i10) {
        this.f39042g = i10;
    }

    public void setRectWidth(int i10) {
        this.f39043h = i10;
    }

    public void setStrokeWidth(int i10) {
        this.f39048m = i10;
    }
}
