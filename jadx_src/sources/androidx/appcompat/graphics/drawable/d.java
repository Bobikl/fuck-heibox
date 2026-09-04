package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.x;
import androidx.appcompat.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: DrawerArrowDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f1960m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f1961n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1962o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f1963p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f1964q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f1965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f1966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f1971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f1974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f1975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1976l;

    /* JADX INFO: compiled from: DrawerArrowDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f1965a = paint;
        this.f1971g = new Path();
        this.f1973i = false;
        this.f1976l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.f1584q, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        p(typedArrayObtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        o(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        s(typedArrayObtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f1972h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f1967c = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f1966b = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f1968d = typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float k(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f1966b;
    }

    public float b() {
        return this.f1968d;
    }

    public float c() {
        return this.f1967c;
    }

    public float d() {
        return this.f1965a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f1976l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? androidx.core.graphics.drawable.d.f(this) == 0 : androidx.core.graphics.drawable.d.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f1966b;
        float fK = k(this.f1967c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f1974j);
        float fK2 = k(this.f1967c, this.f1968d, this.f1974j);
        float fRound = Math.round(k(0.0f, this.f1975k, this.f1974j));
        float fK3 = k(0.0f, f1964q, this.f1974j);
        float fK4 = k(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f1974j);
        double d10 = fK;
        double d11 = fK3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f1971g.rewind();
        float fK5 = k(this.f1969e + this.f1965a.getStrokeWidth(), -this.f1975k, this.f1974j);
        float f11 = (-fK2) / 2.0f;
        this.f1971g.moveTo(f11 + fRound, 0.0f);
        this.f1971g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.f1971g.moveTo(f11, fK5);
        this.f1971g.rLineTo(fRound2, fRound3);
        this.f1971g.moveTo(f11, -fK5);
        this.f1971g.rLineTo(fRound2, -fRound3);
        this.f1971g.close();
        canvas.save();
        float strokeWidth = this.f1965a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f12 = this.f1969e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * f12))) / 4) * 2) + (strokeWidth * 1.5f) + f12);
        if (this.f1970f) {
            canvas.rotate(fK4 * (this.f1973i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1971g, this.f1965a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f1965a.getColor();
    }

    public int f() {
        return this.f1976l;
    }

    public float g() {
        return this.f1969e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1972h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1972h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f1965a;
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float i() {
        return this.f1974j;
    }

    public boolean j() {
        return this.f1970f;
    }

    public void l(float f10) {
        if (this.f1966b != f10) {
            this.f1966b = f10;
            invalidateSelf();
        }
    }

    public void m(float f10) {
        if (this.f1968d != f10) {
            this.f1968d = f10;
            invalidateSelf();
        }
    }

    public void n(float f10) {
        if (this.f1967c != f10) {
            this.f1967c = f10;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        if (this.f1965a.getStrokeWidth() != f10) {
            this.f1965a.setStrokeWidth(f10);
            this.f1975k = (float) (((double) (f10 / 2.0f)) * Math.cos(f1964q));
            invalidateSelf();
        }
    }

    public void p(@l int i10) {
        if (i10 != this.f1965a.getColor()) {
            this.f1965a.setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        if (i10 != this.f1976l) {
            this.f1976l = i10;
            invalidateSelf();
        }
    }

    public void r(float f10) {
        if (f10 != this.f1969e) {
            this.f1969e = f10;
            invalidateSelf();
        }
    }

    public void s(boolean z10) {
        if (this.f1970f != z10) {
            this.f1970f = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f1965a.getAlpha()) {
            this.f1965a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1965a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f1974j != f10) {
            this.f1974j = f10;
            invalidateSelf();
        }
    }

    public void t(boolean z10) {
        if (this.f1973i != z10) {
            this.f1973i = z10;
            invalidateSelf();
        }
    }
}
