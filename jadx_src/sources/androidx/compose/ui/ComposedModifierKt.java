package androidx.compose.ui;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a^\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ah\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ar\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001al\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0016\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0012\u0010\u001c\u001a\u00020\u0000*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "Landroidx/compose/runtime/h;", "factory", "g", "(Landroidx/compose/ui/n;Lyh/l;Lyh/q;)Landroidx/compose/ui/n;", "", "fullyQualifiedName", "", "key1", "e", "(Landroidx/compose/ui/n;Ljava/lang/String;Ljava/lang/Object;Lyh/l;Lyh/q;)Landroidx/compose/ui/n;", "key2", "d", "(Landroidx/compose/ui/n;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Lyh/q;)Landroidx/compose/ui/n;", "key3", ak.aF, "(Landroidx/compose/ui/n;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Lyh/q;)Landroidx/compose/ui/n;", "", Constants.PARAM_KEYS, "f", "(Landroidx/compose/ui/n;Ljava/lang/String;[Ljava/lang/Object;Lyh/l;Lyh/q;)Landroidx/compose/ui/n;", "Landroidx/compose/runtime/p;", "modifier", "m", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ComposedModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.q<androidx.compose.ui.focus.d, androidx.compose.runtime.p, Integer, n> f13386a = new yh.q<androidx.compose.ui.focus.d, androidx.compose.runtime.p, Integer, androidx.compose.ui.focus.e>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1
        @dl.d
        @androidx.compose.runtime.h
        public final androidx.compose.ui.focus.e a(@dl.d androidx.compose.ui.focus.d mod, @dl.e androidx.compose.runtime.p pVar, int i10) {
            f0.p(mod, "mod");
            pVar.T(-1790596922);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1790596922, i10, -1, "androidx.compose.ui.WrapFocusEventModifier.<anonymous> (ComposedModifier.kt:308)");
            }
            pVar.T(1157296644);
            boolean zS = pVar.s(mod);
            Object objU = pVar.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new androidx.compose.ui.focus.e(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(mod));
                pVar.N(objU);
            }
            pVar.c0();
            final androidx.compose.ui.focus.e eVar = (androidx.compose.ui.focus.e) objU;
            pVar.T(1157296644);
            boolean zS2 = pVar.s(eVar);
            Object objU2 = pVar.U();
            if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                objU2 = new yh.a<b2>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1$1$1
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        eVar.f();
                    }
                };
                pVar.N(objU2);
            }
            pVar.c0();
            EffectsKt.k((yh.a) objU2, pVar, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return eVar;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.focus.e invoke(androidx.compose.ui.focus.d dVar, androidx.compose.runtime.p pVar, Integer num) {
            return a(dVar, pVar, num.intValue());
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.q<androidx.compose.ui.focus.t, androidx.compose.runtime.p, Integer, n> f13387b = new yh.q<androidx.compose.ui.focus.t, androidx.compose.runtime.p, Integer, u>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusRequesterModifier$1
        @dl.d
        @androidx.compose.runtime.h
        public final u a(@dl.d androidx.compose.ui.focus.t mod, @dl.e androidx.compose.runtime.p pVar, int i10) {
            f0.p(mod, "mod");
            pVar.T(945678692);
            if (ComposerKt.g0()) {
                ComposerKt.w0(945678692, i10, -1, "androidx.compose.ui.WrapFocusRequesterModifier.<anonymous> (ComposedModifier.kt:318)");
            }
            pVar.T(1157296644);
            boolean zS = pVar.s(mod);
            Object objU = pVar.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new u(mod.i0());
                pVar.N(objU);
            }
            pVar.c0();
            u uVar = (u) objU;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return uVar;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ u invoke(androidx.compose.ui.focus.t tVar, androidx.compose.runtime.p pVar, Integer num) {
            return a(tVar, pVar, num.intValue());
        }
    };

    @g
    @dl.d
    public static final n c(@dl.d n nVar, @dl.d String fullyQualifiedName, @dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        f0.p(nVar, "<this>");
        f0.p(fullyQualifiedName, "fullyQualifiedName");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        return nVar.s0(new k(fullyQualifiedName, obj, obj2, obj3, inspectorInfo, factory));
    }

    @g
    @dl.d
    public static final n d(@dl.d n nVar, @dl.d String fullyQualifiedName, @dl.e Object obj, @dl.e Object obj2, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        f0.p(nVar, "<this>");
        f0.p(fullyQualifiedName, "fullyQualifiedName");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        return nVar.s0(new j(fullyQualifiedName, obj, obj2, inspectorInfo, factory));
    }

    @g
    @dl.d
    public static final n e(@dl.d n nVar, @dl.d String fullyQualifiedName, @dl.e Object obj, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        f0.p(nVar, "<this>");
        f0.p(fullyQualifiedName, "fullyQualifiedName");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        return nVar.s0(new i(fullyQualifiedName, obj, inspectorInfo, factory));
    }

    @g
    @dl.d
    public static final n f(@dl.d n nVar, @dl.d String fullyQualifiedName, @dl.d Object[] keys, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        f0.p(nVar, "<this>");
        f0.p(fullyQualifiedName, "fullyQualifiedName");
        f0.p(keys, "keys");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        return nVar.s0(new l(fullyQualifiedName, keys, inspectorInfo, factory));
    }

    @dl.d
    public static final n g(@dl.d n nVar, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        f0.p(nVar, "<this>");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        return nVar.s0(new f(inspectorInfo, factory));
    }

    public static /* synthetic */ n h(n nVar, String str, Object obj, Object obj2, Object obj3, yh.l lVar, yh.q qVar, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            lVar = InspectableValueKt.b();
        }
        return c(nVar, str, obj, obj2, obj3, lVar, qVar);
    }

    public static /* synthetic */ n i(n nVar, String str, Object obj, Object obj2, yh.l lVar, yh.q qVar, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            lVar = InspectableValueKt.b();
        }
        return d(nVar, str, obj, obj2, lVar, qVar);
    }

    public static /* synthetic */ n j(n nVar, String str, Object obj, yh.l lVar, yh.q qVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.b();
        }
        return e(nVar, str, obj, lVar, qVar);
    }

    public static /* synthetic */ n k(n nVar, String str, Object[] objArr, yh.l lVar, yh.q qVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.b();
        }
        return f(nVar, str, objArr, lVar, qVar);
    }

    public static /* synthetic */ n l(n nVar, yh.l lVar, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = InspectableValueKt.b();
        }
        return g(nVar, lVar, qVar);
    }

    @dl.d
    public static final n m(@dl.d final androidx.compose.runtime.p pVar, @dl.d n modifier) {
        f0.p(pVar, "<this>");
        f0.p(modifier, "modifier");
        if (modifier.a0(new yh.l<n.c, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d n.c it) {
                f0.p(it, "it");
                return Boolean.valueOf(((it instanceof f) || (it instanceof androidx.compose.ui.focus.d) || (it instanceof androidx.compose.ui.focus.t)) ? false : true);
            }
        })) {
            return modifier;
        }
        pVar.T(1219399079);
        n nVar = (n) modifier.x(n.INSTANCE, new yh.p<n, n.c, n>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n invoke(@dl.d n acc, @dl.d n.c element) {
                n nVarS0;
                n nVarS1;
                f0.p(acc, "acc");
                f0.p(element, "element");
                if (element instanceof f) {
                    yh.q<n, androidx.compose.runtime.p, Integer, n> qVarF = ((f) element).f();
                    f0.n(qVarF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    nVarS1 = ComposedModifierKt.m(pVar, (n) ((yh.q) w0.q(qVarF, 3)).invoke(n.INSTANCE, pVar, 0));
                } else {
                    if (element instanceof androidx.compose.ui.focus.d) {
                        yh.q qVar = ComposedModifierKt.f13386a;
                        f0.n(qVar, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusEventModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                        nVarS0 = element.s0((n) ((yh.q) w0.q(qVar, 3)).invoke(element, pVar, 0));
                    } else {
                        nVarS0 = element;
                    }
                    if (element instanceof androidx.compose.ui.focus.t) {
                        yh.q qVar2 = ComposedModifierKt.f13387b;
                        f0.n(qVar2, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusRequesterModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                        nVarS1 = nVarS0.s0((n) ((yh.q) w0.q(qVar2, 3)).invoke(element, pVar, 0));
                    } else {
                        nVarS1 = nVarS0;
                    }
                }
                return acc.s0(nVarS1);
            }
        });
        pVar.c0();
        return nVar;
    }
}
