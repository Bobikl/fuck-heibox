package kotlinx.serialization.internal;

import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: NoOpEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j1 extends kotlinx.serialization.encoding.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j1 f130711a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.modules.e f130712b = SerializersModuleBuildersKt.a();

    private j1() {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void A() {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void C(char c10) {
    }

    @Override // kotlinx.serialization.encoding.b
    public void H(@dl.d Object value) {
        kotlin.jvm.internal.f0.p(value, "value");
    }

    @Override // kotlinx.serialization.encoding.h, kotlinx.serialization.encoding.e
    @dl.d
    public kotlinx.serialization.modules.e a() {
        return f130712b;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void e(byte b10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void f(@dl.d kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.f0.p(enumDescriptor, "enumDescriptor");
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void j(short s10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void k(boolean z10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void l(float f10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void q(int i10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void t(@dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void v(double d10) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void z(long j10) {
    }
}
