package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<List<com.google.android.exoplayer2.text.b>> f49737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Long> f49738c;

    public d(List<List<com.google.android.exoplayer2.text.b>> list, List<Long> list2) {
        this.f49737b = list;
        this.f49738c = list2;
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0);
        com.google.android.exoplayer2.util.a.a(i10 < this.f49738c.size());
        return this.f49738c.get(i10).longValue();
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return this.f49738c.size();
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        int iD = u0.d(this.f49738c, Long.valueOf(j10), false, false);
        if (iD < this.f49738c.size()) {
            return iD;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        int iH = u0.h(this.f49738c, Long.valueOf(j10), true, false);
        return iH == -1 ? Collections.emptyList() : this.f49737b.get(iH);
    }
}
