package com.bumptech.glide.util;

import androidx.annotation.j1;
import androidx.annotation.n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f41993a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f41994b = new b();

    /* JADX INFO: compiled from: Executors.java */
    public class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            o.y(runnable);
        }
    }

    /* JADX INFO: compiled from: Executors.java */
    public class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            runnable.run();
        }
    }

    private f() {
    }

    public static Executor a() {
        return f41994b;
    }

    public static Executor b() {
        return f41993a;
    }

    @j1
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e10) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        }
    }
}
