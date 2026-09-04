package com.google.common.eventbus;

import com.google.common.base.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @u9.g
    private f f58291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    final Object f58292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f58293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f58294d;

    /* JADX INFO: compiled from: Subscriber.java */
    @o9.d
    public static final class b extends j {
        private b(f fVar, Object obj, Method method) {
            super(fVar, obj, method);
        }

        @Override // com.google.common.eventbus.j
        void e(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.e(obj);
            }
        }
    }

    private j(f fVar, Object obj, Method method) {
        this.f58291a = fVar;
        this.f58292b = w.E(obj);
        this.f58293c = method;
        method.setAccessible(true);
        this.f58294d = fVar.a();
    }

    private k b(Object obj) {
        return new k(this.f58291a, obj, this.f58292b, this.f58293c);
    }

    static j c(f fVar, Object obj, Method method) {
        return f(method) ? new j(fVar, obj, method) : new b(fVar, obj, method);
    }

    private static boolean f(Method method) {
        return method.getAnnotation(com.google.common.eventbus.a.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj) {
        try {
            e(obj);
        } catch (InvocationTargetException e10) {
            this.f58291a.b(e10.getCause(), b(obj));
        }
    }

    final void d(final Object obj) {
        this.f58294d.execute(new Runnable() { // from class: com.google.common.eventbus.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f58289b.g(obj);
            }
        });
    }

    @o9.d
    void e(Object obj) throws InvocationTargetException {
        try {
            this.f58293c.invoke(this.f58292b, w.E(obj));
        } catch (IllegalAccessException e10) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
            sb2.append("Method became inaccessible: ");
            sb2.append(strValueOf);
            throw new Error(sb2.toString(), e10);
        } catch (IllegalArgumentException e11) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
            sb3.append("Method rejected target/argument: ");
            sb3.append(strValueOf2);
            throw new Error(sb3.toString(), e11);
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof Error)) {
                throw e12;
            }
            throw ((Error) e12.getCause());
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f58292b == jVar.f58292b && this.f58293c.equals(jVar.f58293c);
    }

    public final int hashCode() {
        return ((this.f58293c.hashCode() + 31) * 31) + System.identityHashCode(this.f58292b);
    }
}
