package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
@kotlinx.serialization.f
public abstract class k2<Tag> implements kotlinx.serialization.encoding.h, kotlinx.serialization.encoding.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ArrayList<Tag> f130717a = new ArrayList<>();

    private final boolean G(kotlinx.serialization.descriptors.f fVar, int i10) {
        a0(Y(fVar, i10));
        return true;
    }

    @Override // kotlinx.serialization.encoding.h
    public void A() {
        R(Z());
    }

    @Override // kotlinx.serialization.encoding.e
    public final void B(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        M(Y(descriptor, i10), f10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void C(char c10) {
        J(Z(), c10);
    }

    @Override // kotlinx.serialization.encoding.h
    public void D() {
        Q(W());
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void E(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d kotlinx.serialization.r<? super T> serializer, T t10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(serializer, "serializer");
        if (G(descriptor, i10)) {
            d(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void F(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        K(Y(descriptor, i10), d10);
    }

    protected void H(Tag tag, boolean z10) {
        U(tag, Boolean.valueOf(z10));
    }

    protected void I(Tag tag, byte b10) {
        U(tag, Byte.valueOf(b10));
    }

    protected void J(Tag tag, char c10) {
        U(tag, Character.valueOf(c10));
    }

    protected void K(Tag tag, double d10) {
        U(tag, Double.valueOf(d10));
    }

    protected void L(Tag tag, @dl.d kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.f0.p(enumDescriptor, "enumDescriptor");
        U(tag, Integer.valueOf(i10));
    }

    protected void M(Tag tag, float f10) {
        U(tag, Float.valueOf(f10));
    }

    @dl.d
    protected kotlinx.serialization.encoding.h N(Tag tag, @dl.d kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.f0.p(inlineDescriptor, "inlineDescriptor");
        a0(tag);
        return this;
    }

    protected void O(Tag tag, int i10) {
        U(tag, Integer.valueOf(i10));
    }

    protected void P(Tag tag, long j10) {
        U(tag, Long.valueOf(j10));
    }

    protected void Q(Tag tag) {
    }

    protected void R(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    protected void S(Tag tag, short s10) {
        U(tag, Short.valueOf(s10));
    }

    protected void T(Tag tag, @dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
        U(tag, value);
    }

    protected void U(Tag tag, @dl.d Object value) {
        kotlin.jvm.internal.f0.p(value, "value");
        throw new SerializationException("Non-serializable " + kotlin.jvm.internal.n0.d(value.getClass()) + " is not supported by " + kotlin.jvm.internal.n0.d(getClass()) + " encoder");
    }

    protected void V(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
    }

    protected final Tag W() {
        return (Tag) CollectionsKt___CollectionsKt.k3(this.f130717a);
    }

    @dl.e
    protected final Tag X() {
        return (Tag) CollectionsKt___CollectionsKt.q3(this.f130717a);
    }

    protected abstract Tag Y(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    protected final Tag Z() {
        if (!(!this.f130717a.isEmpty())) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f130717a;
        return arrayList.remove(CollectionsKt__CollectionsKt.G(arrayList));
    }

    @Override // kotlinx.serialization.encoding.h, kotlinx.serialization.encoding.e
    @dl.d
    public kotlinx.serialization.modules.e a() {
        return SerializersModuleBuildersKt.a();
    }

    protected final void a0(Tag tag) {
        this.f130717a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public kotlinx.serialization.encoding.e b(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.e
    public final void c(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        if (!this.f130717a.isEmpty()) {
            Z();
        }
        V(descriptor);
    }

    @Override // kotlinx.serialization.encoding.h
    public <T> void d(@dl.d kotlinx.serialization.r<? super T> rVar, T t10) {
        kotlinx.serialization.encoding.h.a.d(this, rVar, t10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void e(byte b10) {
        I(Z(), b10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void f(@dl.d kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.f0.p(enumDescriptor, "enumDescriptor");
        L(Z(), enumDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public kotlinx.serialization.encoding.h g(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return N(Z(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void h(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        J(Y(descriptor, i10), c10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void i(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        I(Y(descriptor, i10), b10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void j(short s10) {
        S(Z(), s10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void k(boolean z10) {
        H(Z(), z10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void l(float f10) {
        M(Z(), f10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void m(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, int i11) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        O(Y(descriptor, i10), i11);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void n(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        H(Y(descriptor, i10), z10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void o(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d String value) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(value, "value");
        T(Y(descriptor, i10), value);
    }

    @Override // kotlinx.serialization.encoding.e
    @kotlinx.serialization.d
    public boolean p(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        return kotlinx.serialization.encoding.e.a.a(this, fVar, i10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void q(int i10) {
        O(Z(), i10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void r(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        S(Y(descriptor, i10), s10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void s(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        P(Y(descriptor, i10), j10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void t(@dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
        T(Z(), value);
    }

    @Override // kotlinx.serialization.encoding.e
    @dl.d
    public final kotlinx.serialization.encoding.h u(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return N(Y(descriptor, i10), descriptor.e(i10));
    }

    @Override // kotlinx.serialization.encoding.h
    public final void v(double d10) {
        K(Z(), d10);
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void w(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d kotlinx.serialization.r<? super T> serializer, @dl.e T t10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(serializer, "serializer");
        if (G(descriptor, i10)) {
            y(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public kotlinx.serialization.encoding.e x(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        return kotlinx.serialization.encoding.h.a.a(this, fVar, i10);
    }

    @Override // kotlinx.serialization.encoding.h
    @kotlinx.serialization.d
    public <T> void y(@dl.d kotlinx.serialization.r<? super T> rVar, @dl.e T t10) {
        kotlinx.serialization.encoding.h.a.c(this, rVar, t10);
    }

    @Override // kotlinx.serialization.encoding.h
    public final void z(long j10) {
        P(Z(), j10);
    }
}
