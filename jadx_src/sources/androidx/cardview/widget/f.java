package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3387a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f3389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f3390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3391e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f3394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f3395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f3396j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3392f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3393g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f3397k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f3388b = new Paint(5);

    f(ColorStateList colorStateList, float f10) {
        this.f3387a = f10;
        e(colorStateList);
        this.f3389c = new RectF();
        this.f3390d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3394h = colorStateList;
        this.f3388b.setColor(colorStateList.getColorForState(getState(), this.f3394h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3389c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3390d.set(rect);
        if (this.f3392f) {
            this.f3390d.inset((int) Math.ceil(g.c(this.f3391e, this.f3387a, this.f3393g)), (int) Math.ceil(g.d(this.f3391e, this.f3387a, this.f3393g)));
            this.f3389c.set(this.f3390d);
        }
    }

    public ColorStateList b() {
        return this.f3394h;
    }

    float c() {
        return this.f3391e;
    }

    public float d() {
        return this.f3387a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f3388b;
        if (this.f3395i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f3395i);
            z10 = true;
        }
        RectF rectF = this.f3389c;
        float f10 = this.f3387a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(@p0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f3391e && this.f3392f == z10 && this.f3393g == z11) {
            return;
        }
        this.f3391e = f10;
        this.f3392f = z10;
        this.f3393g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3390d, this.f3387a);
    }

    void h(float f10) {
        if (f10 == this.f3387a) {
            return;
        }
        this.f3387a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3396j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f3394h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3394h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f3388b.getColor();
        if (z10) {
            this.f3388b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3396j;
        if (colorStateList2 == null || (mode = this.f3397k) == null) {
            return z10;
        }
        this.f3395i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3388b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3388b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3396j = colorStateList;
        this.f3395i = a(colorStateList, this.f3397k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3397k = mode;
        this.f3395i = a(this.f3396j, mode);
        invalidateSelf();
    }
}
