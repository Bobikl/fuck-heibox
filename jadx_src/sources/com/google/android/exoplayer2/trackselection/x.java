package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.p3;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3[] f50191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j[] f50192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4 f50193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Object f50194e;

    public x(p3[] p3VarArr, j[] jVarArr, e4 e4Var, @p0 Object obj) {
        this.f50191b = p3VarArr;
        this.f50192c = (j[]) jVarArr.clone();
        this.f50193d = e4Var;
        this.f50194e = obj;
        this.f50190a = p3VarArr.length;
    }

    @Deprecated
    public x(p3[] p3VarArr, j[] jVarArr, @p0 Object obj) {
        this(p3VarArr, jVarArr, e4.f44783c, obj);
    }

    public boolean a(@p0 x xVar) {
        if (xVar == null || xVar.f50192c.length != this.f50192c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f50192c.length; i10++) {
            if (!b(xVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@p0 x xVar, int i10) {
        return xVar != null && u0.c(this.f50191b[i10], xVar.f50191b[i10]) && u0.c(this.f50192c[i10], xVar.f50192c[i10]);
    }

    public boolean c(int i10) {
        return this.f50191b[i10] != null;
    }
}
