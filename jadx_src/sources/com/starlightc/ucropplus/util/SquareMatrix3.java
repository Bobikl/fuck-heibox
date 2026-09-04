package com.starlightc.ucropplus.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SquareMatrix3.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SquareMatrix3 {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final float[] data;

    public SquareMatrix3() {
        this.data = new float[9];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareMatrix3(@d float[] values) {
        this();
        f0.p(values, "values");
        setValues(values);
    }

    @d
    public final SquareMatrix3 copy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50980, new Class[0], SquareMatrix3.class);
        return patchProxyResultProxy.isSupported ? (SquareMatrix3) patchProxyResultProxy.result : new SquareMatrix3(getValues());
    }

    @d
    public final float[] getValues() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50978, new Class[0], float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        float[] fArr = new float[9];
        System.arraycopy(this.data, 0, fArr, 0, 9);
        return fArr;
    }

    @d
    public final SquareMatrix3 inverseMatrix() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50982, new Class[0], SquareMatrix3.class);
        if (patchProxyResultProxy.isSupported) {
            return (SquareMatrix3) patchProxyResultProxy.result;
        }
        float[] values = copy().getValues();
        float f10 = values[0];
        float f11 = values[4];
        values[0] = 1.0f / f10;
        values[1] = 0.0f;
        float[] fArr = this.data;
        values[2] = (fArr[2] / f10) * (-1.0f);
        values[3] = 0.0f;
        values[4] = 1.0f / f11;
        values[5] = (fArr[5] / f11) * (-1.0f);
        values[6] = 0.0f;
        values[7] = 0.0f;
        values[8] = 1.0f;
        return new SquareMatrix3(values);
    }

    public final void multiply(@d SquareMatrix3 m10) {
        if (PatchProxy.proxy(new Object[]{m10}, this, changeQuickRedirect, false, 50981, new Class[]{SquareMatrix3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(m10, "m");
        float[] values = copy().getValues();
        float[] values2 = m10.copy().getValues();
        float[] fArr = this.data;
        float f10 = values[0] * values2[0];
        float f11 = values[1];
        float f12 = values2[3];
        float f13 = values[2];
        float f14 = values2[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = values[0];
        float f16 = values2[1] * f15;
        float f17 = values2[4];
        float f18 = values2[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * values2[2];
        float f20 = values[1];
        float f21 = values2[5];
        float f22 = values2[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = values[3];
        float f24 = values2[0];
        float f25 = values[4];
        float f26 = (f23 * f24) + (f12 * f25);
        float f27 = values[5];
        fArr[3] = f26 + (f27 * f14);
        float f28 = values[3];
        float f29 = values2[1];
        fArr[4] = (f28 * f29) + (f25 * f17) + (f27 * f18);
        float f30 = values2[2];
        fArr[5] = (f28 * f30) + (values[4] * f21) + (f27 * f22);
        float f31 = values[6] * f24;
        float f32 = values[7];
        float f33 = f31 + (values2[3] * f32);
        float f34 = values[8];
        fArr[6] = f33 + (f14 * f34);
        float f35 = values[6];
        fArr[7] = (f29 * f35) + (f32 * values2[4]) + (f18 * f34);
        fArr[8] = (f35 * f30) + (values[7] * values2[5]) + (f34 * f22);
    }

    public final void println() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50983, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        System.out.println((Object) ("data--->      " + this.data[0] + "  " + this.data[1] + "  " + this.data[2]));
        System.out.println((Object) ("              " + this.data[3] + "  " + this.data[4] + "  " + this.data[5]));
        System.out.println((Object) ("              " + this.data[6] + "  " + this.data[7] + "  " + this.data[8]));
    }

    public final void setValues(@d float[] values) {
        if (PatchProxy.proxy(new Object[]{values}, this, changeQuickRedirect, false, 50979, new Class[]{float[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(values, "values");
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.data[i10] = values[i10];
        }
    }
}
