package p9;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Finalizer.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f138197e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f138198f = "com.google.common.base.FinalizableReference";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private static final Constructor<Thread> f138199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    private static final Field f138200h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Class<?>> f138201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PhantomReference<Object> f138202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<Object> f138203d;

    static {
        Constructor<Thread> constructorB = b();
        f138199g = constructorB;
        f138200h = constructorB == null ? d() : null;
    }

    private a(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.f138203d = referenceQueue;
        this.f138201b = new WeakReference<>(cls);
        this.f138202c = phantomReference;
    }

    private boolean a(Reference<?> reference) {
        Method methodC = c();
        if (methodC == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f138202c) {
                return false;
            }
            try {
                methodC.invoke(reference, new Object[0]);
            } catch (Throwable th2) {
                f138197e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
            reference = this.f138203d.poll();
        } while (reference != null);
        return true;
    }

    @CheckForNull
    private static Constructor<Thread> b() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    private Method c() {
        Class<?> cls = this.f138201b.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    @CheckForNull
    private static Field d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f138197e.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public static void e(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        if (!cls.getName().equals("com.google.common.base.j")) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        a aVar = new a(cls, referenceQueue, phantomReference);
        String name = a.class.getName();
        Constructor<Thread> constructor = f138199g;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, aVar, name, 0L, Boolean.FALSE);
            } catch (Throwable th2) {
                f138197e.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th2);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, aVar, name);
        }
        thread.setDaemon(true);
        try {
            Field field = f138200h;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th3) {
            f138197e.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th3);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.f138203d.remove())) {
        }
    }
}
