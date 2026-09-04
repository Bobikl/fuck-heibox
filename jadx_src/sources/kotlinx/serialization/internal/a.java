package kotlinx.serialization.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.f
public abstract class a<Element, Collection, Builder> implements kotlinx.serialization.g<Collection> {
    private a() {
    }

    public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static /* synthetic */ void n(a aVar, kotlinx.serialization.encoding.d dVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.m(dVar, i10, obj, z10);
    }

    private final int o(kotlinx.serialization.encoding.d dVar, Builder builder) {
        int iT = dVar.t(a());
        h(builder, iT);
        return iT;
    }

    @Override // kotlinx.serialization.r
    public abstract void b(@dl.d kotlinx.serialization.encoding.h hVar, Collection collection);

    @Override // kotlinx.serialization.c
    public Collection d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return k(decoder, null);
    }

    protected abstract Builder f();

    protected abstract int g(Builder builder);

    protected abstract void h(Builder builder, int i10);

    @dl.d
    protected abstract Iterator<Element> i(Collection collection);

    protected abstract int j(Collection collection);

    @kotlinx.serialization.f
    public final Collection k(@dl.d kotlinx.serialization.encoding.f decoder, @dl.e Collection collection) {
        Builder builderF;
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        if (collection == null || (builderF = p(collection)) == null) {
            builderF = f();
        }
        int iG = g(builderF);
        kotlinx.serialization.encoding.d dVarB = decoder.b(a());
        if (!dVarB.j()) {
            while (true) {
                int iU = dVarB.u(a());
                if (iU == -1) {
                    break;
                }
                n(this, dVarB, iG + iU, builderF, false, 8, null);
            }
        } else {
            l(dVarB, builderF, iG, o(dVarB, builderF));
        }
        dVarB.c(a());
        return q(builderF);
    }

    protected abstract void l(@dl.d kotlinx.serialization.encoding.d dVar, Builder builder, int i10, int i11);

    protected abstract void m(@dl.d kotlinx.serialization.encoding.d dVar, int i10, Builder builder, boolean z10);

    protected abstract Builder p(Collection collection);

    protected abstract Collection q(Builder builder);
}
