package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackSelectionArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o[] f50126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50127c;

    public p(o... oVarArr) {
        this.f50126b = oVarArr;
        this.f50125a = oVarArr.length;
    }

    @p0
    public o a(int i10) {
        return this.f50126b[i10];
    }

    public o[] b() {
        return (o[]) this.f50126b.clone();
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f50126b, ((p) obj).f50126b);
    }

    public int hashCode() {
        if (this.f50127c == 0) {
            this.f50127c = bb.c.b.f30674h7 + Arrays.hashCode(this.f50126b);
        }
        return this.f50127c;
    }
}
