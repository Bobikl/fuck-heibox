package com.google.common.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: compiled from: CharSink.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public abstract class i {
    protected i() {
    }

    public Writer a() throws IOException {
        Writer writerB = b();
        return writerB instanceof BufferedWriter ? (BufferedWriter) writerB : new BufferedWriter(writerB);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence) throws Throwable {
        com.google.common.base.w.E(charSequence);
        m mVarA = m.a();
        try {
            Writer writer = (Writer) mVarA.b(b());
            writer.append(charSequence);
            writer.flush();
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
    public long d(Readable readable) throws Throwable {
        com.google.common.base.w.E(readable);
        m mVarA = m.a();
        try {
            Writer writer = (Writer) mVarA.b(b());
            long jB = k.b(readable, writer);
            writer.flush();
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

    public void e(Iterable<? extends CharSequence> iterable) throws Throwable {
        f(iterable, System.getProperty("line.separator"));
    }

    public void f(Iterable<? extends CharSequence> iterable, String str) throws Throwable {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.E(str);
        m mVarA = m.a();
        try {
            Writer writer = (Writer) mVarA.b(a());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
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
}
