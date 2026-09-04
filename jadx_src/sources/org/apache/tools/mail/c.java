package org.apache.tools.mail;

import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: compiled from: MailMessage.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends PrintStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137265b;

    public c(OutputStream outputStream) {
        super(outputStream, true);
    }

    void a(String str) {
        for (char c10 : str.toCharArray()) {
            b(c10);
        }
    }

    void b(int i10) {
        super.write(i10);
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        if (i10 == 10 && this.f137265b != 13) {
            b(13);
            b(i10);
        } else if (i10 == 46 && this.f137265b == 10) {
            b(46);
            b(i10);
        } else {
            b(i10);
        }
        this.f137265b = i10;
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            write(bArr[i10 + i12]);
        }
    }
}
