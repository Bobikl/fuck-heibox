package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import yh.l;

/* JADX INFO: compiled from: DFS.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* JADX INFO: compiled from: DFS.java */
    public static final class a<N> extends AbstractC1184b<N, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f128296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f128297b;

        a(l lVar, boolean[] zArr) {
            this.f128296a = lVar;
            this.f128297b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean a(N n10) {
            if (((Boolean) this.f128296a.invoke(n10)).booleanValue()) {
                this.f128297b[0] = true;
            }
            return !this.f128297b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean result() {
            return Boolean.valueOf(this.f128297b[0]);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DFS.java */
    public static abstract class AbstractC1184b<N, R> implements e<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean a(N n10) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public void b(N n10) {
        }
    }

    /* JADX INFO: compiled from: DFS.java */
    public static abstract class c<N, R, C extends Iterable<R>> extends AbstractC1184b<N, C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        protected final C f128298a;

        protected c(@dl.d C c10) {
            if (c10 == null) {
                c(0);
            }
            this.f128298a = c10;
        }

        private static /* synthetic */ void c(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "result";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = "result";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C result() {
            C c10 = this.f128298a;
            if (c10 == null) {
                c(1);
            }
            return c10;
        }
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface d<N> {
        @dl.d
        Iterable<? extends N> a(N n10);
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface e<N, R> {
        boolean a(N n10);

        void b(N n10);

        R result();
    }

    /* JADX INFO: compiled from: DFS.java */
    public static abstract class f<N, R> extends c<N, R, LinkedList<R>> {
        protected f() {
            super(new LinkedList());
        }
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface g<N> {
        boolean a(N n10);
    }

    /* JADX INFO: compiled from: DFS.java */
    public static class h<N> implements g<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<N> f128299a;

        public h() {
            this(new HashSet());
        }

        public h(@dl.d Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f128299a = set;
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.g
        public boolean a(N n10) {
            return this.f128299a.add(n10);
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.vss.g.H2;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(@dl.d Collection<N> collection, @dl.d d<N> dVar, @dl.d e<N, R> eVar) {
        if (collection == null) {
            a(4);
        }
        if (dVar == null) {
            a(5);
        }
        if (eVar == null) {
            a(6);
        }
        return (R) c(collection, dVar, new h(), eVar);
    }

    public static <N, R> R c(@dl.d Collection<N> collection, @dl.d d<N> dVar, @dl.d g<N> gVar, @dl.d e<N, R> eVar) {
        if (collection == null) {
            a(0);
        }
        if (dVar == null) {
            a(1);
        }
        if (gVar == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), dVar, gVar, eVar);
        }
        return eVar.result();
    }

    public static <N> void d(@dl.d N n10, @dl.d d<N> dVar, @dl.d g<N> gVar, @dl.d e<N, ?> eVar) {
        if (n10 == null) {
            a(22);
        }
        if (dVar == null) {
            a(23);
        }
        if (gVar == null) {
            a(24);
        }
        if (eVar == null) {
            a(25);
        }
        if (gVar.a(n10) && eVar.a(n10)) {
            Iterator<? extends N> it = dVar.a(n10).iterator();
            while (it.hasNext()) {
                d(it.next(), dVar, gVar, eVar);
            }
            eVar.b(n10);
        }
    }

    public static <N> Boolean e(@dl.d Collection<N> collection, @dl.d d<N> dVar, @dl.d l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (dVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, dVar, new a(lVar, new boolean[1]));
    }
}
