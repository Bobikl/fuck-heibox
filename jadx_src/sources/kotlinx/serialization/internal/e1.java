package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
@kotlinx.serialization.f
public abstract class e1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<Key> f130689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<Value> f130690b;

    private e1(kotlinx.serialization.g<Key> gVar, kotlinx.serialization.g<Value> gVar2) {
        super(null);
        this.f130689a = gVar;
        this.f130690b = gVar2;
    }

    public /* synthetic */ e1(kotlinx.serialization.g gVar, kotlinx.serialization.g gVar2, kotlin.jvm.internal.u uVar) {
        this(gVar, gVar2);
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
        Iterator<Map.Entry<? extends Key, ? extends Value>> itI = i(collection);
        int i10 = 0;
        while (itI.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itI.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            eVarX.E(a(), i10, r(), key);
            eVarX.E(a(), i11, s(), value);
            i10 = i11 + 1;
        }
        eVarX.c(fVarA);
    }

    @dl.d
    public final kotlinx.serialization.g<Key> r() {
        return this.f130689a;
    }

    @dl.d
    public final kotlinx.serialization.g<Value> s() {
        return this.f130690b;
    }

    protected abstract void t(@dl.d Builder builder, int i10, Key key, Value value);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void l(@dl.d kotlinx.serialization.encoding.d decoder, @dl.d Builder builder, int i10, int i11) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, i11 * 2), 2);
        int iH = jVarB1.h();
        int i12 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ <= 0 || iH > i12) && (iJ >= 0 || i12 > iH)) {
            return;
        }
        while (true) {
            m(decoder, i10 + iH, builder, false);
            if (iH == i12) {
                return;
            } else {
                iH += iJ;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d Builder builder, boolean z10) {
        int iU;
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        Object objD = kotlinx.serialization.encoding.d.b.d(decoder, a(), i10, this.f130689a, null, 8, null);
        if (z10) {
            iU = decoder.u(a());
            if (!(iU == i10 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iU).toString());
            }
        } else {
            iU = i10 + 1;
        }
        int i11 = iU;
        builder.put(objD, (!builder.containsKey(objD) || (this.f130690b.a().b() instanceof kotlinx.serialization.descriptors.e)) ? kotlinx.serialization.encoding.d.b.d(decoder, a(), i11, this.f130690b, null, 8, null) : decoder.o(a(), i11, this.f130690b, kotlin.collections.s0.K(builder, objD)));
    }
}
