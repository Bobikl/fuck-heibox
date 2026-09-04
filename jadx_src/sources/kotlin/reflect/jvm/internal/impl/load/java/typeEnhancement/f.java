package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final NullabilityQualifier f126398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126399b;

    public f(@dl.d NullabilityQualifier qualifier, boolean z10) {
        f0.p(qualifier, "qualifier");
        this.f126398a = qualifier;
        this.f126399b = z10;
    }

    public /* synthetic */ f(NullabilityQualifier nullabilityQualifier, boolean z10, int i10, u uVar) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ f b(f fVar, NullabilityQualifier nullabilityQualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = fVar.f126398a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f126399b;
        }
        return fVar.a(nullabilityQualifier, z10);
    }

    @dl.d
    public final f a(@dl.d NullabilityQualifier qualifier, boolean z10) {
        f0.p(qualifier, "qualifier");
        return new f(qualifier, z10);
    }

    @dl.d
    public final NullabilityQualifier c() {
        return this.f126398a;
    }

    public final boolean d() {
        return this.f126399b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f126398a == fVar.f126398a && this.f126399b == fVar.f126399b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f126398a.hashCode() * 31;
        boolean z10 = this.f126399b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @dl.d
    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f126398a + ", isForWarningOnly=" + this.f126399b + ')';
    }
}
