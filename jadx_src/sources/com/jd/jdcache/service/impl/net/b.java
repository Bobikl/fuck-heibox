package com.jd.jdcache.service.impl.net;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CallbackInputStream.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final InputStream f64280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final a f64281c;

    /* JADX INFO: compiled from: CallbackInputStream.kt */
    public interface a {
        void onClose();
    }

    public b(@dl.d InputStream stream, @dl.e a aVar) {
        f0.p(stream, "stream");
        this.f64280b = stream;
        this.f64281c = aVar;
    }

    @dl.e
    public final a a() {
        return this.f64281c;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f64280b.available();
    }

    @dl.d
    public final InputStream b() {
        return this.f64280b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64280b.close();
        a aVar = this.f64281c;
        if (aVar != null) {
            aVar.onClose();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f64280b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f64280b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f64280b.read();
    }

    @Override // java.io.InputStream
    public int read(@dl.e byte[] bArr) {
        return this.f64280b.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(@dl.e byte[] bArr, int i10, int i11) {
        return this.f64280b.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f64280b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f64280b.skip(j10);
    }
}
