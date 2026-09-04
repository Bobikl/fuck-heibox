package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.internal.p1;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: SerializersJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n11065#2:202\n11400#2,3:203\n1549#3:206\n1620#3,3:207\n37#4,2:210\n1#5:212\n*S KotlinDebug\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n*L\n113#1:202\n113#1:203,3\n140#1:206\n140#1:207,3\n169#1:210,2\n*E\n"})
public final /* synthetic */ class u {
    private static final g<Object> a(kotlinx.serialization.modules.e eVar, GenericArrayType genericArrayType, boolean z10) {
        g<Object> gVarQ;
        kotlin.reflect.d dVarI;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            f0.o(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) ArraysKt___ArraysKt.sc(upperBounds);
        }
        f0.m(genericComponentType);
        if (z10) {
            gVarQ = t.k(eVar, genericComponentType);
        } else {
            gVarQ = t.q(eVar, genericComponentType);
            if (gVarQ == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            f0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVarI = xh.a.i((Class) rawType);
        } else {
            if (!(genericComponentType instanceof kotlin.reflect.d)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + n0.d(genericComponentType.getClass()));
            }
            dVarI = (kotlin.reflect.d) genericComponentType;
        }
        f0.n(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        g<Object> gVarA = dj.a.a(dVarI, gVarQ);
        f0.n(gVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return gVarA;
    }

    private static final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            f0.o(rawType, "getRawType(...)");
            return b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            f0.o(upperBounds, "getUpperBounds(...)");
            Object objSc = ArraysKt___ArraysKt.sc(upperBounds);
            f0.o(objSc, "first(...)");
            return b((Type) objSc);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            f0.o(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + n0.d(type.getClass()));
    }

    private static final <T> g<T> c(kotlinx.serialization.modules.e eVar, Class<T> cls, List<? extends g<Object>> list) {
        g[] gVarArr = (g[]) list.toArray(new g[0]);
        g<T> gVarC = p1.c(cls, (g[]) Arrays.copyOf(gVarArr, gVarArr.length));
        if (gVarC != null) {
            return gVarC;
        }
        kotlin.reflect.d<T> dVarI = xh.a.i(cls);
        g<T> gVarB = z1.b(dVarI);
        return gVarB == null ? eVar.c(dVarI, list) : gVarB;
    }

    @dl.d
    public static final g<Object> d(@dl.d Type type) {
        f0.p(type, "type");
        return t.k(SerializersModuleBuildersKt.a(), type);
    }

    @dl.d
    public static final g<Object> e(@dl.d kotlinx.serialization.modules.e eVar, @dl.d Type type) {
        f0.p(eVar, "<this>");
        f0.p(type, "type");
        g<Object> gVarF = f(eVar, type, true);
        if (gVarF != null) {
            return gVarF;
        }
        p1.r(b(type));
        throw new KotlinNothingValueException();
    }

    private static final g<Object> f(kotlinx.serialization.modules.e eVar, Type type, boolean z10) {
        ArrayList<g> arrayList;
        if (type instanceof GenericArrayType) {
            return a(eVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return j(eVar, (Class) type, z10);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                f0.o(upperBounds, "getUpperBounds(...)");
                Object objSc = ArraysKt___ArraysKt.sc(upperBounds);
                f0.o(objSc, "first(...)");
                return g(eVar, (Type) objSc, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + n0.d(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        f0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        f0.m(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                f0.m(type2);
                arrayList.add(t.k(eVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                f0.m(type3);
                g<Object> gVarQ = t.q(eVar, type3);
                if (gVarQ == null) {
                    return null;
                }
                arrayList.add(gVarQ);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            g<Object> gVarO = dj.a.o((g) arrayList.get(0));
            f0.n(gVarO, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarO;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            g<Object> gVarI = dj.a.i((g) arrayList.get(0));
            f0.n(gVarI, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarI;
        }
        if (Map.class.isAssignableFrom(cls)) {
            g<Object> gVarL = dj.a.l((g) arrayList.get(0), (g) arrayList.get(1));
            f0.n(gVarL, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarL;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            g<Object> gVarK = dj.a.k((g) arrayList.get(0), (g) arrayList.get(1));
            f0.n(gVarK, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarK;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            g<Object> gVarN = dj.a.n((g) arrayList.get(0), (g) arrayList.get(1));
            f0.n(gVarN, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarN;
        }
        if (Triple.class.isAssignableFrom(cls)) {
            g<Object> gVarQ2 = dj.a.q((g) arrayList.get(0), (g) arrayList.get(1), (g) arrayList.get(2));
            f0.n(gVarQ2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return gVarQ2;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, 10));
        for (g gVar : arrayList) {
            f0.n(gVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(gVar);
        }
        return c(eVar, cls, arrayList2);
    }

    static /* synthetic */ g g(kotlinx.serialization.modules.e eVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return f(eVar, type, z10);
    }

    @dl.e
    public static final g<Object> h(@dl.d Type type) {
        f0.p(type, "type");
        return t.q(SerializersModuleBuildersKt.a(), type);
    }

    @dl.e
    public static final g<Object> i(@dl.d kotlinx.serialization.modules.e eVar, @dl.d Type type) {
        f0.p(eVar, "<this>");
        f0.p(type, "type");
        return f(eVar, type, false);
    }

    private static final g<Object> j(kotlinx.serialization.modules.e eVar, Class<?> cls, boolean z10) {
        g<Object> gVarQ;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            f0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(eVar, cls, CollectionsKt__CollectionsKt.E());
        }
        Class<?> componentType = cls.getComponentType();
        f0.o(componentType, "getComponentType(...)");
        if (z10) {
            gVarQ = t.k(eVar, componentType);
        } else {
            gVarQ = t.q(eVar, componentType);
            if (gVarQ == null) {
                return null;
            }
        }
        kotlin.reflect.d dVarI = xh.a.i(componentType);
        f0.n(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        g<Object> gVarA = dj.a.a(dVarI, gVarQ);
        f0.n(gVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return gVarA;
    }
}
