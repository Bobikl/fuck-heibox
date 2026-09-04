package com.google.android.exoplayer2.text;

import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l extends com.google.android.exoplayer2.decoder.h implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private g f49651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f49652f;

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        return ((g) com.google.android.exoplayer2.util.a.g(this.f49651e)).a(i10) + this.f49652f;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return ((g) com.google.android.exoplayer2.util.a.g(this.f49651e)).b();
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        return ((g) com.google.android.exoplayer2.util.a.g(this.f49651e)).c(j10 - this.f49652f);
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<b> d(long j10) {
        return ((g) com.google.android.exoplayer2.util.a.g(this.f49651e)).d(j10 - this.f49652f);
    }

    @Override // com.google.android.exoplayer2.decoder.a
    public void f() {
        super.f();
        this.f49651e = null;
    }

    public void o(long j10, g gVar, long j11) {
        this.f44523c = j10;
        this.f49651e = gVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f49652f = j10;
    }
}
