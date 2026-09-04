package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MediaChunkIterator.java */
/* JADX INFO: loaded from: classes7.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f47701a = new a();

    /* JADX INFO: compiled from: MediaChunkIterator.java */
    public class a implements o {
        a() {
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public boolean b() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long c() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public com.google.android.exoplayer2.upstream.r d() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public boolean next() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public void reset() {
        }
    }

    long a();

    boolean b();

    long c();

    com.google.android.exoplayer2.upstream.r d();

    boolean next();

    void reset();
}
