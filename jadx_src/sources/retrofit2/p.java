package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f139042c = f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f139043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Constructor<MethodHandles.Lookup> f139044b;

    /* JADX INFO: compiled from: Platform.java */
    public static final class a extends p {

        /* JADX INFO: renamed from: retrofit2.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Platform.java */
        public static final class ExecutorC1265a implements Executor {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Handler f139045b = new Handler(Looper.getMainLooper());

            ExecutorC1265a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f139045b.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.p
        public Executor c() {
            return new ExecutorC1265a();
        }

        @Override // retrofit2.p
        @Nullable
        Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    p(boolean z10) {
        this.f139043a = z10;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z10) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f139044b = declaredConstructor;
    }

    private static p f() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new p(true);
    }

    static p g() {
        return f139042c;
    }

    List<? extends c.a> a(@Nullable Executor executor) {
        g gVar = new g(executor);
        return this.f139043a ? Arrays.asList(e.f138948a, gVar) : Collections.singletonList(gVar);
    }

    int b() {
        return this.f139043a ? 2 : 1;
    }

    @Nullable
    Executor c() {
        return null;
    }

    List<? extends f.a> d() {
        return this.f139043a ? Collections.singletonList(m.f138995a) : Collections.emptyList();
    }

    int e() {
        return this.f139043a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f139044b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    boolean i(Method method) {
        return this.f139043a && method.isDefault();
    }
}
