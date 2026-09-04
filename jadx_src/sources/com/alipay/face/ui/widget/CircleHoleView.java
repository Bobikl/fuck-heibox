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
public class CircleHoleView extends ImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Xfermode f39024m = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f39025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f39026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f39027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Bitmap> f39028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f39029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f39030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f39031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f39032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39035l;

    public CircleHoleView(Context context) {
        super(context);
        this.f39029f = -1.0f;
        this.f39030g = -1.0f;
        this.f39031h = -1.0f;
        this.f39032i = -1.0f;
        this.f39033j = false;
        this.f39034k = false;
        this.f39035l = -1;
        d();
    }

    public CircleHoleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39029f = -1.0f;
        this.f39030g = -1.0f;
        this.f39031h = -1.0f;
        this.f39032i = -1.0f;
        this.f39033j = false;
        this.f39034k = false;
        this.f39035l = -1;
        c(context, attributeSet);
        d();
    }

    public CircleHoleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39029f = -1.0f;
        this.f39030g = -1.0f;
        this.f39031h = -1.0f;
        this.f39032i = -1.0f;
        this.f39033j = false;
        this.f39034k = false;
        this.f39035l = -1;
        c(context, attributeSet);
        d();
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f39302a);
        if (typedArrayObtainStyledAttributes != null) {
            this.f39029f = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39305d, 0.0f);
            this.f39030g = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39306e, 0.0f);
            this.f39031h = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39308g, 0.0f);
            this.f39032i = typedArrayObtainStyledAttributes.getDimension(R.styleable.f39304c, 0.0f);
            this.f39033j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39303b, false);
            this.f39034k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f39307f, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void d() {
        this.f39027d = new Paint(1);
    }

    public void a(int i10) {
        this.f39035l = i10;
        invalidate();
    }

    public Bitmap b() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float width = getWidth();
        float height = getHeight();
        float f10 = this.f39029f;
        float f11 = 0.0f;
        if (f10 <= -1.0f) {
            f10 = 0.0f;
        }
        if (this.f39033j) {
            f10 = (width / 2.0f) - (this.f39031h / 2.0f);
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
        }
        float f12 = (height - width) / 2.0f;
        float f13 = this.f39030g;
        if (f13 > -1.0f) {
            f12 = f13;
        }
        if (this.f39034k) {
            float f14 = (height / 2.0f) - (this.f39032i / 2.0f);
            if (f14 >= 0.0f) {
                f11 = f14;
            }
        } else {
            f11 = f12;
        }
        float f15 = this.f39031h;
        float f16 = f15 > -1.0f ? f15 + f10 : width;
        float f17 = width + f11;
        float f18 = this.f39032i;
        if (f18 > -1.0f) {
            f17 = f11 + f18;
        }
        canvas.drawOval(new RectF(f10, f11, f16, f17), paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f39028e = null;
        Bitmap bitmap = this.f39026c;
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
            WeakReference<Bitmap> weakReference = this.f39028e;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f39026c;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f39026c = b();
                    }
                    this.f39027d.reset();
                    this.f39027d.setFilterBitmap(false);
                    this.f39027d.setXfermode(f39024m);
                    canvas2.drawColor(this.f39035l);
                    canvas2.drawBitmap(this.f39026c, 0.0f, 0.0f, this.f39027d);
                    this.f39028e = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f39027d.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f39027d);
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
}
