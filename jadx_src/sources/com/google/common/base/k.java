package com.google.common.base;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FinalizableReferenceQueue.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public class k implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56735f = "com.google.common.base.internal.Finalizer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ReferenceQueue<Object> f56737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final PhantomReference<Object> f56738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f56739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f56734e = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f56736g = c(d(new d(), new a(), new b()));

    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f56740a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        a() {
        }

        @Override // com.google.common.base.k.c
        @CheckForNull
        public Class<?> a() {
            try {
                return c(b()).loadClass(k.f56735f);
            } catch (Exception e10) {
                k.f56734e.log(Level.WARNING, f56740a, (Throwable) e10);
                return null;
            }
        }

        URL b() throws IOException {
            String strConcat = String.valueOf(k.f56735f.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX)).concat(".class");
            URL resource = getClass().getClassLoader().getResource(strConcat);
            if (resource == null) {
                throw new FileNotFoundException(strConcat);
            }
            String string = resource.toString();
            if (string.endsWith(strConcat)) {
                return new URL(resource, string.substring(0, string.length() - strConcat.length()));
            }
            throw new IOException(string.length() != 0 ? "Unsupported path style: ".concat(string) : new String("Unsupported path style: "));
        }

        URLClassLoader c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    public static class b implements c {
        b() {
        }

        @Override // com.google.common.base.k.c
        public Class<?> a() {
            try {
                return Class.forName("p9.a");
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    public interface c {
        @CheckForNull
        Class<?> a();
    }

    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    public static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @o9.d
        static boolean f56741a;

        d() {
        }

        @Override // com.google.common.base.k.c
        @CheckForNull
        public Class<?> a() {
            if (f56741a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(k.f56735f);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                k.f56734e.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public k() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f56737b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f56738c = phantomReference;
        boolean z10 = true;
        try {
            f56736g.invoke(null, j.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (Throwable th2) {
            f56734e.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z10 = false;
        }
        this.f56739d = z10;
    }

    static Method c(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    private static Class<?> d(c... cVarArr) {
        for (c cVar : cVarArr) {
            Class<?> clsA = cVar.a();
            if (clsA != null) {
                return clsA;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b() {
        if (this.f56739d) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f56737b.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((j) referencePoll).a();
            } catch (Throwable th2) {
                f56734e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56738c.enqueue();
        b();
    }
}
