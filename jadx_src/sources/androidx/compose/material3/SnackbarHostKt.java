package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a<\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\"\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\"\"\u0014\u0010&\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"*b\b\u0002\u0010)\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006*"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/l1;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "snackbar", "b", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/n;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/c;", "accessibilityManager", "", RXScreenCaptureService.KEY_HEIGHT, org.apache.tools.ant.taskdefs.optional.vss.g.H2, "content", ak.av, "(Landroidx/compose/material3/l1;Landroidx/compose/ui/n;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/animation/core/h;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/m2;", "f", "(Landroidx/compose/animation/core/h;ZLyh/a;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "g", "(Landroidx/compose/animation/core/h;ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", "I", "SnackbarFadeInMillis", "SnackbarFadeOutMillis", ak.aF, "SnackbarInBetweenDelayMillis", "Lkotlin/m0;", "name", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SnackbarHostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f10817a = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f10818b = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f10819c = 0;

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10845a;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            f10845a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4 A[LOOP:0: B:52:0x00be->B:54:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa A[LOOP:1: B:59:0x00f4->B:61:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0214 A[LOOP:2: B:82:0x020e->B:84:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0264  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final l1 l1Var, androidx.compose.ui.n nVar, final yh.q<? super l1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        androidx.compose.ui.n nVar3;
        Object objU;
        final b0 b0Var;
        int i14;
        yh.a<ComposeUiNode> aVarA;
        int i15;
        ArrayList arrayList;
        Iterator it;
        final List listT5;
        List listB;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(-1316639904);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(l1Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= bb.c.b.f30966u4;
            } else if ((i10 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(qVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & bb.c.b.f30586db) == 146 || !pVarF.b()) {
                if (i16 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:340)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new b0();
                    pVarF.N(objU);
                }
                pVarF.c0();
                b0Var = (b0) objU;
                if (!kotlin.jvm.internal.f0.g(l1Var, b0Var.getCurrent())) {
                    b0Var.d(l1Var);
                    List listB2 = b0Var.b();
                    arrayList = new ArrayList(kotlin.collections.t.Y(listB2, 10));
                    it = listB2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((l1) ((FadeInFadeOutAnimationItem) it.next()).e());
                    }
                    listT5 = CollectionsKt___CollectionsKt.T5(arrayList);
                    if (!listT5.contains(l1Var)) {
                        listT5.add(l1Var);
                    }
                    b0Var.b().clear();
                    List<l1> listN2 = CollectionsKt___CollectionsKt.n2(listT5);
                    listB = b0Var.b();
                    for (final l1 l1Var2 : listN2) {
                        listB.add(new FadeInFadeOutAnimationItem(l1Var2, androidx.compose.runtime.internal.b.b(pVarF, 1365430839, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> children, @dl.e androidx.compose.runtime.p pVar2, int i17) {
                                int i18;
                                kotlin.jvm.internal.f0.p(children, "children");
                                if ((i17 & 14) == 0) {
                                    i18 = i17 | (pVar2.s(children) ? 4 : 2);
                                } else {
                                    i18 = i17;
                                }
                                if ((i18 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1365430839, i18, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:354)");
                                }
                                boolean zG = kotlin.jvm.internal.f0.g(l1Var2, l1Var);
                                int i19 = zG ? 150 : 75;
                                int i20 = (!zG || CollectionsKt___CollectionsKt.n2(listT5).size() == 1) ? 0 : 75;
                                androidx.compose.animation.core.e1 e1VarP = androidx.compose.animation.core.i.p(i19, i20, androidx.compose.animation.core.d0.c());
                                final l1 l1Var3 = l1Var2;
                                final b0<l1> b0Var2 = b0Var;
                                m2 m2VarF = SnackbarHostKt.f(e1VarP, zG, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (kotlin.jvm.internal.f0.g(l1Var3, b0Var2.getCurrent())) {
                                            return;
                                        }
                                        List<FadeInFadeOutAnimationItem<l1>> listB3 = b0Var2.b();
                                        final l1 l1Var4 = l1Var3;
                                        kotlin.collections.x.I0(listB3, new yh.l<FadeInFadeOutAnimationItem<l1>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // yh.l
                                            @dl.d
                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(@dl.d FadeInFadeOutAnimationItem<l1> it2) {
                                                kotlin.jvm.internal.f0.p(it2, "it");
                                                return Boolean.valueOf(kotlin.jvm.internal.f0.g(it2.e(), l1Var4));
                                            }
                                        });
                                        androidx.compose.runtime.n1 scope = b0Var2.getScope();
                                        if (scope != null) {
                                            scope.invalidate();
                                        }
                                    }
                                }, pVar2, 0, 0);
                                m2 m2VarG = SnackbarHostKt.g(androidx.compose.animation.core.i.p(i19, i20, androidx.compose.animation.core.d0.b()), zG, pVar2, 0);
                                androidx.compose.ui.n nVarE = GraphicsLayerModifierKt.e(androidx.compose.ui.n.INSTANCE, ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null);
                                final l1 l1Var4 = l1Var2;
                                pVar2.T(1157296644);
                                boolean zS = pVar2.s(l1Var4);
                                Object objU2 = pVar2.U();
                                if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d r semantics) {
                                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                            SemanticsPropertiesKt.k0(semantics, androidx.compose.ui.semantics.e.INSTANCE.b());
                                            final l1 l1Var5 = l1Var4;
                                            SemanticsPropertiesKt.l(semantics, null, new yh.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // yh.a
                                                @dl.d
                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    l1Var5.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                            a(rVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    };
                                    pVar2.N(objU2);
                                }
                                pVar2.c0();
                                androidx.compose.ui.n nVarC = SemanticsModifierKt.c(nVarE, false, (yh.l) objU2, 1, null);
                                pVar2.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar2, 0);
                                pVar2.T(-1323940314);
                                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarC);
                                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar2.h();
                                if (pVar2.D()) {
                                    pVar2.L(aVarA2);
                                } else {
                                    pVar2.d();
                                }
                                pVar2.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                                Updater.j(pVarB, i0VarK, companion.d());
                                Updater.j(pVarB, eVar, companion.b());
                                Updater.j(pVarB, layoutDirection, companion.c());
                                Updater.j(pVarB, d2Var, companion.f());
                                pVar2.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                                pVar2.T(2058660585);
                                pVar2.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar2.T(-208740163);
                                children.invoke(pVar2, Integer.valueOf(i18 & 14));
                                pVar2.c0();
                                pVar2.c0();
                                pVar2.c0();
                                pVar2.f();
                                pVar2.c0();
                                pVar2.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar2, androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar2, pVar3, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        })));
                    }
                }
                i14 = (i12 >> 3) & 14;
                pVarF.T(733328855);
                int i17 = i14 >> 3;
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i17 & 112) | (i17 & 14));
                pVarF.T(-1323940314);
                s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVar3);
                i15 = ((((i14 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                Updater.j(pVarB, i0VarK, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVarF.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i15 >> 9) & 14 & 11) == 2 || !pVarF.b()) {
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                    pVarF.T(393759974);
                    if (((((i14 >> 6) & 112) | 6) & 81) == 16 || !pVarF.b()) {
                        b0Var.f(ComposablesKt.m(pVarF, 0));
                        for (FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem : b0Var.b()) {
                            final l1 l1Var3 = (l1) fadeInFadeOutAnimationItem.a();
                            yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB = fadeInFadeOutAnimationItem.b();
                            pVarF.X(870027402, l1Var3);
                            qVarB.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                                    if ((i18 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1462081411, i18, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                    }
                                    yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                    l1 l1Var4 = l1Var3;
                                    kotlin.jvm.internal.f0.m(l1Var4);
                                    qVar2.invoke(l1Var4, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, 6);
                            pVarF.b0();
                        }
                    } else {
                        pVarF.l();
                    }
                    pVarF.c0();
                } else {
                    pVarF.l();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar4 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    SnackbarHostKt.a(l1Var, nVar4, qVar, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            if (pVarF.s(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & bb.c.b.f30586db) == 146) {
            if (i16 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:340)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new b0();
                pVarF.N(objU);
            }
            pVarF.c0();
            b0Var = (b0) objU;
            if (!kotlin.jvm.internal.f0.g(l1Var, b0Var.getCurrent())) {
                b0Var.d(l1Var);
                List listB3 = b0Var.b();
                arrayList = new ArrayList(kotlin.collections.t.Y(listB3, 10));
                it = listB3.iterator();
                while (it.hasNext()) {
                    arrayList.add((l1) ((FadeInFadeOutAnimationItem) it.next()).e());
                }
                listT5 = CollectionsKt___CollectionsKt.T5(arrayList);
                if (!listT5.contains(l1Var)) {
                    listT5.add(l1Var);
                }
                b0Var.b().clear();
                List<l1> listN3 = CollectionsKt___CollectionsKt.n2(listT5);
                listB = b0Var.b();
                while (r11.hasNext()) {
                    listB.add(new FadeInFadeOutAnimationItem(l1Var2, androidx.compose.runtime.internal.b.b(pVarF, 1365430839, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> children, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                            int i19;
                            kotlin.jvm.internal.f0.p(children, "children");
                            if ((i18 & 14) == 0) {
                                i19 = i18 | (pVar2.s(children) ? 4 : 2);
                            } else {
                                i19 = i18;
                            }
                            if ((i19 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1365430839, i19, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:354)");
                            }
                            boolean zG = kotlin.jvm.internal.f0.g(l1Var2, l1Var);
                            int i110 = zG ? 150 : 75;
                            int i20 = (!zG || CollectionsKt___CollectionsKt.n2(listT5).size() == 1) ? 0 : 75;
                            androidx.compose.animation.core.e1 e1VarP = androidx.compose.animation.core.i.p(i110, i20, androidx.compose.animation.core.d0.c());
                            final l1 l1Var4 = l1Var2;
                            final b0<l1> b0Var2 = b0Var;
                            m2 m2VarF = SnackbarHostKt.f(e1VarP, zG, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (kotlin.jvm.internal.f0.g(l1Var4, b0Var2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<l1>> listB4 = b0Var2.b();
                                    final l1 l1Var5 = l1Var4;
                                    kotlin.collections.x.I0(listB4, new yh.l<FadeInFadeOutAnimationItem<l1>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // yh.l
                                        @dl.d
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(@dl.d FadeInFadeOutAnimationItem<l1> it2) {
                                            kotlin.jvm.internal.f0.p(it2, "it");
                                            return Boolean.valueOf(kotlin.jvm.internal.f0.g(it2.e(), l1Var5));
                                        }
                                    });
                                    androidx.compose.runtime.n1 scope = b0Var2.getScope();
                                    if (scope != null) {
                                        scope.invalidate();
                                    }
                                }
                            }, pVar2, 0, 0);
                            m2 m2VarG = SnackbarHostKt.g(androidx.compose.animation.core.i.p(i110, i20, androidx.compose.animation.core.d0.b()), zG, pVar2, 0);
                            androidx.compose.ui.n nVarE = GraphicsLayerModifierKt.e(androidx.compose.ui.n.INSTANCE, ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null);
                            final l1 l1Var5 = l1Var2;
                            pVar2.T(1157296644);
                            boolean zS = pVar2.s(l1Var5);
                            Object objU2 = pVar2.U();
                            if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d r semantics) {
                                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.k0(semantics, androidx.compose.ui.semantics.e.INSTANCE.b());
                                        final l1 l1Var6 = l1Var5;
                                        SemanticsPropertiesKt.l(semantics, null, new yh.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                            {
                                                super(0);
                                            }

                                            @Override // yh.a
                                            @dl.d
                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                l1Var6.dismiss();
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                                pVar2.N(objU2);
                            }
                            pVar2.c0();
                            androidx.compose.ui.n nVarC = SemanticsModifierKt.c(nVarE, false, (yh.l) objU2, 1, null);
                            pVar2.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar2, 0);
                            pVar2.T(-1323940314);
                            s1.e eVar2 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarC);
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.D()) {
                                pVar2.L(aVarA2);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVar2);
                            Updater.j(pVarB2, i0VarK2, companion2.d());
                            Updater.j(pVarB2, eVar2, companion2.b());
                            Updater.j(pVarB2, layoutDirection2, companion2.c());
                            Updater.j(pVarB2, d2Var2, companion2.f());
                            pVar2.x();
                            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                            pVar2.T(2058660585);
                            pVar2.T(-2137368960);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                            pVar2.T(-208740163);
                            children.invoke(pVar2, Integer.valueOf(i19 & 14));
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar2, androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar2, pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    })));
                }
            }
            i14 = (i12 >> 3) & 14;
            pVarF.T(733328855);
            int i18 = i14 >> 3;
            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i18 & 112) | (i18 & 14));
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVar3);
            i15 = ((((i14 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarK2, companion2.d());
            Updater.j(pVarB2, eVar2, companion2.b());
            Updater.j(pVarB2, layoutDirection2, companion2.c());
            Updater.j(pVarB2, d2Var2, companion2.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            if (((i15 >> 9) & 14 & 11) == 2) {
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                pVarF.T(393759974);
                if (((((i14 >> 6) & 112) | 6) & 81) == 16) {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var4 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB2 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var4);
                        qVarB2.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                if ((i19 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i19, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var5 = l1Var4;
                                kotlin.jvm.internal.f0.m(l1Var5);
                                qVar2.invoke(l1Var5, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                } else {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var5 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB3 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var5);
                        qVarB3.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                if ((i19 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i19, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var6 = l1Var5;
                                kotlin.jvm.internal.f0.m(l1Var6);
                                qVar2.invoke(l1Var6, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                pVarF.T(393759974);
                if (((((i14 >> 6) & 112) | 6) & 81) == 16) {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var6 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB4 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var6);
                        qVarB4.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                if ((i19 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i19, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var7 = l1Var6;
                                kotlin.jvm.internal.f0.m(l1Var7);
                                qVar2.invoke(l1Var7, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                } else {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var7 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB5 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var7);
                        qVarB5.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                if ((i19 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i19, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var8 = l1Var7;
                                kotlin.jvm.internal.f0.m(l1Var8);
                                qVar2.invoke(l1Var8, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        } else {
            if (i16 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:340)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new b0();
                pVarF.N(objU);
            }
            pVarF.c0();
            b0Var = (b0) objU;
            if (!kotlin.jvm.internal.f0.g(l1Var, b0Var.getCurrent())) {
                b0Var.d(l1Var);
                List listB4 = b0Var.b();
                arrayList = new ArrayList(kotlin.collections.t.Y(listB4, 10));
                it = listB4.iterator();
                while (it.hasNext()) {
                    arrayList.add((l1) ((FadeInFadeOutAnimationItem) it.next()).e());
                }
                listT5 = CollectionsKt___CollectionsKt.T5(arrayList);
                if (!listT5.contains(l1Var)) {
                    listT5.add(l1Var);
                }
                b0Var.b().clear();
                List<l1> listN4 = CollectionsKt___CollectionsKt.n2(listT5);
                listB = b0Var.b();
                while (r11.hasNext()) {
                    listB.add(new FadeInFadeOutAnimationItem(l1Var2, androidx.compose.runtime.internal.b.b(pVarF, 1365430839, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> children, @dl.e androidx.compose.runtime.p pVar2, int i19) {
                            int i110;
                            kotlin.jvm.internal.f0.p(children, "children");
                            if ((i19 & 14) == 0) {
                                i110 = i19 | (pVar2.s(children) ? 4 : 2);
                            } else {
                                i110 = i19;
                            }
                            if ((i110 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1365430839, i110, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:354)");
                            }
                            boolean zG = kotlin.jvm.internal.f0.g(l1Var2, l1Var);
                            int i111 = zG ? 150 : 75;
                            int i20 = (!zG || CollectionsKt___CollectionsKt.n2(listT5).size() == 1) ? 0 : 75;
                            androidx.compose.animation.core.e1 e1VarP = androidx.compose.animation.core.i.p(i111, i20, androidx.compose.animation.core.d0.c());
                            final l1 l1Var8 = l1Var2;
                            final b0<l1> b0Var2 = b0Var;
                            m2 m2VarF = SnackbarHostKt.f(e1VarP, zG, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (kotlin.jvm.internal.f0.g(l1Var8, b0Var2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<l1>> listB5 = b0Var2.b();
                                    final l1 l1Var9 = l1Var8;
                                    kotlin.collections.x.I0(listB5, new yh.l<FadeInFadeOutAnimationItem<l1>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // yh.l
                                        @dl.d
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(@dl.d FadeInFadeOutAnimationItem<l1> it2) {
                                            kotlin.jvm.internal.f0.p(it2, "it");
                                            return Boolean.valueOf(kotlin.jvm.internal.f0.g(it2.e(), l1Var9));
                                        }
                                    });
                                    androidx.compose.runtime.n1 scope = b0Var2.getScope();
                                    if (scope != null) {
                                        scope.invalidate();
                                    }
                                }
                            }, pVar2, 0, 0);
                            m2 m2VarG = SnackbarHostKt.g(androidx.compose.animation.core.i.p(i111, i20, androidx.compose.animation.core.d0.b()), zG, pVar2, 0);
                            androidx.compose.ui.n nVarE = GraphicsLayerModifierKt.e(androidx.compose.ui.n.INSTANCE, ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarG.getValue()).floatValue(), ((Number) m2VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null);
                            final l1 l1Var9 = l1Var2;
                            pVar2.T(1157296644);
                            boolean zS = pVar2.s(l1Var9);
                            Object objU2 = pVar2.U();
                            if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d r semantics) {
                                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.k0(semantics, androidx.compose.ui.semantics.e.INSTANCE.b());
                                        final l1 l1Var10 = l1Var9;
                                        SemanticsPropertiesKt.l(semantics, null, new yh.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                            {
                                                super(0);
                                            }

                                            @Override // yh.a
                                            @dl.d
                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                l1Var10.dismiss();
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                                pVar2.N(objU2);
                            }
                            pVar2.c0();
                            androidx.compose.ui.n nVarC = SemanticsModifierKt.c(nVarE, false, (yh.l) objU2, 1, null);
                            pVar2.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar2, 0);
                            pVar2.T(-1323940314);
                            s1.e eVar3 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection3 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion3.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarC);
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.D()) {
                                pVar2.L(aVarA2);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB3 = Updater.b(pVar2);
                            Updater.j(pVarB3, i0VarK3, companion3.d());
                            Updater.j(pVarB3, eVar3, companion3.b());
                            Updater.j(pVarB3, layoutDirection3, companion3.c());
                            Updater.j(pVarB3, d2Var3, companion3.f());
                            pVar2.x();
                            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                            pVar2.T(2058660585);
                            pVar2.T(-2137368960);
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                            pVar2.T(-208740163);
                            children.invoke(pVar2, Integer.valueOf(i110 & 14));
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar2, androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar2, pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    })));
                }
            }
            i14 = (i12 >> 3) & 14;
            pVarF.T(733328855);
            int i19 = i14 >> 3;
            androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i19 & 112) | (i19 & 14));
            pVarF.T(-1323940314);
            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVar3);
            i15 = ((((i14 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
            Updater.j(pVarB3, i0VarK3, companion3.d());
            Updater.j(pVarB3, eVar3, companion3.b());
            Updater.j(pVarB3, layoutDirection3, companion3.c());
            Updater.j(pVarB3, d2Var3, companion3.f());
            pVarF.x();
            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            if (((i15 >> 9) & 14 & 11) == 2) {
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                pVarF.T(393759974);
                if (((((i14 >> 6) & 112) | 6) & 81) == 16) {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var8 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB6 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var8);
                        qVarB6.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                                if ((i110 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i110, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var9 = l1Var8;
                                kotlin.jvm.internal.f0.m(l1Var9);
                                qVar2.invoke(l1Var9, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                } else {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var9 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB7 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var9);
                        qVarB7.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                                if ((i110 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i110, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var10 = l1Var9;
                                kotlin.jvm.internal.f0.m(l1Var10);
                                qVar2.invoke(l1Var10, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                pVarF.T(393759974);
                if (((((i14 >> 6) & 112) | 6) & 81) == 16) {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var10 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB8 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var10);
                        qVarB8.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                                if ((i110 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i110, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var11 = l1Var10;
                                kotlin.jvm.internal.f0.m(l1Var11);
                                qVar2.invoke(l1Var11, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                } else {
                    b0Var.f(ComposablesKt.m(pVarF, 0));
                    while (r0.hasNext()) {
                        final l1 l1Var11 = (l1) fadeInFadeOutAnimationItem.a();
                        yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarB9 = fadeInFadeOutAnimationItem.b();
                        pVarF.X(870027402, l1Var11);
                        qVarB9.invoke(androidx.compose.runtime.internal.b.b(pVarF, -1462081411, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                                if ((i110 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1462081411, i110, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:403)");
                                }
                                yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                                l1 l1Var12 = l1Var11;
                                kotlin.jvm.internal.f0.m(l1Var12);
                                qVar2.invoke(l1Var12, pVar2, Integer.valueOf((i12 >> 3) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 6);
                        pVarF.b0();
                    }
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar5 = nVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                SnackbarHostKt.a(l1Var, nVar5, qVar, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final SnackbarHostState hostState, @dl.e androidx.compose.ui.n nVar, @dl.e yh.q<? super l1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(hostState, "hostState");
        androidx.compose.runtime.p pVarF = pVar.F(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(hostState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(nVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(qVar) ? 256 : 128;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (i14 != 0) {
                qVar = ComposableSingletons$SnackbarHostKt.f9324a.a();
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(464178177, i12, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:218)");
            }
            l1 l1VarB = hostState.b();
            EffectsKt.h(l1VarB, new SnackbarHostKt$SnackbarHost$1(l1VarB, (androidx.compose.ui.platform.c) pVarF.K(CompositionLocalsKt.c()), null), pVarF, 64);
            a(hostState.b(), nVar, qVar, pVarF, (i12 & 112) | (i12 & bb.c.b.f30796me), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar2 = nVar;
        final yh.q<? super l1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2 = qVar;
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                SnackbarHostKt.b(hostState, nVar2, qVar2, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final m2<Float> f(androidx.compose.animation.core.h<Float> hVar, boolean z10, yh.a<kotlin.b2> aVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1431889134);
        if ((i11 & 4) != 0) {
            aVar = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarHostKt$animatedOpacity$1
                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        yh.a<kotlin.b2> aVar2 = aVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1431889134, i10, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:426)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = androidx.compose.animation.core.b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        Animatable animatable = (Animatable) objU;
        EffectsKt.h(Boolean.valueOf(z10), new SnackbarHostKt$animatedOpacity$2(animatable, z10, hVar, aVar2, null), pVar, ((i10 >> 3) & 14) | 64);
        m2<Float> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final m2<Float> g(androidx.compose.animation.core.h<Float> hVar, boolean z10, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1966809761);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1966809761, i10, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:443)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = androidx.compose.animation.core.b.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        Animatable animatable = (Animatable) objU;
        EffectsKt.h(Boolean.valueOf(z10), new SnackbarHostKt$animatedScale$1(animatable, z10, hVar, null), pVar, ((i10 >> 3) & 14) | 64);
        m2<Float> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    public static final long h(@dl.d SnackbarDuration snackbarDuration, boolean z10, @dl.e androidx.compose.ui.platform.c cVar) {
        long j10;
        kotlin.jvm.internal.f0.p(snackbarDuration, "<this>");
        int i10 = a.f10845a[snackbarDuration.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return cVar == null ? j11 : cVar.a(j11, true, true, z10);
    }
}
