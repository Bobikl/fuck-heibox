package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @dl.e
    public static final r a(@dl.d ProtoBuf.Property proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, boolean z10, boolean z11, boolean z12) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f127073d;
        f0.o(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z10) {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a aVarC = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return r.f126558b.b(aVarC);
        }
        if (!z11 || !jvmPropertySignature.K()) {
            return null;
        }
        r.a aVar = r.f126558b;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureE = jvmPropertySignature.E();
        f0.o(jvmMethodSignatureE, "signature.syntheticMethod");
        return aVar.c(nameResolver, jvmMethodSignatureE);
    }

    public static /* synthetic */ r b(ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = (i10 & 8) != 0 ? false : z10;
        boolean z14 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(property, cVar, gVar, z13, z14, z12);
    }
}
