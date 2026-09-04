package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class KPackageImpl$getLocalProperty$1$1$1 extends FunctionReference implements yh.p<MemberDeserializer, ProtoBuf.Property, o0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KPackageImpl$getLocalProperty$1$1$1 f125203d = new KPackageImpl$getLocalProperty$1$1$1();

    KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // yh.p
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final o0 invoke(@dl.d MemberDeserializer p10, @dl.d ProtoBuf.Property p11) {
        f0.p(p10, "p0");
        f0.p(p11, "p1");
        return p10.l(p11);
    }
}
