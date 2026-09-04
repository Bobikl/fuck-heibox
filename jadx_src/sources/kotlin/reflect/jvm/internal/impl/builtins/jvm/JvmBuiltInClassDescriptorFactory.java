package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.collections.s;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.n;
import yh.l;

/* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltInClassDescriptorFactory implements gi.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125482h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d0 f125483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l<d0, k> f125484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125485c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f125479e = {n0.u(new PropertyReference1Impl(n0.d(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f125478d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f125480f = kotlin.reflect.jvm.internal.impl.builtins.h.f125412u;

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return JvmBuiltInClassDescriptorFactory.f125482h;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.d dVar = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125424d;
        kotlin.reflect.jvm.internal.impl.name.f fVarI = dVar.i();
        f0.o(fVarI, "cloneable.shortName()");
        f125481g = fVarI;
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(dVar.l());
        f0.o(bVarM, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f125482h = bVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@dl.d final m storageManager, @dl.d d0 moduleDescriptor, @dl.d l<? super d0, ? extends k> computeContainingDeclaration) {
        f0.p(storageManager, "storageManager");
        f0.p(moduleDescriptor, "moduleDescriptor");
        f0.p(computeContainingDeclaration, "computeContainingDeclaration");
        this.f125483a = moduleDescriptor;
        this.f125484b = computeContainingDeclaration;
        this.f125485c = storageManager.c(new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.impl.g>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.g invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.g gVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.g((k) this.f125487b.f125484b.invoke(this.f125487b.f125483a), JvmBuiltInClassDescriptorFactory.f125481g, Modality.ABSTRACT, ClassKind.INTERFACE, s.k(this.f125487b.f125483a.t().i()), t0.f125942a, false, storageManager);
                gVar.L0(new a(storageManager, gVar), d1.k(), null);
                return gVar;
            }
        });
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(m mVar, d0 d0Var, l lVar, int i10, u uVar) {
        this(mVar, d0Var, (i10 & 4) != 0 ? new l<d0, kotlin.reflect.jvm.internal.impl.builtins.a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.builtins.a invoke(@dl.d d0 module) {
                f0.p(module, "module");
                List<g0> listQ = module.R(JvmBuiltInClassDescriptorFactory.f125480f).Q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listQ) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.a) {
                        arrayList.add(obj);
                    }
                }
                return (kotlin.reflect.jvm.internal.impl.builtins.a) CollectionsKt___CollectionsKt.w2(arrayList);
            }
        } : lVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.g i() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.g) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125485c, this, f125479e[0]);
    }

    @Override // gi.b
    public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName, @dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(packageFqName, "packageFqName");
        f0.p(name, "name");
        return f0.g(name, f125481g) && f0.g(packageFqName, f125480f);
    }

    @Override // gi.b
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        if (f0.g(classId, f125482h)) {
            return i();
        }
        return null;
    }

    @Override // gi.b
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
        f0.p(packageFqName, "packageFqName");
        return f0.g(packageFqName, f125480f) ? c1.f(i()) : d1.k();
    }
}
