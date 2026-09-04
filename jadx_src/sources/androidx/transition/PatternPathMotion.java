package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f27717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f27718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f27719c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f27718b = path;
        this.f27719c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f27717a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        this.f27718b = new Path();
        this.f27719c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27916k);
        try {
            String strM = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            d(androidx.core.graphics.m0.e(strM));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public PatternPathMotion(Path path) {
        this.f27718b = new Path();
        this.f27719c = new Matrix();
        d(path);
    }

    private static float b(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    @Override // androidx.transition.PathMotion
    @androidx.annotation.n0
    public Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fB = b(f14, f15);
        double dAtan2 = Math.atan2(f15, f14);
        this.f27719c.setScale(fB, fB);
        this.f27719c.postRotate((float) Math.toDegrees(dAtan2));
        this.f27719c.postTranslate(f10, f11);
        Path path = new Path();
        this.f27718b.transform(this.f27719c, path);
        return path;
    }

    public Path c() {
        return this.f27717a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f27719c.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fB = 1.0f / b(f14, f15);
        this.f27719c.postScale(fB, fB);
        this.f27719c.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f27719c, this.f27718b);
        this.f27717a = path;
    }
}
