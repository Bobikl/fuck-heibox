package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
@kotlinx.serialization.f
public abstract class TaggedDecoder<Tag> implements kotlinx.serialization.encoding.f, kotlinx.serialization.encoding.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ArrayList<Tag> f130650d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f130651e;

    private final <E> E c0(Tag tag, yh.a<? extends E> aVar) {
        b0(tag);
        E eInvoke = aVar.invoke();
        if (!this.f130651e) {
            a0();
        }
        this.f130651e = false;
        return eInvoke;
    }

    @Override // kotlinx.serialization.encoding.d
    public final boolean A(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return J(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public boolean B() {
        Tag tagY = Y();
        if (tagY == null) {
            return false;
        }
        return S(tagY);
    }

    @Override // kotlinx.serialization.encoding.d
    public final short C(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return U(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.d
    public final double D(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return M(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public <T> T E(@dl.d kotlinx.serialization.c<? extends T> cVar) {
        return (T) kotlinx.serialization.encoding.f.a.b(this, cVar);
    }

    @Override // kotlinx.serialization.encoding.f
    public final byte F() {
        return K(a0());
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.e
    @kotlinx.serialization.d
    public <T> T G(@dl.d kotlinx.serialization.c<? extends T> cVar) {
        return (T) kotlinx.serialization.encoding.f.a.a(this, cVar);
    }

    protected final void H(@dl.d TaggedDecoder<Tag> other) {
        kotlin.jvm.internal.f0.p(other, "other");
        other.f130650d.addAll(this.f130650d);
    }

    protected <T> T I(@dl.d kotlinx.serialization.c<? extends T> deserializer, @dl.e T t10) {
        kotlin.jvm.internal.f0.p(deserializer, "deserializer");
        return (T) E(deserializer);
    }

    protected boolean J(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objW).booleanValue();
    }

    protected byte K(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objW).byteValue();
    }

    protected char L(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objW).charValue();
    }

    protected double M(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objW).doubleValue();
    }

    protected int N(Tag tag, @dl.d kotlinx.serialization.descriptors.f enumDescriptor) {
        kotlin.jvm.internal.f0.p(enumDescriptor, "enumDescriptor");
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objW).intValue();
    }

    protected float O(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objW).floatValue();
    }

    @dl.d
    protected kotlinx.serialization.encoding.f P(Tag tag, @dl.d kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.f0.p(inlineDescriptor, "inlineDescriptor");
        b0(tag);
        return this;
    }

    protected int Q(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objW).intValue();
    }

    protected long R(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objW).longValue();
    }

    protected boolean S(Tag tag) {
        return true;
    }

    @dl.e
    protected Void T(Tag tag) {
        return null;
    }

    protected short U(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objW).shortValue();
    }

    @dl.d
    protected String V(Tag tag) {
        Object objW = W(tag);
        kotlin.jvm.internal.f0.n(objW, "null cannot be cast to non-null type kotlin.String");
        return (String) objW;
    }

    @dl.d
    protected Object W(Tag tag) {
        throw new SerializationException(kotlin.jvm.internal.n0.d(getClass()) + " can't retrieve untyped values");
    }

    protected final Tag X() {
        return (Tag) CollectionsKt___CollectionsKt.k3(this.f130650d);
    }

    @dl.e
    protected final Tag Y() {
        return (Tag) CollectionsKt___CollectionsKt.q3(this.f130650d);
    }

    protected abstract Tag Z(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @Override // kotlinx.serialization.encoding.f, kotlinx.serialization.encoding.d
    @dl.d
    public kotlinx.serialization.modules.e a() {
        return SerializersModuleBuildersKt.a();
    }

    protected final Tag a0() {
        ArrayList<Tag> arrayList = this.f130650d;
        Tag tagRemove = arrayList.remove(CollectionsKt__CollectionsKt.G(arrayList));
        this.f130651e = true;
        return tagRemove;
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public kotlinx.serialization.encoding.d b(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return this;
    }

    protected final void b0(Tag tag) {
        this.f130650d.add(tag);
    }

    @Override // kotlinx.serialization.encoding.d
    public void c(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.d
    public final long d(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return R(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.d
    public final int e(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return Q(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.e
    public final Void f() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.f
    public final long g() {
        return R(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.d
    public final String h(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return V(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.e
    public final <T> T i(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d final kotlinx.serialization.c<? extends T> deserializer, @dl.e final T t10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(deserializer, "deserializer");
        return (T) c0(Z(descriptor, i10), new yh.a<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TaggedDecoder<Tag> f130652b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f130652b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // yh.a
            @dl.e
            public final T invoke() {
                TaggedDecoder<Tag> taggedDecoder = this.f130652b;
                kotlinx.serialization.c<T> cVar = deserializer;
                return (cVar.a().c() || taggedDecoder.B()) ? (T) taggedDecoder.I((kotlinx.serialization.c<? extends T>) cVar, t10) : (T) taggedDecoder.f();
            }
        });
    }

    @Override // kotlinx.serialization.encoding.d
    @kotlinx.serialization.d
    public boolean j() {
        return kotlinx.serialization.encoding.d.b.c(this);
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.d
    public final kotlinx.serialization.encoding.f k(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return P(Z(descriptor, i10), descriptor.e(i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public final short l() {
        return U(a0());
    }

    @Override // kotlinx.serialization.encoding.f
    public final double m() {
        return M(a0());
    }

    @Override // kotlinx.serialization.encoding.f
    public final char n() {
        return L(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    public final <T> T o(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d final kotlinx.serialization.c<? extends T> deserializer, @dl.e final T t10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(deserializer, "deserializer");
        return (T) c0(Z(descriptor, i10), new yh.a<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TaggedDecoder<Tag> f130655b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f130655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // yh.a
            public final T invoke() {
                return (T) this.f130655b.I((kotlinx.serialization.c<? extends T>) deserializer, t10);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public final String p() {
        return V(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    public final char q(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return L(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public final int r(@dl.d kotlinx.serialization.descriptors.f enumDescriptor) {
        kotlin.jvm.internal.f0.p(enumDescriptor, "enumDescriptor");
        return N(a0(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.f
    public final int s() {
        return Q(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    public int t(@dl.d kotlinx.serialization.descriptors.f fVar) {
        return kotlinx.serialization.encoding.d.b.a(this, fVar);
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public kotlinx.serialization.encoding.f v(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return P(a0(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.f
    public final float w() {
        return O(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    public final float x(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return O(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public final boolean y() {
        return J(a0());
    }

    @Override // kotlinx.serialization.encoding.d
    public final byte z(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return K(Z(descriptor, i10));
    }
}
