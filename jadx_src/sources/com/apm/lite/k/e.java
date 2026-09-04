package com.apm.lite.k;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class e extends PrintWriter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MessageDigest f40057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Charset f40058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f40059d;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f40058c = null;
        this.f40057b = messageDigest;
        this.f40059d = aVar;
        if (messageDigest != null) {
            this.f40058c = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f40057b;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f40057b != null) {
            a aVar = this.f40059d;
            if (aVar == null || aVar.a(str)) {
                this.f40057b.update(this.f40058c.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f40057b;
        if (messageDigest != null) {
            messageDigest.update(this.f40058c.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
