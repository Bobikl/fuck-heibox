package kotlinx.serialization.modules;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SerializersModuleBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@dl.d String msg) {
        super(msg);
        f0.p(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@dl.d kotlin.reflect.d<?> baseClass, @dl.d kotlin.reflect.d<?> concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        f0.p(baseClass, "baseClass");
        f0.p(concreteClass, "concreteClass");
    }
}
