package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Closer.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class m implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f58693e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    final c f58694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque<Closeable> f58695c = new ArrayDeque(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private Throwable f58696d;

    /* JADX INFO: compiled from: Closer.java */
    @o9.d
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f58697a = new a();

        a() {
        }

        @Override // com.google.common.io.m.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            Logger logger = l.f58692a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(closeable);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 42);
            sb2.append("Suppressing exception thrown when closing ");
            sb2.append(strValueOf);
            logger.log(level, sb2.toString(), th3);
        }
    }

    /* JADX INFO: compiled from: Closer.java */
    @o9.d
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f58698a;

        private b(Method method) {
            this.f58698a = method;
        }

        @CheckForNull
        static b b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.google.common.io.m.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                this.f58698a.invoke(th2, th3);
            } catch (Throwable unused) {
                a.f58697a.a(closeable, th2, th3);
            }
        }
    }

    /* JADX INFO: compiled from: Closer.java */
    @o9.d
    public interface c {
        void a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        c cVarB = b.b();
        if (cVarB == null) {
            cVarB = a.f58697a;
        }
        f58693e = cVarB;
    }

    @o9.d
    m(c cVar) {
        this.f58694b = (c) com.google.common.base.w.E(cVar);
    }

    public static m a() {
        return new m(f58693e);
    }

    @a0
    @s9.a
    public <C extends Closeable> C b(@a0 C c10) {
        if (c10 != null) {
            this.f58695c.addFirst(c10);
        }
        return c10;
    }

    public RuntimeException c(Throwable th2) throws Throwable {
        com.google.common.base.w.E(th2);
        this.f58696d = th2;
        com.google.common.base.d0.t(th2, IOException.class);
        throw new RuntimeException(th2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th2 = this.f58696d;
        while (!this.f58695c.isEmpty()) {
            Closeable closeableRemoveFirst = this.f58695c.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f58694b.a(closeableRemoveFirst, th2, th3);
                }
            }
        }
        if (this.f58696d != null || th2 == null) {
            return;
        }
        com.google.common.base.d0.t(th2, IOException.class);
        throw new AssertionError(th2);
    }

    public <X extends Exception> RuntimeException d(Throwable th2, Class<X> cls) throws Exception {
        com.google.common.base.w.E(th2);
        this.f58696d = th2;
        com.google.common.base.d0.t(th2, IOException.class);
        com.google.common.base.d0.t(th2, cls);
        throw new RuntimeException(th2);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException e(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Exception {
        com.google.common.base.w.E(th2);
        this.f58696d = th2;
        com.google.common.base.d0.t(th2, IOException.class);
        com.google.common.base.d0.u(th2, cls, cls2);
        throw new RuntimeException(th2);
    }
}
