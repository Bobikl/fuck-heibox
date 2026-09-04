package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.n0;

/* JADX INFO: compiled from: TimestampAdjusterProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<n0> f48412a = new SparseArray<>();

    public n0 a(int i10) {
        n0 n0Var = this.f48412a.get(i10);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(n0.f51494f);
        this.f48412a.put(i10, n0Var2);
        return n0Var2;
    }

    public void b() {
        this.f48412a.clear();
    }
}
