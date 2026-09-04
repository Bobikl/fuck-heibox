package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AppInitializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27490d = "Startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f27491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f27492f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    final Context f27495c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    final Set<Class<? extends b<?>>> f27494b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    final Map<Class<?>, Object> f27493a = new HashMap();

    a(@n0 Context context) {
        this.f27495c = context.getApplicationContext();
    }

    @n0
    private <T> T d(@n0 Class<? extends b<?>> cls, @n0 Set<Class<?>> set) {
        T t10;
        if (androidx.tracing.b.h()) {
            try {
                androidx.tracing.b.c(cls.getSimpleName());
            } catch (Throwable th2) {
                androidx.tracing.b.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f27493a.containsKey(cls)) {
            t10 = (T) this.f27493a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> listB = bVarNewInstance.b();
                if (!listB.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listB) {
                        if (!this.f27493a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) bVarNewInstance.a(this.f27495c);
                set.remove(cls);
                this.f27493a.put(cls, t10);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        androidx.tracing.b.f();
        return t10;
    }

    @n0
    public static a e(@n0 Context context) {
        if (f27491e == null) {
            synchronized (f27492f) {
                if (f27491e == null) {
                    f27491e = new a(context);
                }
            }
        }
        return f27491e;
    }

    static void h(@n0 a aVar) {
        synchronized (f27492f) {
            f27491e = aVar;
        }
    }

    void a() {
        try {
            try {
                androidx.tracing.b.c(f27490d);
                b(this.f27495c.getPackageManager().getProviderInfo(new ComponentName(this.f27495c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                androidx.tracing.b.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    void b(@p0 Bundle bundle) {
        String string = this.f27495c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f27494b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f27494b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    @n0
    <T> T c(@n0 Class<? extends b<?>> cls) {
        T t10;
        synchronized (f27492f) {
            t10 = (T) this.f27493a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    @n0
    public <T> T f(@n0 Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@n0 Class<? extends b<?>> cls) {
        return this.f27494b.contains(cls);
    }
}
