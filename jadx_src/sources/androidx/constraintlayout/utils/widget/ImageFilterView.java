package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f19147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f19149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f19150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f19154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ViewOutlineProvider f19155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RectF f19156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Drawable[] f19157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    LayerDrawable f19158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f19159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f19160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f19161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f19162q;

    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f19152g) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f19153h);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f19165a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ColorMatrix f19166b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorMatrix f19167c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f19168d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f19169e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f19170f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f19171g = 1.0f;

        c() {
        }

        private void a(float f10) {
            float[] fArr = this.f19165a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f19165a;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f10) {
            float fLog;
            float fPow;
            float fLog2;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            if (f11 > 66.0f) {
                double d10 = f11 - 60.0f;
                fPow = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d10, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 < 66.0f) {
                fLog2 = f11 > 19.0f ? (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f19165a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void c(ImageView imageView) {
            boolean z10;
            this.f19166b.reset();
            float f10 = this.f19169e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f19166b.set(this.f19165a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f19170f;
            if (f11 != 1.0f) {
                this.f19167c.setScale(f11, f11, f11, 1.0f);
                this.f19166b.postConcat(this.f19167c);
                z10 = true;
            }
            float f12 = this.f19171g;
            if (f12 != 1.0f) {
                d(f12);
                this.f19167c.set(this.f19165a);
                this.f19166b.postConcat(this.f19167c);
                z10 = true;
            }
            float f13 = this.f19168d;
            if (f13 != 1.0f) {
                a(f13);
                this.f19167c.set(this.f19165a);
                this.f19166b.postConcat(this.f19167c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f19166b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f19147b = new c();
        this.f19148c = true;
        this.f19149d = null;
        this.f19150e = null;
        this.f19151f = 0.0f;
        this.f19152g = 0.0f;
        this.f19153h = Float.NaN;
        this.f19157l = new Drawable[2];
        this.f19159n = Float.NaN;
        this.f19160o = Float.NaN;
        this.f19161p = Float.NaN;
        this.f19162q = Float.NaN;
        h(context, null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19147b = new c();
        this.f19148c = true;
        this.f19149d = null;
        this.f19150e = null;
        this.f19151f = 0.0f;
        this.f19152g = 0.0f;
        this.f19153h = Float.NaN;
        this.f19157l = new Drawable[2];
        this.f19159n = Float.NaN;
        this.f19160o = Float.NaN;
        this.f19161p = Float.NaN;
        this.f19162q = Float.NaN;
        h(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19147b = new c();
        this.f19148c = true;
        this.f19149d = null;
        this.f19150e = null;
        this.f19151f = 0.0f;
        this.f19152g = 0.0f;
        this.f19153h = Float.NaN;
        this.f19157l = new Drawable[2];
        this.f19159n = Float.NaN;
        this.f19160o = Float.NaN;
        this.f19161p = Float.NaN;
        this.f19162q = Float.NaN;
        h(context, attributeSet);
    }

    private void h(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f19149d = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f19151f = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f19148c));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f19159n));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f19160o));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f19162q));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f19161p));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f19150e = drawable;
            if (this.f19149d == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f19150e = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f19157l;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f19150e = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f19157l;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f19150e = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f19157l[1] = this.f19149d.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f19157l);
            this.f19158m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f19151f * 255.0f));
            if (!this.f19148c) {
                this.f19158m.getDrawable(0).setAlpha((int) ((1.0f - this.f19151f) * 255.0f));
            }
            super.setImageDrawable(this.f19158m);
        }
    }

    private void i() {
        if (Float.isNaN(this.f19159n) && Float.isNaN(this.f19160o) && Float.isNaN(this.f19161p) && Float.isNaN(this.f19162q)) {
            return;
        }
        float f10 = Float.isNaN(this.f19159n) ? 0.0f : this.f19159n;
        float f11 = Float.isNaN(this.f19160o) ? 0.0f : this.f19160o;
        float f12 = Float.isNaN(this.f19161p) ? 1.0f : this.f19161p;
        float f13 = Float.isNaN(this.f19162q) ? 0.0f : this.f19162q;
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

    private void j() {
        if (Float.isNaN(this.f19159n) && Float.isNaN(this.f19160o) && Float.isNaN(this.f19161p) && Float.isNaN(this.f19162q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            i();
        }
    }

    private void setOverlay(boolean z10) {
        this.f19148c = z10;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f19147b.f19168d;
    }

    public float getContrast() {
        return this.f19147b.f19170f;
    }

    public float getCrossfade() {
        return this.f19151f;
    }

    public float getImagePanX() {
        return this.f19159n;
    }

    public float getImagePanY() {
        return this.f19160o;
    }

    public float getImageRotate() {
        return this.f19162q;
    }

    public float getImageZoom() {
        return this.f19161p;
    }

    public float getRound() {
        return this.f19153h;
    }

    public float getRoundPercent() {
        return this.f19152g;
    }

    public float getSaturation() {
        return this.f19147b.f19169e;
    }

    public float getWarmth() {
        return this.f19147b.f19171g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        i();
    }

    public void setAltImageResource(int i10) {
        Drawable drawableMutate = b0.a.b(getContext(), i10).mutate();
        this.f19149d = drawableMutate;
        Drawable[] drawableArr = this.f19157l;
        drawableArr[0] = this.f19150e;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19157l);
        this.f19158m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19151f);
    }

    public void setBrightness(float f10) {
        c cVar = this.f19147b;
        cVar.f19168d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f19147b;
        cVar.f19170f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f19151f = f10;
        if (this.f19157l != null) {
            if (!this.f19148c) {
                this.f19158m.getDrawable(0).setAlpha((int) ((1.0f - this.f19151f) * 255.0f));
            }
            this.f19158m.getDrawable(1).setAlpha((int) (this.f19151f * 255.0f));
            super.setImageDrawable(this.f19158m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f19149d == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f19150e = drawableMutate;
        Drawable[] drawableArr = this.f19157l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19149d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19157l);
        this.f19158m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19151f);
    }

    public void setImagePanX(float f10) {
        this.f19159n = f10;
        j();
    }

    public void setImagePanY(float f10) {
        this.f19160o = f10;
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f19149d == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = b0.a.b(getContext(), i10).mutate();
        this.f19150e = drawableMutate;
        Drawable[] drawableArr = this.f19157l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19149d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f19157l);
        this.f19158m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19151f);
    }

    public void setImageRotate(float f10) {
        this.f19162q = f10;
        j();
    }

    public void setImageZoom(float f10) {
        this.f19161p = f10;
        j();
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f19153h = f10;
            float f11 = this.f19152g;
            this.f19152g = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f19153h != f10;
        this.f19153h = f10;
        if (f10 != 0.0f) {
            if (this.f19154i == null) {
                this.f19154i = new Path();
            }
            if (this.f19156k == null) {
                this.f19156k = new RectF();
            }
            if (this.f19155j == null) {
                b bVar = new b();
                this.f19155j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19156k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19154i.reset();
            Path path = this.f19154i;
            RectF rectF = this.f19156k;
            float f12 = this.f19153h;
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
        boolean z10 = this.f19152g != f10;
        this.f19152g = f10;
        if (f10 != 0.0f) {
            if (this.f19154i == null) {
                this.f19154i = new Path();
            }
            if (this.f19156k == null) {
                this.f19156k = new RectF();
            }
            if (this.f19155j == null) {
                a aVar = new a();
                this.f19155j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19152g) / 2.0f;
            this.f19156k.set(0.0f, 0.0f, width, height);
            this.f19154i.reset();
            this.f19154i.addRoundRect(this.f19156k, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f19147b;
        cVar.f19169e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f19147b;
        cVar.f19171g = f10;
        cVar.c(this);
    }
}
