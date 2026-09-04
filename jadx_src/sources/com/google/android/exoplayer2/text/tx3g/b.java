package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.g;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f49888c = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.text.b> f49889b;

    private b() {
        this.f49889b = Collections.emptyList();
    }

    public b(com.google.android.exoplayer2.text.b bVar) {
        this.f49889b = Collections.singletonList(bVar);
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
        return j10 >= 0 ? this.f49889b : Collections.emptyList();
    }
}
