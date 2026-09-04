package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import yh.l;

/* JADX INFO: compiled from: ResolutionScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface h {

    /* JADX INFO: compiled from: ResolutionScope.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(h hVar, d dVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                dVar = d.f127625o;
            }
            if ((i10 & 2) != 0) {
                lVar = MemberScope.f127583a.a();
            }
            return hVar.g(dVar, lVar);
        }

        public static void b(@dl.d h hVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            hVar.a(name, location);
        }
    }

    @dl.d
    Collection<? extends w> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

    void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

    @dl.d
    Collection<k> g(@dl.d d dVar, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @dl.e
    kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);
}
