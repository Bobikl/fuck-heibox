package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final b1 f24287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final b f24288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final u2.a f24289c;

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        public static final String f24291g = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private static a f24292h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private final Application f24294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        public static final C0175a f24290f = new C0175a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        @xh.e
        public static final u2.a.b<Application> f24293i = C0175a.C0176a.f24295a;

        /* JADX INFO: renamed from: androidx.lifecycle.y0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class C0175a {

            /* JADX INFO: renamed from: androidx.lifecycle.y0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            public static final class C0176a implements u2.a.b<Application> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @dl.d
                public static final C0176a f24295a = new C0176a();

                private C0176a() {
                }
            }

            private C0175a() {
            }

            public /* synthetic */ C0175a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final b a(@dl.d c1 owner) {
                kotlin.jvm.internal.f0.p(owner, "owner");
                return owner instanceof r ? ((r) owner).getDefaultViewModelProviderFactory() : c.f24298b.a();
            }

            @dl.d
            @xh.m
            public final a b(@dl.d Application application) {
                kotlin.jvm.internal.f0.p(application, "application");
                if (a.f24292h == null) {
                    a.f24292h = new a(application);
                }
                a aVar = a.f24292h;
                kotlin.jvm.internal.f0.m(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Application application) {
            this(application, 0);
            kotlin.jvm.internal.f0.p(application, "application");
        }

        private a(Application application, int i10) {
            this.f24294e = application;
        }

        private final <T extends w0> T h(Class<T> cls, Application application) {
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.f0.o(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @dl.d
        @xh.m
        public static final a i(@dl.d Application application) {
            return f24290f.b(application);
        }

        @Override // androidx.lifecycle.y0.c, androidx.lifecycle.y0.b
        @dl.d
        public <T extends w0> T a(@dl.d Class<T> modelClass) {
            kotlin.jvm.internal.f0.p(modelClass, "modelClass");
            Application application = this.f24294e;
            if (application != null) {
                return (T) h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.y0.c, androidx.lifecycle.y0.b
        @dl.d
        public <T extends w0> T b(@dl.d Class<T> modelClass, @dl.d u2.a extras) {
            kotlin.jvm.internal.f0.p(modelClass, "modelClass");
            kotlin.jvm.internal.f0.p(extras, "extras");
            if (this.f24294e != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f24293i);
            if (application != null) {
                return (T) h(modelClass, application);
            }
            if (androidx.lifecycle.b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(modelClass);
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f24296a = a.f24297a;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f24297a = new a();

            private a() {
            }

            @dl.d
            @xh.m
            public final b a(@dl.d u2.g<?>... initializers) {
                kotlin.jvm.internal.f0.p(initializers, "initializers");
                return new u2.b((u2.g[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @dl.d
        <T extends w0> T a(@dl.d Class<T> cls);

        @dl.d
        <T extends w0> T b(@dl.d Class<T> cls, @dl.d u2.a aVar);
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private static c f24299c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f24298b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        @xh.e
        public static final u2.a.b<String> f24300d = a.C0177a.f24301a;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.y0$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            public static final class C0177a implements u2.a.b<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @dl.d
                public static final C0177a f24301a = new C0177a();

                private C0177a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @xh.m
            public static /* synthetic */ void b() {
            }

            @dl.d
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final c a() {
                if (c.f24299c == null) {
                    c.f24299c = new c();
                }
                c cVar = c.f24299c;
                kotlin.jvm.internal.f0.m(cVar);
                return cVar;
            }
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final c e() {
            return f24298b.a();
        }

        @Override // androidx.lifecycle.y0.b
        @dl.d
        public <T extends w0> T a(@dl.d Class<T> modelClass) throws InvocationTargetException {
            kotlin.jvm.internal.f0.p(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.f0.o(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            }
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ w0 b(Class cls, u2.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class d {
        public void c(@dl.d w0 viewModel) {
            kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public y0(@dl.d b1 store, @dl.d b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.f0.p(store, "store");
        kotlin.jvm.internal.f0.p(factory, "factory");
    }

    @xh.i
    public y0(@dl.d b1 store, @dl.d b factory, @dl.d u2.a defaultCreationExtras) {
        kotlin.jvm.internal.f0.p(store, "store");
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(defaultCreationExtras, "defaultCreationExtras");
        this.f24287a = store;
        this.f24288b = factory;
        this.f24289c = defaultCreationExtras;
    }

    public /* synthetic */ y0(b1 b1Var, b bVar, u2.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(b1Var, bVar, (i10 & 4) != 0 ? u2.a.C1270a.f140743b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(@dl.d c1 owner) {
        this(owner.getViewModelStore(), a.f24290f.a(owner), a1.a(owner));
        kotlin.jvm.internal.f0.p(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(@dl.d c1 owner, @dl.d b factory) {
        this(owner.getViewModelStore(), factory, a1.a(owner));
        kotlin.jvm.internal.f0.p(owner, "owner");
        kotlin.jvm.internal.f0.p(factory, "factory");
    }

    @dl.d
    @androidx.annotation.k0
    public <T extends w0> T a(@dl.d Class<T> modelClass) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @dl.d
    @androidx.annotation.k0
    public <T extends w0> T b(@dl.d String key, @dl.d Class<T> modelClass) {
        T t10;
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        T t11 = (T) this.f24287a.b(key);
        if (!modelClass.isInstance(t11)) {
            u2.e eVar = new u2.e(this.f24289c);
            eVar.c(c.f24300d, key);
            try {
                t10 = (T) this.f24288b.b(modelClass, eVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f24288b.a(modelClass);
            }
            this.f24287a.d(key, t10);
            return t10;
        }
        Object obj = this.f24288b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            kotlin.jvm.internal.f0.m(t11);
            dVar.c(t11);
        }
        kotlin.jvm.internal.f0.n(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
