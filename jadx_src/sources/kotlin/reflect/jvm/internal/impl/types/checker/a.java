package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: compiled from: ClassicTypeCheckerState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @dl.d
    public static final TypeCheckerState a(boolean z10, boolean z11, @dl.d b typeSystemContext, @dl.d KotlinTypePreparator kotlinTypePreparator, @dl.d f kotlinTypeRefiner) {
        f0.p(typeSystemContext, "typeSystemContext");
        f0.p(kotlinTypePreparator, "kotlinTypePreparator");
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ TypeCheckerState b(boolean z10, boolean z11, b bVar, KotlinTypePreparator kotlinTypePreparator, f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = o.f128088a;
        }
        if ((i10 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.a.f128056a;
        }
        if ((i10 & 16) != 0) {
            fVar = f.a.f128072a;
        }
        return a(z10, z11, bVar, kotlinTypePreparator, fVar);
    }
}
