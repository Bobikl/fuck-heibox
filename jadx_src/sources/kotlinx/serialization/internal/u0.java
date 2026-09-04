package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
@kotlin.r0
public abstract class u0<K, V, R> implements kotlinx.serialization.g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<K> f130767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<V> f130768b;

    private u0(kotlinx.serialization.g<K> gVar, kotlinx.serialization.g<V> gVar2) {
        this.f130767a = gVar;
        this.f130768b = gVar2;
    }

    public /* synthetic */ u0(kotlinx.serialization.g gVar, kotlinx.serialization.g gVar2, kotlin.jvm.internal.u uVar) {
        this(gVar, gVar2);
    }

    @Override // kotlinx.serialization.r
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, R r10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlinx.serialization.encoding.e eVarB = encoder.b(a());
        eVarB.E(a(), 0, this.f130767a, f(r10));
        eVarB.E(a(), 1, this.f130768b, h(r10));
        eVarB.c(a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.c
    public R d(@dl.d kotlinx.serialization.encoding.f decoder) {
        R r10;
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlinx.serialization.descriptors.f fVarA = a();
        kotlinx.serialization.encoding.d dVarB = decoder.b(fVarA);
        if (dVarB.j()) {
            r10 = (R) j(kotlinx.serialization.encoding.d.b.d(dVarB, a(), 0, g(), null, 8, null), kotlinx.serialization.encoding.d.b.d(dVarB, a(), 1, i(), null, 8, null));
        } else {
            Object objD = l2.f130723a;
            Object objD2 = l2.f130723a;
            while (true) {
                int iU = dVarB.u(a());
                if (iU == -1) {
                    if (objD == l2.f130723a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objD2 == l2.f130723a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r10 = (R) j(objD, objD2);
                    break;
                }
                if (iU == 0) {
                    objD = kotlinx.serialization.encoding.d.b.d(dVarB, a(), 0, g(), null, 8, null);
                } else {
                    if (iU != 1) {
                        throw new SerializationException("Invalid index: " + iU);
                    }
                    objD2 = kotlinx.serialization.encoding.d.b.d(dVarB, a(), 1, i(), null, 8, null);
                }
            }
        }
        dVarB.c(fVarA);
        return r10;
    }

    protected abstract K f(R r10);

    @dl.d
    protected final kotlinx.serialization.g<K> g() {
        return this.f130767a;
    }

    protected abstract V h(R r10);

    @dl.d
    protected final kotlinx.serialization.g<V> i() {
        return this.f130768b;
    }

    protected abstract R j(K k10, V v10);
}
