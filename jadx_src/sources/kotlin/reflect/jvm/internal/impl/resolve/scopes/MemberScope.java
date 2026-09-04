package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import yh.l;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface MemberScope extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Companion f127583a = Companion.f127584a;

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f127584a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> f127585b = new l<kotlin.reflect.jvm.internal.impl.name.f, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f it) {
                f0.p(it, "it");
                return Boolean.TRUE;
            }
        };

        private Companion() {
        }

        @dl.d
        public final l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> a() {
            return f127585b;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class a {
        public static void a(@dl.d MemberScope memberScope, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            h.a.b(memberScope, name, location);
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f127587b = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            return d1.k();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    Collection<? extends s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

    @dl.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @dl.d
    Collection<? extends o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

    @dl.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> d();

    @dl.e
    Set<kotlin.reflect.jvm.internal.impl.name.f> f();
}
