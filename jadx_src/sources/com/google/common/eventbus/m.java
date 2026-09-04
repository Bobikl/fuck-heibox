package com.google.common.eventbus;

import com.google.common.base.d0;
import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.base.w;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.b3;
import com.google.common.collect.r1;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SubscriberRegistry.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.common.cache.i<Class<?>, ImmutableList<Method>> f58299c = CacheBuilder.D().M().b(new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.cache.i<Class<?>, ImmutableSet<Class<?>>> f58300d = CacheBuilder.D().M().b(new b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<j>> f58301a = Maps.V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @u9.g
    private final f f58302b;

    /* JADX INFO: compiled from: SubscriberRegistry.java */
    public class a extends CacheLoader<Class<?>, ImmutableList<Method>> {
        a() {
        }

        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableList<Method> d(Class<?> cls) throws Exception {
            return m.e(cls);
        }
    }

    /* JADX INFO: compiled from: SubscriberRegistry.java */
    public class b extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        b() {
        }

        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<Class<?>> d(Class<?> cls) {
            return ImmutableSet.w(TypeToken.of((Class) cls).getTypes().e1());
        }
    }

    /* JADX INFO: compiled from: SubscriberRegistry.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Class<?>> f58304b;

        c(Method method) {
            this.f58303a = method.getName();
            this.f58304b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f58303a.equals(cVar.f58303a) && this.f58304b.equals(cVar.f58304b);
        }

        public int hashCode() {
            return s.b(this.f58303a, this.f58304b);
        }
    }

    m(f fVar) {
        this.f58302b = (f) w.E(fVar);
    }

    private r1<Class<?>, j> b(Object obj) {
        HashMultimap hashMultimapK = HashMultimap.K();
        b3<Method> it = d(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            hashMultimapK.put(next.getParameterTypes()[0], j.c(this.f58302b, obj, next));
        }
        return hashMultimapK;
    }

    @o9.d
    static ImmutableSet<Class<?>> c(Class<?> cls) {
        try {
            return f58300d.l0(cls);
        } catch (UncheckedExecutionException e10) {
            throw d0.q(e10.getCause());
        }
    }

    private static ImmutableList<Method> d(Class<?> cls) {
        try {
            return f58299c.l0(cls);
        } catch (UncheckedExecutionException e10) {
            d0.w(e10.getCause());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<Method> e(Class<?> cls) {
        Set setE1 = TypeToken.of((Class) cls).getTypes().e1();
        HashMap mapY = Maps.Y();
        Iterator it = setE1.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(h.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    w.w(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    w.z(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), com.google.common.primitives.h.f(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!mapY.containsKey(cVar)) {
                        mapY.put(cVar, method);
                    }
                }
            }
        }
        return ImmutableList.v(mapY.values());
    }

    Iterator<j> f(Object obj) {
        ImmutableSet<Class<?>> immutableSetC = c(obj.getClass());
        ArrayList arrayListU = Lists.u(immutableSetC.size());
        b3<Class<?>> it = immutableSetC.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f58301a.get(it.next());
            if (copyOnWriteArraySet != null) {
                arrayListU.add(copyOnWriteArraySet.iterator());
            }
        }
        return Iterators.i(arrayListU.iterator());
    }

    @o9.d
    Set<j> g(Class<?> cls) {
        return (Set) q.a(this.f58301a.get(cls), ImmutableSet.D());
    }

    void h(Object obj) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(obj).e().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f58301a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<j> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) q.a(this.f58301a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    void i(Object obj) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(obj).e().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f58301a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                String strValueOf = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 65);
                sb2.append("missing event subscriber for an annotated method. Is ");
                sb2.append(strValueOf);
                sb2.append(" registered?");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }
}
