package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.constraintlayout.core.motion.utils.w;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class GifTextureView extends TextureView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImageView.ScaleType[] f138319h = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView.ScaleType f138320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f138321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f138322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f138323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f138324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j.b f138325g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f138326a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f138326a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138326a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138326a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138326a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138326a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138326a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138326a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f138326a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface b {
        void a(Canvas canvas);
    }

    public static class c extends Thread implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final pl.droidsonroids.gif.b f138327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GifInfoHandle f138328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IOException f138329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long[] f138330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WeakReference<GifTextureView> f138331f;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GifTextureView f138332b;

            a(GifTextureView gifTextureView) {
                this.f138332b = gifTextureView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f138332b.i(c.this.f138328c);
            }
        }

        c(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.f138327b = new pl.droidsonroids.gif.b();
            this.f138328c = new GifInfoHandle();
            this.f138331f = new WeakReference<>(gifTextureView);
        }

        void c(@n0 GifTextureView gifTextureView, @p0 b bVar) {
            this.f138327b.b();
            gifTextureView.setSuperSurfaceTextureListener(bVar != null ? new o(bVar) : null);
            this.f138328c.z();
            interrupt();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            GifTextureView gifTextureView = this.f138331f.get();
            if (gifTextureView != null) {
                gifTextureView.i(this.f138328c);
            }
            this.f138327b.c();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f138327b.b();
            this.f138328c.z();
            interrupt();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                GifTextureView gifTextureView = this.f138331f.get();
                if (gifTextureView == null) {
                    return;
                }
                GifInfoHandle gifInfoHandleC = gifTextureView.f138322d.c();
                this.f138328c = gifInfoHandleC;
                gifInfoHandleC.K((char) 1, gifTextureView.isOpaque());
                if (gifTextureView.f138325g.f138377b >= 0) {
                    this.f138328c.J(gifTextureView.f138325g.f138377b);
                }
                GifTextureView gifTextureView2 = this.f138331f.get();
                if (gifTextureView2 == null) {
                    this.f138328c.A();
                    return;
                }
                gifTextureView2.setSuperSurfaceTextureListener(this);
                boolean zIsAvailable = gifTextureView2.isAvailable();
                this.f138327b.d(zIsAvailable);
                if (zIsAvailable) {
                    gifTextureView2.post(new a(gifTextureView2));
                }
                this.f138328c.L(gifTextureView2.f138324f);
                while (!isInterrupted()) {
                    try {
                        this.f138327b.a();
                        GifTextureView gifTextureView3 = this.f138331f.get();
                        if (gifTextureView3 == null) {
                            break;
                        }
                        SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                        if (surfaceTexture != null) {
                            Surface surface = new Surface(surfaceTexture);
                            try {
                                this.f138328c.a(surface, this.f138330e);
                                surface.release();
                            } catch (Throwable th2) {
                                surface.release();
                                throw th2;
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                this.f138328c.A();
                this.f138328c = new GifInfoHandle();
            } catch (IOException e10) {
                this.f138329d = e10;
            }
        }
    }

    public GifTextureView(Context context) {
        super(context);
        this.f138320b = ImageView.ScaleType.FIT_CENTER;
        this.f138321c = new Matrix();
        this.f138324f = 1.0f;
        h(null, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138320b = ImageView.ScaleType.FIT_CENTER;
        this.f138321c = new Matrix();
        this.f138324f = 1.0f;
        h(attributeSet, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f138320b = ImageView.ScaleType.FIT_CENTER;
        this.f138321c = new Matrix();
        this.f138324f = 1.0f;
        h(attributeSet, i10, 0);
    }

    @w0(21)
    public GifTextureView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f138320b = ImageView.ScaleType.FIT_CENTER;
        this.f138321c = new Matrix();
        this.f138324f = 1.0f;
        h(attributeSet, i10, i11);
    }

    private void f() {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            Surface surface = new Surface(surfaceTexture);
            try {
                surface.unlockCanvasAndPost(surface.lockCanvas(null));
            } finally {
                surface.release();
            }
        }
    }

    private static k g(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(R.styleable.GifTextureView_gifSource, typedValue)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
            if (j.f138373b.contains(resourceTypeName)) {
                return new k.i(typedArray.getResources(), typedValue.resourceId);
            }
            if (!w.b.f17895e.equals(resourceTypeName)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. '" + resourceTypeName + "' is not supported");
            }
        }
        return new k.c(typedArray.getResources().getAssets(), typedValue.string.toString());
    }

    private void h(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f138319h;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f138320b = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f138335a, i10, i11);
            this.f138322d = g(typedArrayObtainStyledAttributes);
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(R.styleable.GifTextureView_isOpaque, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f138325g = new j.b(this, attributeSet, i10, i11);
        } else {
            super.setOpaque(false);
            this.f138325g = new j.b();
        }
        if (isInEditMode()) {
            return;
        }
        c cVar = new c(this);
        this.f138323e = cVar;
        if (this.f138322d != null) {
            cVar.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fQ = gifInfoHandle.q() / width;
        float fI = gifInfoHandle.i() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.q(), gifInfoHandle.i());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (a.f138326a[this.f138320b.ordinal()]) {
            case 1:
                matrix.setScale(fQ, fI, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fQ, fI);
                matrix.setScale(fQ * fMin, fMin * fI, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.q()) > width || ((float) gifInfoHandle.i()) > height) ? Math.min(1.0f / fQ, 1.0f / fI) : 1.0f;
                matrix.setScale(fQ * fMin2, fMin2 * fI, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fQ, fI);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fQ, fI);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fQ, fI);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f138321c);
                matrix.preScale(fQ, fI);
                break;
        }
        super.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @p0
    public IOException getIOException() {
        return this.f138323e.f138329d != null ? this.f138323e.f138329d : GifIOException.a(this.f138323e.f138328c.l());
    }

    public ImageView.ScaleType getScaleType() {
        return this.f138320b;
    }

    @Override // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    @Override // android.view.TextureView
    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f138321c);
        return matrix;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f138323e.c(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        this.f138323e.f138330e = gifViewSavedState.f138334b[0];
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = this.f138323e;
        cVar.f138330e = cVar.f138328c.o();
        return new GifViewSavedState(super.onSaveInstanceState(), this.f138325g.f138376a ? this.f138323e.f138330e : null);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f138325g.f138376a = z10;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(@p0 k kVar) {
        setInputSource(kVar, null);
    }

    public synchronized void setInputSource(@p0 k kVar, @p0 b bVar) {
        this.f138323e.c(this, bVar);
        try {
            this.f138323e.join();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.f138322d = kVar;
        c cVar = new c(this);
        this.f138323e = cVar;
        if (kVar != null) {
            cVar.start();
        } else {
            f();
        }
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean z10) {
        if (z10 != isOpaque()) {
            super.setOpaque(z10);
            setInputSource(this.f138322d);
        }
    }

    public void setScaleType(@n0 ImageView.ScaleType scaleType) {
        this.f138320b = scaleType;
        i(this.f138323e.f138328c);
    }

    public void setSpeed(@x(from = 0.0d, fromInclusive = false) float f10) {
        this.f138324f = f10;
        this.f138323e.f138328c.L(f10);
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        this.f138321c.set(matrix);
        i(this.f138323e.f138328c);
    }
}
