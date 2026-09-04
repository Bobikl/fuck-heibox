package kotlin.reflect.jvm.internal.impl.renderer;

import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.o;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.error.g;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.m1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.u;
import kotlin.text.y;
import kotlin.z;
import yh.l;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements kotlin.reflect.jvm.internal.impl.renderer.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final DescriptorRendererOptionsImpl f127434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final z f127435m;

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public final class a implements m<b2, StringBuilder> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
        public final /* synthetic */ class C1173a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127437a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f127437a = iArr;
            }
        }

        public a() {
        }

        private final void t(n0 n0Var, StringBuilder sb2, String str) throws IOException {
            int i10 = C1173a.f127437a[DescriptorRendererImpl.this.n0().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                p(n0Var, sb2);
                return;
            }
            DescriptorRendererImpl.this.T0(n0Var, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            o0 o0VarN0 = n0Var.n0();
            f0.o(o0VarN0, "descriptor.correspondingProperty");
            descriptorRendererImpl.C1(o0VarN0, sb2);
        }

        public void A(@dl.d b1 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.U1(descriptor, true, builder, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder sb2) throws IOException {
            n(dVar, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 b(k0 k0Var, StringBuilder sb2) {
            s(k0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 c(o0 o0Var, StringBuilder sb2) throws IOException {
            u(o0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 d(q0 q0Var, StringBuilder sb2) throws IOException {
            w(q0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 e(b1 b1Var, StringBuilder sb2) {
            A(b1Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 f(j jVar, StringBuilder sb2) throws IOException {
            o(jVar, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 g(r0 r0Var, StringBuilder sb2) {
            x(r0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 h(y0 y0Var, StringBuilder sb2) {
            z(y0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 i(x0 x0Var, StringBuilder sb2) {
            y(x0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 j(p0 p0Var, StringBuilder sb2) throws IOException {
            v(p0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 k(g0 g0Var, StringBuilder sb2) {
            r(g0Var, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 l(w wVar, StringBuilder sb2) throws IOException {
            p(wVar, sb2);
            return b2.f124493a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ b2 m(d0 d0Var, StringBuilder sb2) {
            q(d0Var, sb2);
            return b2.f124493a;
        }

        public void n(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d descriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.Z0(descriptor, builder);
        }

        public void o(@dl.d j constructorDescriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(constructorDescriptor, "constructorDescriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.e1(constructorDescriptor, builder);
        }

        public void p(@dl.d w descriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.k1(descriptor, builder);
        }

        public void q(@dl.d d0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.u1(descriptor, builder, true);
        }

        public void r(@dl.d g0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.y1(descriptor, builder);
        }

        public void s(@dl.d k0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.A1(descriptor, builder);
        }

        public void u(@dl.d o0 descriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.C1(descriptor, builder);
        }

        public void v(@dl.d p0 descriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(@dl.d q0 descriptor, @dl.d StringBuilder builder) throws IOException {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(@dl.d r0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(@dl.d x0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.K1(descriptor, builder);
        }

        public void z(@dl.d y0 descriptor, @dl.d StringBuilder builder) {
            f0.p(descriptor, "descriptor");
            f0.p(builder, "builder");
            DescriptorRendererImpl.this.P1(descriptor, builder, true);
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f127440b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127439a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f127440b = iArr2;
        }
    }

    public DescriptorRendererImpl(@dl.d DescriptorRendererOptionsImpl options) {
        f0.p(options, "options");
        this.f127434l = options;
        options.m0();
        this.f127435m = b0.c(new yh.a<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DescriptorRendererImpl invoke() {
                DescriptorRenderer descriptorRendererA = this.f127441b.A(new l<b, b2>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                    public final void a(@dl.d b withOptions) {
                        f0.p(withOptions, "$this$withOptions");
                        withOptions.f(e1.C(withOptions.c(), CollectionsKt__CollectionsKt.L(h.a.C, h.a.D)));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                        a(bVar);
                        return b2.f124493a;
                    }
                });
                f0.n(descriptorRendererA, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl) descriptorRendererA;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(k0 k0Var, StringBuilder sb2) {
        z1(k0Var.e(), "package", sb2);
        if (d()) {
            sb2.append(" in context of ");
            u1(k0Var.I0(), sb2, false);
        }
    }

    private final void B1(StringBuilder sb2, m0 m0Var) {
        m0 m0VarC = m0Var.c();
        if (m0VarC != null) {
            B1(sb2, m0VarC);
            sb2.append(lg.a.f131414g);
            f name = m0Var.b().getName();
            f0.o(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(x(name, false));
        } else {
            z0 z0VarR = m0Var.b().r();
            f0.o(z0VarR, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(M1(z0VarR));
        }
        sb2.append(L1(m0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(o0 o0Var, StringBuilder sb2) throws IOException {
        if (!A0()) {
            if (!z0()) {
                D1(o0Var, sb2);
                List<r0> listG0 = o0Var.G0();
                f0.o(listG0, "property.contextReceiverParameters");
                f1(listG0, sb2);
                s visibility = o0Var.getVisibility();
                f0.o(visibility, "property.visibility");
                X1(visibility, sb2);
                boolean z10 = false;
                t1(sb2, g0().contains(DescriptorRendererModifier.CONST) && o0Var.isConst(), "const");
                p1(o0Var, sb2);
                s1(o0Var, sb2);
                x1(o0Var, sb2);
                if (g0().contains(DescriptorRendererModifier.LATEINIT) && o0Var.H0()) {
                    z10 = true;
                }
                t1(sb2, z10, "lateinit");
                o1(o0Var, sb2);
            }
            T1(this, o0Var, sb2, false, 4, null);
            List<y0> typeParameters = o0Var.getTypeParameters();
            f0.o(typeParameters, "property.typeParameters");
            R1(typeParameters, sb2, true);
            E1(o0Var, sb2);
        }
        u1(o0Var, sb2, true);
        sb2.append(": ");
        kotlin.reflect.jvm.internal.impl.types.d0 type = o0Var.getType();
        f0.o(type, "property.type");
        sb2.append(y(type));
        F1(o0Var, sb2);
        m1(o0Var, sb2);
        List<y0> typeParameters2 = o0Var.getTypeParameters();
        f0.o(typeParameters2, "property.typeParameters");
        Y1(typeParameters2, sb2);
    }

    private final void D1(o0 o0Var, StringBuilder sb2) {
        if (g0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            X0(this, sb2, o0Var, null, 2, null);
            v vVarT = o0Var.T();
            if (vVarT != null) {
                W0(sb2, vVarT, AnnotationUseSiteTarget.FIELD);
            }
            v vVarH = o0Var.H();
            if (vVarH != null) {
                W0(sb2, vVarH, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (n0() == PropertyAccessorRenderingPolicy.NONE) {
                p0 getter = o0Var.getGetter();
                if (getter != null) {
                    W0(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                q0 setter = o0Var.getSetter();
                if (setter != null) {
                    W0(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<b1> listI = setter.i();
                    f0.o(listI, "setter.valueParameters");
                    b1 it = (b1) CollectionsKt___CollectionsKt.c5(listI);
                    f0.o(it, "it");
                    W0(sb2, it, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void E1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        r0 r0VarL0 = aVar.l0();
        if (r0VarL0 != null) {
            W0(sb2, r0VarL0, AnnotationUseSiteTarget.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.d0 type = r0VarL0.getType();
            f0.o(type, "receiver.type");
            sb2.append(i1(type));
            sb2.append(".");
        }
    }

    private final void F1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        r0 r0VarL0;
        if (o0() && (r0VarL0 = aVar.l0()) != null) {
            sb2.append(" on ");
            kotlin.reflect.jvm.internal.impl.types.d0 type = r0VarL0.getType();
            f0.o(type, "receiver.type");
            sb2.append(y(type));
        }
    }

    private final void G1(StringBuilder sb2, j0 j0Var) {
        if (f0.g(j0Var, i1.f128137b) || i1.k(j0Var)) {
            sb2.append("???");
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.h.o(j0Var)) {
            if (!D0()) {
                sb2.append("???");
                return;
            }
            z0 z0VarO0 = j0Var.O0();
            f0.n(z0VarO0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(h1(((g) z0VarO0).g(0)));
            return;
        }
        if (e0.a(j0Var)) {
            g1(sb2, j0Var);
        } else if (Z1(j0Var)) {
            l1(sb2, j0Var);
        } else {
            g1(sb2, j0Var);
        }
    }

    private final void H1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void I1(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder sb2) throws IOException {
        if (K0() || kotlin.reflect.jvm.internal.impl.builtins.g.m0(dVar.v())) {
            return;
        }
        Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionL = dVar.r().l();
        f0.o(collectionL, "klass.typeConstructor.supertypes");
        if (collectionL.isEmpty()) {
            return;
        }
        if (collectionL.size() == 1 && kotlin.reflect.jvm.internal.impl.builtins.g.b0(collectionL.iterator().next())) {
            return;
        }
        H1(sb2);
        sb2.append(": ");
        CollectionsKt___CollectionsKt.e3(collectionL, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new l<kotlin.reflect.jvm.internal.impl.types.d0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(kotlin.reflect.jvm.internal.impl.types.d0 it) {
                DescriptorRendererImpl descriptorRendererImpl = this.f127445b;
                f0.o(it, "it");
                return descriptorRendererImpl.y(it);
            }
        });
    }

    private final void J1(w wVar, StringBuilder sb2) {
        t1(sb2, wVar.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(x0 x0Var, StringBuilder sb2) {
        X0(this, sb2, x0Var, null, 2, null);
        s visibility = x0Var.getVisibility();
        f0.o(visibility, "typeAlias.visibility");
        X1(visibility, sb2);
        p1(x0Var, sb2);
        sb2.append(n1("typealias"));
        sb2.append(" ");
        u1(x0Var, sb2, true);
        List<y0> listW = x0Var.w();
        f0.o(listW, "typeAlias.declaredTypeParameters");
        R1(listW, sb2, false);
        Y0(x0Var, sb2);
        sb2.append(" = ");
        sb2.append(y(x0Var.E0()));
    }

    private final String M0() {
        return Q(">");
    }

    private final void N(StringBuilder sb2, k kVar) {
        k kVarC;
        String name;
        if ((kVar instanceof g0) || (kVar instanceof k0) || (kVarC = kVar.c()) == null || (kVarC instanceof d0)) {
            return;
        }
        sb2.append(" ");
        sb2.append(q1("defined in"));
        sb2.append(" ");
        kotlin.reflect.jvm.internal.impl.name.d dVarM = kotlin.reflect.jvm.internal.impl.resolve.d.m(kVarC);
        f0.o(dVarM, "getFqName(containingDeclaration)");
        sb2.append(dVarM.e() ? "root package" : w(dVarM));
        if (I0() && (kVarC instanceof g0) && (kVar instanceof n) && (name = ((n) kVar).j().b().getName()) != null) {
            sb2.append(" ");
            sb2.append(q1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final boolean N0(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        return kotlin.reflect.jvm.internal.impl.builtins.f.q(d0Var) || !d0Var.getAnnotations().isEmpty();
    }

    private final void N1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var, z0 z0Var) {
        m0 m0VarA = TypeParameterUtilsKt.a(d0Var);
        if (m0VarA != null) {
            B1(sb2, m0VarA);
        } else {
            sb2.append(M1(z0Var));
            sb2.append(L1(d0Var.M0()));
        }
    }

    private final void O(StringBuilder sb2, List<? extends c1> list) throws IOException {
        CollectionsKt___CollectionsKt.e3(list, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new l<c1, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$appendTypeProjections$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d c1 it) {
                f0.p(it, "it");
                if (it.b()) {
                    return androidx.webkit.b.f28327e;
                }
                DescriptorRendererImpl descriptorRendererImpl = this.f127438b;
                kotlin.reflect.jvm.internal.impl.types.d0 type = it.getType();
                f0.o(type, "it.type");
                String strY = descriptorRendererImpl.y(type);
                if (it.c() == Variance.INVARIANT) {
                    return strY;
                }
                return it.c() + ' ' + strY;
            }
        });
    }

    private final Modality O0(a0 a0Var) {
        if (a0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.d) a0Var).b() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        k kVarC = a0Var.c();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
        if (dVar != null && (a0Var instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) a0Var;
            Collection<? extends CallableMemberDescriptor> collectionF = callableMemberDescriptor.f();
            f0.o(collectionF, "this.overriddenDescriptors");
            if ((!collectionF.isEmpty()) && dVar.l() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (dVar.b() != ClassKind.INTERFACE || f0.g(callableMemberDescriptor.getVisibility(), r.f125864a)) {
                return Modality.FINAL;
            }
            Modality modalityL = callableMemberDescriptor.l();
            Modality modality = Modality.ABSTRACT;
            return modalityL == modality ? modality : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    static /* synthetic */ void O1(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var, z0 z0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z0Var = d0Var.O0();
        }
        descriptorRendererImpl.N1(sb2, d0Var, z0Var);
    }

    private final String P() {
        int i10 = b.f127439a[B0().ordinal()];
        if (i10 == 1) {
            return Q("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return f0.g(cVar.e(), h.a.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(y0 y0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(Q0());
        }
        if (G0()) {
            sb2.append("/*");
            sb2.append(y0Var.getIndex());
            sb2.append("*/ ");
        }
        t1(sb2, y0Var.k(), "reified");
        String label = y0Var.n().getLabel();
        boolean z11 = true;
        t1(sb2, label.length() > 0, label);
        X0(this, sb2, y0Var, null, 2, null);
        u1(y0Var, sb2, z10);
        int size = y0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.d0 upperBound = y0Var.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.g.i0(upperBound)) {
                sb2.append(" : ");
                f0.o(upperBound, "upperBound");
                sb2.append(y(upperBound));
            }
        } else if (z10) {
            for (kotlin.reflect.jvm.internal.impl.types.d0 upperBound2 : y0Var.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.g.i0(upperBound2)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    f0.o(upperBound2, "upperBound");
                    sb2.append(y(upperBound2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(M0());
        }
    }

    private final String Q(String str) {
        return B0().escape(str);
    }

    private final String Q0() {
        return Q("<");
    }

    private final void Q1(StringBuilder sb2, List<? extends y0> list) {
        Iterator<? extends y0> it = list.iterator();
        while (it.hasNext()) {
            P1(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final boolean R0(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.f().isEmpty();
    }

    private final void R1(List<? extends y0> list, StringBuilder sb2, boolean z10) {
        if (!L0() && (!list.isEmpty())) {
            sb2.append(Q0());
            Q1(sb2, list);
            sb2.append(M0());
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    private final void S0(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.a aVar) {
        RenderingFormat renderingFormatB0 = B0();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatB0 == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        w1(sb2, aVar.f0());
        sb2.append(" */");
        if (B0() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    private final void S1(d1 d1Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(d1Var instanceof b1)) {
            sb2.append(n1(d1Var.G() ? "var" : TPReportParams.JSON_KEY_VAL));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(n0 n0Var, StringBuilder sb2) {
        p1(n0Var, sb2);
    }

    static /* synthetic */ void T1(DescriptorRendererImpl descriptorRendererImpl, d1 d1Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        descriptorRendererImpl.S1(d1Var, sb2, z10);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    private final void U0(w wVar, StringBuilder sb2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (wVar.U()) {
            Collection<? extends w> collectionF = wVar.f();
            f0.o(collectionF, "functionDescriptor.overriddenDescriptors");
            if (!collectionF.isEmpty()) {
                Iterator<T> it = collectionF.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z12 = true;
                        break;
                    } else if (((w) it.next()).U()) {
                        z12 = false;
                        break;
                    }
                }
            } else {
                z12 = true;
                break;
            }
            if (z12 || S()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (wVar.K()) {
            Collection<? extends w> collectionF2 = wVar.f();
            f0.o(collectionF2, "functionDescriptor.overriddenDescriptors");
            if (!collectionF2.isEmpty()) {
                Iterator<T> it2 = collectionF2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = true;
                        break;
                    } else if (((w) it2.next()).K()) {
                        z11 = false;
                        break;
                    }
                }
            } else {
                z11 = true;
                break;
            }
            if (z11 || S()) {
                z13 = true;
            }
        }
        t1(sb2, wVar.C(), "tailrec");
        J1(wVar, sb2);
        t1(sb2, wVar.g(), "inline");
        t1(sb2, z13, "infix");
        t1(sb2, z10, "operator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    public final void U1(b1 b1Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        boolean z13;
        if (z11) {
            sb2.append(n1("value-parameter"));
            sb2.append(" ");
        }
        if (G0()) {
            sb2.append("/*");
            sb2.append(b1Var.getIndex());
            sb2.append("*/ ");
        }
        X0(this, sb2, b1Var, null, 2, null);
        t1(sb2, b1Var.C0(), "crossinline");
        t1(sb2, b1Var.A0(), "noinline");
        if (v0()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVarC = b1Var.c();
            kotlin.reflect.jvm.internal.impl.descriptors.c cVar = aVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.c ? (kotlin.reflect.jvm.internal.impl.descriptors.c) aVarC : null;
            if (cVar != null && cVar.s0()) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            t1(sb2, R(), "actual");
        }
        W1(b1Var, z10, sb2, z11, z12);
        if (X() != null) {
            z13 = d() ? b1Var.W() : DescriptorUtilsKt.c(b1Var);
        }
        if (z13) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" = ");
            l<b1, String> lVarX = X();
            f0.m(lVarX);
            sb3.append(lVarX.invoke(b1Var));
            sb2.append(sb3.toString());
        }
    }

    private final List<String> V0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVarD;
        List<b1> listI;
        Map<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> mapA = cVar.a();
        List listE = null;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = s0() ? DescriptorUtilsKt.i(cVar) : null;
        if (dVarI != null && (cVarD = dVarI.D()) != null && (listI = cVarD.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((b1) obj).W()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((b1) it.next()).getName());
            }
            listE = arrayList2;
        }
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listE) {
            f it2 = (f) obj2;
            f0.o(it2, "it");
            if (!mapA.containsKey(it2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(t.Y(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((f) it3.next()).b() + " = ...");
        }
        Set<Map.Entry<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(t.Y(setEntrySet, 10));
        Iterator<T> it4 = setEntrySet.iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            f fVar = (f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!listE.contains(fVar) ? d1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        return CollectionsKt___CollectionsKt.l5(CollectionsKt___CollectionsKt.y4(arrayList4, arrayList5));
    }

    private final void V1(Collection<? extends b1> collection, boolean z10, StringBuilder sb2) {
        boolean zA2 = a2(z10);
        int size = collection.size();
        F0().a(size, sb2);
        int i10 = 0;
        for (b1 b1Var : collection) {
            F0().c(b1Var, i10, size, sb2);
            U1(b1Var, zA2, sb2, false);
            F0().d(b1Var, i10, size, sb2);
            i10++;
        }
        F0().b(size, sb2);
    }

    private final void W0(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (g0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<kotlin.reflect.jvm.internal.impl.name.c> setC = aVar instanceof kotlin.reflect.jvm.internal.impl.types.d0 ? c() : Z();
            l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> lVarT = T();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.getAnnotations()) {
                if (!CollectionsKt___CollectionsKt.R1(setC, cVar.e()) && !P0(cVar) && (lVarT == null || lVarT.invoke(cVar).booleanValue())) {
                    sb2.append(t(cVar, annotationUseSiteTarget));
                    if (Y()) {
                        sb2.append('\n');
                        f0.o(sb2, "append('\\n')");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void W1(d1 d1Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        kotlin.reflect.jvm.internal.impl.types.d0 type = d1Var.getType();
        f0.o(type, "variable.type");
        b1 b1Var = d1Var instanceof b1 ? (b1) d1Var : null;
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarF0 = b1Var != null ? b1Var.F0() : null;
        kotlin.reflect.jvm.internal.impl.types.d0 d0Var = d0VarF0 == null ? type : d0VarF0;
        t1(sb2, d0VarF0 != null, "vararg");
        if (z12 || (z11 && !A0())) {
            S1(d1Var, sb2, z12);
        }
        if (z10) {
            u1(d1Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(y(d0Var));
        m1(d1Var, sb2);
        if (!G0() || d0VarF0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(y(type));
        sb2.append("*/");
    }

    static /* synthetic */ void X0(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.W0(sb2, aVar, annotationUseSiteTarget);
    }

    private final boolean X1(s sVar, StringBuilder sb2) {
        if (!g0().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (h0()) {
            sVar = sVar.f();
        }
        if (!u0() && f0.g(sVar, r.f125875l)) {
            return false;
        }
        sb2.append(n1(sVar.c()));
        sb2.append(" ");
        return true;
    }

    private final void Y0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, StringBuilder sb2) {
        List<y0> listW = gVar.w();
        f0.o(listW, "classifier.declaredTypeParameters");
        List<y0> parameters = gVar.r().getParameters();
        f0.o(parameters, "classifier.typeConstructor.parameters");
        if (G0() && gVar.m() && parameters.size() > listW.size()) {
            sb2.append(" /*captured type parameters: ");
            Q1(sb2, parameters.subList(listW.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    private final void Y1(List<? extends y0> list, StringBuilder sb2) throws IOException {
        if (L0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (y0 y0Var : list) {
            List<kotlin.reflect.jvm.internal.impl.types.d0> upperBounds = y0Var.getUpperBounds();
            f0.o(upperBounds, "typeParameter.upperBounds");
            for (kotlin.reflect.jvm.internal.impl.types.d0 it : CollectionsKt___CollectionsKt.X1(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                f name = y0Var.getName();
                f0.o(name, "typeParameter.name");
                sb3.append(x(name, false));
                sb3.append(" : ");
                f0.o(it, "it");
                sb3.append(y(it));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(n1("where"));
            sb2.append(" ");
            CollectionsKt___CollectionsKt.e3(arrayList, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder sb2) throws IOException {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVarD;
        boolean z10 = dVar.b() == ClassKind.ENUM_ENTRY;
        if (!A0()) {
            X0(this, sb2, dVar, null, 2, null);
            List<r0> listP0 = dVar.p0();
            f0.o(listP0, "klass.contextReceivers");
            f1(listP0, sb2);
            if (!z10) {
                s visibility = dVar.getVisibility();
                f0.o(visibility, "klass.visibility");
                X1(visibility, sb2);
            }
            if ((dVar.b() != ClassKind.INTERFACE || dVar.l() != Modality.ABSTRACT) && (!dVar.b().isSingleton() || dVar.l() != Modality.FINAL)) {
                Modality modalityL = dVar.l();
                f0.o(modalityL, "klass.modality");
                r1(modalityL, sb2, O0(dVar));
            }
            p1(dVar, sb2);
            t1(sb2, g0().contains(DescriptorRendererModifier.INNER) && dVar.m(), ak.au);
            t1(sb2, g0().contains(DescriptorRendererModifier.DATA) && dVar.z(), "data");
            t1(sb2, g0().contains(DescriptorRendererModifier.INLINE) && dVar.g(), "inline");
            t1(sb2, g0().contains(DescriptorRendererModifier.VALUE) && dVar.y(), "value");
            t1(sb2, g0().contains(DescriptorRendererModifier.FUN) && dVar.x(), "fun");
            a1(dVar, sb2);
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.d.x(dVar)) {
            c1(dVar, sb2);
        } else {
            if (!A0()) {
                H1(sb2);
            }
            u1(dVar, sb2, true);
        }
        if (z10) {
            return;
        }
        List<y0> listW = dVar.w();
        f0.o(listW, "klass.declaredTypeParameters");
        R1(listW, sb2, false);
        Y0(dVar, sb2);
        if (!dVar.b().isSingleton() && V() && (cVarD = dVar.D()) != null) {
            sb2.append(" ");
            X0(this, sb2, cVarD, null, 2, null);
            s visibility2 = cVarD.getVisibility();
            f0.o(visibility2, "primaryConstructor.visibility");
            X1(visibility2, sb2);
            sb2.append(n1("constructor"));
            List<b1> listI = cVarD.i();
            f0.o(listI, "primaryConstructor.valueParameters");
            V1(listI, cVarD.t0(), sb2);
        }
        I1(dVar, sb2);
        Y1(listW, sb2);
    }

    private final boolean Z1(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        boolean z10;
        if (!kotlin.reflect.jvm.internal.impl.builtins.f.o(d0Var)) {
            return false;
        }
        List<c1> listM0 = d0Var.M0();
        if ((listM0 instanceof Collection) && listM0.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = listM0.iterator();
            while (it.hasNext()) {
                if (((c1) it.next()).b()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    private final DescriptorRendererImpl a0() {
        return (DescriptorRendererImpl) this.f127435m.getValue();
    }

    private final void a1(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder sb2) {
        sb2.append(n1(DescriptorRenderer.f127411a.a(dVar)));
    }

    private final boolean a2(boolean z10) {
        int i10 = b.f127440b[k0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final void c1(k kVar, StringBuilder sb2) {
        if (p0()) {
            if (A0()) {
                sb2.append("companion object");
            }
            H1(sb2);
            k kVarC = kVar.c();
            if (kVarC != null) {
                sb2.append("of ");
                f name = kVarC.getName();
                f0.o(name, "containingDeclaration.name");
                sb2.append(x(name, false));
            }
        }
        if (G0() || !f0.g(kVar.getName(), kotlin.reflect.jvm.internal.impl.name.h.f127212d)) {
            if (!A0()) {
                H1(sb2);
            }
            f name2 = kVar.getName();
            f0.o(name2, "descriptor.name");
            sb2.append(x(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d1(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            return CollectionsKt___CollectionsKt.h3(((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b(), ", ", "{", z5.g.f141884d, 0, null, new l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstant$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(@dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> it) {
                    f0.p(it, "it");
                    return this.f127443b.d1(it);
                }
            }, 24, null);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return StringsKt__StringsKt.d4(DescriptorRenderer.u(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof o)) {
            return gVar.toString();
        }
        o.b bVarB = ((o) gVar).b();
        if (bVarB instanceof o.b.a) {
            return ((o.b.a) bVarB).a() + "::class";
        }
        if (!(bVarB instanceof o.b.C1176b)) {
            throw new NoWhenBranchMatchedException();
        }
        o.b.C1176b c1176b = (o.b.C1176b) bVarB;
        String strB = c1176b.b().b().b();
        f0.o(strB, "classValue.classId.asSingleFqName().asString()");
        int iA = c1176b.a();
        for (int i10 = 0; i10 < iA; i10++) {
            strB = "kotlin.Array<" + strB + y.f128597f;
        }
        return strB + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public final void e1(j jVar, StringBuilder sb2) throws IOException {
        boolean z10;
        kotlin.reflect.jvm.internal.impl.descriptors.c cVarD;
        X0(this, sb2, jVar, null, 2, null);
        if (this.f127434l.U() || jVar.O().l() != Modality.SEALED) {
            s visibility = jVar.getVisibility();
            f0.o(visibility, "constructor.visibility");
            if (X1(visibility, sb2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        o1(jVar, sb2);
        boolean z11 = r0() || !jVar.s0() || z10;
        if (z11) {
            sb2.append(n1("constructor"));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g gVarC = jVar.c();
        f0.o(gVarC, "constructor.containingDeclaration");
        if (y0()) {
            if (z11) {
                sb2.append(" ");
            }
            u1(gVarC, sb2, true);
            List<y0> typeParameters = jVar.getTypeParameters();
            f0.o(typeParameters, "constructor.typeParameters");
            R1(typeParameters, sb2, false);
        }
        List<b1> listI = jVar.i();
        f0.o(listI, "constructor.valueParameters");
        V1(listI, jVar.t0(), sb2);
        if (q0() && !jVar.s0() && (gVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && (cVarD = ((kotlin.reflect.jvm.internal.impl.descriptors.d) gVarC).D()) != null) {
            List<b1> listI2 = cVarD.i();
            f0.o(listI2, "primaryConstructor.valueParameters");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI2) {
                b1 b1Var = (b1) obj;
                if (!b1Var.W() && b1Var.F0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(n1("this"));
                sb2.append(CollectionsKt___CollectionsKt.h3(arrayList, ", ", "(", ")", 0, null, new l<b1, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final CharSequence invoke(b1 b1Var2) {
                        return "";
                    }
                }, 24, null));
            }
        }
        if (y0()) {
            List<y0> typeParameters2 = jVar.getTypeParameters();
            f0.o(typeParameters2, "constructor.typeParameters");
            Y1(typeParameters2, sb2);
        }
    }

    private final void f1(List<? extends r0> list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i10 = 0;
            for (r0 r0Var : list) {
                int i11 = i10 + 1;
                W0(sb2, r0Var, AnnotationUseSiteTarget.RECEIVER);
                kotlin.reflect.jvm.internal.impl.types.d0 type = r0Var.getType();
                f0.o(type, "contextReceiver.type");
                sb2.append(i1(type));
                if (i10 == CollectionsKt__CollectionsKt.G(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    private final void g1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        X0(this, sb2, d0Var, null, 2, null);
        kotlin.reflect.jvm.internal.impl.types.n nVar = d0Var instanceof kotlin.reflect.jvm.internal.impl.types.n ? (kotlin.reflect.jvm.internal.impl.types.n) d0Var : null;
        j0 j0VarA1 = nVar != null ? nVar.a1() : null;
        if (e0.a(d0Var)) {
            if (TypeUtilsKt.s(d0Var) && m0()) {
                sb2.append(h1(kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.p(d0Var)));
            } else {
                if (!(d0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.f) || f0()) {
                    sb2.append(d0Var.O0().toString());
                } else {
                    sb2.append(((kotlin.reflect.jvm.internal.impl.types.error.f) d0Var).X0());
                }
                sb2.append(L1(d0Var.M0()));
            }
        } else if (d0Var instanceof kotlin.reflect.jvm.internal.impl.types.q0) {
            sb2.append(((kotlin.reflect.jvm.internal.impl.types.q0) d0Var).X0().toString());
        } else if (j0VarA1 instanceof kotlin.reflect.jvm.internal.impl.types.q0) {
            sb2.append(((kotlin.reflect.jvm.internal.impl.types.q0) j0VarA1).X0().toString());
        } else {
            O1(this, sb2, d0Var, null, 2, null);
        }
        if (d0Var.P0()) {
            sb2.append("?");
        }
        if (kotlin.reflect.jvm.internal.impl.types.n0.c(d0Var)) {
            sb2.append(" & Any");
        }
    }

    private final String h1(String str) {
        int i10 = b.f127439a[B0().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final String i1(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        String strY = y(d0Var);
        if (!Z1(d0Var) || i1.l(d0Var)) {
            return strY;
        }
        return '(' + strY + ')';
    }

    private final String j1(List<f> list) {
        return Q(e.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(w wVar, StringBuilder sb2) throws IOException {
        if (!A0()) {
            if (!z0()) {
                X0(this, sb2, wVar, null, 2, null);
                List<r0> listG0 = wVar.G0();
                f0.o(listG0, "function.contextReceiverParameters");
                f1(listG0, sb2);
                s visibility = wVar.getVisibility();
                f0.o(visibility, "function.visibility");
                X1(visibility, sb2);
                s1(wVar, sb2);
                if (b0()) {
                    p1(wVar, sb2);
                }
                x1(wVar, sb2);
                if (b0()) {
                    U0(wVar, sb2);
                } else {
                    J1(wVar, sb2);
                }
                o1(wVar, sb2);
                if (G0()) {
                    if (wVar.J0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (wVar.Y()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(n1("fun"));
            sb2.append(" ");
            List<y0> typeParameters = wVar.getTypeParameters();
            f0.o(typeParameters, "function.typeParameters");
            R1(typeParameters, sb2, true);
            E1(wVar, sb2);
        }
        u1(wVar, sb2, true);
        List<b1> listI = wVar.i();
        f0.o(listI, "function.valueParameters");
        V1(listI, wVar.t0(), sb2);
        F1(wVar, sb2);
        kotlin.reflect.jvm.internal.impl.types.d0 returnType = wVar.getReturnType();
        if (!J0() && (E0() || returnType == null || !kotlin.reflect.jvm.internal.impl.builtins.g.B0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : y(returnType));
        }
        List<y0> typeParameters2 = wVar.getTypeParameters();
        f0.o(typeParameters2, "function.typeParameters");
        Y1(typeParameters2, sb2);
    }

    private final void l1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        f fVarD;
        int length = sb2.length();
        X0(a0(), sb2, d0Var, null, 2, null);
        boolean z10 = sb2.length() != length;
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarJ = kotlin.reflect.jvm.internal.impl.builtins.f.j(d0Var);
        List<kotlin.reflect.jvm.internal.impl.types.d0> listE = kotlin.reflect.jvm.internal.impl.builtins.f.e(d0Var);
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator<kotlin.reflect.jvm.internal.impl.types.d0> it = listE.subList(0, CollectionsKt__CollectionsKt.G(listE)).iterator();
            while (it.hasNext()) {
                v1(sb2, it.next());
                sb2.append(", ");
            }
            v1(sb2, (kotlin.reflect.jvm.internal.impl.types.d0) CollectionsKt___CollectionsKt.k3(listE));
            sb2.append(") ");
        }
        boolean zQ = kotlin.reflect.jvm.internal.impl.builtins.f.q(d0Var);
        boolean zP0 = d0Var.P0();
        boolean z11 = zP0 || (z10 && d0VarJ != null);
        if (z11) {
            if (zQ) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    kotlin.text.b.r(StringsKt___StringsKt.u7(sb2));
                    if (sb2.charAt(StringsKt__StringsKt.j3(sb2) - 1) != ')') {
                        sb2.insert(StringsKt__StringsKt.j3(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        t1(sb2, zQ, "suspend");
        if (d0VarJ != null) {
            boolean z12 = (Z1(d0VarJ) && !d0VarJ.P0()) || N0(d0VarJ);
            if (z12) {
                sb2.append("(");
            }
            v1(sb2, d0VarJ);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!kotlin.reflect.jvm.internal.impl.builtins.f.m(d0Var) || d0Var.M0().size() > 1) {
            int i10 = 0;
            for (c1 c1Var : kotlin.reflect.jvm.internal.impl.builtins.f.l(d0Var)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (l0()) {
                    kotlin.reflect.jvm.internal.impl.types.d0 type = c1Var.getType();
                    f0.o(type, "typeProjection.type");
                    fVarD = kotlin.reflect.jvm.internal.impl.builtins.f.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(x(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(z(c1Var));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(P());
        sb2.append(" ");
        v1(sb2, kotlin.reflect.jvm.internal.impl.builtins.f.k(d0Var));
        if (z11) {
            sb2.append(")");
        }
        if (zP0) {
            sb2.append("?");
        }
    }

    private final void m1(d1 d1Var, StringBuilder sb2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarZ0;
        if (!e0() || (gVarZ0 = d1Var.z0()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(Q(d1(gVarZ0)));
    }

    private final String n1(String str) {
        int i10 = b.f127439a[B0().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (U()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void o1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (g0().contains(DescriptorRendererModifier.MEMBER_KIND) && G0() && callableMemberDescriptor.b() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(ti.a.f(callableMemberDescriptor.b().name()));
            sb2.append("*/ ");
        }
    }

    private final void p1(a0 a0Var, StringBuilder sb2) {
        t1(sb2, a0Var.B(), "external");
        t1(sb2, g0().contains(DescriptorRendererModifier.EXPECT) && a0Var.w0(), "expect");
        t1(sb2, g0().contains(DescriptorRendererModifier.ACTUAL) && a0Var.o0(), "actual");
    }

    private final void r1(Modality modality, StringBuilder sb2, Modality modality2) {
        if (t0() || modality != modality2) {
            t1(sb2, g0().contains(DescriptorRendererModifier.MODALITY), ti.a.f(modality.name()));
        }
    }

    private final void s1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (kotlin.reflect.jvm.internal.impl.resolve.d.J(callableMemberDescriptor) && callableMemberDescriptor.l() == Modality.FINAL) {
            return;
        }
        if (j0() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.l() == Modality.OPEN && R0(callableMemberDescriptor)) {
            return;
        }
        Modality modalityL = callableMemberDescriptor.l();
        f0.o(modalityL, "callable.modality");
        r1(modalityL, sb2, O0(callableMemberDescriptor));
    }

    private final void t1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(n1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(k kVar, StringBuilder sb2, boolean z10) {
        f name = kVar.getName();
        f0.o(name, "descriptor.name");
        sb2.append(x(name, z10));
    }

    private final void v1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        l1 l1VarR0 = d0Var.R0();
        kotlin.reflect.jvm.internal.impl.types.a aVar = l1VarR0 instanceof kotlin.reflect.jvm.internal.impl.types.a ? (kotlin.reflect.jvm.internal.impl.types.a) l1VarR0 : null;
        if (aVar == null) {
            w1(sb2, d0Var);
            return;
        }
        if (w0()) {
            w1(sb2, aVar.f0());
            return;
        }
        w1(sb2, aVar.a1());
        if (x0()) {
            S0(sb2, aVar);
        }
    }

    private final void w1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if ((d0Var instanceof m1) && d() && !((m1) d0Var).T0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof kotlin.reflect.jvm.internal.impl.types.y) {
            sb2.append(((kotlin.reflect.jvm.internal.impl.types.y) l1VarR0).Y0(this, this));
        } else if (l1VarR0 instanceof j0) {
            G1(sb2, (j0) l1VarR0);
        }
    }

    private final void x1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (g0().contains(DescriptorRendererModifier.OVERRIDE) && R0(callableMemberDescriptor) && j0() != OverrideRenderingPolicy.RENDER_OPEN) {
            t1(sb2, true, "override");
            if (G0()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.f().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(g0 g0Var, StringBuilder sb2) {
        z1(g0Var.e(), "package-fragment", sb2);
        if (d()) {
            sb2.append(" in ");
            u1(g0Var.c(), sb2, false);
        }
    }

    private final void z1(kotlin.reflect.jvm.internal.impl.name.c cVar, String str, StringBuilder sb2) {
        sb2.append(n1(str));
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = cVar.j();
        f0.o(dVarJ, "fqName.toUnsafe()");
        String strW = w(dVarJ);
        if (strW.length() > 0) {
            sb2.append(" ");
            sb2.append(strW);
        }
    }

    public boolean A0() {
        return this.f127434l.a0();
    }

    @dl.d
    public RenderingFormat B0() {
        return this.f127434l.b0();
    }

    @dl.d
    public l<kotlin.reflect.jvm.internal.impl.types.d0, kotlin.reflect.jvm.internal.impl.types.d0> C0() {
        return this.f127434l.c0();
    }

    public boolean D0() {
        return this.f127434l.d0();
    }

    public boolean E0() {
        return this.f127434l.e0();
    }

    @dl.d
    public DescriptorRenderer.b F0() {
        return this.f127434l.f0();
    }

    public boolean G0() {
        return this.f127434l.g0();
    }

    public boolean H0() {
        return this.f127434l.h0();
    }

    public boolean I0() {
        return this.f127434l.i0();
    }

    public boolean J0() {
        return this.f127434l.j0();
    }

    public boolean K0() {
        return this.f127434l.k0();
    }

    public boolean L0() {
        return this.f127434l.l0();
    }

    @dl.d
    public String L1(@dl.d List<? extends c1> typeArguments) throws IOException {
        f0.p(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Q0());
        O(sb2, typeArguments);
        sb2.append(M0());
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public String M1(@dl.d z0 typeConstructor) {
        f0.p(typeConstructor, "typeConstructor");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = typeConstructor.d();
        if (fVarD instanceof y0 ? true : fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? true : fVarD instanceof x0) {
            return b1(fVarD);
        }
        if (fVarD == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).i(new l<kotlin.reflect.jvm.internal.impl.types.d0, Object>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderTypeConstructor$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 it) {
                    f0.p(it, "it");
                    return it instanceof kotlin.reflect.jvm.internal.impl.types.q0 ? ((kotlin.reflect.jvm.internal.impl.types.q0) it).X0() : it;
                }
            }) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + fVarD.getClass()).toString());
    }

    public boolean R() {
        return this.f127434l.t();
    }

    public boolean S() {
        return this.f127434l.u();
    }

    @dl.e
    public l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> T() {
        return this.f127434l.v();
    }

    public boolean U() {
        return this.f127434l.w();
    }

    public boolean V() {
        return this.f127434l.x();
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.renderer.a W() {
        return this.f127434l.y();
    }

    @dl.e
    public l<b1, String> X() {
        return this.f127434l.z();
    }

    public boolean Y() {
        return this.f127434l.A();
    }

    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> Z() {
        return this.f127434l.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void a(@dl.d ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        f0.p(parameterNameRenderingPolicy, "<set-?>");
        this.f127434l.a(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public boolean b() {
        return this.f127434l.b();
    }

    public boolean b0() {
        return this.f127434l.C();
    }

    @dl.d
    public String b1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f klass) {
        f0.p(klass, "klass");
        return kotlin.reflect.jvm.internal.impl.types.error.h.m(klass) ? klass.r().toString() : W().a(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
        return this.f127434l.c();
    }

    public boolean c0() {
        return this.f127434l.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public boolean d() {
        return this.f127434l.d();
    }

    public boolean d0() {
        return this.f127434l.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    @dl.d
    public AnnotationArgumentsRenderingPolicy e() {
        return this.f127434l.e();
    }

    public boolean e0() {
        return this.f127434l.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void f(@dl.d Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        f0.p(set, "<set-?>");
        this.f127434l.f(set);
    }

    public boolean f0() {
        return this.f127434l.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void g(@dl.d Set<? extends DescriptorRendererModifier> set) {
        f0.p(set, "<set-?>");
        this.f127434l.g(set);
    }

    @dl.d
    public Set<DescriptorRendererModifier> g0() {
        return this.f127434l.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void h(boolean z10) {
        this.f127434l.h(z10);
    }

    public boolean h0() {
        return this.f127434l.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void i(boolean z10) {
        this.f127434l.i(z10);
    }

    @dl.d
    public final DescriptorRendererOptionsImpl i0() {
        return this.f127434l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void j(boolean z10) {
        this.f127434l.j(z10);
    }

    @dl.d
    public OverrideRenderingPolicy j0() {
        return this.f127434l.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void k(boolean z10) {
        this.f127434l.k(z10);
    }

    @dl.d
    public ParameterNameRenderingPolicy k0() {
        return this.f127434l.K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void l(boolean z10) {
        this.f127434l.l(z10);
    }

    public boolean l0() {
        return this.f127434l.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void m(boolean z10) {
        this.f127434l.m(z10);
    }

    public boolean m0() {
        return this.f127434l.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void n(boolean z10) {
        this.f127434l.n(z10);
    }

    @dl.d
    public PropertyAccessorRenderingPolicy n0() {
        return this.f127434l.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void o(@dl.d RenderingFormat renderingFormat) {
        f0.p(renderingFormat, "<set-?>");
        this.f127434l.o(renderingFormat);
    }

    public boolean o0() {
        return this.f127434l.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void p(@dl.d AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        f0.p(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f127434l.p(annotationArgumentsRenderingPolicy);
    }

    public boolean p0() {
        return this.f127434l.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void q(@dl.d kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        f0.p(aVar, "<set-?>");
        this.f127434l.q(aVar);
    }

    public boolean q0() {
        return this.f127434l.Q();
    }

    @dl.d
    public String q1(@dl.d String message) {
        f0.p(message, "message");
        int i10 = b.f127439a[B0().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public void r(boolean z10) {
        this.f127434l.r(z10);
    }

    public boolean r0() {
        return this.f127434l.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String s(@dl.d k declarationDescriptor) {
        f0.p(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.c0(new a(), sb2);
        if (H0()) {
            N(sb2, declarationDescriptor);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean s0() {
        return this.f127434l.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String t(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation, @dl.e AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        f0.p(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        kotlin.reflect.jvm.internal.impl.types.d0 type = annotation.getType();
        sb2.append(y(type));
        if (c0()) {
            List<String> listV0 = V0(annotation);
            if (d0() || (!listV0.isEmpty())) {
                CollectionsKt___CollectionsKt.e3(listV0, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
            }
        }
        if (G0() && (e0.a(type) || (type.O0().d() instanceof NotFoundClasses.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean t0() {
        return this.f127434l.T();
    }

    public boolean u0() {
        return this.f127434l.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String v(@dl.d String lowerRendered, @dl.d String upperRendered, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns) {
        f0.p(lowerRendered, "lowerRendered");
        f0.p(upperRendered, "upperRendered");
        f0.p(builtIns, "builtIns");
        if (e.f(lowerRendered, upperRendered)) {
            if (!u.v2(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        kotlin.reflect.jvm.internal.impl.renderer.a aVarW = W();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarW = builtIns.w();
        f0.o(dVarW, "builtIns.collection");
        String strY5 = StringsKt__StringsKt.y5(aVarW.a(dVarW, this), "Collection", null, 2, null);
        String strD = e.d(lowerRendered, strY5 + "Mutable", upperRendered, strY5, strY5 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = e.d(lowerRendered, strY5 + "MutableMap.MutableEntry", upperRendered, strY5 + "Map.Entry", strY5 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        kotlin.reflect.jvm.internal.impl.renderer.a aVarW2 = W();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarJ = builtIns.j();
        f0.o(dVarJ, "builtIns.array");
        String strY6 = StringsKt__StringsKt.y5(aVarW2.a(dVarJ, this), "Array", null, 2, null);
        String strD3 = e.d(lowerRendered, strY6 + Q("Array<"), upperRendered, strY6 + Q("Array<out "), strY6 + Q("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean v0() {
        return this.f127434l.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String w(@dl.d kotlin.reflect.jvm.internal.impl.name.d fqName) {
        f0.p(fqName, "fqName");
        List<f> listH = fqName.h();
        f0.o(listH, "fqName.pathSegments()");
        return j1(listH);
    }

    public boolean w0() {
        return this.f127434l.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String x(@dl.d f name, boolean z10) {
        f0.p(name, "name");
        String strQ = Q(e.b(name));
        if (!U() || B0() != RenderingFormat.HTML || !z10) {
            return strQ;
        }
        return "<b>" + strQ + "</b>";
    }

    public boolean x0() {
        return this.f127434l.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String y(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 type) {
        f0.p(type, "type");
        StringBuilder sb2 = new StringBuilder();
        v1(sb2, C0().invoke(type));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean y0() {
        return this.f127434l.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @dl.d
    public String z(@dl.d c1 typeProjection) throws IOException {
        f0.p(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        O(sb2, kotlin.collections.s.k(typeProjection));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean z0() {
        return this.f127434l.Z();
    }
}
