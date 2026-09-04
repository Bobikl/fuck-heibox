package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.o;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import si.n;
import si.r;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends AbstractSignatureParts<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f126409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final AnnotationQualifierApplicabilityType f126412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f126413e;

    public i(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d containerContext, @dl.d AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z11) {
        f0.p(containerContext, "containerContext");
        f0.p(containerApplicabilityType, "containerApplicabilityType");
        this.f126409a = aVar;
        this.f126410b = z10;
        this.f126411c = containerContext;
        this.f126412d = containerApplicabilityType;
        this.f126413e = z11;
    }

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z11, int i10, u uVar) {
        this(aVar, z10, dVar, annotationQualifierApplicabilityType, (i10 & 16) != 0 ? false : z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean A(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        return ((d0) gVar).R0() instanceof e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.b h() {
        return this.f126411c.a().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public d0 p(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        return k1.a((d0) gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean r(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        f0.p(cVar, "<this>");
        return ((cVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) && ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) cVar).g()) || ((cVar instanceof LazyJavaAnnotationDescriptor) && !o() && (((LazyJavaAnnotationDescriptor) cVar).l() || l() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.d
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public r v() {
        return o.f128088a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.d
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        return ((d0) gVar).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.d
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f126409a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? CollectionsKt__CollectionsKt.E() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.d
    public AnnotationQualifierApplicabilityType l() {
        return this.f126412d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.e
    public kotlin.reflect.jvm.internal.impl.load.java.r m() {
        return this.f126411c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean n() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f126409a;
        return (aVar instanceof b1) && ((b1) aVar).F0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean o() {
        return this.f126411c.a().q().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.d s(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = i1.f((d0) gVar);
        if (dVarF != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.d.m(dVarF);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean u() {
        return this.f126413e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean w(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        return kotlin.reflect.jvm.internal.impl.builtins.g.e0((d0) gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean x() {
        return this.f126410b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean y(@dl.d si.g gVar, @dl.d si.g other) {
        f0.p(gVar, "<this>");
        f0.p(other, "other");
        return this.f126411c.a().k().a((d0) gVar, (d0) other);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean z(@dl.d n nVar) {
        f0.p(nVar, "<this>");
        return nVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e;
    }
}
