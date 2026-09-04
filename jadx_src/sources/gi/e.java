package gi;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: PlatformDependentTypeTransformer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface e {

    /* JADX INFO: compiled from: PlatformDependentTypeTransformer.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f119067a = new a();

        private a() {
        }

        @Override // gi.e
        @dl.d
        public j0 a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d j0 computedType) {
            f0.p(classId, "classId");
            f0.p(computedType, "computedType");
            return computedType;
        }
    }

    @dl.d
    j0 a(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d j0 j0Var);
}
