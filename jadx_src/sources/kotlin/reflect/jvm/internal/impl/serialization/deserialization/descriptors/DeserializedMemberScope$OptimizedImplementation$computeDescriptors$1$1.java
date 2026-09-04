package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.p;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements yh.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f127815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ByteArrayInputStream f127816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DeserializedMemberScope f127817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(p<Object> pVar, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f127815b = pVar;
        this.f127816c = byteArrayInputStream;
        this.f127817d = deserializedMemberScope;
    }

    @Override // yh.a
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke() {
        return (n) this.f127815b.a(this.f127816c, this.f127817d.q().c().j());
    }
}
