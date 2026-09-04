package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Closeables.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.d
    static final Logger f58692a = Logger.getLogger(l.class.getName());

    private l() {
    }

    public static void a(@CheckForNull Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f58692a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(@CheckForNull InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void c(@CheckForNull Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
