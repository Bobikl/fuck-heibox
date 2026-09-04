package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.annotation.i1;
import androidx.annotation.j;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ButterKnife {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35546a = "ButterKnife";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f35547b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @j1
    static final Map<Class<?>, Constructor<? extends Unbinder>> f35548c = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    @n0
    @i1
    public static Unbinder a(@n0 Activity activity) {
        return f(activity, activity.getWindow().getDecorView());
    }

    @n0
    @i1
    public static Unbinder b(@n0 Dialog dialog) {
        return f(dialog, dialog.getWindow().getDecorView());
    }

    @n0
    @i1
    public static Unbinder c(@n0 View view) {
        return f(view, view);
    }

    @n0
    @i1
    public static Unbinder d(@n0 Object obj, @n0 Activity activity) {
        return f(obj, activity.getWindow().getDecorView());
    }

    @n0
    @i1
    public static Unbinder e(@n0 Object obj, @n0 Dialog dialog) {
        return f(obj, dialog.getWindow().getDecorView());
    }

    @n0
    @i1
    public static Unbinder f(@n0 Object obj, @n0 View view) {
        Class<?> cls = obj.getClass();
        if (f35547b) {
            Log.d(f35546a, "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> constructorG = g(cls);
        if (constructorG == null) {
            return Unbinder.f35554a;
        }
        try {
            return constructorG.newInstance(obj, view);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to invoke " + constructorG, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to invoke " + constructorG, e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    @i1
    @p0
    private static Constructor<? extends Unbinder> g(Class<?> cls) {
        Constructor<? extends Unbinder> constructorG;
        Map<Class<?>, Constructor<? extends Unbinder>> map = f35548c;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (f35547b) {
                Log.d(f35546a, "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!f35547b) {
                return null;
            }
            Log.d(f35546a, "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            constructorG = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            if (f35547b) {
                Log.d(f35546a, "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (f35547b) {
                Log.d(f35546a, "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            constructorG = g(cls.getSuperclass());
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e10);
        }
        f35548c.put(cls, constructorG);
        return constructorG;
    }

    public static void h(boolean z10) {
        f35547b = z10;
    }
}
