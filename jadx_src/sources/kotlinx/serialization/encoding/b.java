package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.j1;
import kotlinx.serialization.r;

/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.d
public abstract class b implements h, e {
    @Override // kotlinx.serialization.encoding.h
    public void A() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.e
    public final void B(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, float f10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            l(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.h
    public void C(char c10) {
        H(Character.valueOf(c10));
    }

    @Override // kotlinx.serialization.encoding.h
    @kotlinx.serialization.d
    public void D() {
        h.a.b(this);
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void E(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d r<? super T> serializer, T t10) {
        f0.p(descriptor, "descriptor");
        f0.p(serializer, "serializer");
        if (G(descriptor, i10)) {
            d(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void F(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, double d10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            v(d10);
        }
    }

    public boolean G(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return true;
    }

    public void H(@dl.d Object value) {
        f0.p(value, "value");
        throw new SerializationException("Non-serializable " + n0.d(value.getClass()) + " is not supported by " + n0.d(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public e b(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.e
    public void c(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.h
    public <T> void d(@dl.d r<? super T> rVar, T t10) {
        h.a.d(this, rVar, t10);
    }

    @Override // kotlinx.serialization.encoding.h
    public void e(byte b10) {
        H(Byte.valueOf(b10));
    }

    @Override // kotlinx.serialization.encoding.h
    public void f(@dl.d kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        f0.p(enumDescriptor, "enumDescriptor");
        H(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public h g(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.e
    public final void h(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, char c10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            C(c10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void i(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, byte b10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            e(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.h
    public void j(short s10) {
        H(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.h
    public void k(boolean z10) {
        H(Boolean.valueOf(z10));
    }

    @Override // kotlinx.serialization.encoding.h
    public void l(float f10) {
        H(Float.valueOf(f10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void m(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, int i11) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            q(i11);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void n(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, boolean z10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            k(z10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void o(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d String value) {
        f0.p(descriptor, "descriptor");
        f0.p(value, "value");
        if (G(descriptor, i10)) {
            t(value);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    @kotlinx.serialization.d
    public boolean p(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        return e.a.a(this, fVar, i10);
    }

    @Override // kotlinx.serialization.encoding.h
    public void q(int i10) {
        H(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void r(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, short s10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            j(s10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public final void s(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, long j10) {
        f0.p(descriptor, "descriptor");
        if (G(descriptor, i10)) {
            z(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.h
    public void t(@dl.d String value) {
        f0.p(value, "value");
        H(value);
    }

    @Override // kotlinx.serialization.encoding.e
    @dl.d
    public final h u(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        return G(descriptor, i10) ? g(descriptor.e(i10)) : j1.f130711a;
    }

    @Override // kotlinx.serialization.encoding.h
    public void v(double d10) {
        H(Double.valueOf(d10));
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void w(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d r<? super T> serializer, @dl.e T t10) {
        f0.p(descriptor, "descriptor");
        f0.p(serializer, "serializer");
        if (G(descriptor, i10)) {
            y(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.h
    @dl.d
    public e x(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        return h.a.a(this, fVar, i10);
    }

    @Override // kotlinx.serialization.encoding.h
    @kotlinx.serialization.d
    public <T> void y(@dl.d r<? super T> rVar, @dl.e T t10) {
        h.a.c(this, rVar, t10);
    }

    @Override // kotlinx.serialization.encoding.h
    public void z(long j10) {
        H(Long.valueOf(j10));
    }
}
