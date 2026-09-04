package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.v0;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f127854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f127855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i f127856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final f f127857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f127858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final h0 f127859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final q f127860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final m f127861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final ki.c f127862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final n f127863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final Iterable<gi.b> f127864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final NotFoundClasses f127865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final g f127866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final gi.a f127867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final gi.c f127868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f127869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.j f127870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final pi.a f127871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final gi.e f127872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final List<v0> f127873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final ClassDeserializer f127874u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d d0 moduleDescriptor, @dl.d i configuration, @dl.d f classDataFinder, @dl.d a<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> annotationAndConstantLoader, @dl.d h0 packageFragmentProvider, @dl.d q localClassifierTypeSettings, @dl.d m errorReporter, @dl.d ki.c lookupTracker, @dl.d n flexibleTypeDeserializer, @dl.d Iterable<? extends gi.b> fictitiousClassDescriptorFactories, @dl.d NotFoundClasses notFoundClasses, @dl.d g contractDeserializer, @dl.d gi.a additionalClassPartsProvider, @dl.d gi.c platformDependentDeclarationFilter, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.f extensionRegistryLite, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.j kotlinTypeChecker, @dl.d pi.a samConversionResolver, @dl.d gi.e platformDependentTypeTransformer, @dl.d List<? extends v0> typeAttributeTranslators) {
        f0.p(storageManager, "storageManager");
        f0.p(moduleDescriptor, "moduleDescriptor");
        f0.p(configuration, "configuration");
        f0.p(classDataFinder, "classDataFinder");
        f0.p(annotationAndConstantLoader, "annotationAndConstantLoader");
        f0.p(packageFragmentProvider, "packageFragmentProvider");
        f0.p(localClassifierTypeSettings, "localClassifierTypeSettings");
        f0.p(errorReporter, "errorReporter");
        f0.p(lookupTracker, "lookupTracker");
        f0.p(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        f0.p(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(contractDeserializer, "contractDeserializer");
        f0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        f0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        f0.p(extensionRegistryLite, "extensionRegistryLite");
        f0.p(kotlinTypeChecker, "kotlinTypeChecker");
        f0.p(samConversionResolver, "samConversionResolver");
        f0.p(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        f0.p(typeAttributeTranslators, "typeAttributeTranslators");
        this.f127854a = storageManager;
        this.f127855b = moduleDescriptor;
        this.f127856c = configuration;
        this.f127857d = classDataFinder;
        this.f127858e = annotationAndConstantLoader;
        this.f127859f = packageFragmentProvider;
        this.f127860g = localClassifierTypeSettings;
        this.f127861h = errorReporter;
        this.f127862i = lookupTracker;
        this.f127863j = flexibleTypeDeserializer;
        this.f127864k = fictitiousClassDescriptorFactories;
        this.f127865l = notFoundClasses;
        this.f127866m = contractDeserializer;
        this.f127867n = additionalClassPartsProvider;
        this.f127868o = platformDependentDeclarationFilter;
        this.f127869p = extensionRegistryLite;
        this.f127870q = kotlinTypeChecker;
        this.f127871r = samConversionResolver;
        this.f127872s = platformDependentTypeTransformer;
        this.f127873t = typeAttributeTranslators;
        this.f127874u = new ClassDeserializer(this);
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.storage.m mVar, d0 d0Var, i iVar, f fVar, a aVar, h0 h0Var, q qVar, m mVar2, ki.c cVar, n nVar, Iterable iterable, NotFoundClasses notFoundClasses, g gVar, gi.a aVar2, gi.c cVar2, kotlin.reflect.jvm.internal.impl.protobuf.f fVar2, kotlin.reflect.jvm.internal.impl.types.checker.j jVar, pi.a aVar3, gi.e eVar, List list, int i10, kotlin.jvm.internal.u uVar) {
        this(mVar, d0Var, iVar, fVar, aVar, h0Var, qVar, mVar2, cVar, nVar, iterable, notFoundClasses, gVar, (i10 & 8192) != 0 ? gi.a.C1078a.f119063a : aVar2, (i10 & 16384) != 0 ? gi.c.a.f119064a : cVar2, fVar2, (65536 & i10) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.j.f128080b.a() : jVar, aVar3, (262144 & i10) != 0 ? gi.e.a.f119067a : eVar, (i10 & 524288) != 0 ? kotlin.collections.s.k(kotlin.reflect.jvm.internal.impl.types.m.f128152a) : list);
    }

    @dl.d
    public final j a(@dl.d g0 descriptor, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar) {
        f0.p(descriptor, "descriptor");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        f0.p(versionRequirementTable, "versionRequirementTable");
        f0.p(metadataVersion, "metadataVersion");
        return new j(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, eVar, null, CollectionsKt__CollectionsKt.E());
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        return ClassDeserializer.e(this.f127874u, classId, null, 2, null);
    }

    @dl.d
    public final gi.a c() {
        return this.f127867n;
    }

    @dl.d
    public final a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d() {
        return this.f127858e;
    }

    @dl.d
    public final f e() {
        return this.f127857d;
    }

    @dl.d
    public final ClassDeserializer f() {
        return this.f127874u;
    }

    @dl.d
    public final i g() {
        return this.f127856c;
    }

    @dl.d
    public final g h() {
        return this.f127866m;
    }

    @dl.d
    public final m i() {
        return this.f127861h;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.protobuf.f j() {
        return this.f127869p;
    }

    @dl.d
    public final Iterable<gi.b> k() {
        return this.f127864k;
    }

    @dl.d
    public final n l() {
        return this.f127863j;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.types.checker.j m() {
        return this.f127870q;
    }

    @dl.d
    public final q n() {
        return this.f127860g;
    }

    @dl.d
    public final ki.c o() {
        return this.f127862i;
    }

    @dl.d
    public final d0 p() {
        return this.f127855b;
    }

    @dl.d
    public final NotFoundClasses q() {
        return this.f127865l;
    }

    @dl.d
    public final h0 r() {
        return this.f127859f;
    }

    @dl.d
    public final gi.c s() {
        return this.f127868o;
    }

    @dl.d
    public final gi.e t() {
        return this.f127872s;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.storage.m u() {
        return this.f127854a;
    }

    @dl.d
    public final List<v0> v() {
        return this.f127873t;
    }
}
