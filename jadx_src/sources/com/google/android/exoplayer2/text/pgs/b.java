package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.g;
import java.util.List;

/* JADX INFO: compiled from: PgsSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.text.b> f49684b;

    public b(List<com.google.android.exoplayer2.text.b> list) {
        this.f49684b = list;
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        return this.f49684b;
    }
}
