package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.n;

/* JADX INFO: compiled from: JvmBuiltIns.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f125489l = {n0.u(new PropertyReference1Impl(n0.d(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final Kind f125490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private yh.a<a> f125491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125492k;

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final d0 f125493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f125494b;

        public a(@dl.d d0 ownerModuleDescriptor, boolean z10) {
            f0.p(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f125493a = ownerModuleDescriptor;
            this.f125494b = z10;
        }

        @dl.d
        public final d0 a() {
            return this.f125493a;
        }

        public final boolean b() {
            return this.f125494b;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125495a;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125495a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@dl.d final m storageManager, @dl.d Kind kind) {
        super(storageManager);
        f0.p(storageManager, "storageManager");
        f0.p(kind, "kind");
        this.f125490i = kind;
        this.f125492k = storageManager.c(new yh.a<JvmBuiltInsCustomizer>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JvmBuiltInsCustomizer invoke() {
                ModuleDescriptorImpl builtInsModule = this.f125496b.r();
                f0.o(builtInsModule, "builtInsModule");
                m mVar = storageManager;
                final JvmBuiltIns jvmBuiltIns = this.f125496b;
                return new JvmBuiltInsCustomizer(builtInsModule, mVar, new yh.a<JvmBuiltIns.a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2.1
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final JvmBuiltIns.a invoke() {
                        yh.a aVar = jvmBuiltIns.f125491j;
                        if (aVar == null) {
                            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                        }
                        JvmBuiltIns.a aVar2 = (JvmBuiltIns.a) aVar.invoke();
                        jvmBuiltIns.f125491j = null;
                        return aVar2;
                    }
                });
            }
        });
        int i10 = b.f125495a[kind.ordinal()];
        if (i10 == 2) {
            f(false);
        } else {
            if (i10 != 3) {
                return;
            }
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.g
    @dl.d
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List<gi.b> v() {
        Iterable<gi.b> iterableV = super.v();
        f0.o(iterableV, "super.getClassDescriptorFactories()");
        m storageManager = U();
        f0.o(storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = r();
        f0.o(builtInsModule, "builtInsModule");
        return CollectionsKt___CollectionsKt.v4(iterableV, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    @dl.d
    public final JvmBuiltInsCustomizer H0() {
        return (JvmBuiltInsCustomizer) l.a(this.f125492k, this, f125489l[0]);
    }

    public final void I0(@dl.d final d0 moduleDescriptor, final boolean z10) {
        f0.p(moduleDescriptor, "moduleDescriptor");
        J0(new yh.a<a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JvmBuiltIns.a invoke() {
                return new JvmBuiltIns.a(moduleDescriptor, z10);
            }
        });
    }

    public final void J0(@dl.d yh.a<a> computation) {
        f0.p(computation, "computation");
        this.f125491j = computation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.g
    @dl.d
    protected gi.c M() {
        return H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.g
    @dl.d
    protected gi.a g() {
        return H0();
    }
}
