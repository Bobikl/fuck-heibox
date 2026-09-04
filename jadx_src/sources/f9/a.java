package f9;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.core.graphics.f0;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.j0;
import com.google.android.material.resources.b;

/* JADX INFO: compiled from: ElevationOverlayProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f118813f = 4.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f118814g = 2.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f118815h = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f118816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f118820e;

    public a(@n0 Context context) {
        this(b.b(context, R.attr.elevationOverlayEnabled, false), m.b(context, R.attr.elevationOverlayColor, 0), m.b(context, R.attr.elevationOverlayAccentColor, 0), m.b(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean z10, @l int i10, @l int i11, @l int i12, float f10) {
        this.f118816a = z10;
        this.f118817b = i10;
        this.f118818c = i11;
        this.f118819d = i12;
        this.f118820e = f10;
    }

    private boolean m(@l int i10) {
        return f0.B(i10, 255) == this.f118819d;
    }

    public int a(float f10) {
        return Math.round(b(f10) * 255.0f);
    }

    public float b(float f10) {
        float f11 = this.f118820e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * f118813f) + f118814g) / 100.0f, 1.0f);
    }

    @l
    public int c(@l int i10, float f10) {
        int i11;
        float fB = b(f10);
        int iAlpha = Color.alpha(i10);
        int iO = m.o(f0.B(i10, 255), this.f118817b, fB);
        if (fB > 0.0f && (i11 = this.f118818c) != 0) {
            iO = m.n(iO, f0.B(i11, f118815h));
        }
        return f0.B(iO, iAlpha);
    }

    @l
    public int d(@l int i10, float f10, @n0 View view) {
        return c(i10, f10 + i(view));
    }

    @l
    public int e(@l int i10, float f10) {
        return (this.f118816a && m(i10)) ? c(i10, f10) : i10;
    }

    @l
    public int f(@l int i10, float f10, @n0 View view) {
        return e(i10, f10 + i(view));
    }

    @l
    public int g(float f10) {
        return e(this.f118819d, f10);
    }

    @l
    public int h(float f10, @n0 View view) {
        return g(f10 + i(view));
    }

    public float i(@n0 View view) {
        return j0.n(view);
    }

    @l
    public int j() {
        return this.f118817b;
    }

    @l
    public int k() {
        return this.f118819d;
    }

    public boolean l() {
        return this.f118816a;
    }
}
