package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractTypeConstructor extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<a> f127970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f127971c;

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public final class ModuleViewTypeConstructor implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.types.checker.f f127972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final kotlin.z f127973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractTypeConstructor f127974c;

        public ModuleViewTypeConstructor(@dl.d final AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f127974c = abstractTypeConstructor;
            this.f127972a = kotlinTypeRefiner;
            this.f127973b = kotlin.b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<List<? extends d0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends d0> invoke() {
                    return kotlin.reflect.jvm.internal.impl.types.checker.g.b(this.f127975b.f127972a, abstractTypeConstructor.l());
                }
            });
        }

        private final List<d0> g() {
            return (List) this.f127973b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f127974c.a(kotlinTypeRefiner);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
            return this.f127974c.d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return this.f127974c.e();
        }

        public boolean equals(@dl.e Object obj) {
            return this.f127974c.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<kotlin.reflect.jvm.internal.impl.descriptors.y0> getParameters() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters = this.f127974c.getParameters();
            kotlin.jvm.internal.f0.o(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<d0> l() {
            return g();
        }

        public int hashCode() {
            return this.f127974c.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public kotlin.reflect.jvm.internal.impl.builtins.g t() {
            kotlin.reflect.jvm.internal.impl.builtins.g gVarT = this.f127974c.t();
            kotlin.jvm.internal.f0.o(gVarT, "this@AbstractTypeConstructor.builtIns");
            return gVarT;
        }

        @dl.d
        public String toString() {
            return this.f127974c.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Collection<d0> f127977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private List<? extends d0> f127978b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d Collection<? extends d0> allSupertypes) {
            kotlin.jvm.internal.f0.p(allSupertypes, "allSupertypes");
            this.f127977a = allSupertypes;
            this.f127978b = kotlin.collections.s.k(kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.l());
        }

        @dl.d
        public final Collection<d0> a() {
            return this.f127977a;
        }

        @dl.d
        public final List<d0> b() {
            return this.f127978b;
        }

        public final void c(@dl.d List<? extends d0> list) {
            kotlin.jvm.internal.f0.p(list, "<set-?>");
            this.f127978b = list;
        }
    }

    public AbstractTypeConstructor(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager) {
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        this.f127970b = storageManager.d(new yh.a<a>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractTypeConstructor.a invoke() {
                return new AbstractTypeConstructor.a(this.f127979b.k());
            }
        }, new yh.l<Boolean, a>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @dl.d
            public final AbstractTypeConstructor.a a(boolean z10) {
                return new AbstractTypeConstructor.a(kotlin.collections.s.k(kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.l()));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ AbstractTypeConstructor.a invoke(Boolean bool) {
                return a(bool.booleanValue());
            }
        }, new yh.l<a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3
            {
                super(1);
            }

            public final void a(@dl.d AbstractTypeConstructor.a supertypes) {
                kotlin.jvm.internal.f0.p(supertypes, "supertypes");
                kotlin.reflect.jvm.internal.impl.descriptors.w0 w0VarP = this.f127981b.p();
                AbstractTypeConstructor abstractTypeConstructor = this.f127981b;
                Collection<d0> collectionA = supertypes.a();
                final AbstractTypeConstructor abstractTypeConstructor2 = this.f127981b;
                yh.l<z0, Iterable<? extends d0>> lVar = new yh.l<z0, Iterable<? extends d0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Iterable<d0> invoke(@dl.d z0 it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        return abstractTypeConstructor2.j(it, false);
                    }
                };
                final AbstractTypeConstructor abstractTypeConstructor3 = this.f127981b;
                Collection<d0> collectionA2 = w0VarP.a(abstractTypeConstructor, collectionA, lVar, new yh.l<d0, b2>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
                    {
                        super(1);
                    }

                    public final void a(@dl.d d0 it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        abstractTypeConstructor3.u(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(d0 d0Var) {
                        a(d0Var);
                        return b2.f124493a;
                    }
                });
                if (collectionA2.isEmpty()) {
                    d0 d0VarM = this.f127981b.m();
                    collectionA2 = d0VarM != null ? kotlin.collections.s.k(d0VarM) : null;
                    if (collectionA2 == null) {
                        collectionA2 = CollectionsKt__CollectionsKt.E();
                    }
                }
                if (this.f127981b.o()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.w0 w0VarP2 = this.f127981b.p();
                    final AbstractTypeConstructor abstractTypeConstructor4 = this.f127981b;
                    yh.l<z0, Iterable<? extends d0>> lVar2 = new yh.l<z0, Iterable<? extends d0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.2
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Iterable<d0> invoke(@dl.d z0 it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            return abstractTypeConstructor4.j(it, true);
                        }
                    };
                    final AbstractTypeConstructor abstractTypeConstructor5 = this.f127981b;
                    w0VarP2.a(abstractTypeConstructor4, collectionA2, lVar2, new yh.l<d0, b2>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.3
                        {
                            super(1);
                        }

                        public final void a(@dl.d d0 it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            abstractTypeConstructor5.s(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(d0 d0Var) {
                            a(d0Var);
                            return b2.f124493a;
                        }
                    });
                }
                AbstractTypeConstructor abstractTypeConstructor6 = this.f127981b;
                List<d0> listQ5 = collectionA2 instanceof List ? (List) collectionA2 : null;
                if (listQ5 == null) {
                    listQ5 = CollectionsKt___CollectionsKt.Q5(collectionA2);
                }
                supertypes.c(abstractTypeConstructor6.r(listQ5));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(AbstractTypeConstructor.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<d0> j(z0 z0Var, boolean z10) {
        List listY4;
        AbstractTypeConstructor abstractTypeConstructor = z0Var instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) z0Var : null;
        if (abstractTypeConstructor != null && (listY4 = CollectionsKt___CollectionsKt.y4(abstractTypeConstructor.f127970b.invoke().a(), abstractTypeConstructor.n(z10))) != null) {
            return listY4;
        }
        Collection<d0> supertypes = z0Var.l();
        kotlin.jvm.internal.f0.o(supertypes, "supertypes");
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    @dl.d
    protected abstract Collection<d0> k();

    @dl.e
    protected d0 m() {
        return null;
    }

    @dl.d
    protected Collection<d0> n(boolean z10) {
        return CollectionsKt__CollectionsKt.E();
    }

    protected boolean o() {
        return this.f127971c;
    }

    @dl.d
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.w0 p();

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<d0> l() {
        return this.f127970b.invoke().b();
    }

    @dl.d
    protected List<d0> r(@dl.d List<d0> supertypes) {
        kotlin.jvm.internal.f0.p(supertypes, "supertypes");
        return supertypes;
    }

    protected void s(@dl.d d0 type) {
        kotlin.jvm.internal.f0.p(type, "type");
    }

    protected void u(@dl.d d0 type) {
        kotlin.jvm.internal.f0.p(type, "type");
    }
}
