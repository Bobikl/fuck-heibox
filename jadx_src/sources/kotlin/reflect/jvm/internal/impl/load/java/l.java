package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f126060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Collection<AnnotationQualifierApplicabilityType> f126061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126062c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@dl.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f nullabilityQualifier, @dl.d Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        f0.p(nullabilityQualifier, "nullabilityQualifier");
        f0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f126060a = nullabilityQualifier;
        this.f126061b = qualifierApplicabilityTypes;
        this.f126062c = z10;
    }

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar, Collection collection, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(fVar, collection, (i10 & 4) != 0 ? fVar.c() == NullabilityQualifier.NOT_NULL : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l b(l lVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = lVar.f126060a;
        }
        if ((i10 & 2) != 0) {
            collection = lVar.f126061b;
        }
        if ((i10 & 4) != 0) {
            z10 = lVar.f126062c;
        }
        return lVar.a(fVar, collection, z10);
    }

    @dl.d
    public final l a(@dl.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f nullabilityQualifier, @dl.d Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        f0.p(nullabilityQualifier, "nullabilityQualifier");
        f0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new l(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f126062c;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f d() {
        return this.f126060a;
    }

    @dl.d
    public final Collection<AnnotationQualifierApplicabilityType> e() {
        return this.f126061b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f0.g(this.f126060a, lVar.f126060a) && f0.g(this.f126061b, lVar.f126061b) && this.f126062c == lVar.f126062c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.f126060a.hashCode() * 31) + this.f126061b.hashCode()) * 31;
        boolean z10 = this.f126062c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @dl.d
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f126060a + ", qualifierApplicabilityTypes=" + this.f126061b + ", definitelyNotNull=" + this.f126062c + ')';
    }
}
