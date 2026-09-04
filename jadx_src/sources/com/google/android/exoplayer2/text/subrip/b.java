package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.text.b[] f49751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f49752c;

    public b(com.google.android.exoplayer2.text.b[] bVarArr, long[] jArr) {
        this.f49751b = bVarArr;
        this.f49752c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0);
        com.google.android.exoplayer2.util.a.a(i10 < this.f49752c.length);
        return this.f49752c[i10];
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return this.f49752c.length;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        int iF = u0.f(this.f49752c, j10, false, false);
        if (iF < this.f49752c.length) {
            return iF;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        com.google.android.exoplayer2.text.b bVar;
        int iJ = u0.j(this.f49752c, j10, true, false);
        return (iJ == -1 || (bVar = this.f49751b[iJ]) == com.google.android.exoplayer2.text.b.f49365s) ? Collections.emptyList() : Collections.singletonList(bVar);
    }
}
