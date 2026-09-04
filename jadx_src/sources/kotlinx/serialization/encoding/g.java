package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @dl.e
    public static final <T> T a(@dl.d f fVar, @dl.d kotlinx.serialization.c<? extends T> deserializer, @dl.d yh.a<? extends T> block) {
        f0.p(fVar, "<this>");
        f0.p(deserializer, "deserializer");
        f0.p(block, "block");
        return (deserializer.a().c() || fVar.B()) ? block.invoke() : (T) fVar.f();
    }

    public static final <T> T b(@dl.d f fVar, @dl.d kotlinx.serialization.descriptors.f descriptor, @dl.d l<? super d, ? extends T> block) {
        f0.p(fVar, "<this>");
        f0.p(descriptor, "descriptor");
        f0.p(block, "block");
        d dVarB = fVar.b(descriptor);
        T tInvoke = block.invoke(dVarB);
        dVarB.c(descriptor);
        return tInvoke;
    }
}
