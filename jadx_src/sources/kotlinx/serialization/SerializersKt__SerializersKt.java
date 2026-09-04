package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.r0;
import kotlinx.serialization.internal.j0;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.p1;
import kotlinx.serialization.internal.q1;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,379:1\n79#2:380\n79#2:381\n79#2:387\n79#2:388\n1549#3:382\n1620#3,3:383\n1549#3:389\n1620#3,3:390\n1549#3:393\n1620#3,3:394\n1#4:386\n37#5,2:397\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:380\n54#1:381\n211#1:387\n235#1:388\n190#1:382\n190#1:383,3\n246#1:389\n246#1:390,3\n248#1:393\n248#1:394,3\n313#1:397,2\n*E\n"})
public final /* synthetic */ class SerializersKt__SerializersKt {
    private static final g<? extends Object> a(kotlin.reflect.d<Object> dVar, List<? extends g<Object>> list, yh.a<? extends kotlin.reflect.g> aVar) {
        if (f0.g(dVar, n0.d(Collection.class)) ? true : f0.g(dVar, n0.d(List.class)) ? true : f0.g(dVar, n0.d(List.class)) ? true : f0.g(dVar, n0.d(ArrayList.class))) {
            return new kotlinx.serialization.internal.f(list.get(0));
        }
        if (f0.g(dVar, n0.d(HashSet.class))) {
            return new l0(list.get(0));
        }
        if (f0.g(dVar, n0.d(Set.class)) ? true : f0.g(dVar, n0.d(Set.class)) ? true : f0.g(dVar, n0.d(LinkedHashSet.class))) {
            return new y0(list.get(0));
        }
        if (f0.g(dVar, n0.d(HashMap.class))) {
            return new j0(list.get(0), list.get(1));
        }
        if (f0.g(dVar, n0.d(Map.class)) ? true : f0.g(dVar, n0.d(Map.class)) ? true : f0.g(dVar, n0.d(LinkedHashMap.class))) {
            return new w0(list.get(0), list.get(1));
        }
        if (f0.g(dVar, n0.d(Map.Entry.class))) {
            return dj.a.k(list.get(0), list.get(1));
        }
        if (f0.g(dVar, n0.d(Pair.class))) {
            return dj.a.n(list.get(0), list.get(1));
        }
        if (f0.g(dVar, n0.d(Triple.class))) {
            return dj.a.q(list.get(0), list.get(1), list.get(2));
        }
        if (!p1.p(dVar)) {
            return null;
        }
        kotlin.reflect.g gVarInvoke = aVar.invoke();
        f0.n(gVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return dj.a.a((kotlin.reflect.d) gVarInvoke, list.get(0));
    }

    private static final g<? extends Object> b(kotlin.reflect.d<Object> dVar, List<? extends g<Object>> list) {
        g[] gVarArr = (g[]) list.toArray(new g[0]);
        return p1.d(dVar, (g[]) Arrays.copyOf(gVarArr, gVarArr.length));
    }

    @dl.d
    @r0
    public static final g<?> c(@dl.d String forClass) {
        f0.p(forClass, "forClass");
        throw new SerializationException(q1.h(forClass));
    }

    @dl.d
    @r0
    public static final g<?> d(@dl.d kotlinx.serialization.modules.e module, @dl.d kotlin.reflect.d<?> kClass) {
        f0.p(module, "module");
        f0.p(kClass, "kClass");
        g<?> gVarD = kotlinx.serialization.modules.e.d(module, kClass, null, 2, null);
        if (gVarD != null) {
            return gVarD;
        }
        q1.j(kClass);
        throw new KotlinNothingValueException();
    }

    @dl.d
    @r0
    public static final g<?> e(@dl.d kotlinx.serialization.modules.e module, @dl.d kotlin.reflect.d<?> kClass, @dl.d g<?>[] argSerializers) {
        f0.p(module, "module");
        f0.p(kClass, "kClass");
        f0.p(argSerializers, "argSerializers");
        g<?> gVarC = module.c(kClass, kotlin.collections.m.t(argSerializers));
        if (gVarC != null) {
            return gVarC;
        }
        q1.j(kClass);
        throw new KotlinNothingValueException();
    }

    private static final <T> g<T> f(g<T> gVar, boolean z10) {
        if (z10) {
            return dj.a.v(gVar);
        }
        f0.n(gVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return gVar;
    }

    @dl.e
    public static final g<? extends Object> g(@dl.d kotlin.reflect.d<Object> dVar, @dl.d List<? extends g<Object>> serializers, @dl.d yh.a<? extends kotlin.reflect.g> elementClassifierIfArray) {
        f0.p(dVar, "<this>");
        f0.p(serializers, "serializers");
        f0.p(elementClassifierIfArray, "elementClassifierIfArray");
        g<? extends Object> gVarA = a(dVar, serializers, elementClassifierIfArray);
        return gVarA == null ? b(dVar, serializers) : gVarA;
    }

    public static final /* synthetic */ <T> g<T> h() {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        g<T> gVar = (g<T>) t.i(null);
        f0.n(gVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return gVar;
    }

    @f
    @dl.d
    public static final <T> g<T> i(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        g<T> gVarO = t.o(dVar);
        if (gVarO != null) {
            return gVarO;
        }
        q1.j(dVar);
        throw new KotlinNothingValueException();
    }

    @dl.d
    @d
    public static final g<Object> j(@dl.d kotlin.reflect.d<?> kClass, @dl.d List<? extends g<?>> typeArgumentsSerializers, boolean z10) {
        f0.p(kClass, "kClass");
        f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        return t.l(SerializersModuleBuildersKt.a(), kClass, typeArgumentsSerializers, z10);
    }

    @dl.d
    public static final g<Object> k(@dl.d kotlin.reflect.r type) {
        f0.p(type, "type");
        return t.m(SerializersModuleBuildersKt.a(), type);
    }

    public static final /* synthetic */ <T> g<T> l(kotlinx.serialization.modules.e eVar) {
        f0.p(eVar, "<this>");
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        g<T> gVar = (g<T>) t.m(eVar, null);
        f0.n(gVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return gVar;
    }

    @dl.d
    @d
    public static final g<Object> m(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.d<?> kClass, @dl.d List<? extends g<?>> typeArgumentsSerializers, boolean z10) {
        f0.p(eVar, "<this>");
        f0.p(kClass, "kClass");
        f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        g<Object> gVarO = o(eVar, kClass, typeArgumentsSerializers, z10);
        if (gVarO != null) {
            return gVarO;
        }
        p1.q(kClass);
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final g<Object> n(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.r type) {
        f0.p(eVar, "<this>");
        f0.p(type, "type");
        g<Object> gVarP = p(eVar, type, true);
        if (gVarP != null) {
            return gVarP;
        }
        p1.q(q1.g(type));
        throw new KotlinNothingValueException();
    }

    private static final g<Object> o(kotlinx.serialization.modules.e eVar, kotlin.reflect.d<Object> dVar, List<? extends g<Object>> list, boolean z10) {
        g<? extends Object> gVarC;
        if (list.isEmpty()) {
            gVarC = t.o(dVar);
            if (gVarC == null) {
                gVarC = kotlinx.serialization.modules.e.d(eVar, dVar, null, 2, null);
            }
        } else {
            try {
                g<? extends Object> gVarD = t.d(dVar, list, new yh.a<kotlin.reflect.g>() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1
                    @Override // yh.a
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final kotlin.reflect.g invoke() {
                        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
                    }
                });
                gVarC = gVarD == null ? eVar.c(dVar, list) : gVarD;
            } catch (IndexOutOfBoundsException e10) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e10);
            }
        }
        if (gVarC != null) {
            return f(gVarC, z10);
        }
        return null;
    }

    private static final g<Object> p(kotlinx.serialization.modules.e eVar, kotlin.reflect.r rVar, boolean z10) {
        g<Object> gVarA;
        g<? extends Object> gVarC;
        kotlin.reflect.d<Object> dVarG = q1.g(rVar);
        boolean zP = rVar.p();
        List<kotlin.reflect.t> listD = rVar.d();
        final ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(q1.k((kotlin.reflect.t) it.next()));
        }
        if (arrayList.isEmpty()) {
            gVarA = SerializersCacheKt.a(dVarG, zP);
        } else {
            Object objB = SerializersCacheKt.b(dVarG, arrayList, zP);
            if (Result.i(objB)) {
                objB = null;
            }
            gVarA = (g) objB;
        }
        if (gVarA != null) {
            return gVarA;
        }
        if (arrayList.isEmpty()) {
            gVarC = kotlinx.serialization.modules.e.d(eVar, dVarG, null, 2, null);
        } else {
            List<g<Object>> listS = t.s(eVar, arrayList, z10);
            if (listS == null) {
                return null;
            }
            g<? extends Object> gVarD = t.d(dVarG, listS, new yh.a<kotlin.reflect.g>() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.g invoke() {
                    return arrayList.get(0).o();
                }
            });
            gVarC = gVarD == null ? eVar.c(dVarG, listS) : gVarD;
        }
        if (gVarC != null) {
            return f(gVarC, zP);
        }
        return null;
    }

    @f
    @dl.e
    public static final <T> g<T> q(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        g<T> gVarB = p1.b(dVar);
        return gVarB == null ? z1.b(dVar) : gVarB;
    }

    @dl.e
    public static final g<Object> r(@dl.d kotlin.reflect.r type) {
        f0.p(type, "type");
        return t.r(SerializersModuleBuildersKt.a(), type);
    }

    @dl.e
    public static final g<Object> s(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.r type) {
        f0.p(eVar, "<this>");
        f0.p(type, "type");
        return p(eVar, type, false);
    }

    @dl.e
    public static final List<g<Object>> t(@dl.d kotlinx.serialization.modules.e eVar, @dl.d List<? extends kotlin.reflect.r> typeArguments, boolean z10) {
        ArrayList arrayList;
        f0.p(eVar, "<this>");
        f0.p(typeArguments, "typeArguments");
        if (z10) {
            arrayList = new ArrayList(kotlin.collections.t.Y(typeArguments, 10));
            Iterator<T> it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(t.m(eVar, (kotlin.reflect.r) it.next()));
            }
        } else {
            arrayList = new ArrayList(kotlin.collections.t.Y(typeArguments, 10));
            Iterator<T> it2 = typeArguments.iterator();
            while (it2.hasNext()) {
                g<Object> gVarR = t.r(eVar, (kotlin.reflect.r) it2.next());
                if (gVarR == null) {
                    return null;
                }
                arrayList.add(gVarR);
            }
        }
        return arrayList;
    }
}
