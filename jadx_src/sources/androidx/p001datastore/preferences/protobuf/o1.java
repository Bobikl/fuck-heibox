package androidx.p001datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o1 f22565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o1 f22566b;

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class b extends o1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?> f22567c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) z3.O(obj, j10);
        }

        private static <L> List<L> g(Object obj, long j10, int i10) {
            Object obj2;
            List<L> listD2;
            List<L> listF = f(obj, j10);
            if (listF.isEmpty()) {
                if (listF instanceof n1) {
                    listD2 = new m1(i10);
                } else {
                    listD2 = ((listF instanceof q2) && (listF instanceof i1.k)) ? ((i1.k) listF).d2(i10) : new ArrayList<>(i10);
                }
                z3.q0(obj, j10, listD2);
                return listD2;
            }
            if (f22567c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                z3.q0(obj, j10, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listF instanceof y3)) {
                    if (!(listF instanceof q2) || !(listF instanceof i1.k)) {
                        return listF;
                    }
                    i1.k kVar = (i1.k) listF;
                    if (kVar.l1()) {
                        return listF;
                    }
                    i1.k kVarD2 = kVar.d2(listF.size() + i10);
                    z3.q0(obj, j10, kVarD2);
                    return kVarD2;
                }
                m1 m1Var = new m1(listF.size() + i10);
                m1Var.addAll((y3) listF);
                z3.q0(obj, j10, m1Var);
                obj2 = m1Var;
            }
            return (List<L>) obj2;
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) z3.O(obj, j10);
            if (list instanceof n1) {
                objUnmodifiableList = ((n1) list).n();
            } else {
                if (f22567c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof q2) && (list instanceof i1.k)) {
                    i1.k kVar = (i1.k) list;
                    if (kVar.l1()) {
                        kVar.z0();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z3.q0(obj, j10, objUnmodifiableList);
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        <E> void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            z3.q0(obj, j10, listF);
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class c extends o1 {
        private c() {
            super();
        }

        static <E> i1.k<E> f(Object obj, long j10) {
            return (i1.k) z3.O(obj, j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        void c(Object obj, long j10) {
            f(obj, j10).z0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        <E> void d(Object obj, Object obj2, long j10) {
            i1.k kVarF = f(obj, j10);
            i1.k kVarF2 = f(obj2, j10);
            int size = kVarF.size();
            int size2 = kVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!kVarF.l1()) {
                    kVarF = kVarF.d2(size2 + size);
                }
                kVarF.addAll(kVarF2);
            }
            if (size > 0) {
                kVarF2 = kVarF;
            }
            z3.q0(obj, j10, kVarF2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.o1
        <L> List<L> e(Object obj, long j10) {
            i1.k kVarF = f(obj, j10);
            if (kVarF.l1()) {
                return kVarF;
            }
            int size = kVarF.size();
            i1.k kVarD2 = kVarF.d2(size == 0 ? 10 : size * 2);
            z3.q0(obj, j10, kVarD2);
            return kVarD2;
        }
    }

    static {
        f22565a = new b();
        f22566b = new c();
    }

    private o1() {
    }

    static o1 a() {
        return f22565a;
    }

    static o1 b() {
        return f22566b;
    }

    abstract void c(Object obj, long j10);

    abstract <L> void d(Object obj, Object obj2, long j10);

    abstract <L> List<L> e(Object obj, long j10);
}
