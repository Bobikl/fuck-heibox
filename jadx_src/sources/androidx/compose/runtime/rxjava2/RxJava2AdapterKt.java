package androidx.compose.runtime.rxjava2;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.f0;
import androidx.compose.runtime.h;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import io.reactivex.disposables.b;
import io.reactivex.i0;
import io.reactivex.j;
import io.reactivex.q;
import io.reactivex.z;
import kh.g;
import kotlin.Metadata;
import kotlin.b2;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: RxJava2Adapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0014*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u00002+\b\u0004\u0010\u001a\u001a%\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\u0002\b\u0019H\u0083\b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"R", androidx.exifinterface.media.a.f23244d5, "Lio/reactivex/z;", "initial", "Landroidx/compose/runtime/m2;", "e", "(Lio/reactivex/z;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Lio/reactivex/j;", ak.aF, "(Lio/reactivex/j;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Lio/reactivex/i0;", "f", "(Lio/reactivex/i0;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Lio/reactivex/q;", "d", "(Lio/reactivex/q;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Lio/reactivex/a;", "", "b", "(Lio/reactivex/a;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", androidx.exifinterface.media.a.R4, "Lkotlin/Function2;", "Lkotlin/Function1;", "Lkotlin/b2;", "Lio/reactivex/disposables/b;", "Lkotlin/t;", "subscribe", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "runtime-rxjava2_release"}, k = 2, mv = {1, 7, 1})
public final class RxJava2AdapterKt {

    /* JADX INFO: compiled from: RxJava2Adapter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final /* synthetic */ class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ l f13059b;

        a(l lVar) {
            this.f13059b = lVar;
        }

        @Override // kh.g
        public final /* synthetic */ void accept(Object obj) {
            this.f13059b.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: RxJava2Adapter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b implements kh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Boolean, b2> f13065b;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super Boolean, b2> lVar) {
            this.f13065b = lVar;
        }

        @Override // kh.a
        public final void run() {
            this.f13065b.invoke(Boolean.TRUE);
        }
    }

    @h
    private static final <T, S> m2<T> a(final S s10, T t10, final p<? super S, ? super l<? super T, b2>, ? extends io.reactivex.disposables.b> pVar, androidx.compose.runtime.p pVar2, int i10) {
        pVar2.T(1188063717);
        pVar2.T(-492369756);
        Object objU = pVar2.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar2.N(objU);
        }
        pVar2.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(s10, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$asState$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13063a;

                public a(b bVar) {
                    this.f13063a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13063a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
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
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                p<S, l<? super T, b2>, b> pVar3 = pVar;
                S s11 = s10;
                final a1<T> a1Var2 = a1Var;
                return new a(pVar3.invoke(s11, new l<T, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$asState$1$disposable$1
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
                    public final void invoke2(T t11) {
                        a1Var2.setValue(t11);
                    }
                }));
            }
        }, pVar2, i10 & 14);
        pVar2.c0();
        return a1Var;
    }

    @d
    @h
    public static final m2<Boolean> b(@d final io.reactivex.a aVar, @e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        pVar.T(-1096770830);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1096770830, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:125)");
        }
        Boolean bool = Boolean.FALSE;
        pVar.T(1188063717);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(bool, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(aVar, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$5

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release", "androidx/compose/runtime/rxjava2/RxJava2AdapterKt$asState$1$a"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13085a;

                public a(b bVar) {
                    this.f13085a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13085a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                Object obj = aVar;
                final a1 a1Var2 = a1Var;
                b bVarH0 = ((io.reactivex.a) obj).H0(new RxJava2AdapterKt.b(new l<Boolean, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$5.1
                    {
                        super(1);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Boolean bool2) {
                        m5invoke(bool2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m5invoke(Boolean bool2) {
                        a1Var2.setValue(bool2);
                    }
                }));
                kotlin.jvm.internal.f0.o(bVarH0, "callback -> subscribe { callback(true) }");
                return new a(bVarH0);
            }
        }, pVar, 8);
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @d
    @h
    public static final <R, T extends R> m2<R> c(@d final j<T> jVar, R r10, @e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(jVar, "<this>");
        pVar.T(-88151092);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-88151092, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:68)");
        }
        int i11 = (i10 & 112) | (((i10 >> 3) & 8) << 3) | 8;
        pVar.T(1188063717);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(r10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(jVar, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$2

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release", "androidx/compose/runtime/rxjava2/RxJava2AdapterKt$asState$1$a"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13073a;

                public a(b bVar) {
                    this.f13073a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13073a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                Object obj = jVar;
                final a1 a1Var2 = a1Var;
                b bVarF6 = ((j) obj).f6(new RxJava2AdapterKt.a(new l<R, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$2.1
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
                    public final void invoke2(R r11) {
                        a1Var2.setValue(r11);
                    }
                }));
                kotlin.jvm.internal.f0.o(bVarF6, "subscribe(it)");
                return new a(bVarF6);
            }
        }, pVar, i11 & 14);
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @d
    @h
    public static final <R, T extends R> m2<R> d(@d final q<T> qVar, R r10, @e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        pVar.T(-1187249144);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1187249144, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:108)");
        }
        int i11 = (i10 & 112) | (((i10 >> 3) & 8) << 3) | 8;
        pVar.T(1188063717);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(r10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(qVar, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$4

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release", "androidx/compose/runtime/rxjava2/RxJava2AdapterKt$asState$1$a"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13081a;

                public a(b bVar) {
                    this.f13081a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13081a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                Object obj = qVar;
                final a1 a1Var2 = a1Var;
                b bVarO1 = ((q) obj).o1(new RxJava2AdapterKt.a(new l<R, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$4.1
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
                    public final void invoke2(R r11) {
                        a1Var2.setValue(r11);
                    }
                }));
                kotlin.jvm.internal.f0.o(bVarO1, "subscribe(it)");
                return new a(bVarO1);
            }
        }, pVar, i11 & 14);
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @d
    @h
    public static final <R, T extends R> m2<R> e(@d final z<T> zVar, R r10, @e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(zVar, "<this>");
        pVar.T(1018254449);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1018254449, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:48)");
        }
        int i11 = (i10 & 112) | (((i10 >> 3) & 8) << 3) | 8;
        pVar.T(1188063717);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(r10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(zVar, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release", "androidx/compose/runtime/rxjava2/RxJava2AdapterKt$asState$1$a"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13069a;

                public a(b bVar) {
                    this.f13069a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13069a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                Object obj = zVar;
                final a1 a1Var2 = a1Var;
                b bVarD5 = ((z) obj).D5(new RxJava2AdapterKt.a(new l<R, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$1.1
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
                    public final void invoke2(R r11) {
                        a1Var2.setValue(r11);
                    }
                }));
                kotlin.jvm.internal.f0.o(bVarD5, "subscribe(it)");
                return new a(bVarD5);
            }
        }, pVar, i11 & 14);
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @d
    @h
    public static final <R, T extends R> m2<R> f(@d final i0<T> i0Var, R r10, @e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(i0Var, "<this>");
        pVar.T(-1511060596);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1511060596, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:88)");
        }
        int i11 = (i10 & 112) | (((i10 >> 3) & 8) << 3) | 8;
        pVar.T(1188063717);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(r10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        EffectsKt.c(i0Var, new l<f0, e0>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$3

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release", "androidx/compose/runtime/rxjava2/RxJava2AdapterKt$asState$1$a"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f13077a;

                public a(b bVar) {
                    this.f13077a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13077a.dispose();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@d f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                Object obj = i0Var;
                final a1 a1Var2 = a1Var;
                b bVarA1 = ((i0) obj).a1(new RxJava2AdapterKt.a(new l<R, b2>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$3.1
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
                    public final void invoke2(R r11) {
                        a1Var2.setValue(r11);
                    }
                }));
                kotlin.jvm.internal.f0.o(bVarA1, "subscribe(it)");
                return new a(bVarA1);
            }
        }, pVar, i11 & 14);
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
