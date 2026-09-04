package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: ContextReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f127646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.name.f f127647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a declarationDescriptor, @dl.d d0 receiverType, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e h hVar) {
        super(receiverType, hVar);
        f0.p(declarationDescriptor, "declarationDescriptor");
        f0.p(receiverType, "receiverType");
        this.f127646c = declarationDescriptor;
        this.f127647d = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f127647d;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.a d() {
        return this.f127646c;
    }

    @dl.d
    public String toString() {
        return "Cxt { " + d() + " }";
    }
}
