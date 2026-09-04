package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageFilterView.c f19129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f19133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ViewOutlineProvider f19134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RectF f19135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Drawable[] f19136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    LayerDrawable f19137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f19139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f19140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f19141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f19142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f19143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f19144t;

    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f19131g) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f19132h);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f19129e = new ImageFilterView.c();
        this.f19130f = 0.0f;
        this.f19131g = 0.0f;
        this.f19132h = Float.NaN;
        this.f19136l = new Drawable[2];
        this.f19138n = true;
        this.f19139o = null;
        this.f19140p = null;
        this.f19141q = Float.NaN;
        this.f19142r = Float.NaN;
        this.f19143s = Float.NaN;
        this.f19144t = Float.NaN;
        c(context, null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19129e = new ImageFilterView.c();
        this.f19130f = 0.0f;
        this.f19131g = 0.0f;
        this.f19132h = Float.NaN;
        this.f19136l = new Drawable[2];
        this.f19138n = true;
        this.f19139o = null;
        this.f19140p = null;
        this.f19141q = Float.NaN;
        this.f19142r = Float.NaN;
        this.f19143s = Float.NaN;
        this.f19144t = Float.NaN;
        c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19129e = new ImageFilterView.c();
        this.f19130f = 0.0f;
        this.f19131g = 0.0f;
        this.f19132h = Float.NaN;
        this.f19136l = new Drawable[2];
        this.f19138n = true;
        this.f19139o = null;
        this.f19140p = null;
        this.f19141q = Float.NaN;
        this.f19142r = Float.NaN;
        this.f19143s = Float.NaN;
        this.f19144t = Float.NaN;
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f19139o = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f19130f = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f19138n));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f19141q));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f19142r));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f19144t));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f19143s));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f19140p = drawable;
            if (this.f19139o == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f19140p = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f19136l;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f19140p = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f19136l;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f19140p = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f19136l[1] = this.f19139o.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f19136l);
            this.f19137m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f19130f * 255.0f));
            if (!this.f19138n) {
                this.f19137m.getDrawable(0).setAlpha((int) ((1.0f - this.f19130f) * 255.0f));
            }
            super.setImageDrawable(this.f19137m);
        }
    }

    private void d() {
        if (Float.isNaN(this.f19141q) && Float.isNaN(this.f19142r) && Float.isNaN(this.f19143s) && Float.isNaN(this.f19144t)) {
            return;
        }
        float f10 = Float.isNaN(this.f19141q) ? 0.0f : this.f19141q;
        float f11 = Float.isNaN(this.f19142r) ? 0.0f : this.f19142r;
        float f12 = Float.isNaN(this.f19143s) ? 1.0f : this.f19143s;
        float f13 = Float.isNaN(this.f19144t) ? 0.0f : this.f19144t;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate((((f10 * (width - f15)) + width) - f15) * 0.5f, (((f11 * (height - f16)) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void e() {
        if (Float.isNaN(this.f19141q) && Float.isNaN(this.f19142r) && Float.isNaN(this.f19143s) && Float.isNaN(this.f19144t)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    private void setOverlay(boolean z10) {
        this.f19138n = z10;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f19129e.f19170f;
    }

    public float getCrossfade() {
        return this.f19130f;
    }

    public float getImagePanX() {
        return this.f19141q;
    }

    public float getImagePanY() {
        return this.f19142r;
    }

    public float getImageRotate() {
        return this.f19144t;
    }

    public float getImageZoom() {
        return this.f19143s;
    }

    public float getRound() {
        return this.f19132h;
    }

    public float getRoundPercent() {
        return this.f19131g;
    }

    public float getSaturation() {
        return this.f19129e.f19169e;
    }

    public float getWarmth() {
        return this.f19129e.f19171g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        d();
    }

    public void setAltImageResource(int i10) {
        Drawable drawableMutate = b0.a.b(getContext(), i10).mutate();
        this.f19139o = drawableMutate;
        Drawable[] drawableArr = this.f19136l;
        drawableArr[0] = this.f19140p;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19136l);
        this.f19137m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19130f);
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.f19129e;
        cVar.f19168d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.f19129e;
        cVar.f19170f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f19130f = f10;
        if (this.f19136l != null) {
            if (!this.f19138n) {
                this.f19137m.getDrawable(0).setAlpha((int) ((1.0f - this.f19130f) * 255.0f));
            }
            this.f19137m.getDrawable(1).setAlpha((int) (this.f19130f * 255.0f));
            super.setImageDrawable(this.f19137m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f19139o == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f19140p = drawableMutate;
        Drawable[] drawableArr = this.f19136l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19139o;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19136l);
        this.f19137m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19130f);
    }

    public void setImagePanX(float f10) {
        this.f19141q = f10;
        e();
    }

    public void setImagePanY(float f10) {
        this.f19142r = f10;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f19139o == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = b0.a.b(getContext(), i10).mutate();
        this.f19140p = drawableMutate;
        Drawable[] drawableArr = this.f19136l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19139o;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19136l);
        this.f19137m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19130f);
    }

    public void setImageRotate(float f10) {
        this.f19144t = f10;
        e();
    }

    public void setImageZoom(float f10) {
        this.f19143s = f10;
        e();
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f19132h = f10;
            float f11 = this.f19131g;
            this.f19131g = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f19132h != f10;
        this.f19132h = f10;
        if (f10 != 0.0f) {
            if (this.f19133i == null) {
                this.f19133i = new Path();
            }
            if (this.f19135k == null) {
                this.f19135k = new RectF();
            }
            if (this.f19134j == null) {
                b bVar = new b();
                this.f19134j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19135k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19133i.reset();
            Path path = this.f19133i;
            RectF rectF = this.f19135k;
            float f12 = this.f19132h;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f19131g != f10;
        this.f19131g = f10;
        if (f10 != 0.0f) {
            if (this.f19133i == null) {
                this.f19133i = new Path();
            }
            if (this.f19135k == null) {
                this.f19135k = new RectF();
            }
            if (this.f19134j == null) {
                a aVar = new a();
                this.f19134j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19131g) / 2.0f;
            this.f19135k.set(0.0f, 0.0f, width, height);
            this.f19133i.reset();
            this.f19133i.addRoundRect(this.f19135k, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.f19129e;
        cVar.f19169e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.f19129e;
        cVar.f19171g = f10;
        cVar.c(this);
    }
}
