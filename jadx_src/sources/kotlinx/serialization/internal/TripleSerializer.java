package kotlinx.serialization.internal;

import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class TripleSerializer<A, B, C> implements kotlinx.serialization.g<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<A> f130658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<B> f130659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<C> f130660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130661d;

    public TripleSerializer(@dl.d kotlinx.serialization.g<A> aSerializer, @dl.d kotlinx.serialization.g<B> bSerializer, @dl.d kotlinx.serialization.g<C> cSerializer) {
        kotlin.jvm.internal.f0.p(aSerializer, "aSerializer");
        kotlin.jvm.internal.f0.p(bSerializer, "bSerializer");
        kotlin.jvm.internal.f0.p(cSerializer, "cSerializer");
        this.f130658a = aSerializer;
        this.f130659b = bSerializer;
        this.f130660c = cSerializer;
        this.f130661d = SerialDescriptorsKt.c("kotlin.Triple", new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, kotlin.b2>(this) { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TripleSerializer<A, B, C> f130662b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f130662b = this;
            }

            public final void a(@dl.d kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
                kotlin.jvm.internal.f0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", ((TripleSerializer) this.f130662b).f130658a.a(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, p7.a.f135567e, ((TripleSerializer) this.f130662b).f130659b.a(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, h5.b.f119119o, ((TripleSerializer) this.f130662b).f130660c.a(), null, false, 12, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
            }
        });
    }

    private final Triple<A, B, C> i(kotlinx.serialization.encoding.d dVar) {
        Object objD = kotlinx.serialization.encoding.d.b.d(dVar, a(), 0, this.f130658a, null, 8, null);
        Object objD2 = kotlinx.serialization.encoding.d.b.d(dVar, a(), 1, this.f130659b, null, 8, null);
        Object objD3 = kotlinx.serialization.encoding.d.b.d(dVar, a(), 2, this.f130660c, null, 8, null);
        dVar.c(a());
        return new Triple<>(objD, objD2, objD3);
    }

    private final Triple<A, B, C> j(kotlinx.serialization.encoding.d dVar) {
        Object objD = l2.f130723a;
        Object objD2 = l2.f130723a;
        Object objD3 = l2.f130723a;
        while (true) {
            int iU = dVar.u(a());
            if (iU == -1) {
                dVar.c(a());
                if (objD == l2.f130723a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objD2 == l2.f130723a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objD3 != l2.f130723a) {
                    return new Triple<>(objD, objD2, objD3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iU == 0) {
                objD = kotlinx.serialization.encoding.d.b.d(dVar, a(), 0, this.f130658a, null, 8, null);
            } else if (iU == 1) {
                objD2 = kotlinx.serialization.encoding.d.b.d(dVar, a(), 1, this.f130659b, null, 8, null);
            } else {
                if (iU != 2) {
                    throw new SerializationException("Unexpected index " + iU);
                }
                objD3 = kotlinx.serialization.encoding.d.b.d(dVar, a(), 2, this.f130660c, null, 8, null);
            }
        }
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130661d;
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlinx.serialization.encoding.d dVarB = decoder.b(a());
        return dVarB.j() ? i(dVarB) : j(dVarB);
    }

    @Override // kotlinx.serialization.r
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d Triple<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        kotlinx.serialization.encoding.e eVarB = encoder.b(a());
        eVarB.E(a(), 0, this.f130658a, value.f());
        eVarB.E(a(), 1, this.f130659b, value.g());
        eVarB.E(a(), 2, this.f130660c, value.h());
        eVarB.c(a());
    }
}
