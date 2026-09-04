package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: ClassifierBasedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f128145a;

    private final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        return (kotlin.reflect.jvm.internal.impl.types.error.h.m(fVar) || kotlin.reflect.jvm.internal.impl.resolve.d.E(fVar)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f d();

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0) || obj.hashCode() != hashCode()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (z0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d();
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD2 = z0Var.d();
        if (fVarD2 != null && g(fVarD) && g(fVarD2)) {
            return h(fVarD2);
        }
        return false;
    }

    protected final boolean f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f first, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.f second) {
        kotlin.jvm.internal.f0.p(first, "first");
        kotlin.jvm.internal.f0.p(second, "second");
        if (!kotlin.jvm.internal.f0.g(first.getName(), second.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = first.c();
        for (kotlin.reflect.jvm.internal.impl.descriptors.k kVarC2 = second.c(); kVarC != null && kVarC2 != null; kVarC2 = kVarC2.c()) {
            if (kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d0) {
                return kVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d0;
            }
            if (kVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d0) {
                return false;
            }
            if (kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
                return (kVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) && kotlin.jvm.internal.f0.g(((kotlin.reflect.jvm.internal.impl.descriptors.g0) kVarC).e(), ((kotlin.reflect.jvm.internal.impl.descriptors.g0) kVarC2).e());
            }
            if ((kVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) || !kotlin.jvm.internal.f0.g(kVarC.getName(), kVarC2.getName())) {
                return false;
            }
            kVarC = kVarC.c();
        }
        return true;
    }

    protected abstract boolean h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar);

    public int hashCode() {
        int i10 = this.f128145a;
        if (i10 != 0) {
            return i10;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d();
        int iHashCode = g(fVarD) ? kotlin.reflect.jvm.internal.impl.resolve.d.m(fVarD).hashCode() : System.identityHashCode(this);
        this.f128145a = iHashCode;
        return iHashCode;
    }
}
