package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.n;
import kotlin.z;

/* JADX INFO: compiled from: ReflectionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectionTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final NotFoundClasses f125343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f125344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a f125345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final a f125346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final a f125347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final a f125348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final a f125349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final a f125350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final a f125351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final a f125352j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f125342l = {n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final b f125341k = new b(null);

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125353a;

        public a(int i10) {
            this.f125353a = i10;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.d a(@dl.d ReflectionTypes types, @dl.d n<?> property) {
            f0.p(types, "types");
            f0.p(property, "property");
            return types.b(ti.a.a(property.getName()), this.f125353a);
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.e
        public final d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
            f0.p(module, "module");
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(module, h.a.f125455s0);
            if (dVarA == null) {
                return null;
            }
            w0 w0VarH = w0.f128193c.h();
            List<y0> parameters = dVarA.r().getParameters();
            f0.o(parameters, "kPropertyClass.typeConstructor.parameters");
            Object objC5 = CollectionsKt___CollectionsKt.c5(parameters);
            f0.o(objC5, "kPropertyClass.typeConstructor.parameters.single()");
            return KotlinTypeFactory.g(w0VarH, dVarA, s.k(new StarProjectionImpl((y0) objC5)));
        }
    }

    public ReflectionTypes(@dl.d final kotlin.reflect.jvm.internal.impl.descriptors.d0 module, @dl.d NotFoundClasses notFoundClasses) {
        f0.p(module, "module");
        f0.p(notFoundClasses, "notFoundClasses");
        this.f125343a = notFoundClasses;
        this.f125344b = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope invoke() {
                return module.R(h.f125409r).u();
            }
        });
        this.f125345c = new a(1);
        this.f125346d = new a(1);
        this.f125347e = new a(1);
        this.f125348f = new a(2);
        this.f125349g = new a(3);
        this.f125350h = new a(1);
        this.f125351i = new a(2);
        this.f125352j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(String str, int i10) {
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(str);
        f0.o(fVarF, "identifier(className)");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = d().h(fVarF, NoLookupLocation.FROM_REFLECTION);
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH : null;
        return dVar == null ? this.f125343a.d(new kotlin.reflect.jvm.internal.impl.name.b(h.f125409r, fVarF), s.k(Integer.valueOf(i10))) : dVar;
    }

    private final MemberScope d() {
        return (MemberScope) this.f125344b.getValue();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.d c() {
        return this.f125345c.a(this, f125342l[0]);
    }
}
