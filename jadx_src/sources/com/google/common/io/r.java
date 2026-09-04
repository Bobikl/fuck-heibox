package com.google.common.io;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Flushables.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f58711a = Logger.getLogger(r.class.getName());

    private r() {
    }

    public static void a(Flushable flushable, boolean z10) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f58711a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e10);
        }
    }

    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e10) {
            f58711a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e10);
        }
    }
}
