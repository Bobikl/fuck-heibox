package com.google.common.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ByteSink.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public abstract class e {

    /* JADX INFO: compiled from: ByteSink.java */
    public final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f58657a;

        private b(Charset charset) {
            this.f58657a = (Charset) com.google.common.base.w.E(charset);
        }

        @Override // com.google.common.io.i
        public Writer b() throws IOException {
            return new OutputStreamWriter(e.this.c(), this.f58657a);
        }

        public String toString() {
            String string = e.this.toString();
            String strValueOf = String.valueOf(this.f58657a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 13 + strValueOf.length());
            sb2.append(string);
            sb2.append(".asCharSink(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    protected e() {
    }

    public i a(Charset charset) {
        return new b(charset);
    }

    public OutputStream b() throws IOException {
        OutputStream outputStreamC = c();
        return outputStreamC instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamC : new BufferedOutputStream(outputStreamC);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] bArr) throws Throwable {
        com.google.common.base.w.E(bArr);
        m mVarA = m.a();
        try {
            OutputStream outputStream = (OutputStream) mVarA.b(c());
            outputStream.write(bArr);
            outputStream.flush();
            mVarA.close();
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @s9.a
    public long e(InputStream inputStream) throws Throwable {
        com.google.common.base.w.E(inputStream);
        m mVarA = m.a();
        try {
            OutputStream outputStream = (OutputStream) mVarA.b(c());
            long jB = g.b(inputStream, outputStream);
            outputStream.flush();
            mVarA.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }
}
