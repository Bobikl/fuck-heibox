package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n270#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
@kotlinx.serialization.d
public abstract class a implements f, d {
    public static /* synthetic */ Object I(a aVar, kotlinx.serialization.c cVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return aVar.H(cVar, obj);
    }

    @Override // kotlinx.serialization.encoding.d
    public final boolean A(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return y();
    }

    @Override // kotlinx.serialization.encoding.f
    public boolean B() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.d
    public final short C(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return l();
    }

    @Override // kotlinx.serialization.encoding.d
    public final double D(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return m();
    }

    @Override // kotlinx.serialization.encoding.f
    public <T> T E(@dl.d kotlinx.serialization.c<? extends T> cVar) {
        return (T) f.a.b(this, cVar);
    }

    @Override // kotlinx.serialization.encoding.f
    public byte F() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objJ).byteValue();
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.e
    @kotlinx.serialization.d
    public <T> T G(@dl.d kotlinx.serialization.c<? extends T> cVar) {
        return (T) f.a.a(this, cVar);
    }

    public <T> T H(@dl.d kotlinx.serialization.c<? extends T> deserializer, @dl.e T t10) {
        f0.p(deserializer, "deserializer");
        return (T) E(deserializer);
    }

    @dl.d
    public Object J() {
        throw new SerializationException(n0.d(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public d b(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.d
    public void c(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.d
    public final long d(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return g();
    }

    @Override // kotlinx.serialization.encoding.d
    public final int e(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return s();
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.e
    public Void f() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.f
    public long g() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objJ).longValue();
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.d
    public final String h(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return p();
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.e
    public final <T> T i(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d kotlinx.serialization.c<? extends T> deserializer, @dl.e T t10) {
        f0.p(descriptor, "descriptor");
        f0.p(deserializer, "deserializer");
        return (deserializer.a().c() || B()) ? (T) H(deserializer, t10) : (T) f();
    }

    @Override // kotlinx.serialization.encoding.d
    @kotlinx.serialization.d
    public boolean j() {
        return d.b.c(this);
    }

    @Override // kotlinx.serialization.encoding.d
    @dl.d
    public f k(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return v(descriptor.e(i10));
    }

    @Override // kotlinx.serialization.encoding.f
    public short l() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objJ).shortValue();
    }

    @Override // kotlinx.serialization.encoding.f
    public double m() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.f
    public char n() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public <T> T o(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d kotlinx.serialization.c<? extends T> deserializer, @dl.e T t10) {
        f0.p(descriptor, "descriptor");
        f0.p(deserializer, "deserializer");
        return (T) H(deserializer, t10);
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public String p() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // kotlinx.serialization.encoding.d
    public final char q(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return n();
    }

    @Override // kotlinx.serialization.encoding.f
    public int r(@dl.d kotlinx.serialization.descriptors.f enumDescriptor) {
        f0.p(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // kotlinx.serialization.encoding.f
    public int s() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public int t(@dl.d kotlinx.serialization.descriptors.f fVar) {
        return d.b.a(this, fVar);
    }

    @Override // kotlinx.serialization.encoding.f
    @dl.d
    public f v(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.f
    public float w() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final float x(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return w();
    }

    @Override // kotlinx.serialization.encoding.f
    public boolean y() {
        Object objJ = J();
        f0.n(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final byte z(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return F();
    }
}
