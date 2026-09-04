package com.igexin.a.a.b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f63129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63130b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63131c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63132d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63133e;

    public a(OutputStream outputStream, int i10) {
        this.f63129a = outputStream;
        this.f63133e = i10;
    }

    protected void a() throws IOException {
        if (this.f63131c > 0) {
            int i10 = this.f63133e;
            if (i10 > 0 && this.f63132d == i10) {
                this.f63129a.write("\r\n".getBytes());
                this.f63132d = 0;
            }
            char cCharAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f63130b << 8) >>> 26);
            char cCharAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f63130b << 14) >>> 26);
            int i11 = this.f63131c;
            char cCharAt3 = n5.a.f132013h;
            char cCharAt4 = i11 < 2 ? '=' : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f63130b << 20) >>> 26);
            if (this.f63131c >= 3) {
                cCharAt3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f63130b << 26) >>> 26);
            }
            this.f63129a.write(cCharAt);
            this.f63129a.write(cCharAt2);
            this.f63129a.write(cCharAt4);
            this.f63129a.write(cCharAt3);
            this.f63132d += 4;
            this.f63131c = 0;
            this.f63130b = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f63129a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.f63131c;
        this.f63130b = ((i10 & 255) << (16 - (i11 * 8))) | this.f63130b;
        int i12 = i11 + 1;
        this.f63131c = i12;
        if (i12 == 3) {
            a();
        }
    }
}
