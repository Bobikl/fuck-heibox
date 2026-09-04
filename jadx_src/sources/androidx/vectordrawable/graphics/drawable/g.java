package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.q;
import androidx.core.graphics.m0;
import com.xiaomi.mipush.sdk.Constants;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PathInterpolatorCompat.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f28071c = 0.002f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28072d = 3000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f28073e = 1.0E-5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f28074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f28075b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, a.f28022r0);
        d(typedArrayS, xmlPullParser);
        typedArrayS.recycle();
    }

    private void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f28074a = new float[iMin];
        this.f28075b = new float[iMin];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < iMin; i11++) {
            pathMeasure.getPosTan((i11 * length) / (iMin - 1), fArr, null);
            this.f28074a[i11] = fArr[0];
            this.f28075b[i11] = fArr[1];
        }
        if (Math.abs(this.f28074a[0]) <= 1.0E-5d && Math.abs(this.f28075b[0]) <= 1.0E-5d) {
            int i12 = iMin - 1;
            if (Math.abs(this.f28074a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f28075b[i12] - 1.0f) <= 1.0E-5d) {
                float f10 = 0.0f;
                int i13 = 0;
                while (i10 < iMin) {
                    float[] fArr2 = this.f28074a;
                    int i14 = i13 + 1;
                    float f11 = fArr2[i13];
                    if (f11 < f10) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                    }
                    fArr2[i10] = f11;
                    i10++;
                    f10 = f11;
                    i13 = i14;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb2.append(this.f28074a[0]);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(this.f28075b[0]);
        sb2.append(" end:");
        int i15 = iMin - 1;
        sb2.append(this.f28074a[i15]);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(this.f28075b[i15]);
        throw new IllegalArgumentException(sb2.toString());
    }

    private void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (q.r(xmlPullParser, "pathData")) {
            String strM = q.m(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = m0.e(strM);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM);
        }
        if (!q.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!q.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fJ = q.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fJ2 = q.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zR = q.r(xmlPullParser, "controlX2");
        if (zR != q.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zR) {
            a(fJ, fJ2, q.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), q.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(fJ, fJ2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f28074a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f28074a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f28074a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f28075b[i10];
        }
        float[] fArr2 = this.f28075b;
        float f14 = fArr2[i10];
        return f14 + (((f10 - f12) / f13) * (fArr2[length] - f14));
    }
}
