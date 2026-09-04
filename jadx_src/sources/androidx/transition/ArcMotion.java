package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f27615g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f27616h = 70.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f27617i = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f27618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f27619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f27621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f27622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27623f;

    public ArcMotion() {
        this.f27618a = 0.0f;
        this.f27619b = 0.0f;
        this.f27620c = 70.0f;
        this.f27621d = 0.0f;
        this.f27622e = 0.0f;
        this.f27623f = f27617i;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27618a = 0.0f;
        this.f27619b = 0.0f;
        this.f27620c = 70.0f;
        this.f27621d = 0.0f;
        this.f27622e = 0.0f;
        this.f27623f = f27617i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27915j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(androidx.core.content.res.q.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(androidx.core.content.res.q.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(androidx.core.content.res.q.j(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float h(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    @androidx.annotation.n0
    public Path a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f17 = f12 - f10;
        float f18 = f13 - f11;
        float f19 = (f17 * f17) + (f18 * f18);
        float f20 = (f10 + f12) / 2.0f;
        float f21 = (f11 + f13) / 2.0f;
        float f22 = 0.25f * f19;
        boolean z10 = f11 > f13;
        if (Math.abs(f17) < Math.abs(f18)) {
            float fAbs = Math.abs(f19 / (f18 * 2.0f));
            if (z10) {
                f15 = fAbs + f13;
                f14 = f12;
            } else {
                f15 = fAbs + f11;
                f14 = f10;
            }
            f16 = this.f27622e;
        } else {
            float f23 = f19 / (f17 * 2.0f);
            if (z10) {
                f15 = f11;
                f14 = f23 + f10;
            } else {
                f14 = f12 - f23;
                f15 = f13;
            }
            f16 = this.f27621d;
        }
        float f24 = f22 * f16 * f16;
        float f25 = f20 - f14;
        float f26 = f21 - f15;
        float f27 = (f25 * f25) + (f26 * f26);
        float f28 = this.f27623f;
        float f29 = f22 * f28 * f28;
        if (f27 >= f24) {
            f24 = f27 > f29 ? f29 : 0.0f;
        }
        if (f24 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f24 / f27);
            f14 = ((f14 - f20) * fSqrt) + f20;
            f15 = f21 + (fSqrt * (f15 - f21));
        }
        path.cubicTo((f10 + f14) / 2.0f, (f11 + f15) / 2.0f, (f14 + f12) / 2.0f, (f15 + f13) / 2.0f, f12, f13);
        return path;
    }

    public float b() {
        return this.f27620c;
    }

    public float c() {
        return this.f27618a;
    }

    public float d() {
        return this.f27619b;
    }

    public void e(float f10) {
        this.f27620c = f10;
        this.f27623f = h(f10);
    }

    public void f(float f10) {
        this.f27618a = f10;
        this.f27621d = h(f10);
    }

    public void g(float f10) {
        this.f27619b = f10;
        this.f27622e = h(f10);
    }
}
