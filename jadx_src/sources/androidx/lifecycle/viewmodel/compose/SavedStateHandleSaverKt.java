package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.d2;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.e;
import androidx.compose.runtime.saveable.f;
import androidx.compose.runtime.snapshots.r;
import androidx.lifecycle.q0;
import dl.d;
import kotlin.c1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.n;
import kotlin.u;
import xh.h;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: SavedStateHandleSaver.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class SavedStateHandleSaverKt {

    /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
    public static final class a implements androidx.savedstate.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T, ? extends Object> f24273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f24274b;

        /* JADX INFO: renamed from: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
        public final /* synthetic */ class C0174a implements f, a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q0.a f24275a;

            C0174a(q0.a aVar) {
                this.f24275a = aVar;
            }

            @Override // androidx.compose.runtime.saveable.f
            public final boolean a(@dl.e Object obj) {
                return this.f24275a.b(obj);
            }

            @Override // kotlin.jvm.internal.a0
            @d
            public final u<?> b() {
                return new FunctionReferenceImpl(1, this.f24275a, q0.a.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
            }

            public final boolean equals(@dl.e Object obj) {
                if ((obj instanceof f) && (obj instanceof a0)) {
                    return f0.g(b(), ((a0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        a(e<T, ? extends Object> eVar, T t10) {
            this.f24273a = eVar;
            this.f24274b = t10;
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
        @Override // androidx.savedstate.b.c
        @d
        public final Bundle saveState() {
            return androidx.core.os.e.b(c1.a("value", this.f24273a.a(new C0174a(q0.f24236f), this.f24274b)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
    public static final class b<T> implements kotlin.properties.d<Object, kotlin.properties.e<? super Object, ? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f24276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T, ? extends Object> f24277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<T> f24278c;

        /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
        public static final class a implements kotlin.properties.e<Object, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ T f24279a;

            a(T t10) {
                this.f24279a = t10;
            }

            @Override // kotlin.properties.e
            @d
            public final T a(@dl.e Object obj, @d n<?> nVar) {
                f0.p(nVar, "<anonymous parameter 1>");
                return this.f24279a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(q0 q0Var, e<T, ? extends Object> eVar, yh.a<? extends T> aVar) {
            this.f24276a = q0Var;
            this.f24277b = eVar;
            this.f24278c = aVar;
        }

        @Override // kotlin.properties.d
        @d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.properties.e<Object, T> a(@dl.e Object obj, @d n<?> property) {
            f0.p(property, "property");
            return new a(SavedStateHandleSaverKt.c(this.f24276a, property.getName(), this.f24277b, this.f24278c));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
    public static final class c<T> implements kotlin.properties.d<Object, kotlin.properties.f<? super Object, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f24280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T, ? extends Object> f24281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<M> f24282c;

        /* JADX INFO: compiled from: SavedStateHandleSaver.kt */
        @t0({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$provideDelegate$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,196:1\n89#2:197\n115#2,2:198\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$provideDelegate$1\n*L\n167#1:197\n170#1:198,2\n*E\n"})
        public static final class a implements kotlin.properties.f<Object, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a1<T> f24283a;

            a(a1<T> a1Var) {
                this.f24283a = a1Var;
            }

            @Override // kotlin.properties.f, kotlin.properties.e
            @d
            public T a(@dl.e Object obj, @d n<?> property) {
                f0.p(property, "property");
                return this.f24283a.getValue();
            }

            @Override // kotlin.properties.f
            public void b(@dl.e Object obj, @d n<?> property, @d T value) {
                f0.p(property, "property");
                f0.p(value, "value");
                this.f24283a.setValue(value);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(q0 q0Var, e<T, ? extends Object> eVar, yh.a<? extends M> aVar) {
            this.f24280a = q0Var;
            this.f24281b = eVar;
            this.f24282c = aVar;
        }

        @Override // kotlin.properties.d
        @d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.properties.f<Object, T> a(@dl.e Object obj, @d n<?> property) {
            f0.p(property, "property");
            return new a(SavedStateHandleSaverKt.b(this.f24280a, property.getName(), this.f24281b, this.f24282c));
        }
    }

    private static final <T> e<a1<T>, a1<Object>> a(final e<T, ? extends Object> eVar) {
        f0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.a(new p<f, a1<T>, a1<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a1<Object> invoke(@d f Saver, @d a1<T> state) {
                f0.p(Saver, "$this$Saver");
                f0.p(state, "state");
                if (!(state instanceof r)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
                }
                Object objA = eVar.a(Saver, state.getValue());
                d2<T> d2VarA = ((r) state).a();
                f0.n(d2VarA, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return e2.j(objA, d2VarA);
            }
        }, new l<a1<Object>, a1<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a1<T> invoke(@d a1<Object> it) {
                T tB;
                f0.p(it, "it");
                if (!(it instanceof r)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (it.getValue() != null) {
                    e<T, Object> eVar2 = eVar;
                    Object value = it.getValue();
                    f0.m(value);
                    tB = eVar2.b(value);
                } else {
                    tB = null;
                }
                d2<T> d2VarA = ((r) it).a();
                f0.n(d2VarA, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0?>");
                a1<T> a1VarJ = e2.j(tB, d2VarA);
                f0.n(a1VarJ, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0>");
                return a1VarJ;
            }
        });
    }

    @d
    @androidx.lifecycle.viewmodel.compose.b
    public static final <T> a1<T> b(@d q0 q0Var, @d String key, @d e<T, ? extends Object> stateSaver, @d yh.a<? extends a1<T>> init) {
        f0.p(q0Var, "<this>");
        f0.p(key, "key");
        f0.p(stateSaver, "stateSaver");
        f0.p(init, "init");
        return (a1) c(q0Var, key, a(stateSaver), init);
    }

    @d
    @androidx.lifecycle.viewmodel.compose.b
    public static final <T> T c(@d q0 q0Var, @d String key, @d e<T, ? extends Object> saver, @d yh.a<? extends T> init) {
        T tInvoke;
        Object obj;
        f0.p(q0Var, "<this>");
        f0.p(key, "key");
        f0.p(saver, "saver");
        f0.p(init, "init");
        Bundle bundle = (Bundle) q0Var.h(key);
        if (bundle == null || (obj = bundle.get("value")) == null || (tInvoke = saver.b(obj)) == null) {
            tInvoke = init.invoke();
        }
        q0Var.r(key, new a(saver, tInvoke));
        return tInvoke;
    }

    @d
    @androidx.lifecycle.viewmodel.compose.b
    public static final <T> kotlin.properties.d<Object, kotlin.properties.e<Object, T>> d(@d q0 q0Var, @d e<T, ? extends Object> saver, @d yh.a<? extends T> init) {
        f0.p(q0Var, "<this>");
        f0.p(saver, "saver");
        f0.p(init, "init");
        return new b(q0Var, saver, init);
    }

    public static /* synthetic */ Object e(q0 q0Var, String str, e eVar, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = SaverKt.b();
        }
        return c(q0Var, str, eVar, aVar);
    }

    public static /* synthetic */ kotlin.properties.d f(q0 q0Var, e eVar, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = SaverKt.b();
        }
        return d(q0Var, eVar, aVar);
    }

    @d
    @h(name = "saveableMutableState")
    @androidx.lifecycle.viewmodel.compose.b
    public static final <T, M extends a1<T>> kotlin.properties.d<Object, kotlin.properties.f<Object, T>> g(@d q0 q0Var, @d e<T, ? extends Object> stateSaver, @d yh.a<? extends M> init) {
        f0.p(q0Var, "<this>");
        f0.p(stateSaver, "stateSaver");
        f0.p(init, "init");
        return new c(q0Var, stateSaver, init);
    }

    public static /* synthetic */ kotlin.properties.d h(q0 q0Var, e eVar, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = SaverKt.b();
        }
        return g(q0Var, eVar, aVar);
    }
}
