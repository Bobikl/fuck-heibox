package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o extends g<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f127541b = new a(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        public final g<?> a(@dl.d d0 argumentType) {
            f0.p(argumentType, "argumentType");
            if (e0.a(argumentType)) {
                return null;
            }
            d0 type = argumentType;
            int i10 = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.g.c0(type)) {
                type = ((c1) CollectionsKt___CollectionsKt.c5(type.M0())).getType();
                f0.o(type, "type.arguments.single().type");
                i10++;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = type.O0().d();
            if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(fVarD);
                return bVarK == null ? new o(new b.a(argumentType)) : new o(bVarK, i10);
            }
            if (!(fVarD instanceof y0)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.f125420b.l());
            f0.o(bVarM, "topLevel(StandardNames.FqNames.any.toSafe())");
            return new o(bVarM, 0);
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static abstract class b {

        /* JADX INFO: compiled from: constantValues.kt */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final d0 f127542a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d d0 type) {
                super(null);
                f0.p(type, "type");
                this.f127542a = type;
            }

            @dl.d
            public final d0 a() {
                return this.f127542a;
            }

            public boolean equals(@dl.e Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && f0.g(this.f127542a, ((a) obj).f127542a);
            }

            public int hashCode() {
                return this.f127542a.hashCode();
            }

            @dl.d
            public String toString() {
                return "LocalClass(type=" + this.f127542a + ')';
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.o$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: constantValues.kt */
        public static final class C1176b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final f f127543a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1176b(@dl.d f value) {
                super(null);
                f0.p(value, "value");
                this.f127543a = value;
            }

            public final int a() {
                return this.f127543a.c();
            }

            @dl.d
            public final kotlin.reflect.jvm.internal.impl.name.b b() {
                return this.f127543a.d();
            }

            @dl.d
            public final f c() {
                return this.f127543a;
            }

            public boolean equals(@dl.e Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1176b) && f0.g(this.f127543a, ((C1176b) obj).f127543a);
            }

            public int hashCode() {
                return this.f127543a.hashCode();
            }

            @dl.d
            public String toString() {
                return "NormalClass(value=" + this.f127543a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, int i10) {
        this(new f(classId, i10));
        f0.p(classId, "classId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@dl.d f value) {
        this(new b.C1176b(value));
        f0.p(value, "value");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d b value) {
        super(value);
        f0.p(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
        f0.p(module, "module");
        w0 w0VarH = w0.f128193c.h();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarE = module.t().E();
        f0.o(dVarE, "module.builtIns.kClass");
        return KotlinTypeFactory.g(w0VarH, dVarE, kotlin.collections.s.k(new e1(c(module))));
    }

    @dl.d
    public final d0 c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
        f0.p(module, "module");
        b bVarB = b();
        if (bVarB instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVarB instanceof b.C1176b)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVarC = ((b.C1176b) b()).c();
        kotlin.reflect.jvm.internal.impl.name.b bVarA = fVarC.a();
        int iB = fVarC.b();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(module, bVarA);
        if (dVarA == null) {
            ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String string = bVarA.toString();
            f0.o(string, "classId.toString()");
            return kotlin.reflect.jvm.internal.impl.types.error.h.d(errorTypeKind, string, String.valueOf(iB));
        }
        j0 j0VarV = dVarA.v();
        f0.o(j0VarV, "descriptor.defaultType");
        d0 d0VarW = TypeUtilsKt.w(j0VarV);
        for (int i10 = 0; i10 < iB; i10++) {
            d0VarW = module.t().l(Variance.INVARIANT, d0VarW);
            f0.o(d0VarW, "module.builtIns.getArray…Variance.INVARIANT, type)");
        }
        return d0VarW;
    }
}
