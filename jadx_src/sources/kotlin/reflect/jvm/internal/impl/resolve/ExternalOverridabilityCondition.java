package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: loaded from: classes5.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    @dl.d
    Contract a();

    @dl.d
    Result b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar);
}
