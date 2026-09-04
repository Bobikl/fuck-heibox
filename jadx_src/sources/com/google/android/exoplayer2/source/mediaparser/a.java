package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: InputReaderAdapterV30.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(30)
@SuppressLint({"Override"})
public final class a implements MediaParser.SeekableInputReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private k f48548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48551d;

    public long a() {
        long j10 = this.f48551d;
        this.f48551d = -1L;
        return j10;
    }

    public void b(long j10) {
        this.f48550c = j10;
    }

    public void c(k kVar, long j10) {
        this.f48548a = kVar;
        this.f48549b = j10;
        this.f48551d = -1L;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.f48549b;
    }

    public long getPosition() {
        return this.f48550c;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((k) u0.k(this.f48548a)).read(bArr, i10, i11);
        this.f48550c += (long) i12;
        return i12;
    }

    public void seekToPosition(long j10) {
        this.f48551d = j10;
    }
}
