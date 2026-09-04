package kotlin.reflect.jvm;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import yh.p;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements p<MemberDeserializer, ProtoBuf.Function, s0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReflectLambdaKt$reflect$descriptor$1 f125070d = new ReflectLambdaKt$reflect$descriptor$1();

    ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final h getOwner() {
        return n0.d(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // yh.p
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final s0 invoke(@dl.d MemberDeserializer p10, @dl.d ProtoBuf.Function p11) {
        f0.p(p10, "p0");
        f0.p(p11, "p1");
        return p10.j(p11);
    }
}
