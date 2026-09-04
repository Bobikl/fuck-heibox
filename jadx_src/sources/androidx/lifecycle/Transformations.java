package androidx.lifecycle;

import kotlin.DeprecationLevel;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "Transformations")
public final class Transformations {

    /* JADX INFO: compiled from: Transformations.kt */
    public static final /* synthetic */ class a implements j0, kotlin.jvm.internal.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f24125a;

        a(yh.l function) {
            kotlin.jvm.internal.f0.p(function, "function");
            this.f24125a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            this.f24125a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f24125a;
        }

        public final boolean equals(@dl.e Object obj) {
            if ((obj instanceof j0) && (obj instanceof kotlin.jvm.internal.a0)) {
                return kotlin.jvm.internal.f0.g(b(), ((kotlin.jvm.internal.a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @dl.d
    @androidx.annotation.k0
    @xh.h(name = "distinctUntilChanged")
    @androidx.annotation.j
    public static final <X> LiveData<X> a(@dl.d LiveData<X> liveData) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        final g0 g0Var = new g0();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f124884b = true;
        if (liveData.j()) {
            g0Var.r(liveData.f());
            booleanRef.f124884b = false;
        }
        g0Var.s(liveData, new a(new yh.l<X, b2>() { // from class: androidx.lifecycle.Transformations$distinctUntilChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x10) {
                X xF = g0Var.f();
                if (booleanRef.f124884b || ((xF == null && x10 != null) || !(xF == null || kotlin.jvm.internal.f0.g(xF, x10)))) {
                    booleanRef.f124884b = false;
                    g0Var.r(x10);
                }
            }
        }));
        return g0Var;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.k0
    @xh.h(name = "map")
    @androidx.annotation.j
    public static final /* synthetic */ LiveData b(LiveData liveData, final f0.a mapFunction) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        kotlin.jvm.internal.f0.p(mapFunction, "mapFunction");
        final g0 g0Var = new g0();
        g0Var.s(liveData, new a(new yh.l<Object, b2>() { // from class: androidx.lifecycle.Transformations$map$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                g0Var.r(mapFunction.apply(obj));
            }
        }));
        return g0Var;
    }

    @dl.d
    @androidx.annotation.k0
    @xh.h(name = "map")
    @androidx.annotation.j
    public static final <X, Y> LiveData<Y> c(@dl.d LiveData<X> liveData, @dl.d final yh.l<X, Y> transform) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        final g0 g0Var = new g0();
        g0Var.s(liveData, new a(new yh.l<X, b2>() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x10) {
                g0Var.r((Y) transform.invoke(x10));
            }
        }));
        return g0Var;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.k0
    @xh.h(name = "switchMap")
    @androidx.annotation.j
    public static final /* synthetic */ LiveData d(LiveData liveData, final f0.a switchMapFunction) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        kotlin.jvm.internal.f0.p(switchMapFunction, "switchMapFunction");
        final g0 g0Var = new g0();
        g0Var.s(liveData, new j0<Object>() { // from class: androidx.lifecycle.Transformations$switchMap$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.e
            private LiveData<Object> f24136a;

            @Override // androidx.lifecycle.j0
            public void a(Object obj) {
                LiveData<Object> liveDataApply = switchMapFunction.apply(obj);
                LiveData<Object> liveData2 = this.f24136a;
                if (liveData2 == liveDataApply) {
                    return;
                }
                if (liveData2 != null) {
                    g0<Object> g0Var2 = g0Var;
                    kotlin.jvm.internal.f0.m(liveData2);
                    g0Var2.t(liveData2);
                }
                this.f24136a = liveDataApply;
                if (liveDataApply != null) {
                    g0<Object> g0Var3 = g0Var;
                    kotlin.jvm.internal.f0.m(liveDataApply);
                    final g0<Object> g0Var4 = g0Var;
                    g0Var3.s(liveDataApply, new Transformations.a(new yh.l<Object, b2>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Object obj2) {
                            invoke2(obj2);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj2) {
                            g0Var4.r(obj2);
                        }
                    }));
                }
            }

            @dl.e
            public final LiveData<Object> b() {
                return this.f24136a;
            }

            public final void c(@dl.e LiveData<Object> liveData2) {
                this.f24136a = liveData2;
            }
        });
        return g0Var;
    }

    @dl.d
    @androidx.annotation.k0
    @xh.h(name = "switchMap")
    @androidx.annotation.j
    public static final <X, Y> LiveData<Y> e(@dl.d LiveData<X> liveData, @dl.d final yh.l<X, LiveData<Y>> transform) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        final g0 g0Var = new g0();
        g0Var.s(liveData, new j0<X>() { // from class: androidx.lifecycle.Transformations$switchMap$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.e
            private LiveData<Y> f24132a;

            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // androidx.lifecycle.j0
            public void a(X x10) {
                LiveData<Y> liveData2 = (LiveData) transform.invoke(x10);
                Object obj = this.f24132a;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    g0<Y> g0Var2 = g0Var;
                    kotlin.jvm.internal.f0.m(obj);
                    g0Var2.t(obj);
                }
                this.f24132a = liveData2;
                if (liveData2 != 0) {
                    g0<Y> g0Var3 = g0Var;
                    kotlin.jvm.internal.f0.m(liveData2);
                    final g0<Y> g0Var4 = g0Var;
                    g0Var3.s(liveData2, new Transformations.a(new yh.l<Y, b2>() { // from class: androidx.lifecycle.Transformations$switchMap$1$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Object obj2) {
                            invoke2(obj2);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Y y10) {
                            g0Var4.r(y10);
                        }
                    }));
                }
            }

            @dl.e
            public final LiveData<Y> b() {
                return this.f24132a;
            }

            public final void c(@dl.e LiveData<Y> liveData2) {
                this.f24132a = liveData2;
            }
        });
        return g0Var;
    }
}
