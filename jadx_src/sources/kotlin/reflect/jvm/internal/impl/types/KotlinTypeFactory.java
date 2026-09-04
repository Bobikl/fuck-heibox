package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinTypeFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final KotlinTypeFactory f127993a = new KotlinTypeFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0> f127994b = new yh.l() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
            kotlin.jvm.internal.f0.p(fVar, "<anonymous parameter 0>");
            return null;
        }
    };

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final j0 f127996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final z0 f127997b;

        public a(@dl.e j0 j0Var, @dl.e z0 z0Var) {
            this.f127996a = j0Var;
            this.f127997b = z0Var;
        }

        @dl.e
        public final j0 a() {
            return this.f127996a;
        }

        @dl.e
        public final z0 b() {
            return this.f127997b;
        }
    }

    private KotlinTypeFactory() {
    }

    @dl.d
    @xh.m
    public static final j0 b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var, @dl.d List<? extends c1> arguments) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        return new r0(t0.a.f128177a, false).i(s0.f128171e.a(null, x0Var, arguments), w0.f128193c.h());
    }

    private final MemberScope c(z0 z0Var, List<? extends c1> list, kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0Var.d();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.y0) fVarD).v().u();
        }
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            if (fVar == null) {
                fVar = DescriptorUtilsKt.o(DescriptorUtilsKt.p(fVarD));
            }
            return list.isEmpty() ? kotlin.reflect.jvm.internal.impl.descriptors.impl.s.b((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD, fVar) : kotlin.reflect.jvm.internal.impl.descriptors.impl.s.a((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD, a1.f128047c.b(z0Var, list), fVar);
        }
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((kotlin.reflect.jvm.internal.impl.descriptors.x0) fVarD).getName().toString();
            kotlin.jvm.internal.f0.o(string, "descriptor.name.toString()");
            return kotlin.reflect.jvm.internal.impl.types.error.h.a(errorScopeKind, true, string);
        }
        if (z0Var instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) z0Var).f();
        }
        throw new IllegalStateException("Unsupported classifier: " + fVarD + " for constructor: " + z0Var);
    }

    @dl.d
    @xh.m
    public static final l1 d(@dl.d j0 lowerBound, @dl.d j0 upperBound) {
        kotlin.jvm.internal.f0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.f0.p(upperBound, "upperBound");
        return kotlin.jvm.internal.f0.g(lowerBound, upperBound) ? lowerBound : new z(lowerBound, upperBound);
    }

    @dl.d
    @xh.m
    public static final j0 e(@dl.d w0 attributes, @dl.d IntegerLiteralTypeConstructor constructor, boolean z10) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        return m(attributes, constructor, CollectionsKt__CollectionsKt.E(), z10, kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a f(z0 z0Var, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, List<? extends c1> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarF;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0Var.d();
        if (fVarD == null || (fVarF = fVar.f(fVarD)) == null) {
            return null;
        }
        if (fVarF instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0) {
            return new a(b((kotlin.reflect.jvm.internal.impl.descriptors.x0) fVarF, list), null);
        }
        z0 z0VarA = fVarF.r().a(fVar);
        kotlin.jvm.internal.f0.o(z0VarA, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new a(null, z0VarA);
    }

    @dl.d
    @xh.m
    public static final j0 g(@dl.d w0 attributes, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d descriptor, @dl.d List<? extends c1> arguments) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        z0 z0VarR = descriptor.r();
        kotlin.jvm.internal.f0.o(z0VarR, "descriptor.typeConstructor");
        return l(attributes, z0VarR, arguments, false, null, 16, null);
    }

    @dl.d
    @xh.m
    public static final j0 h(@dl.d j0 baseType, @dl.d w0 annotations, @dl.d z0 constructor, @dl.d List<? extends c1> arguments, boolean z10) {
        kotlin.jvm.internal.f0.p(baseType, "baseType");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        return l(annotations, constructor, arguments, z10, null, 16, null);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final j0 i(@dl.d w0 attributes, @dl.d z0 constructor, @dl.d List<? extends c1> arguments, boolean z10) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        return l(attributes, constructor, arguments, z10, null, 16, null);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final j0 j(@dl.d final w0 attributes, @dl.d final z0 constructor, @dl.d final List<? extends c1> arguments, final boolean z10, @dl.e kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.d() == null) {
            return n(attributes, constructor, arguments, z10, f127993a.c(constructor, arguments, fVar), new yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f refiner) {
                    kotlin.jvm.internal.f0.p(refiner, "refiner");
                    KotlinTypeFactory.a aVarF = KotlinTypeFactory.f127993a.f(constructor, refiner, arguments);
                    if (aVarF == null) {
                        return null;
                    }
                    j0 j0VarA = aVarF.a();
                    if (j0VarA != null) {
                        return j0VarA;
                    }
                    w0 w0Var = attributes;
                    z0 z0VarB = aVarF.b();
                    kotlin.jvm.internal.f0.m(z0VarB);
                    return KotlinTypeFactory.j(w0Var, z0VarB, arguments, z10, refiner);
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = constructor.d();
        kotlin.jvm.internal.f0.m(fVarD);
        j0 j0VarV = fVarD.v();
        kotlin.jvm.internal.f0.o(j0VarV, "constructor.declarationDescriptor!!.defaultType");
        return j0VarV;
    }

    public static /* synthetic */ j0 k(j0 j0Var, w0 w0Var, z0 z0Var, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            w0Var = j0Var.N0();
        }
        if ((i10 & 4) != 0) {
            z0Var = j0Var.O0();
        }
        if ((i10 & 8) != 0) {
            list = j0Var.M0();
        }
        if ((i10 & 16) != 0) {
            z10 = j0Var.P0();
        }
        return h(j0Var, w0Var, z0Var, list, z10);
    }

    public static /* synthetic */ j0 l(w0 w0Var, z0 z0Var, List list, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            fVar = null;
        }
        return j(w0Var, z0Var, list, z10, fVar);
    }

    @dl.d
    @xh.m
    public static final j0 m(@dl.d final w0 attributes, @dl.d final z0 constructor, @dl.d final List<? extends c1> arguments, final boolean z10, @dl.d final MemberScope memberScope) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        kotlin.jvm.internal.f0.p(memberScope, "memberScope");
        k0 k0Var = new k0(constructor, arguments, z10, memberScope, new yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
                kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
                KotlinTypeFactory.a aVarF = KotlinTypeFactory.f127993a.f(constructor, kotlinTypeRefiner, arguments);
                if (aVarF == null) {
                    return null;
                }
                j0 j0VarA = aVarF.a();
                if (j0VarA != null) {
                    return j0VarA;
                }
                w0 w0Var = attributes;
                z0 z0VarB = aVarF.b();
                kotlin.jvm.internal.f0.m(z0VarB);
                return KotlinTypeFactory.m(w0Var, z0VarB, arguments, z10, memberScope);
            }
        });
        return attributes.isEmpty() ? k0Var : new l0(k0Var, attributes);
    }

    @dl.d
    @xh.m
    public static final j0 n(@dl.d w0 attributes, @dl.d z0 constructor, @dl.d List<? extends c1> arguments, boolean z10, @dl.d MemberScope memberScope, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.checker.f, ? extends j0> refinedTypeFactory) {
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        kotlin.jvm.internal.f0.p(memberScope, "memberScope");
        kotlin.jvm.internal.f0.p(refinedTypeFactory, "refinedTypeFactory");
        k0 k0Var = new k0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? k0Var : new l0(k0Var, attributes);
    }
}
