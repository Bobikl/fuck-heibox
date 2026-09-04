package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.b2;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class s {
    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> List<E> a(@dl.d List<E> builder) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        return ((ListBuilder) builder).l();
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <E> List<E> b(int i10, yh.l<? super List<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        List listJ = j(i10);
        builderAction.invoke(listJ);
        return a(listJ);
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <E> List<E> c(yh.l<? super List<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        List listI = i();
        builderAction.invoke(listI);
        return a(listI);
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final int d(int i10) {
        if (i10 < 0) {
            if (!sh.m.a(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            CollectionsKt__CollectionsKt.V();
        }
        return i10;
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final int e(int i10) {
        if (i10 < 0) {
            if (!sh.m.a(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            CollectionsKt__CollectionsKt.W();
        }
        return i10;
    }

    @sh.f
    private static final Object[] f(Collection<?> collection) {
        kotlin.jvm.internal.f0.p(collection, "collection");
        return kotlin.jvm.internal.t.a(collection);
    }

    @sh.f
    private static final <T> T[] g(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.f0.p(collection, "collection");
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(collection, array);
    }

    @dl.d
    public static final <T> Object[] h(@dl.d T[] tArr, boolean z10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.f0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> List<E> i() {
        return new ListBuilder();
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> List<E> j(int i10) {
        return new ListBuilder(i10);
    }

    @dl.d
    public static final <T> List<T> k(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.f0.o(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T> List<T> l(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        List<T> listS5 = CollectionsKt___CollectionsKt.S5(iterable);
        Collections.shuffle(listS5);
        return listS5;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T> List<T> m(@dl.d Iterable<? extends T> iterable, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        List<T> listS5 = CollectionsKt___CollectionsKt.S5(iterable);
        Collections.shuffle(listS5, random);
        return listS5;
    }

    @sh.f
    private static final <T> List<T> n(Enumeration<T> enumeration) {
        kotlin.jvm.internal.f0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.f0.o(list, "list(this)");
        return list;
    }
}
