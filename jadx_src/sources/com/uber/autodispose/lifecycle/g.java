package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.l;
import io.reactivex.z;
import java.util.Comparator;
import kh.r;

/* JADX INFO: compiled from: LifecycleScopes.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<Comparable<Object>> f104111a = new Comparator() { // from class: com.uber.autodispose.lifecycle.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    private g() {
        throw new InstantiationError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Comparator comparator, Object obj, Object obj2) throws Exception {
        return comparator.compare(obj2, obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj, Object obj2) throws Exception {
        return obj2.equals(obj);
    }

    public static <E> io.reactivex.g e(c<E> cVar) throws OutsideScopeException {
        return f(cVar, true);
    }

    public static <E> io.reactivex.g f(c<E> cVar, boolean z10) throws Exception {
        E eC = cVar.c();
        a<E> aVarD = cVar.d();
        if (eC == null) {
            throw new LifecycleNotStartedException();
        }
        try {
            return g(cVar.b(), aVarD.apply(eC));
        } catch (Exception e10) {
            if (!z10 || !(e10 instanceof LifecycleEndedException)) {
                return io.reactivex.a.Q(e10);
            }
            kh.g<? super OutsideScopeException> gVarB = l.b();
            if (gVarB == null) {
                throw e10;
            }
            try {
                gVarB.accept((LifecycleEndedException) e10);
                return io.reactivex.a.t();
            } catch (Exception e11) {
                return io.reactivex.a.Q(e11);
            }
        }
    }

    public static <E> io.reactivex.g g(z<E> zVar, E e10) {
        return h(zVar, e10, e10 instanceof Comparable ? f104111a : null);
    }

    public static <E> io.reactivex.g h(z<E> zVar, final E e10, @jh.f final Comparator<E> comparator) {
        return zVar.l5(1L).m6(comparator != null ? new r() { // from class: com.uber.autodispose.lifecycle.e
            @Override // kh.r
            public final boolean test(Object obj) {
                return g.c(comparator, e10, obj);
            }
        } : new r() { // from class: com.uber.autodispose.lifecycle.f
            @Override // kh.r
            public final boolean test(Object obj) {
                return g.d(e10, obj);
            }
        }).c3();
    }
}
