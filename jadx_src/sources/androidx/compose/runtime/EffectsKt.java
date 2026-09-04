package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a<\u0010\u0010\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0013\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0017\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0015\"\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001d\u001a\u00020\u00012'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aE\u0010\u001f\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aO\u0010!\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aS\u0010%\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0015\"\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001\u001a(\u0010.\u001a\u00020\u001a2\u0013\b\u0006\u0010-\u001a\r\u0012\u0004\u0012\u00020'0\u0000¢\u0006\u0002\b,H\u0087\bø\u0001\u0001¢\u0006\u0004\b.\u0010/\"\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100\"\u0014\u00104\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u00103\"\u0014\u00105\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "effect", "k", "(Lyh/a;Landroidx/compose/runtime/p;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/f0;", "Landroidx/compose/runtime/e0;", "Lkotlin/t;", "d", "(Lyh/l;Landroidx/compose/runtime/p;I)V", "", "key1", ak.aF, "(Ljava/lang/Object;Lyh/l;Landroidx/compose/runtime/p;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Landroidx/compose/runtime/p;I)V", "key3", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Landroidx/compose/runtime/p;I)V", "", Constants.PARAM_KEYS, "e", "([Ljava/lang/Object;Lyh/l;Landroidx/compose/runtime/p;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/c;", "block", "i", "(Lyh/p;Landroidx/compose/runtime/p;I)V", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "g", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "j", "([Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/p;", "composer", "m", "Landroidx/compose/runtime/c0;", "getContext", "n", "(Lyh/a;Landroidx/compose/runtime/p;II)Lkotlinx/coroutines/q0;", "Landroidx/compose/runtime/f0;", "InternalDisposableEffectScope", "", "Ljava/lang/String;", "DisposableEffectNoParamError", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class EffectsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final f0 f12373a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f12374b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f12375c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @h
    public static final void a(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.d yh.l<? super f0, ? extends e0> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(-1239538271);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(obj) | pVar.s(obj2) | pVar.s(obj3);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new d0(effect));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void b(@dl.e Object obj, @dl.e Object obj2, @dl.d yh.l<? super f0, ? extends e0> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(1429097729);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        pVar.T(511388516);
        boolean zS = pVar.s(obj) | pVar.s(obj2);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new d0(effect));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void c(@dl.e Object obj, @dl.d yh.l<? super f0, ? extends e0> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(-1371986847);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(obj);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new d0(effect));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = f12374b)
    @h
    public static final void d(@dl.d yh.l<? super f0, ? extends e0> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(-904483903);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:115)");
        }
        throw new IllegalStateException(f12374b.toString());
    }

    @h
    public static final void e(@dl.d Object[] keys, @dl.d yh.l<? super f0, ? extends e0> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(-1307627122);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:271)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(keys, keys.length);
        pVar.T(-568225417);
        boolean zS = false;
        for (Object obj : objArrCopyOf) {
            zS |= pVar.s(obj);
        }
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new d0(effect));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void f(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> block, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(-54093371);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        CoroutineContext coroutineContextM = pVar.M();
        pVar.T(1618982084);
        boolean zS = pVar.s(obj) | pVar.s(obj2) | pVar.s(obj3);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new t0(coroutineContextM, block));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void g(@dl.e Object obj, @dl.e Object obj2, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> block, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(590241125);
        if (ComposerKt.g0()) {
            ComposerKt.w0(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        CoroutineContext coroutineContextM = pVar.M();
        pVar.T(511388516);
        boolean zS = pVar.s(obj) | pVar.s(obj2);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new t0(coroutineContextM, block));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void h(@dl.e Object obj, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> block, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(1179185413);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        CoroutineContext coroutineContextM = pVar.M();
        pVar.T(1157296644);
        boolean zS = pVar.s(obj);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new t0(coroutineContextM, block));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = f12375c)
    @h
    public static final void i(@dl.d final yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> block, @dl.e p pVar, final int i10) {
        kotlin.jvm.internal.f0.p(block, "block");
        p pVarF = pVar.F(-805415771);
        if ((i10 & 1) != 0 || !pVarF.b()) {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-805415771, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:313)");
            }
            throw new IllegalStateException(f12375c.toString());
        }
        pVarF.l();
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.EffectsKt$LaunchedEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i11) {
                EffectsKt.i(block, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @h
    public static final void j(@dl.d Object[] keys, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> block, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(-139560008);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        CoroutineContext coroutineContextM = pVar.M();
        Object[] objArrCopyOf = Arrays.copyOf(keys, keys.length);
        pVar.T(-568225417);
        boolean zS = false;
        for (Object obj : objArrCopyOf) {
            zS |= pVar.s(obj);
        }
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            pVar.N(new t0(coroutineContextM, block));
        }
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @h
    public static final void k(@dl.d yh.a<kotlin.b2> effect, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        pVar.T(-1288466761);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        pVar.g(effect);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @dl.d
    @kotlin.r0
    public static final kotlinx.coroutines.q0 m(@dl.d CoroutineContext coroutineContext, @dl.d p composer) {
        kotlin.jvm.internal.f0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.f0.p(composer, "composer");
        kotlinx.coroutines.d2.Companion companion = kotlinx.coroutines.d2.INSTANCE;
        if (coroutineContext.f(companion) == null) {
            CoroutineContext coroutineContextM = composer.M();
            return kotlinx.coroutines.r0.a(coroutineContextM.I(kotlinx.coroutines.g2.a((kotlinx.coroutines.d2) coroutineContextM.f(companion))).I(coroutineContext));
        }
        kotlinx.coroutines.b0 b0VarC = kotlinx.coroutines.i2.c(null, 1, null);
        b0VarC.i(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.r0.a(b0VarC);
    }

    @dl.d
    @h
    public static final kotlinx.coroutines.q0 n(@dl.e yh.a<? extends CoroutineContext> aVar, @dl.e p pVar, int i10, int i11) {
        pVar.T(773894976);
        if ((i11 & 1) != 0) {
            aVar = new yh.a<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.f124694b;
                }
            };
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = new x(m(aVar.invoke(), pVar));
            pVar.N(objU);
        }
        pVar.c0();
        kotlinx.coroutines.q0 coroutineScope = ((x) objU).getCoroutineScope();
        pVar.c0();
        return coroutineScope;
    }
}
