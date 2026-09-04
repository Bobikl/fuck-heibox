package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Lifecycling.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f24192b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24193c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d0 f24191a = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<Class<?>, Integer> f24194d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Map<Class<?>, List<Constructor<? extends o>>> f24195e = new HashMap();

    private d0() {
    }

    private final o a(Constructor<? extends o> constructor, Object obj) {
        try {
            o oVarNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.f0.o(oVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return oVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends o> b(Class<?> cls) {
        try {
            Package r10 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r10 != null ? r10.getName() : "";
            kotlin.jvm.internal.f0.o(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.f0.o(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.f0.o(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.f0.o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (!(fullPackage.length() == 0)) {
                strC = fullPackage + lg.a.f131414g + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.f0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    @dl.d
    @xh.m
    public static final String c(@dl.d String className) {
        kotlin.jvm.internal.f0.p(className, "className");
        return kotlin.text.u.l2(className, ".", lg.a.f131412e, false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f24194d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && x.class.isAssignableFrom(cls);
    }

    @dl.d
    @xh.m
    public static final v f(@dl.d Object object) {
        kotlin.jvm.internal.f0.p(object, "object");
        boolean z10 = object instanceof v;
        boolean z11 = object instanceof j;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((j) object, (v) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((j) object, null);
        }
        if (z10) {
            return (v) object;
        }
        Class<?> cls = object.getClass();
        d0 d0Var = f24191a;
        if (d0Var.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends o>> list = f24195e.get(cls);
        kotlin.jvm.internal.f0.m(list);
        List<Constructor<? extends o>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(d0Var.a(list2.get(0), object));
        }
        int size = list2.size();
        o[] oVarArr = new o[size];
        for (int i10 = 0; i10 < size; i10++) {
            oVarArr[i10] = f24191a.a(list2.get(i10), object);
        }
        return new CompositeGeneratedAdaptersObserver(oVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends o> constructorB = b(cls);
        if (constructorB != null) {
            f24195e.put(cls, kotlin.collections.s.k(constructorB));
            return 2;
        }
        if (d.f24181c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            kotlin.jvm.internal.f0.o(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends o>> list = f24195e.get(superclass);
            kotlin.jvm.internal.f0.m(list);
            arrayList = new ArrayList(list);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.f0.o(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.f0.o(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends o>> list2 = f24195e.get(intrface);
                kotlin.jvm.internal.f0.m(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f24195e.put(cls, arrayList);
        return 2;
    }
}
