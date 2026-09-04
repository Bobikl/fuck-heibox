package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f51369c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f51370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f51371b;

    /* JADX INFO: compiled from: AtomicFile.java */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FileOutputStream f51372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51373c = false;

        public a(File file) throws FileNotFoundException {
            this.f51372b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51373c) {
                return;
            }
            this.f51373c = true;
            flush();
            try {
                this.f51372b.getFD().sync();
            } catch (IOException e10) {
                u.n(b.f51369c, "Failed to sync file descriptor:", e10);
            }
            this.f51372b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f51372b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f51372b.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f51372b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f51372b.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f51370a = file;
        this.f51371b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    private void e() {
        if (this.f51371b.exists()) {
            this.f51370a.delete();
            this.f51371b.renameTo(this.f51370a);
        }
    }

    public void a() {
        this.f51370a.delete();
        this.f51371b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f51371b.delete();
    }

    public boolean c() {
        return this.f51370a.exists() || this.f51371b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f51370a);
    }

    public OutputStream f() throws IOException {
        if (this.f51370a.exists()) {
            if (this.f51371b.exists()) {
                this.f51370a.delete();
            } else if (!this.f51370a.renameTo(this.f51371b)) {
                String strValueOf = String.valueOf(this.f51370a);
                String strValueOf2 = String.valueOf(this.f51371b);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37 + strValueOf2.length());
                sb2.append("Couldn't rename file ");
                sb2.append(strValueOf);
                sb2.append(" to backup file ");
                sb2.append(strValueOf2);
                u.m(f51369c, sb2.toString());
            }
        }
        try {
            return new a(this.f51370a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f51370a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.f51370a);
                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf3);
                throw new IOException(sb3.toString(), e10);
            }
            try {
                return new a(this.f51370a);
            } catch (FileNotFoundException e11) {
                String strValueOf4 = String.valueOf(this.f51370a);
                StringBuilder sb4 = new StringBuilder(strValueOf4.length() + 16);
                sb4.append("Couldn't create ");
                sb4.append(strValueOf4);
                throw new IOException(sb4.toString(), e11);
            }
        }
    }
}
