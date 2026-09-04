package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    @f
    @dl.d
    public static final <T> c<T> a(@dl.d kotlinx.serialization.internal.b<T> bVar, @dl.d kotlinx.serialization.encoding.d decoder, @dl.e String str) {
        f0.p(bVar, "<this>");
        f0.p(decoder, "decoder");
        c<T> cVarH = bVar.h(decoder, str);
        if (cVarH != null) {
            return cVarH;
        }
        kotlinx.serialization.internal.c.a(str, bVar.j());
        throw new KotlinNothingValueException();
    }

    @f
    @dl.d
    public static final <T> r<T> b(@dl.d kotlinx.serialization.internal.b<T> bVar, @dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        f0.p(bVar, "<this>");
        f0.p(encoder, "encoder");
        f0.p(value, "value");
        r<T> rVarI = bVar.i(encoder, value);
        if (rVarI != null) {
            return rVarI;
        }
        kotlinx.serialization.internal.c.b(n0.d(value.getClass()), bVar.j());
        throw new KotlinNothingValueException();
    }
}
