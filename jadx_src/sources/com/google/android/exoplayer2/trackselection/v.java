package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.upstream.g0;

/* JADX INFO: compiled from: TrackSelectionUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: compiled from: TrackSelectionUtil.java */
    public interface a {
        j a(j.a aVar);
    }

    private v() {
    }

    public static g0.a a(j jVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = jVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (jVar.b(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new g0.a(1, 0, length, i10);
    }

    public static j[] b(j.a[] aVarArr, a aVar) {
        j[] jVarArr = new j[aVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            j.a aVar2 = aVarArr[i10];
            if (aVar2 != null) {
                int[] iArr = aVar2.f50103b;
                if (iArr.length <= 1 || z10) {
                    jVarArr[i10] = new k(aVar2.f50102a, iArr[0], aVar2.f50104c);
                } else {
                    jVarArr[i10] = aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return jVarArr;
    }

    public static f.d c(f.d dVar, int i10, p1 p1Var, boolean z10, @p0 f.C0399f c0399f) {
        f.e eVarK1 = dVar.d().w0(i10).k1(i10, z10);
        if (c0399f != null) {
            eVarK1.m1(i10, p1Var, c0399f);
        }
        return eVarK1.y();
    }
}
