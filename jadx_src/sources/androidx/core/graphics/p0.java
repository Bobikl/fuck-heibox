package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PathUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: compiled from: PathUtils.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static float[] a(Path path, float f10) {
            return path.approximate(f10);
        }
    }

    private p0() {
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public static Collection<n0> a(@androidx.annotation.n0 Path path) {
        return b(path, 0.5f);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public static Collection<n0> b(@androidx.annotation.n0 Path path, @androidx.annotation.x(from = 0.0d) float f10) {
        float[] fArrA = a.a(path, f10);
        int length = fArrA.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f11 = fArrA[i11];
            float f12 = fArrA[i11 + 1];
            float f13 = fArrA[i11 + 2];
            float f14 = fArrA[i12];
            float f15 = fArrA[i12 + 1];
            float f16 = fArrA[i12 + 2];
            if (f11 != f14 && (f12 != f15 || f13 != f16)) {
                arrayList.add(new n0(new PointF(f15, f16), f14, new PointF(f12, f13), f11));
            }
        }
        return arrayList;
    }
}
