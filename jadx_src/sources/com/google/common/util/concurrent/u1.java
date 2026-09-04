package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: UncaughtExceptionHandlers.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class u1 {

    /* JADX INFO: compiled from: UncaughtExceptionHandlers.java */
    @o9.d
    public static final class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Logger f59549b = Logger.getLogger(a.class.getName());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runtime f59550a;

        a(Runtime runtime) {
            this.f59550a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            try {
                f59549b.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th2);
            } catch (Throwable th3) {
                try {
                    System.err.println(th2.getMessage());
                    System.err.println(th3.getMessage());
                } finally {
                    this.f59550a.exit(1);
                }
            }
        }
    }

    private u1() {
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
