package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BaseMediaChunkIterator.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47625d;

    public b(long j10, long j11) {
        this.f47623b = j10;
        this.f47624c = j11;
        reset();
    }

    @Override // com.google.android.exoplayer2.source.chunk.o
    public boolean b() {
        return this.f47625d > this.f47624c;
    }

    protected final void e() {
        long j10 = this.f47625d;
        if (j10 < this.f47623b || j10 > this.f47624c) {
            throw new NoSuchElementException();
        }
    }

    protected final long f() {
        return this.f47625d;
    }

    @Override // com.google.android.exoplayer2.source.chunk.o
    public boolean next() {
        this.f47625d++;
        return !b();
    }

    @Override // com.google.android.exoplayer2.source.chunk.o
    public void reset() {
        this.f47625d = this.f47623b - 1;
    }
}
