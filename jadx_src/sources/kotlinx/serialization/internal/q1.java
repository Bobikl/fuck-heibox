package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n37#3,2:184\n1789#4,3:186\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n75#1:184,2\n159#1:186,3\n*E\n"})
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f[] f130747a = new kotlinx.serialization.descriptors.f[0];

    @dl.d
    public static final Set<String> a(@dl.d kotlinx.serialization.descriptors.f fVar) {
        kotlin.jvm.internal.f0.p(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int iF = fVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            hashSet.add(fVar.h(i10));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    @kotlin.r0
    public static final <T> kotlinx.serialization.c<T> b(@dl.d kotlinx.serialization.c<?> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    @kotlin.r0
    public static final <T> kotlinx.serialization.g<T> c(@dl.d kotlinx.serialization.g<?> gVar) {
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    @kotlin.r0
    public static final <T> kotlinx.serialization.r<T> d(@dl.d kotlinx.serialization.r<?> rVar) {
        kotlin.jvm.internal.f0.p(rVar, "<this>");
        return rVar;
    }

    @dl.d
    public static final kotlinx.serialization.descriptors.f[] e(@dl.e List<? extends kotlinx.serialization.descriptors.f> list) {
        kotlinx.serialization.descriptors.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (kotlinx.serialization.descriptors.f[]) list.toArray(new kotlinx.serialization.descriptors.f[0])) == null) ? f130747a : fVarArr;
    }

    public static final <T, K> int f(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i10 = iHashCode * 31;
            K kInvoke = selector.invoke(it.next());
            iHashCode = i10 + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    @dl.d
    public static final kotlin.reflect.d<Object> g(@dl.d kotlin.reflect.r rVar) {
        kotlin.jvm.internal.f0.p(rVar, "<this>");
        kotlin.reflect.g gVarO = rVar.o();
        if (gVarO instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVarO;
        }
        if (!(gVarO instanceof kotlin.reflect.s)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + gVarO);
        }
        throw new IllegalArgumentException("Captured type parameter " + gVarO + " from generic non-reified function. Such functionality cannot be supported because " + gVarO + " is erased, either specify serializer explicitly or make calling function inline with reified " + gVarO + lg.a.f131414g);
    }

    @dl.d
    public static final String h(@dl.d String className) {
        kotlin.jvm.internal.f0.p(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @dl.d
    public static final String i(@dl.d kotlin.reflect.d<?> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        String strF = dVar.F();
        if (strF == null) {
            strF = "<local class name not available>";
        }
        return h(strF);
    }

    @dl.d
    public static final Void j(@dl.d kotlin.reflect.d<?> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        throw new SerializationException(i(dVar));
    }

    @dl.d
    public static final kotlin.reflect.r k(@dl.d kotlin.reflect.t tVar) {
        kotlin.jvm.internal.f0.p(tVar, "<this>");
        kotlin.reflect.r rVarG = tVar.g();
        if (rVarG != null) {
            return rVarG;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + tVar.g()).toString());
    }
}
