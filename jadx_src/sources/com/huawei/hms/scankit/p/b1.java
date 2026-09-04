package com.huawei.hms.scankit.p;

import android.view.animation.Interpolator;
import java.math.BigDecimal;

/* JADX INFO: compiled from: CubicBezierInterpolator.java */
/* JADX INFO: loaded from: classes7.dex */
public class b1 implements Interpolator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigDecimal f61551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigDecimal f61552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f61553g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f61554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f61555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f61556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f61557d;

    static {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(1.0f));
        f61551e = bigDecimal;
        BigDecimal bigDecimal2 = new BigDecimal(Long.toString(4000L));
        f61552f = bigDecimal2;
        f61553g = bigDecimal.divide(bigDecimal2, 20, 4).floatValue();
    }

    public b1(float f10, float f11, float f12, float f13) {
        this.f61554a = f10;
        this.f61555b = f11;
        this.f61556c = f12;
        this.f61557d = f13;
    }

    private long a(float f10) {
        long j10 = 0;
        long j11 = 4000;
        while (j10 <= j11) {
            long j12 = (j10 + j11) >>> 1;
            float fB = b(f61553g * j12);
            if (fB < f10) {
                j10 = j12 + 1;
            } else {
                if (fB <= f10) {
                    return j12;
                }
                j11 = j12 - 1;
            }
        }
        return j10;
    }

    private String a() {
        return "CubicBezierInterpolator  mControlPoint1x = " + this.f61554a + ", mControlPoint1y = " + this.f61555b + ", mControlPoint2x = " + this.f61556c + ", mControlPoint2y = " + this.f61557d;
    }

    private float b(float f10) {
        float f11 = 1.0f - f10;
        float f12 = 3.0f * f11;
        return (f11 * f12 * f10 * this.f61554a) + (f12 * f10 * f10 * this.f61556c) + (f10 * f10 * f10);
    }

    private float c(float f10) {
        float f11 = 1.0f - f10;
        float f12 = 3.0f * f11;
        return (f11 * f12 * f10 * this.f61555b) + (f12 * f10 * f10 * this.f61557d) + (f10 * f10 * f10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return c(f61553g * a(f10));
    }

    public String toString() {
        return a();
    }
}
