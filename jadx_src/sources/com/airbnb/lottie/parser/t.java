package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.p0;
import androidx.collection.l2;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f37796a = 100.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static l2<WeakReference<Interpolator>> f37798c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f37797b = new LinearInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static JsonReader.a f37799d = JsonReader.a.a("t", ak.aB, "e", "o", "i", RXScreenCaptureService.KEY_HEIGHT, "to", "ti");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static JsonReader.a f37800e = JsonReader.a.a("x", "y");

    t() {
    }

    @p0
    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceG;
        synchronized (t.class) {
            weakReferenceG = g().g(i10);
        }
        return weakReferenceG;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorB;
        pointF.x = com.airbnb.lottie.utils.i.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.i.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.i.c(pointF2.x, -1.0f, 1.0f);
        float fC = com.airbnb.lottie.utils.i.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fC;
        int i10 = com.airbnb.lottie.utils.j.i(pointF.x, pointF.y, pointF2.x, fC);
        WeakReference<Interpolator> weakReferenceA = a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorB = androidx.core.view.animation.b.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                interpolatorB = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? androidx.core.view.animation.b.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorB;
            try {
                h(i10, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    static <T> com.airbnb.lottie.value.a<T> c(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f10, n0<T> n0Var, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return e(gVar, jsonReader, f10, n0Var);
        }
        return z10 ? d(gVar, jsonReader, f10, n0Var) : f(jsonReader, f10, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.g gVar, JsonReader jsonReader, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolatorB;
        T t10;
        jsonReader.c();
        PointF pointFE = null;
        boolean z10 = false;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fI = 0.0f;
        PointF pointFE4 = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37799d)) {
                case 0:
                    fI = (float) jsonReader.i();
                    break;
                case 1:
                    tA2 = n0Var.a(jsonReader, f10);
                    break;
                case 2:
                    tA = n0Var.a(jsonReader, f10);
                    break;
                case 3:
                    pointFE = s.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(jsonReader, 1.0f);
                    break;
                case 5:
                    z10 = jsonReader.k() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(jsonReader, f10);
                    break;
                case 7:
                    pointFE3 = s.e(jsonReader, f10);
                    break;
                default:
                    jsonReader.t();
                    break;
            }
        }
        jsonReader.e();
        if (z10) {
            interpolatorB = f37797b;
            t10 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f37797b : b(pointFE, pointFE4);
            t10 = tA;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(gVar, tA2, t10, interpolatorB, fI, null);
        aVar.f37867o = pointFE2;
        aVar.f37868p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.g gVar, JsonReader jsonReader, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t10;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF;
        float f11;
        PointF pointF2;
        jsonReader.c();
        PointF pointFE = null;
        boolean z10 = false;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fI = 0.0f;
        PointF pointFE4 = null;
        T tA2 = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37799d)) {
                case 0:
                    pointF = pointFE;
                    fI = (float) jsonReader.i();
                    pointFE = pointF;
                    break;
                case 1:
                    pointF = pointFE;
                    tA = n0Var.a(jsonReader, f10);
                    pointFE = pointF;
                    break;
                case 2:
                    pointF = pointFE;
                    tA2 = n0Var.a(jsonReader, f10);
                    pointFE = pointF;
                    break;
                case 3:
                    pointF = pointFE;
                    f11 = fI;
                    PointF pointF7 = pointFE4;
                    if (jsonReader.p() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.c();
                        float fI2 = 0.0f;
                        float fI3 = 0.0f;
                        float fI4 = 0.0f;
                        float fI5 = 0.0f;
                        while (jsonReader.f()) {
                            int iR = jsonReader.r(f37800e);
                            if (iR == 0) {
                                JsonReader.Token tokenP = jsonReader.p();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenP == token) {
                                    fI4 = (float) jsonReader.i();
                                    fI2 = fI4;
                                } else {
                                    jsonReader.b();
                                    fI2 = (float) jsonReader.i();
                                    fI4 = jsonReader.p() == token ? (float) jsonReader.i() : fI2;
                                    jsonReader.d();
                                }
                            } else if (iR != 1) {
                                jsonReader.t();
                            } else {
                                JsonReader.Token tokenP2 = jsonReader.p();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenP2 == token2) {
                                    fI5 = (float) jsonReader.i();
                                    fI3 = fI5;
                                } else {
                                    jsonReader.b();
                                    fI3 = (float) jsonReader.i();
                                    fI5 = jsonReader.p() == token2 ? (float) jsonReader.i() : fI3;
                                    jsonReader.d();
                                }
                            }
                        }
                        PointF pointF8 = new PointF(fI2, fI3);
                        PointF pointF9 = new PointF(fI4, fI5);
                        jsonReader.e();
                        pointF4 = pointF9;
                        pointF3 = pointF8;
                        pointFE4 = pointF7;
                        fI = f11;
                    } else {
                        pointFE2 = s.e(jsonReader, f10);
                        fI = f11;
                        pointFE4 = pointF7;
                    }
                    pointFE = pointF;
                    break;
                case 4:
                    if (jsonReader.p() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.c();
                        float fI6 = 0.0f;
                        float f12 = 0.0f;
                        float fI7 = 0.0f;
                        float fI8 = 0.0f;
                        while (jsonReader.f()) {
                            pointFE4 = pointFE4;
                            int iR2 = jsonReader.r(f37800e);
                            if (iR2 != 0) {
                                pointF2 = pointFE;
                                if (iR2 != 1) {
                                    jsonReader.t();
                                } else {
                                    JsonReader.Token tokenP3 = jsonReader.p();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenP3 == token3) {
                                        fI8 = (float) jsonReader.i();
                                        fI = fI;
                                        f12 = fI8;
                                    } else {
                                        float f13 = fI;
                                        jsonReader.b();
                                        float fI9 = (float) jsonReader.i();
                                        float fI10 = jsonReader.p() == token3 ? (float) jsonReader.i() : fI9;
                                        jsonReader.d();
                                        fI = f13;
                                        pointFE = pointF2;
                                        fI8 = fI10;
                                        f12 = fI9;
                                    }
                                }
                            } else {
                                pointF2 = pointFE;
                                float f14 = fI;
                                JsonReader.Token tokenP4 = jsonReader.p();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenP4 == token4) {
                                    fI7 = (float) jsonReader.i();
                                    fI = f14;
                                    fI6 = fI7;
                                } else {
                                    jsonReader.b();
                                    fI6 = (float) jsonReader.i();
                                    fI7 = jsonReader.p() == token4 ? (float) jsonReader.i() : fI6;
                                    jsonReader.d();
                                    fI = f14;
                                }
                            }
                            pointFE = pointF2;
                        }
                        pointF = pointFE;
                        f11 = fI;
                        PointF pointF10 = new PointF(fI6, f12);
                        PointF pointF11 = new PointF(fI7, fI8);
                        jsonReader.e();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        fI = f11;
                    } else {
                        pointF = pointFE;
                        pointFE3 = s.e(jsonReader, f10);
                    }
                    pointFE = pointF;
                    break;
                case 5:
                    z10 = jsonReader.k() == 1;
                    break;
                case 6:
                    pointFE4 = s.e(jsonReader, f10);
                    break;
                case 7:
                    pointFE = s.e(jsonReader, f10);
                    break;
                default:
                    pointF = pointFE;
                    jsonReader.t();
                    pointFE = pointF;
                    break;
            }
        }
        PointF pointF12 = pointFE;
        float f15 = fI;
        PointF pointF13 = pointFE4;
        jsonReader.e();
        if (z10) {
            interpolatorB = f37797b;
            t10 = tA;
        } else {
            if (pointFE2 == null || pointFE3 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB = f37797b;
                } else {
                    interpolatorB2 = b(pointF3, pointF5);
                    interpolatorB3 = b(pointF4, pointF6);
                    t10 = tA2;
                    interpolatorB = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    aVar = new com.airbnb.lottie.value.a<>(gVar, tA, t10, interpolatorB, f15, null);
                } else {
                    aVar = new com.airbnb.lottie.value.a<>(gVar, tA, t10, interpolatorB2, interpolatorB3, f15, null);
                }
                aVar.f37867o = pointF13;
                aVar.f37868p = pointF12;
                return aVar;
            }
            interpolatorB = b(pointFE2, pointFE3);
            t10 = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            aVar = new com.airbnb.lottie.value.a<>(gVar, tA, t10, interpolatorB, f15, null);
        } else {
            aVar = new com.airbnb.lottie.value.a<>(gVar, tA, t10, interpolatorB, f15, null);
        }
        aVar.f37867o = pointF13;
        aVar.f37868p = pointF12;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(JsonReader jsonReader, float f10, n0<T> n0Var) throws IOException {
        return new com.airbnb.lottie.value.a<>(n0Var.a(jsonReader, f10));
    }

    private static l2<WeakReference<Interpolator>> g() {
        if (f37798c == null) {
            f37798c = new l2<>();
        }
        return f37798c;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f37798c.n(i10, weakReference);
        }
    }
}
