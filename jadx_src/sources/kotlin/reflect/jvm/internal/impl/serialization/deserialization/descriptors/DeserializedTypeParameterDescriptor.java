package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j f127827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.TypeParameter f127828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final b f127829n;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.j c10, @dl.d ProtoBuf.TypeParameter proto, int i10) {
        f0.p(c10, "c");
        f0.p(proto, "proto");
        m mVarH = c10.h();
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = c10.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        kotlin.reflect.jvm.internal.impl.name.f fVarB = r.b(c10.g(), proto.O());
        u uVar = u.f127907a;
        ProtoBuf.TypeParameter.Variance varianceU = proto.U();
        f0.o(varianceU, "proto.variance");
        super(mVarH, kVarE, eVarB, fVarB, uVar.d(varianceU), proto.P(), i10, t0.f125942a, w0.a.f125944a);
        this.f127827l = c10;
        this.f127828m = proto;
        this.f127829n = new b(c10.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                return CollectionsKt___CollectionsKt.Q5(this.f127830b.f127827l.c().d().d(this.f127830b.P0(), this.f127830b.f127827l.g()));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    @dl.d
    protected List<d0> M0() {
        List<ProtoBuf.Type> listS = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.s(this.f127828m, this.f127827l.j());
        if (listS.isEmpty()) {
            return s.k(DescriptorUtilsKt.j(this).y());
        }
        TypeDeserializer typeDeserializerI = this.f127827l.i();
        ArrayList arrayList = new ArrayList(t.Y(listS, 10));
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializerI.q((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public b getAnnotations() {
        return this.f127829n;
    }

    @dl.d
    public final ProtoBuf.TypeParameter P0() {
        return this.f127828m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    @dl.d
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void L0(@dl.d d0 type) {
        f0.p(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
