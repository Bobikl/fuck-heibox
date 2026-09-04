package kotlinx.serialization.internal;

import kotlin.jvm.internal.Ref;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n83#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
@kotlinx.serialization.f
public abstract class b<T> implements kotlinx.serialization.g<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T g(kotlinx.serialization.encoding.d dVar) {
        return (T) kotlinx.serialization.encoding.d.b.d(dVar, a(), 1, kotlinx.serialization.k.a(this, dVar, dVar.h(a(), 0)), null, 8, null);
    }

    @Override // kotlinx.serialization.r
    public final void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        kotlinx.serialization.r<? super T> rVarB = kotlinx.serialization.k.b(this, encoder, value);
        kotlinx.serialization.descriptors.f fVarA = a();
        kotlinx.serialization.encoding.e eVarB = encoder.b(fVarA);
        eVarB.o(a(), 0, rVarB.a().j());
        kotlinx.serialization.descriptors.f fVarA2 = a();
        kotlin.jvm.internal.f0.n(rVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        eVarB.E(fVarA2, 1, rVarB, value);
        eVarB.c(fVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.c
    @dl.d
    public final T d(@dl.d kotlinx.serialization.encoding.f decoder) {
        T t10;
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlinx.serialization.descriptors.f fVarA = a();
        kotlinx.serialization.encoding.d dVarB = decoder.b(fVarA);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (dVarB.j()) {
            t10 = (T) g(dVarB);
        } else {
            t10 = null;
            while (true) {
                int iU = dVarB.u(a());
                if (iU == -1) {
                    if (t10 != null) {
                        kotlin.jvm.internal.f0.n(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.f124891b)).toString());
                }
                if (iU == 0) {
                    objectRef.f124891b = (T) dVarB.h(a(), iU);
                } else {
                    if (iU != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.f124891b;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iU);
                        throw new SerializationException(sb2.toString());
                    }
                    T t11 = objectRef.f124891b;
                    if (t11 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    objectRef.f124891b = t11;
                    t10 = (T) kotlinx.serialization.encoding.d.b.d(dVarB, a(), iU, kotlinx.serialization.k.a(this, dVarB, (String) t11), null, 8, null);
                }
            }
        }
        dVarB.c(fVarA);
        return t10;
    }

    @kotlinx.serialization.f
    @dl.e
    public kotlinx.serialization.c<T> h(@dl.d kotlinx.serialization.encoding.d decoder, @dl.e String str) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return decoder.a().e(j(), str);
    }

    @kotlinx.serialization.f
    @dl.e
    public kotlinx.serialization.r<T> i(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        return encoder.a().f(j(), value);
    }

    @dl.d
    public abstract kotlin.reflect.d<T> j();
}
