package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import androidx.cardview.R;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double f3398q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f3399r = 1.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static a f3400s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3401a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f3403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f3404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f3405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f3406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f3407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f3408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f3409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f3410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f3411k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f3414n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3412l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f3415o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3416p = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f3402b = new Paint(5);

    /* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f3413m = resources.getColor(R.color.cardview_shadow_start_color);
        this.f3414n = resources.getColor(R.color.cardview_shadow_end_color);
        this.f3401a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f3403c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3406f = (int) (f10 + 0.5f);
        this.f3405e = new RectF();
        Paint paint2 = new Paint(this.f3403c);
        this.f3404d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f3408h;
        float f11 = f3399r * f10;
        this.f3405e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    private void b() {
        float f10 = this.f3406f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f3409i;
        rectF2.inset(-f11, -f11);
        Path path = this.f3407g;
        if (path == null) {
            this.f3407g = new Path();
        } else {
            path.reset();
        }
        this.f3407g.setFillType(Path.FillType.EVEN_ODD);
        this.f3407g.moveTo(-this.f3406f, 0.0f);
        this.f3407g.rLineTo(-this.f3409i, 0.0f);
        this.f3407g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3407g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3407g.close();
        float f12 = this.f3406f;
        float f13 = f12 / (this.f3409i + f12);
        Paint paint = this.f3403c;
        float f14 = this.f3406f + this.f3409i;
        int i10 = this.f3413m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f3414n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f3404d;
        float f15 = this.f3406f;
        float f16 = this.f3409i;
        int i11 = this.f3413m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f3414n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f3404d.setAntiAlias(false);
    }

    static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f3398q) * ((double) f11))) : f10;
    }

    static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * f3399r)) + ((1.0d - f3398q) * ((double) f11))) : f10 * f3399r;
    }

    private void e(Canvas canvas) {
        float f10 = this.f3406f;
        float f11 = (-f10) - this.f3409i;
        float f12 = f10 + this.f3401a + (this.f3410j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f3405e.width() - f13 > 0.0f;
        boolean z11 = this.f3405e.height() - f13 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f3405e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f3407g, this.f3403c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f3405e.width() - f13, -this.f3406f, this.f3404d);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f3405e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3407g, this.f3403c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f3405e.width() - f13, (-this.f3406f) + this.f3409i, this.f3404d);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f3405e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3407g, this.f3403c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f3405e.height() - f13, -this.f3406f, this.f3404d);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f3405e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3407g, this.f3403c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f3405e.height() - f13, -this.f3406f, this.f3404d);
        }
        canvas.restoreToCount(iSave4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3411k = colorStateList;
        this.f3402b.setColor(colorStateList.getColorForState(getState(), this.f3411k.getDefaultColor()));
    }

    private void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
        float fT = t(f10);
        float fT2 = t(f11);
        if (fT > fT2) {
            if (!this.f3416p) {
                this.f3416p = true;
            }
            fT = fT2;
        }
        if (this.f3410j == fT && this.f3408h == fT2) {
            return;
        }
        this.f3410j = fT;
        this.f3408h = fT2;
        this.f3409i = (int) ((fT * f3399r) + this.f3401a + 0.5f);
        this.f3412l = true;
        invalidateSelf();
    }

    private int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3412l) {
            a(getBounds());
            this.f3412l = false;
        }
        canvas.translate(0.0f, this.f3410j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f3410j) / 2.0f);
        f3400s.a(canvas, this.f3405e, this.f3406f, this.f3402b);
    }

    ColorStateList f() {
        return this.f3411k;
    }

    float g() {
        return this.f3406f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f3408h, this.f3406f, this.f3415o));
        int iCeil2 = (int) Math.ceil(c(this.f3408h, this.f3406f, this.f3415o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.f3408h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f3411k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f10 = this.f3408h;
        return (Math.max(f10, this.f3406f + this.f3401a + ((f10 * f3399r) / 2.0f)) * 2.0f) + (((this.f3408h * f3399r) + this.f3401a) * 2.0f);
    }

    float k() {
        float f10 = this.f3408h;
        return (Math.max(f10, this.f3406f + this.f3401a + (f10 / 2.0f)) * 2.0f) + ((this.f3408h + this.f3401a) * 2.0f);
    }

    float l() {
        return this.f3410j;
    }

    void m(boolean z10) {
        this.f3415o = z10;
        invalidateSelf();
    }

    void o(@p0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3412l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3411k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f3402b.getColor() == colorForState) {
            return false;
        }
        this.f3402b.setColor(colorForState);
        this.f3412l = true;
        invalidateSelf();
        return true;
    }

    void p(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
        }
        float f11 = (int) (f10 + 0.5f);
        if (this.f3406f == f11) {
            return;
        }
        this.f3406f = f11;
        this.f3412l = true;
        invalidateSelf();
    }

    void q(float f10) {
        s(this.f3410j, f10);
    }

    void r(float f10) {
        s(f10, this.f3408h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3402b.setAlpha(i10);
        this.f3403c.setAlpha(i10);
        this.f3404d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3402b.setColorFilter(colorFilter);
    }
}
