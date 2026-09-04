package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.j;
import kotlin.reflect.jvm.internal.impl.load.java.k;
import kotlin.reflect.jvm.internal.impl.load.java.o;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m f126082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j f126083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.m f126084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final DeserializedDescriptorResolver f126085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.components.e f126086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f126087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.components.d f126088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.components.c f126089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final pi.a f126090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final li.b f126091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final e f126092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final u f126093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final w0 f126094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final ki.c f126095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final d0 f126096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final ReflectionTypes f126097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.b f126098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final SignatureEnhancement f126099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final k f126100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final b f126101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.j f126102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final JavaTypeEnhancementState f126103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final o f126104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.e f126105x;

    public a(@dl.d m storageManager, @dl.d j finder, @dl.d kotlin.reflect.jvm.internal.impl.load.kotlin.m kotlinClassFinder, @dl.d DeserializedDescriptorResolver deserializedDescriptorResolver, @dl.d kotlin.reflect.jvm.internal.impl.load.java.components.e signaturePropagator, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m errorReporter, @dl.d kotlin.reflect.jvm.internal.impl.load.java.components.d javaResolverCache, @dl.d kotlin.reflect.jvm.internal.impl.load.java.components.c javaPropertyInitializerEvaluator, @dl.d pi.a samConversionResolver, @dl.d li.b sourceElementFactory, @dl.d e moduleClassResolver, @dl.d u packagePartProvider, @dl.d w0 supertypeLoopChecker, @dl.d ki.c lookupTracker, @dl.d d0 module, @dl.d ReflectionTypes reflectionTypes, @dl.d kotlin.reflect.jvm.internal.impl.load.java.b annotationTypeQualifierResolver, @dl.d SignatureEnhancement signatureEnhancement, @dl.d k javaClassesTracker, @dl.d b settings, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.j kotlinTypeChecker, @dl.d JavaTypeEnhancementState javaTypeEnhancementState, @dl.d o javaModuleResolver, @dl.d kotlin.reflect.jvm.internal.impl.resolve.jvm.e syntheticPartsProvider) {
        f0.p(storageManager, "storageManager");
        f0.p(finder, "finder");
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        f0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        f0.p(signaturePropagator, "signaturePropagator");
        f0.p(errorReporter, "errorReporter");
        f0.p(javaResolverCache, "javaResolverCache");
        f0.p(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        f0.p(samConversionResolver, "samConversionResolver");
        f0.p(sourceElementFactory, "sourceElementFactory");
        f0.p(moduleClassResolver, "moduleClassResolver");
        f0.p(packagePartProvider, "packagePartProvider");
        f0.p(supertypeLoopChecker, "supertypeLoopChecker");
        f0.p(lookupTracker, "lookupTracker");
        f0.p(module, "module");
        f0.p(reflectionTypes, "reflectionTypes");
        f0.p(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        f0.p(signatureEnhancement, "signatureEnhancement");
        f0.p(javaClassesTracker, "javaClassesTracker");
        f0.p(settings, "settings");
        f0.p(kotlinTypeChecker, "kotlinTypeChecker");
        f0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
        f0.p(javaModuleResolver, "javaModuleResolver");
        f0.p(syntheticPartsProvider, "syntheticPartsProvider");
        this.f126082a = storageManager;
        this.f126083b = finder;
        this.f126084c = kotlinClassFinder;
        this.f126085d = deserializedDescriptorResolver;
        this.f126086e = signaturePropagator;
        this.f126087f = errorReporter;
        this.f126088g = javaResolverCache;
        this.f126089h = javaPropertyInitializerEvaluator;
        this.f126090i = samConversionResolver;
        this.f126091j = sourceElementFactory;
        this.f126092k = moduleClassResolver;
        this.f126093l = packagePartProvider;
        this.f126094m = supertypeLoopChecker;
        this.f126095n = lookupTracker;
        this.f126096o = module;
        this.f126097p = reflectionTypes;
        this.f126098q = annotationTypeQualifierResolver;
        this.f126099r = signatureEnhancement;
        this.f126100s = javaClassesTracker;
        this.f126101t = settings;
        this.f126102u = kotlinTypeChecker;
        this.f126103v = javaTypeEnhancementState;
        this.f126104w = javaModuleResolver;
        this.f126105x = syntheticPartsProvider;
    }

    public /* synthetic */ a(m mVar, j jVar, kotlin.reflect.jvm.internal.impl.load.kotlin.m mVar2, DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.load.java.components.e eVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.m mVar3, kotlin.reflect.jvm.internal.impl.load.java.components.d dVar, kotlin.reflect.jvm.internal.impl.load.java.components.c cVar, pi.a aVar, li.b bVar, e eVar2, u uVar, w0 w0Var, ki.c cVar2, d0 d0Var, ReflectionTypes reflectionTypes, kotlin.reflect.jvm.internal.impl.load.java.b bVar2, SignatureEnhancement signatureEnhancement, k kVar, b bVar3, kotlin.reflect.jvm.internal.impl.types.checker.j jVar2, JavaTypeEnhancementState javaTypeEnhancementState, o oVar, kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar3, int i10, kotlin.jvm.internal.u uVar2) {
        this(mVar, jVar, mVar2, deserializedDescriptorResolver, eVar, mVar3, dVar, cVar, aVar, bVar, eVar2, uVar, w0Var, cVar2, d0Var, reflectionTypes, bVar2, signatureEnhancement, kVar, bVar3, jVar2, javaTypeEnhancementState, oVar, (i10 & 8388608) != 0 ? kotlin.reflect.jvm.internal.impl.resolve.jvm.e.f127571a.a() : eVar3);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.b a() {
        return this.f126098q;
    }

    @dl.d
    public final DeserializedDescriptorResolver b() {
        return this.f126085d;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m c() {
        return this.f126087f;
    }

    @dl.d
    public final j d() {
        return this.f126083b;
    }

    @dl.d
    public final k e() {
        return this.f126100s;
    }

    @dl.d
    public final o f() {
        return this.f126104w;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.components.c g() {
        return this.f126089h;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.components.d h() {
        return this.f126088g;
    }

    @dl.d
    public final JavaTypeEnhancementState i() {
        return this.f126103v;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.m j() {
        return this.f126084c;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.types.checker.j k() {
        return this.f126102u;
    }

    @dl.d
    public final ki.c l() {
        return this.f126095n;
    }

    @dl.d
    public final d0 m() {
        return this.f126096o;
    }

    @dl.d
    public final e n() {
        return this.f126092k;
    }

    @dl.d
    public final u o() {
        return this.f126093l;
    }

    @dl.d
    public final ReflectionTypes p() {
        return this.f126097p;
    }

    @dl.d
    public final b q() {
        return this.f126101t;
    }

    @dl.d
    public final SignatureEnhancement r() {
        return this.f126099r;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.components.e s() {
        return this.f126086e;
    }

    @dl.d
    public final li.b t() {
        return this.f126091j;
    }

    @dl.d
    public final m u() {
        return this.f126082a;
    }

    @dl.d
    public final w0 v() {
        return this.f126094m;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.e w() {
        return this.f126105x;
    }

    @dl.d
    public final a x(@dl.d kotlin.reflect.jvm.internal.impl.load.java.components.d javaResolverCache) {
        f0.p(javaResolverCache, "javaResolverCache");
        return new a(this.f126082a, this.f126083b, this.f126084c, this.f126085d, this.f126086e, this.f126087f, javaResolverCache, this.f126089h, this.f126090i, this.f126091j, this.f126092k, this.f126093l, this.f126094m, this.f126095n, this.f126096o, this.f126097p, this.f126098q, this.f126099r, this.f126100s, this.f126101t, this.f126102u, this.f126103v, this.f126104w, null, 8388608, null);
    }
}
