package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41983d = "ContentLengthStream";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41984e = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41986c;

    private c(@n0 InputStream inputStream, long j10) {
        super(inputStream);
        this.f41985b = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f41986c += i10;
        } else if (this.f41985b - ((long) this.f41986c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f41985b + ", but read: " + this.f41986c);
        }
        return i10;
    }

    @n0
    public static InputStream b(@n0 InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @n0
    public static InputStream c(@n0 InputStream inputStream, @p0 String str) {
        return b(inputStream, d(str));
    }

    private static int d(@p0 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e10) {
                if (Log.isLoggable(f41983d, 3)) {
                    Log.d(f41983d, "failed to parse content length header: " + str, e10);
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f41985b - ((long) this.f41986c), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
