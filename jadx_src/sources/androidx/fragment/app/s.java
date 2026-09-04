package androidx.fragment.app;

import androidx.collection.j2;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: FragmentFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j2<ClassLoader, j2<String, Class<?>>> f23813a = new j2<>();

    static boolean b(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @androidx.annotation.n0
    private static Class<?> c(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws ClassNotFoundException {
        j2<ClassLoader, j2<String, Class<?>>> j2Var = f23813a;
        j2<String, Class<?>> j2Var2 = j2Var.get(classLoader);
        if (j2Var2 == null) {
            j2Var2 = new j2<>();
            j2Var.put(classLoader, j2Var2);
        }
        Class<?> cls = j2Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        j2Var2.put(str, cls2);
        return cls2;
    }

    @androidx.annotation.n0
    public static Class<? extends Fragment> d(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    @androidx.annotation.n0
    public Fragment a(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
