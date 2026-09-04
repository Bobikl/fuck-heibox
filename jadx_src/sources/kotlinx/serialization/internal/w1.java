package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.internal.u1;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
@kotlin.r0
public abstract class w1<Element, Array, Builder extends u1<Array>> extends t<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(@dl.d kotlinx.serialization.g<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.f0.p(primitiveSerializer, "primitiveSerializer");
        this.f130779b = new v1(primitiveSerializer.a());
    }

    protected abstract void A(@dl.d kotlinx.serialization.encoding.e eVar, Array array, int i10);

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public final kotlinx.serialization.descriptors.f a() {
        return this.f130779b;
    }

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.internal.a, kotlinx.serialization.r
    public final void b(@dl.d kotlinx.serialization.encoding.h encoder, Array array) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        int iJ = j(array);
        kotlinx.serialization.descriptors.f fVar = this.f130779b;
        kotlinx.serialization.encoding.e eVarX = encoder.x(fVar, iJ);
        A(eVarX, array, iJ);
        eVarX.c(fVar);
    }

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.c
    public final Array d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return k(decoder, null);
    }

    @Override // kotlinx.serialization.internal.a
    @dl.d
    protected final Iterator<Element> i(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Builder f() {
        return p(w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(@dl.d Builder builder) {
        kotlin.jvm.internal.f0.p(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(@dl.d Builder builder, int i10) {
        kotlin.jvm.internal.f0.p(builder, "<this>");
        builder.b(i10);
    }

    protected abstract Array w();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.t
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(@dl.d Builder builder, int i10, Element element) {
        kotlin.jvm.internal.f0.p(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    protected abstract void y(@dl.d kotlinx.serialization.encoding.d dVar, int i10, @dl.d Builder builder, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Array q(@dl.d Builder builder) {
        kotlin.jvm.internal.f0.p(builder, "<this>");
        return (Array) builder.a();
    }
}
