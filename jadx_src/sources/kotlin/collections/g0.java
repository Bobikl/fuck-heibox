package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g0 extends f0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R> Map<K, R> c(@dl.d d0<T, ? extends K> d0Var, @dl.d yh.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = d0Var.a(next);
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) linkedHashMap.get(objA);
            linkedHashMap.put(objA, operation.U0(objA, aVar, next, Boolean.valueOf(aVar == null && !linkedHashMap.containsKey(objA))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R, M extends Map<? super K, R>> M d(@dl.d d0<T, ? extends K> d0Var, @dl.d M destination, @dl.d yh.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = d0Var.a(next);
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) destination.get(objA);
            destination.put(objA, operation.U0(objA, aVar, next, Boolean.valueOf(aVar == null && !destination.containsKey(objA))));
        }
        return destination;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, M extends Map<? super K, Integer>> M e(@dl.d d0<T, ? extends K> d0Var, @dl.d M destination) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            K kA = d0Var.a(itB.next());
            Object obj = destination.get(kA);
            if (obj == null && !destination.containsKey(kA)) {
                obj = 0;
            }
            destination.put(kA, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R> Map<K, R> f(@dl.d d0<T, ? extends K> d0Var, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = d0Var.a(next);
            a.a.a.a.d.p.d.c.d dVar = (Object) linkedHashMap.get(kA);
            if (dVar == null && !linkedHashMap.containsKey(kA)) {
                dVar = (Object) r10;
            }
            linkedHashMap.put(kA, operation.invoke(dVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R> Map<K, R> g(@dl.d d0<T, ? extends K> d0Var, @dl.d yh.p<? super K, ? super T, ? extends R> initialValueSelector, @dl.d yh.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.f0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = d0Var.a(next);
            R rInvoke = (Object) linkedHashMap.get(objA);
            if (rInvoke == null && !linkedHashMap.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            linkedHashMap.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R, M extends Map<? super K, R>> M h(@dl.d d0<T, ? extends K> d0Var, @dl.d M destination, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = d0Var.a(next);
            a.a.a.a.d.p.d.c.d dVar = (Object) destination.get(kA);
            if (dVar == null && !destination.containsKey(kA)) {
                dVar = (Object) r10;
            }
            destination.put(kA, operation.invoke(dVar, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K, R, M extends Map<? super K, R>> M i(@dl.d d0<T, ? extends K> d0Var, @dl.d M destination, @dl.d yh.p<? super K, ? super T, ? extends R> initialValueSelector, @dl.d yh.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = d0Var.a(next);
            R rInvoke = (Object) destination.get(objA);
            if (rInvoke == null && !destination.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            destination.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <S, T extends S, K> Map<K, S> j(@dl.d d0<T, ? extends K> d0Var, @dl.d yh.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = d0Var.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = d0Var.a(sInvoke);
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) linkedHashMap.get(objA);
            if (!(aVar == null && !linkedHashMap.containsKey(objA))) {
                sInvoke = operation.invoke(objA, aVar, sInvoke);
            }
            linkedHashMap.put(objA, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@dl.d d0<T, ? extends K> d0Var, @dl.d M destination, @dl.d yh.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator itB = d0Var.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = d0Var.a(sInvoke);
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) destination.get(objA);
            if (!(aVar == null && !destination.containsKey(objA))) {
                sInvoke = operation.invoke(objA, aVar, sInvoke);
            }
            destination.put(objA, sInvoke);
        }
        return destination;
    }
}
