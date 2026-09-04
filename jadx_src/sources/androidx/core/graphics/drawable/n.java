package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: RoundedBitmapDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f20679n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Bitmap f20680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20681b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitmapShader f20684e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20686g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20692m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20682c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f20683d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f20685f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f20687h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f20688i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20689j = true;

    n(Resources resources, Bitmap bitmap) {
        this.f20681b = 160;
        if (resources != null) {
            this.f20681b = resources.getDisplayMetrics().densityDpi;
        }
        this.f20680a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f20684e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f20692m = -1;
            this.f20691l = -1;
            this.f20684e = null;
        }
    }

    private void a() {
        this.f20691l = this.f20680a.getScaledWidth(this.f20681b);
        this.f20692m = this.f20680a.getScaledHeight(this.f20681b);
    }

    private static boolean j(float f10) {
        return f10 > 0.05f;
    }

    private void s() {
        this.f20686g = Math.min(this.f20692m, this.f20691l) / 2;
    }

    @p0
    public final Bitmap b() {
        return this.f20680a;
    }

    public float c() {
        return this.f20686g;
    }

    public int d() {
        return this.f20682c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Bitmap bitmap = this.f20680a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f20683d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f20687h, this.f20683d);
            return;
        }
        RectF rectF = this.f20688i;
        float f10 = this.f20686g;
        canvas.drawRoundRect(rectF, f10, f10, this.f20683d);
    }

    @n0
    public final Paint e() {
        return this.f20683d;
    }

    void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f20683d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20683d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f20683d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20692m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20691l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f20682c != 119 || this.f20690k || (bitmap = this.f20680a) == null || bitmap.hasAlpha() || this.f20683d.getAlpha() < 255 || j(this.f20686g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f20690k;
    }

    public void k(boolean z10) {
        this.f20683d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void l(boolean z10) {
        this.f20690k = z10;
        this.f20689j = true;
        if (!z10) {
            m(0.0f);
            return;
        }
        s();
        this.f20683d.setShader(this.f20684e);
        invalidateSelf();
    }

    public void m(float f10) {
        if (this.f20686g == f10) {
            return;
        }
        this.f20690k = false;
        if (j(f10)) {
            this.f20683d.setShader(this.f20684e);
        } else {
            this.f20683d.setShader(null);
        }
        this.f20686g = f10;
        invalidateSelf();
    }

    public void n(int i10) {
        if (this.f20682c != i10) {
            this.f20682c = i10;
            this.f20689j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@n0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f20690k) {
            s();
        }
        this.f20689j = true;
    }

    public void p(int i10) {
        if (this.f20681b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f20681b = i10;
            if (this.f20680a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@n0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@n0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f20683d.getAlpha()) {
            this.f20683d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20683d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f20683d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f20683d.setFilterBitmap(z10);
        invalidateSelf();
    }

    void t() {
        if (this.f20689j) {
            if (this.f20690k) {
                int iMin = Math.min(this.f20691l, this.f20692m);
                f(this.f20682c, iMin, iMin, getBounds(), this.f20687h);
                int iMin2 = Math.min(this.f20687h.width(), this.f20687h.height());
                this.f20687h.inset(Math.max(0, (this.f20687h.width() - iMin2) / 2), Math.max(0, (this.f20687h.height() - iMin2) / 2));
                this.f20686g = iMin2 * 0.5f;
            } else {
                f(this.f20682c, this.f20691l, this.f20692m, getBounds(), this.f20687h);
            }
            this.f20688i.set(this.f20687h);
            if (this.f20684e != null) {
                Matrix matrix = this.f20685f;
                RectF rectF = this.f20688i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f20685f.preScale(this.f20688i.width() / this.f20680a.getWidth(), this.f20688i.height() / this.f20680a.getHeight());
                this.f20684e.setLocalMatrix(this.f20685f);
                this.f20683d.setShader(this.f20684e);
            }
            this.f20689j = false;
        }
    }
}
