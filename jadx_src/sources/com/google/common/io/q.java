package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FileBackedOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class q extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f58704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private final File f58705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @t9.a("this")
    private OutputStream f58706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    @t9.a("this")
    private c f58707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    @t9.a("this")
    private File f58708h;

    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    public class a extends f {
        a() {
        }

        protected void finalize() {
            try {
                q.this.e();
            } catch (Throwable th2) {
                th2.printStackTrace(System.err);
            }
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return q.this.d();
        }
    }

    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    public class b extends f {
        b() {
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return q.this.d();
        }
    }

    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    public static class c extends ByteArrayOutputStream {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public q(int i10) {
        this(i10, false);
    }

    public q(int i10, boolean z10) {
        this(i10, z10, null);
    }

    private q(int i10, boolean z10, @CheckForNull File file) {
        this.f58702b = i10;
        this.f58703c = z10;
        this.f58705e = file;
        c cVar = new c(null);
        this.f58707g = cVar;
        this.f58706f = cVar;
        if (z10) {
            this.f58704d = new a();
        } else {
            this.f58704d = new b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream d() throws IOException {
        if (this.f58708h != null) {
            return new FileInputStream(this.f58708h);
        }
        Objects.requireNonNull(this.f58707g);
        return new ByteArrayInputStream(this.f58707g.a(), 0, this.f58707g.getCount());
    }

    @t9.a("this")
    private void f(int i10) throws IOException {
        c cVar = this.f58707g;
        if (cVar == null || cVar.getCount() + i10 <= this.f58702b) {
            return;
        }
        File fileCreateTempFile = File.createTempFile("FileBackedOutputStream", null, this.f58705e);
        if (this.f58703c) {
            fileCreateTempFile.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(this.f58707g.a(), 0, this.f58707g.getCount());
            fileOutputStream.flush();
            this.f58706f = fileOutputStream;
            this.f58708h = fileCreateTempFile;
            this.f58707g = null;
        } catch (IOException e10) {
            fileCreateTempFile.delete();
            throw e10;
        }
    }

    public f b() {
        return this.f58704d;
    }

    @CheckForNull
    @o9.d
    synchronized File c() {
        return this.f58708h;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f58706f.close();
    }

    public synchronized void e() throws IOException {
        a aVar = null;
        try {
            close();
            c cVar = this.f58707g;
            if (cVar == null) {
                this.f58707g = new c(aVar);
            } else {
                cVar.reset();
            }
            this.f58706f = this.f58707g;
            File file = this.f58708h;
            if (file != null) {
                this.f58708h = null;
                if (!file.delete()) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
                    sb2.append("Could not delete: ");
                    sb2.append(strValueOf);
                    throw new IOException(sb2.toString());
                }
            }
        } catch (Throwable th2) {
            if (this.f58707g == null) {
                this.f58707g = new c(aVar);
            } else {
                this.f58707g.reset();
            }
            this.f58706f = this.f58707g;
            File file2 = this.f58708h;
            if (file2 != null) {
                this.f58708h = null;
                if (!file2.delete()) {
                    String strValueOf2 = String.valueOf(file2);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 18);
                    sb3.append("Could not delete: ");
                    sb3.append(strValueOf2);
                    throw new IOException(sb3.toString());
                }
            }
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f58706f.flush();
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) throws IOException {
        f(1);
        this.f58706f.write(i10);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        f(i11);
        this.f58706f.write(bArr, i10, i11);
    }
}
