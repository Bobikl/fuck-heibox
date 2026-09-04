package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import yh.l;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements l<kotlin.reflect.jvm.internal.impl.types.checker.f, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f p10) {
        f0.p(p10, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p10);
    }
}
