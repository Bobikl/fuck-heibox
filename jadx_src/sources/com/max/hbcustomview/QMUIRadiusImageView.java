package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.appcompat.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class QMUIRadiusImageView extends AppCompatImageView {
    private static final int A = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f68587y = -7829368;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Bitmap.Config f68588z = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f68589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f68599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f68600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorFilter f68601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f68602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BitmapShader f68603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f68604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RectF f68605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RectF f68606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap f68607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Matrix f68608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f68609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f68610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView.ScaleType f68611x;

    public QMUIRadiusImageView(Context context) {
        this(context, null, R.attr.QMUIRadiusImageViewStyle);
    }

    public QMUIRadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.QMUIRadiusImageViewStyle);
    }

    public QMUIRadiusImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68589b = false;
        this.f68590c = false;
        this.f68591d = false;
        this.f68597j = true;
        this.f68604q = false;
        this.f68605r = new RectF();
        this.f68606s = new RectF();
        Paint paint = new Paint();
        this.f68600m = paint;
        paint.setAntiAlias(true);
        this.f68600m.setStyle(Paint.Style.STROKE);
        this.f68608u = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68727v2, i10, 0);
        this.f68592e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.QMUIRadiusImageView_qmui_border_width, 0);
        this.f68593f = typedArrayObtainStyledAttributes.getColor(R.styleable.QMUIRadiusImageView_qmui_border_color, f68587y);
        this.f68594g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.QMUIRadiusImageView_qmui_selected_border_width, this.f68592e);
        this.f68595h = typedArrayObtainStyledAttributes.getColor(R.styleable.QMUIRadiusImageView_qmui_selected_border_color, this.f68593f);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.QMUIRadiusImageView_qmui_selected_mask_color, 0);
        this.f68596i = color;
        if (color != 0) {
            this.f68602o = new PorterDuffColorFilter(this.f68596i, PorterDuff.Mode.DARKEN);
        }
        this.f68597j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.QMUIRadiusImageView_qmui_is_touch_select_mode_enabled, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.QMUIRadiusImageView_qmui_is_circle, false);
        this.f68591d = z10;
        if (!z10) {
            this.f68590c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.QMUIRadiusImageView_qmui_is_oval, false);
        }
        if (!this.f68590c) {
            this.f68598k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.QMUIRadiusImageView_qmui_corner_radius, 0);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.QMUIRadiusImageView_qmui_scale_default, true)) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d(Canvas canvas, int i10) {
        if (PatchProxy.proxy(new Object[]{canvas, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32666x9, new Class[]{Canvas.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = (i10 * 1.0f) / 2.0f;
        this.f68599l.setColorFilter(this.f68589b ? this.f68602o : this.f68601n);
        if (this.f68591d) {
            canvas.drawCircle(this.f68605r.centerX(), this.f68605r.centerY(), Math.min(this.f68605r.width() / 2.0f, this.f68605r.height() / 2.0f) - f10, this.f68599l);
            return;
        }
        RectF rectF = this.f68606s;
        RectF rectF2 = this.f68605r;
        rectF.left = rectF2.left + f10;
        rectF.top = rectF2.top + f10;
        rectF.right = rectF2.right - f10;
        rectF.bottom = rectF2.bottom - f10;
        if (this.f68590c) {
            canvas.drawOval(rectF, this.f68599l);
        } else {
            int i11 = this.f68598k;
            canvas.drawRoundRect(rectF, i11, i11, this.f68599l);
        }
    }

    private void g(Canvas canvas, int i10) {
        if (!PatchProxy.proxy(new Object[]{canvas, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32688y9, new Class[]{Canvas.class, Integer.TYPE}, Void.TYPE).isSupported && i10 > 0) {
            float f10 = i10;
            float f11 = (1.0f * f10) / 2.0f;
            this.f68600m.setColor(this.f68589b ? this.f68595h : this.f68593f);
            this.f68600m.setStrokeWidth(f10);
            if (this.f68591d) {
                canvas.drawCircle(this.f68605r.centerX(), this.f68605r.centerY(), (Math.min(this.f68605r.width(), this.f68605r.height()) / 2.0f) - f11, this.f68600m);
                return;
            }
            RectF rectF = this.f68606s;
            RectF rectF2 = this.f68605r;
            rectF.left = rectF2.left + f11;
            rectF.top = rectF2.top + f11;
            rectF.right = rectF2.right - f11;
            rectF.bottom = rectF2.bottom - f11;
            if (this.f68590c) {
                canvas.drawOval(rectF, this.f68600m);
            } else {
                int i11 = this.f68598k;
                canvas.drawRoundRect(rectF, i11, i11, this.f68600m);
            }
        }
    }

    private Bitmap getBitmap() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32556s9, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f68588z) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f68588z);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return null;
        }
        float minimumWidth = getMinimumWidth() / width;
        float minimumHeight = getMinimumHeight() / height;
        if (minimumWidth <= 1.0f && minimumHeight <= 1.0f) {
            return bitmap;
        }
        float fMax = Math.max(minimumWidth, minimumHeight);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, false);
    }

    private void k() {
        Bitmap bitmap;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32600u9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68608u.reset();
        this.f68604q = false;
        if (this.f68603p == null || (bitmap = this.f68607t) == null) {
            return;
        }
        l(this.f68608u, bitmap, this.f68605r);
        this.f68603p.setLocalMatrix(this.f68608u);
        this.f68599l.setShader(this.f68603p);
    }

    private void l(@n0 Matrix matrix, @n0 Bitmap bitmap, RectF rectF) {
        if (PatchProxy.proxy(new Object[]{matrix, bitmap, rectF}, this, changeQuickRedirect, false, bb.c.f.f32622v9, new Class[]{Matrix.class, Bitmap.class, RectF.class}, Void.TYPE).isSupported) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (scaleType == ImageView.ScaleType.MATRIX) {
            m(matrix, bitmap, rectF);
            return;
        }
        if (scaleType == ImageView.ScaleType.CENTER) {
            float f10 = (this.f68609v - width) / 2.0f;
            float f11 = (this.f68610w - height) / 2.0f;
            matrix.postTranslate(f10, f11);
            rectF.set(Math.max(0.0f, f10), Math.max(0.0f, f11), Math.min(f10 + width, this.f68609v), Math.min(f11 + height, this.f68610w));
            return;
        }
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(this.f68609v / width, this.f68610w / height);
            matrix.setScale(fMax, fMax);
            matrix.postTranslate((-((width * fMax) - this.f68609v)) / 2.0f, (-((fMax * height) - this.f68610w)) / 2.0f);
            rectF.set(0.0f, 0.0f, this.f68609v, this.f68610w);
            return;
        }
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            int i10 = this.f68609v;
            float f12 = i10 / width;
            int i11 = this.f68610w;
            float f13 = i11 / height;
            if (f12 >= 1.0f && f13 >= 1.0f) {
                float f14 = (i10 - width) / 2.0f;
                float f15 = (i11 - height) / 2.0f;
                matrix.postTranslate(f14, f15);
                rectF.set(f14, f15, width + f14, height + f15);
                return;
            }
            float fMin = Math.min(f12, f13);
            matrix.setScale(fMin, fMin);
            float f16 = width * fMin;
            float f17 = height * fMin;
            float f18 = (this.f68609v - f16) / 2.0f;
            float f19 = (this.f68610w - f17) / 2.0f;
            matrix.postTranslate(f18, f19);
            rectF.set(f18, f19, f16 + f18, f17 + f19);
            return;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            matrix.setScale(this.f68609v / width, this.f68610w / height);
            rectF.set(0.0f, 0.0f, this.f68609v, this.f68610w);
            return;
        }
        float fMin2 = Math.min(this.f68609v / width, this.f68610w / height);
        matrix.setScale(fMin2, fMin2);
        float f20 = width * fMin2;
        float f21 = height * fMin2;
        if (scaleType == ImageView.ScaleType.FIT_START) {
            rectF.set(0.0f, 0.0f, f20, f21);
            return;
        }
        if (scaleType == ImageView.ScaleType.FIT_CENTER) {
            float f22 = (this.f68609v - f20) / 2.0f;
            float f23 = (this.f68610w - f21) / 2.0f;
            matrix.postTranslate(f22, f23);
            rectF.set(f22, f23, f20 + f22, f21 + f23);
            return;
        }
        matrix.postTranslate(this.f68609v - f20, this.f68610w - f21);
        int i12 = this.f68609v;
        float f24 = i12 - f20;
        int i13 = this.f68610w;
        rectF.set(f24, i13 - f21, i12, i13);
    }

    public int getBorderColor() {
        return this.f68593f;
    }

    public int getBorderWidth() {
        return this.f68592e;
    }

    public int getCornerRadius() {
        return this.f68598k;
    }

    public int getSelectedBorderColor() {
        return this.f68595h;
    }

    public int getSelectedBorderWidth() {
        return this.f68594g;
    }

    public int getSelectedMaskColor() {
        return this.f68596i;
    }

    public boolean h() {
        return this.f68591d;
    }

    public boolean i() {
        return !this.f68591d && this.f68590c;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f68589b;
    }

    public boolean j() {
        return this.f68597j;
    }

    public void m(@n0 Matrix matrix, @n0 Bitmap bitmap, RectF rectF) {
        if (PatchProxy.proxy(new Object[]{matrix, bitmap, rectF}, this, changeQuickRedirect, false, bb.c.f.f32644w9, new Class[]{Matrix.class, Bitmap.class, RectF.class}, Void.TYPE).isSupported) {
            return;
        }
        matrix.set(getImageMatrix());
        rectF.set(0.0f, 0.0f, this.f68609v, this.f68610w);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32710z9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i10 = this.f68589b ? this.f68594g : this.f68592e;
        if (this.f68607t == null || this.f68603p == null) {
            g(canvas, i10);
            return;
        }
        setupBitmap();
        if (this.f68609v != width || this.f68610w != height || this.f68611x != getScaleType() || this.f68604q) {
            this.f68609v = width;
            this.f68610w = height;
            this.f68611x = getScaleType();
            k();
        }
        d(canvas, i10);
        g(canvas, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32489p9, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (!this.f68591d) {
            super.onMeasure(i10, i11);
            return;
        }
        if (mode == 1073741824) {
            setMeasuredDimension(size, size);
            return;
        }
        if (mode2 == 1073741824) {
            setMeasuredDimension(size2, size2);
            return;
        }
        Bitmap bitmap = this.f68607t;
        if (bitmap == null) {
            setMeasuredDimension(0, 0);
        } else {
            int iMin = Math.min(Math.min(bitmap.getWidth(), size), Math.min(this.f68607t.getHeight(), size2));
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.A9, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f68597j) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setSelected(true);
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            setSelected(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32213d9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32259f9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f68593f == i10) {
            return;
        }
        this.f68593f = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32236e9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f68592e == i10) {
            return;
        }
        this.f68592e = i10;
        invalidate();
    }

    public void setCircle(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32374k9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f68591d == z10) {
            return;
        }
        this.f68591d = z10;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.f.f32466o9, new Class[]{ColorFilter.class}, Void.TYPE).isSupported || this.f68601n == colorFilter) {
            return;
        }
        this.f68601n = colorFilter;
        if (this.f68589b) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32282g9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f68598k == i10) {
            return;
        }
        this.f68598k = i10;
        if (this.f68591d || this.f68590c) {
            return;
        }
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.f32512q9, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageDrawable(drawable);
        setupBitmap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.f.f32534r9, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageURI(uri);
        setupBitmap();
    }

    public void setOval(boolean z10) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32397l9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10 && this.f68591d) {
            this.f68591d = false;
        } else {
            z11 = false;
        }
        if (this.f68590c != z10 || z11) {
            this.f68590c = z10;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32420m9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f68589b == z10) {
            return;
        }
        this.f68589b = z10;
        invalidate();
    }

    public void setSelectedBorderColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32305h9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f68595h == i10) {
            return;
        }
        this.f68595h = i10;
        if (this.f68589b) {
            invalidate();
        }
    }

    public void setSelectedBorderWidth(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32328i9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f68594g == i10) {
            return;
        }
        this.f68594g = i10;
        if (this.f68589b) {
            invalidate();
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.f.f32443n9, new Class[]{ColorFilter.class}, Void.TYPE).isSupported || this.f68602o == colorFilter) {
            return;
        }
        this.f68602o = colorFilter;
        if (this.f68589b) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32351j9, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f68596i != i10) {
            this.f68596i = i10;
            if (i10 != 0) {
                this.f68602o = new PorterDuffColorFilter(this.f68596i, PorterDuff.Mode.DARKEN);
            } else {
                this.f68602o = null;
            }
            if (this.f68589b) {
                invalidate();
            }
        }
        this.f68596i = i10;
    }

    public void setTouchSelectModeEnabled(boolean z10) {
        this.f68597j = z10;
    }

    public void setupBitmap() {
        Bitmap bitmap;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32578t9, new Class[0], Void.TYPE).isSupported || (bitmap = getBitmap()) == this.f68607t) {
            return;
        }
        this.f68607t = bitmap;
        if (bitmap == null) {
            this.f68603p = null;
            invalidate();
            return;
        }
        this.f68604q = true;
        Bitmap bitmap2 = this.f68607t;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f68603p = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f68599l == null) {
            Paint paint = new Paint();
            this.f68599l = paint;
            paint.setAntiAlias(true);
        }
        this.f68599l.setShader(this.f68603p);
        requestLayout();
        invalidate();
    }
}
