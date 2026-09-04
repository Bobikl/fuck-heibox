package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import yh.l;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DescriptorRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f127411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final DescriptorRenderer f127421k;

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public final /* synthetic */ class C1172a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127432a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f127432a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a(@dl.d g classifier) {
            f0.p(classifier, "classifier");
            if (classifier instanceof x0) {
                return "typealias";
            }
            if (!(classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) classifier;
            if (dVar.r0()) {
                return "companion object";
            }
            switch (C1172a.f127432a[dVar.b().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @dl.d
        public final DescriptorRenderer b(@dl.d l<? super kotlin.reflect.jvm.internal.impl.renderer.b, b2> changeOptions) {
            f0.p(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.n0();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public interface b {

        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final a f127433a = new a();

            private a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public void a(int i10, @dl.d StringBuilder builder) {
                f0.p(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public void b(int i10, @dl.d StringBuilder builder) {
                f0.p(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public void c(@dl.d b1 parameter, int i10, int i11, @dl.d StringBuilder builder) {
                f0.p(parameter, "parameter");
                f0.p(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public void d(@dl.d b1 parameter, int i10, int i11, @dl.d StringBuilder builder) {
                f0.p(parameter, "parameter");
                f0.p(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }
        }

        void a(int i10, @dl.d StringBuilder sb2);

        void b(int i10, @dl.d StringBuilder sb2);

        void c(@dl.d b1 b1Var, int i10, int i11, @dl.d StringBuilder sb2);

        void d(@dl.d b1 b1Var, int i10, int i11, @dl.d StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f127411a = aVar;
        f127412b = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.l(false);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127413c = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.l(false);
                withOptions.g(d1.k());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127414d = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.l(false);
                withOptions.g(d1.k());
                withOptions.m(true);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127415e = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.g(d1.k());
                withOptions.q(a.b.f127477a);
                withOptions.a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127416f = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.l(false);
                withOptions.g(d1.k());
                withOptions.q(a.b.f127477a);
                withOptions.j(true);
                withOptions.a(ParameterNameRenderingPolicy.NONE);
                withOptions.n(true);
                withOptions.r(true);
                withOptions.m(true);
                withOptions.k(true);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127417g = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.g(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127418h = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.g(DescriptorRendererModifier.ALL);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127419i = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.q(a.b.f127477a);
                withOptions.a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127420j = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.i(true);
                withOptions.q(a.C1174a.f127476a);
                withOptions.g(DescriptorRendererModifier.ALL);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
        f127421k = aVar.b(new l<kotlin.reflect.jvm.internal.impl.renderer.b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            public final void a(@dl.d b withOptions) {
                f0.p(withOptions, "$this$withOptions");
                withOptions.o(RenderingFormat.HTML);
                withOptions.g(DescriptorRendererModifier.ALL);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                a(bVar);
                return b2.f124493a;
            }
        });
    }

    public static /* synthetic */ String u(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.t(cVar, annotationUseSiteTarget);
    }

    @dl.d
    public final DescriptorRenderer A(@dl.d l<? super kotlin.reflect.jvm.internal.impl.renderer.b, b2> changeOptions) {
        f0.p(changeOptions, "changeOptions");
        f0.n(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplS = ((DescriptorRendererImpl) this).i0().s();
        changeOptions.invoke(descriptorRendererOptionsImplS);
        descriptorRendererOptionsImplS.n0();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplS);
    }

    @dl.d
    public abstract String s(@dl.d k kVar);

    @dl.d
    public abstract String t(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @dl.e AnnotationUseSiteTarget annotationUseSiteTarget);

    @dl.d
    public abstract String v(@dl.d String str, @dl.d String str2, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g gVar);

    @dl.d
    public abstract String w(@dl.d kotlin.reflect.jvm.internal.impl.name.d dVar);

    @dl.d
    public abstract String x(@dl.d f fVar, boolean z10);

    @dl.d
    public abstract String y(@dl.d d0 d0Var);

    @dl.d
    public abstract String z(@dl.d c1 c1Var);
}
