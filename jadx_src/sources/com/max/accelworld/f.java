package com.max.accelworld;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: AccelWorldRecyclerView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16 = f13 * f11;
        float f17 = f14 * f11;
        float f18 = f11 + f12;
        float f19 = f10 / f18;
        float f20 = (int) f19;
        float f21 = f19 - f20;
        if (f21 >= f16 / f18) {
            if (f21 > f17 / f18) {
                f15 = f10 - f17;
            }
            return (int) f12;
        }
        f15 = f10 - f16;
        f12 = (f15 / f20) - f11;
        return (int) f12;
    }
}
