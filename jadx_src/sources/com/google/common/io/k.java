package com.google.common.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CharStreams.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58690a = 2048;

    /* JADX INFO: compiled from: CharStreams.java */
    public static final class a extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f58691b = new a();

        private a() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c10) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence charSequence, int i10, int i11) {
            com.google.common.base.w.f0(i10, i11, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i10) {
        }

        @Override // java.io.Writer
        public void write(String str) {
            com.google.common.base.w.E(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            com.google.common.base.w.f0(i10, i11 + i10, str.length());
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            com.google.common.base.w.E(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            com.google.common.base.w.f0(i10, i11 + i10, cArr.length);
        }
    }

    private k() {
    }

    @o9.a
    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new com.google.common.io.a(appendable);
    }

    @s9.a
    public static long b(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? c((Reader) readable, (StringBuilder) appendable) : d((Reader) readable, a(appendable));
        }
        com.google.common.base.w.E(readable);
        com.google.common.base.w.E(appendable);
        long jRemaining = 0;
        CharBuffer charBufferE = e();
        while (readable.read(charBufferE) != -1) {
            s.b(charBufferE);
            appendable.append(charBufferE);
            jRemaining += (long) charBufferE.remaining();
            s.a(charBufferE);
        }
        return jRemaining;
    }

    @s9.a
    static long c(Reader reader, StringBuilder sb2) throws IOException {
        com.google.common.base.w.E(reader);
        com.google.common.base.w.E(sb2);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            sb2.append(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    @s9.a
    static long d(Reader reader, Writer writer) throws IOException {
        com.google.common.base.w.E(reader);
        com.google.common.base.w.E(writer);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    static CharBuffer e() {
        return CharBuffer.allocate(2048);
    }

    @o9.a
    @s9.a
    public static long f(Readable readable) throws IOException {
        CharBuffer charBufferE = e();
        long j10 = 0;
        while (true) {
            long j11 = readable.read(charBufferE);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            s.a(charBufferE);
        }
    }

    @o9.a
    public static Writer g() {
        return a.f58691b;
    }

    @a0
    @s9.a
    @o9.a
    public static <T> T h(Readable readable, u<T> uVar) throws IOException {
        String strB;
        com.google.common.base.w.E(readable);
        com.google.common.base.w.E(uVar);
        v vVar = new v(readable);
        do {
            strB = vVar.b();
            if (strB == null) {
                break;
            }
        } while (uVar.a(strB));
        return uVar.getResult();
    }

    @o9.a
    public static List<String> i(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        v vVar = new v(readable);
        while (true) {
            String strB = vVar.b();
            if (strB == null) {
                return arrayList;
            }
            arrayList.add(strB);
        }
    }

    @o9.a
    public static void j(Reader reader, long j10) throws IOException {
        com.google.common.base.w.E(reader);
        while (j10 > 0) {
            long jSkip = reader.skip(j10);
            if (jSkip == 0) {
                throw new EOFException();
            }
            j10 -= jSkip;
        }
    }

    public static String k(Readable readable) throws IOException {
        return l(readable).toString();
    }

    private static StringBuilder l(Readable readable) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (readable instanceof Reader) {
            c((Reader) readable, sb2);
        } else {
            b(readable, sb2);
        }
        return sb2;
    }
}
