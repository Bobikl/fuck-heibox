package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface n {

    /* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f127888a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.n
        @dl.d
        public d0 a(@dl.d ProtoBuf.Type proto, @dl.d String flexibleId, @dl.d j0 lowerBound, @dl.d j0 upperBound) {
            f0.p(proto, "proto");
            f0.p(flexibleId, "flexibleId");
            f0.p(lowerBound, "lowerBound");
            f0.p(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @dl.d
    d0 a(@dl.d ProtoBuf.Type type, @dl.d String str, @dl.d j0 j0Var, @dl.d j0 j0Var2);
}
