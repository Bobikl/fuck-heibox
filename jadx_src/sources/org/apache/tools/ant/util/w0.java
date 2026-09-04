package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: compiled from: LeadPipeInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class w0 extends PipedInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f136969c = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.b2 f136970b;

    public w0() {
    }

    public w0(int i10) {
        b(i10);
    }

    public w0(PipedOutputStream pipedOutputStream) throws IOException {
        super(pipedOutputStream);
    }

    public w0(PipedOutputStream pipedOutputStream, int i10) throws IOException {
        super(pipedOutputStream);
        b(i10);
    }

    public void a(String str, int i10) {
        org.apache.tools.ant.b2 b2Var = this.f136970b;
        if (b2Var != null) {
            b2Var.x1(str, i10);
        } else if (i10 > 1) {
            System.out.println(str);
        } else {
            System.err.println(str);
        }
    }

    public synchronized void b(int i10) {
        byte[] bArr = ((PipedInputStream) this).buffer;
        if (i10 > bArr.length) {
            byte[] bArr2 = new byte[i10];
            int i11 = ((PipedInputStream) this).in;
            if (i11 >= 0) {
                int i12 = ((PipedInputStream) this).out;
                if (i11 > i12) {
                    System.arraycopy(bArr, i12, bArr2, i12, i11 - i12);
                } else {
                    int length = bArr.length - i12;
                    System.arraycopy(bArr, i12, bArr2, 0, length);
                    System.arraycopy(((PipedInputStream) this).buffer, 0, bArr2, length, ((PipedInputStream) this).in);
                    ((PipedInputStream) this).in += length;
                    ((PipedInputStream) this).out = 0;
                }
            }
            ((PipedInputStream) this).buffer = bArr2;
        }
    }

    public void c(org.apache.tools.ant.b2 b2Var) {
        this.f136970b = b2Var;
    }

    public void d(org.apache.tools.ant.u2 u2Var) {
        c(u2Var);
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        try {
            i10 = super.read();
        } catch (IOException e10) {
            String message = e10.getMessage();
            if ("write end dead".equalsIgnoreCase(message) || "pipe broken".equalsIgnoreCase(message)) {
                int i11 = ((PipedInputStream) this).in;
                if (i11 > 0) {
                    int i12 = ((PipedInputStream) this).out;
                    byte[] bArr = ((PipedInputStream) this).buffer;
                    if (i12 < bArr.length && i12 > i11) {
                        ((PipedInputStream) this).out = i12 + 1;
                        i10 = bArr[i12] & 255;
                    }
                }
            } else {
                a("error at LeadPipeInputStream.read():  " + message, 2);
            }
            i10 = -1;
        }
        return i10;
    }
}
