package com.google.android.exoplayer2.text.cea;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.google.android.exoplayer2.text.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.text.b> f49542b;

    public f(List<com.google.android.exoplayer2.text.b> list) {
        this.f49542b = list;
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        return j10 >= 0 ? this.f49542b : Collections.emptyList();
    }
}
