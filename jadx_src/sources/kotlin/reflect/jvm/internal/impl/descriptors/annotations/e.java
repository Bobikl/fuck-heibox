package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface e extends Iterable<c>, zh.a {

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @dl.d
    public static final a f125601z1 = a.f125602a;

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f125602a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final e f125603b = new C1143a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Annotations.kt */
        public static final class C1143a implements e {
            C1143a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return b.b(this, cVar);
            }

            @dl.e
            public Void a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
                f0.p(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @dl.d
            public Iterator<c> iterator() {
                return CollectionsKt__CollectionsKt.E().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public /* bridge */ /* synthetic */ c k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return (c) a(cVar);
            }

            @dl.d
            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        @dl.d
        public final e a(@dl.d List<? extends c> annotations) {
            f0.p(annotations, "annotations");
            return annotations.isEmpty() ? f125603b : new f(annotations);
        }

        @dl.d
        public final e b() {
            return f125603b;
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class b {
        @dl.e
        public static c a(@dl.d e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
            c next;
            f0.p(fqName, "fqName");
            Iterator<c> it = eVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (f0.g(next.e(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean b(@dl.d e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
            f0.p(fqName, "fqName");
            return eVar.k(fqName) != null;
        }
    }

    boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean isEmpty();

    @dl.e
    c k(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);
}
