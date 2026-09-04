package kotlinx.serialization.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
@kotlin.r0
public abstract class t<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<Element> f130763a;

    private t(kotlinx.serialization.g<Element> gVar) {
        super(null);
        this.f130763a = gVar;
    }

    public /* synthetic */ t(kotlinx.serialization.g gVar, kotlin.jvm.internal.u uVar) {
        this(gVar);
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public abstract kotlinx.serialization.descriptors.f a();

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.r
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, Collection collection) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        int iJ = j(collection);
        kotlinx.serialization.descriptors.f fVarA = a();
        kotlinx.serialization.encoding.e eVarX = encoder.x(fVarA, iJ);
        Iterator<Element> itI = i(collection);
        for (int i10 = 0; i10 < iJ; i10++) {
            eVarX.E(a(), i10, this.f130763a, itI.next());
        }
        eVarX.c(fVarA);
    }

    @Override // kotlinx.serialization.internal.a
    protected final void l(@dl.d kotlinx.serialization.encoding.d decoder, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            m(decoder, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.a
    protected void m(@dl.d kotlinx.serialization.encoding.d decoder, int i10, Builder builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        s(builder, i10, kotlinx.serialization.encoding.d.b.d(decoder, a(), i10, this.f130763a, null, 8, null));
    }

    protected abstract void s(Builder builder, int i10, Element element);
}
