package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.d2;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.snapshots.r;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0011\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002\u001a\u0016\u0010\u0015\u001a\u00020\u0014*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "", "inputs", "Landroidx/compose/runtime/saveable/e;", "saver", "", "key", "Lkotlin/Function0;", lg.a.f131415h, "d", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/e;Ljava/lang/String;Lyh/a;Landroidx/compose/runtime/p;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/a1;", ak.aF, "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/e;Ljava/lang/String;Lyh/a;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/a1;", ak.au, "b", "Landroidx/compose/runtime/saveable/c;", "value", "Lkotlin/b2;", "e", "", ak.av, "I", "MaxSupportedRadix", "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class RememberSaveableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13095a = 36;

    private static final <T> e<a1<T>, a1<Object>> b(final e<T, ? extends Object> eVar) {
        f0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.a(new p<f, a1<T>, a1<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a1<Object> invoke(@dl.d f Saver, @dl.d a1<T> state) {
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
        }, new l<a1<Object>, a1<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a1<T> invoke(@dl.d a1<Object> it) {
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
                f0.n(d2VarA, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda-2?>");
                a1<T> a1VarJ = e2.j(tB, d2VarA);
                f0.n(a1VarJ, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda-2>");
                return a1VarJ;
            }
        });
    }

    @dl.d
    @h
    public static final <T> a1<T> c(@dl.d Object[] inputs, @dl.d e<T, ? extends Object> stateSaver, @dl.e String str, @dl.d yh.a<? extends a1<T>> init, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        f0.p(inputs, "inputs");
        f0.p(stateSaver, "stateSaver");
        f0.p(init, "init");
        pVar.T(-202053668);
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:136)");
        }
        a1<T> a1Var = (a1) d(Arrays.copyOf(inputs, inputs.length), b(stateSaver), str2, init, pVar, (i10 & bb.c.b.f30796me) | 8 | (i10 & bb.c.g.f32954lc), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @dl.d
    @h
    public static final <T> T d(@dl.d Object[] inputs, @dl.e e<T, ? extends Object> eVar, @dl.e final String str, @dl.d yh.a<? extends T> init, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        Object objE;
        f0.p(inputs, "inputs");
        f0.p(init, "init");
        pVar.T(441892779);
        if ((i11 & 2) != 0) {
            eVar = SaverKt.b();
        }
        T tB = null;
        if ((i11 & 4) != 0) {
            str = null;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)");
        }
        pVar.T(1059366469);
        if (str == null || str.length() == 0) {
            str = Integer.toString(ComposablesKt.j(pVar, 0), kotlin.text.b.a(f13095a));
            f0.o(str, "toString(this, checkRadix(radix))");
        }
        pVar.c0();
        f0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final c cVar = (c) pVar.K(SaveableStateRegistryKt.b());
        Object[] objArrCopyOf = Arrays.copyOf(inputs, inputs.length);
        pVar.T(-568225417);
        boolean zS = false;
        for (Object obj : objArrCopyOf) {
            zS |= pVar.s(obj);
        }
        T tInvoke = (T) pVar.U();
        if (zS || tInvoke == androidx.compose.runtime.p.INSTANCE.a()) {
            if (cVar != null && (objE = cVar.e(str)) != null) {
                tB = eVar.b(objE);
            }
            tInvoke = tB == null ? init.invoke() : tB;
            pVar.N(tInvoke);
        }
        pVar.c0();
        if (cVar != null) {
            final m2 m2VarT = e2.t(eVar, pVar, 0);
            final m2 m2VarT2 = e2.t(tInvoke, pVar, 0);
            EffectsKt.b(cVar, str, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ c.a f13102a;

                    public a(c.a aVar) {
                        this.f13102a = aVar;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f13102a.unregister();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    final m2<e<T, Object>> m2Var = m2VarT;
                    final m2<T> m2Var2 = m2VarT2;
                    final c cVar2 = cVar;
                    yh.a<? extends Object> aVar = new yh.a<Object>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1

                        /* JADX INFO: compiled from: RememberSaveable.kt */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        public static final class a implements f {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ c f13106a;

                            a(c cVar) {
                                this.f13106a = cVar;
                            }

                            @Override // androidx.compose.runtime.saveable.f
                            public final boolean a(@dl.d Object it) {
                                f0.p(it, "it");
                                return this.f13106a.a(it);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.e
                        public final Object invoke() {
                            return ((e) m2Var.getValue()).a(new a(cVar2), m2Var2.getValue());
                        }
                    };
                    RememberSaveableKt.e(cVar, aVar.invoke());
                    return new a(cVar.b(str, aVar));
                }
            }, pVar, 0);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c cVar, Object obj) {
        String str;
        if (obj == null || cVar.a(obj)) {
            return;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.a() == e2.l() || rVar.a() == e2.w() || rVar.a() == e2.s()) {
                str = "MutableState containing " + rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
