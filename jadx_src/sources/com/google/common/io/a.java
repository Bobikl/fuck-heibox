package com.google.common.io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AppendableWriter.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public class a extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Appendable f58644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58645c;

    a(Appendable appendable) {
        this.f58644b = (Appendable) com.google.common.base.w.E(appendable);
    }

    private void a() throws IOException {
        if (this.f58645c) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        a();
        this.f58644b.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence) throws IOException {
        a();
        this.f58644b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence, int i10, int i11) throws IOException {
        a();
        this.f58644b.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f58645c = true;
        Appendable appendable = this.f58644b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        a();
        Appendable appendable = this.f58644b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        a();
        this.f58644b.append((char) i10);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        com.google.common.base.w.E(str);
        a();
        this.f58644b.append(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        com.google.common.base.w.E(str);
        a();
        this.f58644b.append(str, i10, i11 + i10);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        a();
        this.f58644b.append(new String(cArr, i10, i11));
    }
}
