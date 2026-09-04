package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends FunctionReference implements yh.p<d0, d0, Boolean> {
    TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(Object obj) {
        super(2, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(k.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // yh.p
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@dl.d d0 p10, @dl.d d0 p11) {
        f0.p(p10, "p0");
        f0.p(p11, "p1");
        return Boolean.valueOf(((k) this.receiver).a(p10, p11));
    }
}
