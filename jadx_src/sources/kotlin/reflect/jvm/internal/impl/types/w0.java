package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* JADX INFO: compiled from: TypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w0 extends kotlin.reflect.jvm.internal.impl.util.e<u0<?>, u0<?>> implements Iterable<u0<?>>, zh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128193c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final w0 f128194d = new w0((List<? extends u0<?>>) CollectionsKt__CollectionsKt.E());

    /* JADX INFO: compiled from: TypeAttributes.kt */
    public static final class a extends TypeRegistry<u0<?>, u0<?>> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public <T extends u0<?>> int b(@dl.d ConcurrentHashMap<kotlin.reflect.d<? extends u0<?>>, Integer> concurrentHashMap, @dl.d kotlin.reflect.d<T> kClass, @dl.d yh.l<? super kotlin.reflect.d<? extends u0<?>>, Integer> compute) {
            int iIntValue;
            kotlin.jvm.internal.f0.p(concurrentHashMap, "<this>");
            kotlin.jvm.internal.f0.p(kClass, "kClass");
            kotlin.jvm.internal.f0.p(compute, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer numInvoke = compute.invoke(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(numInvoke.intValue()));
                    num2 = numInvoke;
                }
                kotlin.jvm.internal.f0.o(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                iIntValue = num2.intValue();
            }
            return iIntValue;
        }

        @dl.d
        public final w0 g(@dl.d List<? extends u0<?>> attributes) {
            kotlin.jvm.internal.f0.p(attributes, "attributes");
            return attributes.isEmpty() ? h() : new w0(attributes, null);
        }

        @dl.d
        public final w0 h() {
            return w0.f128194d;
        }
    }

    private w0(List<? extends u0<?>> list) {
        for (u0<?> u0Var : list) {
            e(u0Var.b(), u0Var);
        }
    }

    public /* synthetic */ w0(List list, kotlin.jvm.internal.u uVar) {
        this((List<? extends u0<?>>) list);
    }

    private w0(u0<?> u0Var) {
        this((List<? extends u0<?>>) kotlin.collections.s.k(u0Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @dl.d
    protected TypeRegistry<u0<?>, u0<?>> b() {
        return f128193c;
    }

    @dl.d
    public final w0 h(@dl.d w0 other) {
        u0 u0VarA;
        kotlin.jvm.internal.f0.p(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f128193c.e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            u0<?> u0Var = a().get(iIntValue);
            u0<?> u0Var2 = other.a().get(iIntValue);
            if (u0Var == null) {
                u0VarA = u0Var2 != null ? u0Var2.a(u0Var) : null;
            } else {
                u0VarA = u0Var.a(u0Var2);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, u0VarA);
        }
        return f128193c.g(arrayList);
    }

    public final boolean i(@dl.d u0<?> attribute) {
        kotlin.jvm.internal.f0.p(attribute, "attribute");
        return a().get(f128193c.d(attribute.b())) != null;
    }

    @dl.d
    public final w0 j(@dl.d w0 other) {
        u0 u0VarC;
        kotlin.jvm.internal.f0.p(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f128193c.e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            u0<?> u0Var = a().get(iIntValue);
            u0<?> u0Var2 = other.a().get(iIntValue);
            if (u0Var == null) {
                u0VarC = u0Var2 != null ? u0Var2.c(u0Var) : null;
            } else {
                u0VarC = u0Var.c(u0Var2);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, u0VarC);
        }
        return f128193c.g(arrayList);
    }

    @dl.d
    public final w0 l(@dl.d u0<?> attribute) {
        kotlin.jvm.internal.f0.p(attribute, "attribute");
        if (i(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new w0(attribute);
        }
        return f128193c.g(CollectionsKt___CollectionsKt.z4(CollectionsKt___CollectionsKt.Q5(this), attribute));
    }

    @dl.d
    public final w0 o(@dl.d u0<?> attribute) {
        kotlin.jvm.internal.f0.p(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.util.c<u0<?>> cVarA = a();
        ArrayList arrayList = new ArrayList();
        for (u0<?> u0Var : cVarA) {
            if (!kotlin.jvm.internal.f0.g(u0Var, attribute)) {
                arrayList.add(u0Var);
            }
        }
        return arrayList.size() == a().a() ? this : f128193c.g(arrayList);
    }
}
