package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: JavaFlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f126495a = new g();

    private g() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.n
    @dl.d
    public d0 a(@dl.d ProtoBuf.Type proto, @dl.d String flexibleId, @dl.d j0 lowerBound, @dl.d j0 upperBound) {
        f0.p(proto, "proto");
        f0.p(flexibleId, "flexibleId");
        f0.p(lowerBound, "lowerBound");
        f0.p(upperBound, "upperBound");
        if (f0.g(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.x(JvmProtoBuf.f127076g) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.d(lowerBound, upperBound);
        }
        return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
