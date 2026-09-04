package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.name.f;
import mi.n;
import mi.r;
import mi.w;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DeclaredMemberIndex.kt */
    public static final class C1153a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final C1153a f126253a = new C1153a();

        private C1153a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.d
        public Set<f> a() {
            return d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.d
        public Set<f> b() {
            return d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.e
        public n c(@dl.d f name) {
            f0.p(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.d
        public Set<f> d() {
            return d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.e
        public w f(@dl.d f name) {
            f0.p(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        @dl.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<r> e(@dl.d f name) {
            f0.p(name, "name");
            return CollectionsKt__CollectionsKt.E();
        }
    }

    @dl.d
    Set<f> a();

    @dl.d
    Set<f> b();

    @dl.e
    n c(@dl.d f fVar);

    @dl.d
    Set<f> d();

    @dl.d
    Collection<r> e(@dl.d f fVar);

    @dl.e
    w f(@dl.d f fVar);
}
