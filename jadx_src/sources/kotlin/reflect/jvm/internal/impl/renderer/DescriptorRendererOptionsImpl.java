package kotlin.reflect.jvm.internal.impl.renderer;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.d1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.properties.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.n;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: DescriptorRendererOptionsImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl implements b {
    static final /* synthetic */ n<Object>[] X = {n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), com.tekartik.sqflite.b.K, "getDebugMode()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), n0.k(new MutablePropertyReference1Impl(n0.d(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    @dl.d
    private final f A;

    @dl.d
    private final f B;

    @dl.d
    private final f C;

    @dl.d
    private final f D;

    @dl.d
    private final f E;

    @dl.d
    private final f F;

    @dl.d
    private final f G;

    @dl.d
    private final f H;

    @dl.d
    private final f I;

    @dl.d
    private final f J;

    @dl.d
    private final f K;

    @dl.d
    private final f L;

    @dl.d
    private final f M;

    @dl.d
    private final f N;

    @dl.d
    private final f O;

    @dl.d
    private final f P;

    @dl.d
    private final f Q;

    @dl.d
    private final f R;

    @dl.d
    private final f S;

    @dl.d
    private final f T;

    @dl.d
    private final f U;

    @dl.d
    private final f V;

    @dl.d
    private final f W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f127447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final f f127448b = o0(kotlin.reflect.jvm.internal.impl.renderer.a.c.f127478a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f f127449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final f f127450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final f f127451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final f f127452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final f f127453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final f f127454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final f f127455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final f f127456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final f f127457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final f f127458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final f f127459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final f f127460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final f f127461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final f f127462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final f f127463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final f f127464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final f f127465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final f f127466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final f f127467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final f f127468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final f f127469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final f f127470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final f f127471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final f f127472z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Delegates.kt */
    public static final class a<T> extends kotlin.properties.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DescriptorRendererOptionsImpl f127473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
            super(obj);
            this.f127473b = descriptorRendererOptionsImpl;
        }

        @Override // kotlin.properties.c
        protected boolean d(@dl.d n<?> property, T t10, T t11) {
            f0.p(property, "property");
            if (this.f127473b.m0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f127449c = o0(bool);
        this.f127450d = o0(bool);
        this.f127451e = o0(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f127452f = o0(bool2);
        this.f127453g = o0(bool2);
        this.f127454h = o0(bool2);
        this.f127455i = o0(bool2);
        this.f127456j = o0(bool2);
        this.f127457k = o0(bool);
        this.f127458l = o0(bool2);
        this.f127459m = o0(bool2);
        this.f127460n = o0(bool2);
        this.f127461o = o0(bool);
        this.f127462p = o0(bool);
        this.f127463q = o0(bool2);
        this.f127464r = o0(bool2);
        this.f127465s = o0(bool2);
        this.f127466t = o0(bool2);
        this.f127467u = o0(bool2);
        this.f127468v = o0(bool2);
        this.f127469w = o0(bool2);
        this.f127470x = o0(new l<d0, d0>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$typeNormalizer$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(@dl.d d0 it) {
                f0.p(it, "it");
                return it;
            }
        });
        this.f127471y = o0(new l<b1, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d b1 it) {
                f0.p(it, "it");
                return "...";
            }
        });
        this.f127472z = o0(bool);
        this.A = o0(OverrideRenderingPolicy.RENDER_OPEN);
        this.B = o0(DescriptorRenderer.b.a.f127433a);
        this.C = o0(RenderingFormat.PLAIN);
        this.D = o0(ParameterNameRenderingPolicy.ALL);
        this.E = o0(bool2);
        this.F = o0(bool2);
        this.G = o0(PropertyAccessorRenderingPolicy.DEBUG);
        this.H = o0(bool2);
        this.I = o0(bool2);
        this.J = o0(d1.k());
        this.K = o0(c.f127479a.a());
        this.L = o0(null);
        this.M = o0(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.N = o0(bool2);
        this.O = o0(bool);
        this.P = o0(bool);
        this.Q = o0(bool2);
        this.R = o0(bool);
        this.S = o0(bool);
        this.T = o0(bool2);
        this.U = o0(bool2);
        this.V = o0(bool2);
        this.W = o0(bool);
    }

    private final <T> f<DescriptorRendererOptionsImpl, T> o0(T t10) {
        kotlin.properties.a aVar = kotlin.properties.a.f125017a;
        return new a(t10, this);
    }

    public boolean A() {
        return ((Boolean) this.I.a(this, X[33])).booleanValue();
    }

    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> B() {
        return (Set) this.J.a(this, X[34]);
    }

    public boolean C() {
        return ((Boolean) this.R.a(this, X[42])).booleanValue();
    }

    public boolean D() {
        return b.a.a(this);
    }

    public boolean E() {
        return b.a.b(this);
    }

    public boolean F() {
        return ((Boolean) this.f127467u.a(this, X[19])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.W.a(this, X[47])).booleanValue();
    }

    @dl.d
    public Set<DescriptorRendererModifier> H() {
        return (Set) this.f127451e.a(this, X[3]);
    }

    public boolean I() {
        return ((Boolean) this.f127460n.a(this, X[12])).booleanValue();
    }

    @dl.d
    public OverrideRenderingPolicy J() {
        return (OverrideRenderingPolicy) this.A.a(this, X[25]);
    }

    @dl.d
    public ParameterNameRenderingPolicy K() {
        return (ParameterNameRenderingPolicy) this.D.a(this, X[28]);
    }

    public boolean L() {
        return ((Boolean) this.S.a(this, X[43])).booleanValue();
    }

    public boolean M() {
        return ((Boolean) this.U.a(this, X[45])).booleanValue();
    }

    @dl.d
    public PropertyAccessorRenderingPolicy N() {
        return (PropertyAccessorRenderingPolicy) this.G.a(this, X[31]);
    }

    public boolean O() {
        return ((Boolean) this.E.a(this, X[29])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.F.a(this, X[30])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.f127463q.a(this, X[15])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.O.a(this, X[39])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.H.a(this, X[32])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f127462p.a(this, X[14])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f127461o.a(this, X[13])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f127464r.a(this, X[16])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.Q.a(this, X[41])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.P.a(this, X[40])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f127472z.a(this, X[24])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f127453g.a(this, X[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void a(@dl.d ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        f0.p(parameterNameRenderingPolicy, "<set-?>");
        this.D.b(this, X[28], parameterNameRenderingPolicy);
    }

    public boolean a0() {
        return ((Boolean) this.f127452f.a(this, X[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public boolean b() {
        return ((Boolean) this.f127459m.a(this, X[11])).booleanValue();
    }

    @dl.d
    public RenderingFormat b0() {
        return (RenderingFormat) this.C.a(this, X[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
        return (Set) this.K.a(this, X[35]);
    }

    @dl.d
    public l<d0, d0> c0() {
        return (l) this.f127470x.a(this, X[22]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public boolean d() {
        return ((Boolean) this.f127454h.a(this, X[6])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f127466t.a(this, X[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    @dl.d
    public AnnotationArgumentsRenderingPolicy e() {
        return (AnnotationArgumentsRenderingPolicy) this.M.a(this, X[37]);
    }

    public boolean e0() {
        return ((Boolean) this.f127457k.a(this, X[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void f(@dl.d Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        f0.p(set, "<set-?>");
        this.K.b(this, X[35], set);
    }

    @dl.d
    public DescriptorRenderer.b f0() {
        return (DescriptorRenderer.b) this.B.a(this, X[26]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void g(@dl.d Set<? extends DescriptorRendererModifier> set) {
        f0.p(set, "<set-?>");
        this.f127451e.b(this, X[3], set);
    }

    public boolean g0() {
        return ((Boolean) this.f127456j.a(this, X[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void h(boolean z10) {
        this.f127456j.b(this, X[8], Boolean.valueOf(z10));
    }

    public boolean h0() {
        return ((Boolean) this.f127449c.a(this, X[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void i(boolean z10) {
        this.f127454h.b(this, X[6], Boolean.valueOf(z10));
    }

    public boolean i0() {
        return ((Boolean) this.f127450d.a(this, X[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void j(boolean z10) {
        this.f127468v.b(this, X[20], Boolean.valueOf(z10));
    }

    public boolean j0() {
        return ((Boolean) this.f127458l.a(this, X[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void k(boolean z10) {
        this.f127452f.b(this, X[4], Boolean.valueOf(z10));
    }

    public boolean k0() {
        return ((Boolean) this.f127469w.a(this, X[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void l(boolean z10) {
        this.f127449c.b(this, X[1], Boolean.valueOf(z10));
    }

    public boolean l0() {
        return ((Boolean) this.f127468v.a(this, X[20])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void m(boolean z10) {
        this.f127469w.b(this, X[21], Boolean.valueOf(z10));
    }

    public final boolean m0() {
        return this.f127447a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void n(boolean z10) {
        this.E.b(this, X[29], Boolean.valueOf(z10));
    }

    public final void n0() {
        this.f127447a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void o(@dl.d RenderingFormat renderingFormat) {
        f0.p(renderingFormat, "<set-?>");
        this.C.b(this, X[27], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void p(@dl.d AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        f0.p(annotationArgumentsRenderingPolicy, "<set-?>");
        this.M.b(this, X[37], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void q(@dl.d kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        f0.p(aVar, "<set-?>");
        this.f127448b.b(this, X[0], aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void r(boolean z10) {
        this.F.b(this, X[30], Boolean.valueOf(z10));
    }

    @dl.d
    public final DescriptorRendererOptionsImpl s() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        f0.o(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                kotlin.properties.c cVar = obj instanceof kotlin.properties.c ? (kotlin.properties.c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    f0.o(name, "field.name");
                    u.v2(name, ak.f104422ae, false, 2, null);
                    kotlin.reflect.d dVarD = n0.d(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    f0.o(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.o0(cVar.a(this, new PropertyReference1Impl(dVarD, name2, sb2.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean t() {
        return ((Boolean) this.f127465s.a(this, X[17])).booleanValue();
    }

    public boolean u() {
        return ((Boolean) this.N.a(this, X[38])).booleanValue();
    }

    @dl.e
    public l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> v() {
        return (l) this.L.a(this, X[36]);
    }

    public boolean w() {
        return ((Boolean) this.V.a(this, X[46])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f127455i.a(this, X[7])).booleanValue();
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.renderer.a y() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a) this.f127448b.a(this, X[0]);
    }

    @dl.e
    public l<b1, String> z() {
        return (l) this.f127471y.a(this, X[23]);
    }
}
