package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;

/* JADX INFO: compiled from: MultiBrowseCarouselStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f53514b = 0.1f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f53515c = {1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f53516d = {1, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f53517e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53518a;

    /* JADX INFO: compiled from: MultiBrowseCarouselStrategy.java */
    @j1
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f53519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f53520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f53521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f53522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f53523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f53524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f53525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f53526h;

        a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
            this.f53519a = i10;
            this.f53520b = a2.a.d(f10, f11, f12);
            this.f53521c = i11;
            this.f53523e = f13;
            this.f53522d = i12;
            this.f53524f = f14;
            this.f53525g = i13;
            c(f15, f11, f12, f14);
            this.f53526h = b(f14);
        }

        private float a(float f10, int i10, float f11, int i11, int i12) {
            if (i10 <= 0) {
                f11 = 0.0f;
            }
            float f12 = i11 / 2.0f;
            return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
        }

        private float b(float f10) {
            if (e()) {
                return Math.abs(f10 - this.f53524f) * this.f53519a;
            }
            return Float.MAX_VALUE;
        }

        private void c(float f10, float f11, float f12, float f13) {
            float fD = f10 - d();
            int i10 = this.f53521c;
            if (i10 > 0 && fD > 0.0f) {
                float f14 = this.f53520b;
                this.f53520b = f14 + Math.min(fD / i10, f12 - f14);
            } else if (i10 > 0 && fD < 0.0f) {
                float f15 = this.f53520b;
                this.f53520b = f15 + Math.max(fD / i10, f11 - f15);
            }
            float fA = a(f10, this.f53521c, this.f53520b, this.f53522d, this.f53525g);
            this.f53524f = fA;
            float f16 = (this.f53520b + fA) / 2.0f;
            this.f53523e = f16;
            int i11 = this.f53522d;
            if (i11 <= 0 || fA == f13) {
                return;
            }
            float f17 = (f13 - fA) * this.f53525g;
            float fMin = Math.min(Math.abs(f17), f16 * 0.1f * i11);
            if (f17 > 0.0f) {
                this.f53523e -= fMin / this.f53522d;
                this.f53524f += fMin / this.f53525g;
            } else {
                this.f53523e += fMin / this.f53522d;
                this.f53524f -= fMin / this.f53525g;
            }
        }

        private float d() {
            return (this.f53524f * this.f53525g) + (this.f53523e * this.f53522d) + (this.f53520b * this.f53521c);
        }

        private boolean e() {
            int i10 = this.f53525g;
            if (i10 <= 0 || this.f53521c <= 0 || this.f53522d <= 0) {
                return i10 <= 0 || this.f53521c <= 0 || this.f53524f > this.f53520b;
            }
            float f10 = this.f53524f;
            float f11 = this.f53523e;
            return f10 > f11 && f11 > this.f53520b;
        }

        @n0
        public String toString() {
            return "Arrangement [priority=" + this.f53519a + ", smallCount=" + this.f53521c + ", smallSize=" + this.f53520b + ", mediumCount=" + this.f53522d + ", mediumSize=" + this.f53523e + ", largeCount=" + this.f53525g + ", largeSize=" + this.f53524f + ", cost=" + this.f53526h + "]";
        }
    }

    public i() {
        this(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public i(boolean z10) {
        this.f53518a = z10;
    }

    private static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        int i10 = 1;
        a aVar = null;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar2 = new a(i10, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f53526h < aVar.f53526h) {
                        if (aVar2.f53526h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                i12++;
            }
        }
        return aVar;
    }

    private float d(@n0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    private float e(@n0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    private float f(@n0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    private static int g(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.carousel.b
    @n0
    c b(@n0 com.google.android.material.carousel.a aVar, @n0 View view) {
        float fG = aVar.g();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        float f11 = f(view.getContext()) + f10;
        float fE = e(view.getContext()) + f10;
        float measuredWidth = view.getMeasuredWidth();
        float fMin = Math.min(measuredWidth + f10, fG);
        float fD = a2.a.d((measuredWidth / 3.0f) + f10, f(view.getContext()) + f10, e(view.getContext()) + f10);
        float f12 = (fMin + fD) / 2.0f;
        int[] iArr = f53515c;
        int[] iArr2 = this.f53518a ? f53517e : f53516d;
        int iMax = (int) Math.max(1.0d, Math.floor(((fG - (g(iArr2) * f12)) - (g(iArr) * fE)) / fMin));
        int iCeil = (int) Math.ceil(fG / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = c(fG, fD, f11, fE, iArr, f12, iArr2, fMin, iArr3);
        float fD2 = d(view.getContext()) + f10;
        float f13 = fD2 / 2.0f;
        float f14 = 0.0f - f13;
        float f15 = (aVarC.f53524f / 2.0f) + 0.0f;
        float fMax = Math.max(0, aVarC.f53525g - 1);
        float f16 = aVarC.f53524f;
        float f17 = f15 + (fMax * f16);
        float f18 = (f16 / 2.0f) + f17;
        int i12 = aVarC.f53522d;
        if (i12 > 0) {
            f17 = (aVarC.f53523e / 2.0f) + f18;
        }
        if (i12 > 0) {
            f18 = (aVarC.f53523e / 2.0f) + f17;
        }
        float f19 = aVarC.f53521c > 0 ? f18 + (aVarC.f53520b / 2.0f) : f17;
        float fG2 = aVar.g() + f13;
        float fA = b.a(fD2, aVarC.f53524f, f10);
        float fA2 = b.a(aVarC.f53520b, aVarC.f53524f, f10);
        float fA3 = b.a(aVarC.f53523e, aVarC.f53524f, f10);
        c.b bVarD = new c.b(aVarC.f53524f).a(f14, fA, fD2).d(f15, 0.0f, aVarC.f53524f, aVarC.f53525g, true);
        if (aVarC.f53522d > 0) {
            bVarD.a(f17, fA3, aVarC.f53523e);
        }
        int i13 = aVarC.f53521c;
        if (i13 > 0) {
            bVarD.c(f19, fA2, aVarC.f53520b, i13);
        }
        bVarD.a(fG2, fA, fD2);
        return bVarD.e();
    }
}
