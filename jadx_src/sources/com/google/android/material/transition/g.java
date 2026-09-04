package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: compiled from: FitModeEvaluators.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f55909a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f55910b = new b();

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    public class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fO = v.o(f13, f15, f11, f12, f10, true);
            float f17 = fO / f13;
            float f18 = fO / f15;
            return new h(f17, f18, fO, f14 * f17, fO, f16 * f18);
        }

        @Override // com.google.android.material.transition.f
        public boolean b(h hVar) {
            return hVar.f55914d > hVar.f55916f;
        }

        @Override // com.google.android.material.transition.f
        public void c(RectF rectF, float f10, h hVar) {
            rectF.bottom -= Math.abs(hVar.f55916f - hVar.f55914d) * f10;
        }
    }

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    public class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fO = v.o(f14, f16, f11, f12, f10, true);
            float f17 = fO / f14;
            float f18 = fO / f16;
            return new h(f17, f18, f13 * f17, fO, f15 * f18, fO);
        }

        @Override // com.google.android.material.transition.f
        public boolean b(h hVar) {
            return hVar.f55913c > hVar.f55915e;
        }

        @Override // com.google.android.material.transition.f
        public void c(RectF rectF, float f10, h hVar) {
            float fAbs = (Math.abs(hVar.f55915e - hVar.f55913c) / 2.0f) * f10;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }

    private g() {
    }

    static f a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f55909a : f55910b;
        }
        if (i10 == 1) {
            return f55909a;
        }
        if (i10 == 2) {
            return f55910b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i10);
    }

    private static boolean b(boolean z10, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f10 = (fHeight2 * fWidth) / fWidth2;
        float f11 = (fWidth2 * fHeight) / fWidth;
        if (z10) {
            if (f10 >= fHeight) {
                return true;
            }
        } else if (f11 >= fHeight2) {
            return true;
        }
        return false;
    }
}
