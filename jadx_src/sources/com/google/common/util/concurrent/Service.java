package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
@u
@s9.f("Create an AbstractIdleService")
@o9.c
public interface Service {

    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    public static abstract class a {
        public void a(State state, Throwable th2) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(State state) {
        }

        public void e(State state) {
        }
    }

    void a(a aVar, Executor executor);

    void b(long j10, TimeUnit timeUnit) throws TimeoutException;

    void c(long j10, TimeUnit timeUnit) throws TimeoutException;

    void d();

    Throwable e();

    void f();

    @s9.a
    Service g();

    State h();

    boolean isRunning();

    @s9.a
    Service stopAsync();
}
