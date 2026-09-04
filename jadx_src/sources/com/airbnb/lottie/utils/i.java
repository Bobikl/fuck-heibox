package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.x;
import java.util.List;

/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static PointF f37839a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int d(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean e(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int f(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    static int g(float f10, float f11) {
        return h((int) f10, (int) f11);
    }

    private static int h(int i10, int i11) {
        return i10 - (i11 * f(i10, i11));
    }

    public static void i(com.airbnb.lottie.model.content.i iVar, Path path) {
        path.reset();
        PointF pointFB = iVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f37839a.set(pointFB.x, pointFB.y);
        for (int i10 = 0; i10 < iVar.a().size(); i10++) {
            com.airbnb.lottie.model.a aVar = iVar.a().get(i10);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            if (pointFA.equals(f37839a) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
            } else {
                path.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            f37839a.set(pointFC.x, pointFC.y);
        }
        if (iVar.d()) {
            path.close();
        }
    }

    public static double j(double d10, double d11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) double d12) {
        return d10 + (d12 * (d11 - d10));
    }

    public static float k(float f10, float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int l(int i10, int i11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static void m(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (dVar.c(kVar.getName(), i10)) {
            list.add(dVar2.a(kVar.getName()).j(kVar));
        }
    }
}
