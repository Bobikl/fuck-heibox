package androidx.collection;

import java.util.List;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object[] f3574a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ObjectList<Object> f3575b = new x1(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    @dl.d
    public static final <E> ObjectList<E> f() {
        ObjectList<E> objectList = (ObjectList<E>) f3575b;
        kotlin.jvm.internal.f0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    @dl.d
    public static final <E> x1<E> g() {
        return new x1<>(0, 1, null);
    }

    @dl.d
    public static final <E> x1<E> h(E e10) {
        x1<E> x1Var = new x1<>(1);
        x1Var.Z(e10);
        return x1Var;
    }

    @dl.d
    public static final <E> x1<E> i(E e10, E e11) {
        x1<E> x1Var = new x1<>(2);
        x1Var.Z(e10);
        x1Var.Z(e11);
        return x1Var;
    }

    @dl.d
    public static final <E> x1<E> j(E e10, E e11, E e12) {
        x1<E> x1Var = new x1<>(3);
        x1Var.Z(e10);
        x1Var.Z(e11);
        x1Var.Z(e12);
        return x1Var;
    }

    @dl.d
    public static final <E> x1<E> k(@dl.d E... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        x1<E> x1Var = new x1<>(elements.length);
        x1Var.A0(elements);
        return x1Var;
    }

    @dl.d
    public static final <E> ObjectList<E> l() {
        ObjectList<E> objectList = (ObjectList<E>) f3575b;
        kotlin.jvm.internal.f0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    @dl.d
    public static final <E> ObjectList<E> m(E e10) {
        return h(e10);
    }

    @dl.d
    public static final <E> ObjectList<E> n(E e10, E e11) {
        return i(e10, e11);
    }

    @dl.d
    public static final <E> ObjectList<E> o(E e10, E e11, E e12) {
        return j(e10, e11, e12);
    }

    @dl.d
    public static final <E> ObjectList<E> p(@dl.d E... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        x1 x1Var = new x1(elements.length);
        x1Var.A0(elements);
        return x1Var;
    }
}
