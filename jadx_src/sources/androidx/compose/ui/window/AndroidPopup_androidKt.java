package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.w;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.o;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0013\b\b\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0083\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002\u001a\u001a\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\" \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/c;", "alignment", "Ls1/n;", w.c.R, "Lkotlin/Function0;", "Lkotlin/b2;", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Landroidx/compose/ui/c;JLyh/a;Landroidx/compose/ui/window/h;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/window/g;", "popupPositionProvider", ak.av, "(Landroidx/compose/ui/window/g;Lyh/a;Landroidx/compose/ui/window/h;Lyh/p;Landroidx/compose/runtime/p;II)V", "", "tag", "d", "(Ljava/lang/String;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/n;", "modifier", "e", "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroid/view/View;", "", "i", "Landroid/graphics/Rect;", "Ls1/p;", "l", sd.b.f139384b, "testTag", "j", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/j1;", "LocalPopupTestTag", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidPopup_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<String> f17116a = CompositionLocalKt.d(null, new yh.a<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[PHI: r1 r3
  0x00d0: PHI (r1v39 int) = (r1v14 int), (r1v14 int), (r1v40 int) binds: [B:62:0x00af, B:57:0x00a5, B:58:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r3v15 yh.a<kotlin.b2>) = (r3v3 yh.a<kotlin.b2>), (r3v2 yh.a<kotlin.b2>), (r3v2 yh.a<kotlin.b2>) binds: [B:62:0x00af, B:57:0x00a5, B:58:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x020d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0219  */
    /* JADX WARN: Code duplicated, block: B:78:0x021d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0273  */
    /* JADX WARN: Code duplicated, block: B:86:0x0281  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final g popupPositionProvider, @dl.e yh.a<b2> aVar, @dl.e h hVar, @dl.d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        yh.a<b2> aVar2;
        h hVar2;
        int i13;
        int i14;
        h hVar3;
        yh.a<b2> aVar3;
        View view;
        s1.e eVar;
        final String str;
        LayoutDirection layoutDirection;
        r rVarU;
        final m2 m2VarT;
        UUID popupId;
        Object objU;
        LayoutDirection layoutDirection2;
        yh.a<ComposeUiNode> aVarA;
        final yh.a<b2> aVar4;
        final h hVar4;
        u1 u1VarH;
        f0.p(popupPositionProvider, "popupPositionProvider");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(popupPositionProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                aVar2 = aVar;
                i12 |= pVarF.s(aVar2) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    hVar2 = hVar;
                    int i16 = pVarF.s(hVar2) ? 256 : 128;
                    i12 |= i16;
                } else {
                    hVar2 = hVar;
                }
                i12 |= i16;
            } else {
                hVar2 = hVar;
            }
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & bb.c.f.br) == 1170 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i15 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        i14 = i12 & (-897);
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        aVar3 = aVar2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:219)");
                    }
                    view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    str = (String) pVarF.K(f17116a);
                    layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    rVarU = ComposablesKt.u(pVarF, 0);
                    m2VarT = e2.t(content, pVarF, (i14 >> 9) & 14);
                    popupId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new yh.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                        @Override // yh.a
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    }, pVarF, bb.c.d.f31377lj, 6);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        f0.o(popupId, "popupId");
                        layoutDirection2 = layoutDirection;
                        final PopupLayout popupLayout = new PopupLayout(aVar3, hVar3, str, view, eVar, popupPositionProvider, popupId, null, 128, null);
                        popupLayout.setContent(rVarU, androidx.compose.runtime.internal.b.c(1302892335, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                                if ((i17 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1302892335, i17, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:242)");
                                }
                                n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                        f0.p(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.U(semantics);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                        a(rVar);
                                        return b2.f124493a;
                                    }
                                }, 1, null);
                                final PopupLayout popupLayout2 = popupLayout;
                                n nVarA = androidx.compose.ui.draw.a.a(OnRemeasuredModifierKt.a(nVarC, new l<s1.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    public final void a(long j10) {
                                        popupLayout2.m7setPopupContentSizefhxjrPA(s1.r.b(j10));
                                        popupLayout2.u();
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                                        a(rVar.getF139248a());
                                        return b2.f124493a;
                                    }
                                }), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                                final m2<p<androidx.compose.runtime.p, Integer, b2>> m2Var = m2VarT;
                                androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar2, 606497925, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i18) {
                                        if ((i18 & 11) == 2 && pVar3.b()) {
                                            pVar3.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(606497925, i18, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:253)");
                                        }
                                        AndroidPopup_androidKt.b(m2Var).invoke(pVar3, 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                        a(pVar3, num.intValue());
                                        return b2.f124493a;
                                    }
                                });
                                pVar2.T(1406149896);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17161a;
                                pVar2.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection3 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                                d2 d2Var = (d2) pVar2.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion.a();
                                q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarA);
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
                                Updater.j(pVarB, androidPopup_androidKt$SimpleStack$1, companion.d());
                                Updater.j(pVarB, eVar2, companion.b());
                                Updater.j(pVarB, layoutDirection3, companion.c());
                                Updater.j(pVarB, d2Var, companion.f());
                                pVar2.x();
                                qVarF.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
                                pVar2.T(2058660585);
                                aVarB.invoke(pVar2, 6);
                                pVar2.c0();
                                pVar2.f();
                                pVar2.c0();
                                pVar2.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        }));
                        pVarF.N(popupLayout);
                        objU = popupLayout;
                    } else {
                        layoutDirection2 = layoutDirection;
                    }
                    pVarF.c0();
                    final PopupLayout popupLayout2 = (PopupLayout) objU;
                    final yh.a<b2> aVar5 = aVar3;
                    final h hVar5 = hVar3;
                    final LayoutDirection layoutDirection3 = layoutDirection2;
                    EffectsKt.c(popupLayout2, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ PopupLayout f17130a;

                            public a(PopupLayout popupLayout) {
                                this.f17130a = popupLayout;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f17130a.e();
                                this.f17130a.n();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            popupLayout2.p();
                            popupLayout2.r(aVar5, hVar5, str, layoutDirection3);
                            return new a(popupLayout2);
                        }
                    }, pVarF, 8);
                    EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            popupLayout2.r(aVar5, hVar5, str, layoutDirection3);
                        }
                    }, pVarF, 0);
                    EffectsKt.c(popupPositionProvider, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {
                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            popupLayout2.setPositionProvider(popupPositionProvider);
                            popupLayout2.u();
                            return new a();
                        }
                    }, pVarF, i14 & 14);
                    EffectsKt.h(popupLayout2, new AndroidPopup_androidKt$Popup$5(popupLayout2, null), pVarF, 72);
                    n nVarA = OnGloballyPositionedModifierKt.a(n.INSTANCE, new l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.layout.q childCoordinates) {
                            f0.p(childCoordinates, "childCoordinates");
                            androidx.compose.ui.layout.q qVarD = childCoordinates.D();
                            f0.m(qVarD);
                            popupLayout2.t(qVarD);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                            a(qVar);
                            return b2.f124493a;
                        }
                    });
                    final LayoutDirection layoutDirection4 = layoutDirection2;
                    i0 i0Var = new i0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                        @Override // androidx.compose.ui.layout.i0
                        @dl.d
                        public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> list, long j10) {
                            f0.p(Layout, "$this$Layout");
                            f0.p(list, "<anonymous parameter 0>");
                            popupLayout2.setParentLayoutDirection(layoutDirection4);
                            return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                                public final void a(@dl.d e1.a layout) {
                                    f0.p(layout, "$this$layout");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar6) {
                                    a(aVar6);
                                    return b2.f124493a;
                                }
                            }, 4, null);
                        }

                        @Override // androidx.compose.ui.layout.i0
                        public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i17) {
                            return h0.c(this, nVar, list, i17);
                        }

                        @Override // androidx.compose.ui.layout.i0
                        public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i17) {
                            return h0.d(this, nVar, list, i17);
                        }

                        @Override // androidx.compose.ui.layout.i0
                        public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i17) {
                            return h0.a(this, nVar, list, i17);
                        }

                        @Override // androidx.compose.ui.layout.i0
                        public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i17) {
                            return h0.b(this, nVar, list, i17);
                        }
                    };
                    pVarF.T(-1323940314);
                    s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    aVarA = companion.a();
                    q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarA);
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
                    Updater.j(pVarB, i0Var, companion.d());
                    Updater.j(pVarB, eVar2, companion.b());
                    Updater.j(pVarB, layoutDirection5, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVarF.x();
                    qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(2085825549);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    aVar4 = aVar3;
                    hVar4 = hVar3;
                } else {
                    pVarF.l();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                i14 = i12;
                aVar3 = aVar2;
                hVar3 = hVar2;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:219)");
                }
                view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                str = (String) pVarF.K(f17116a);
                layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                rVarU = ComposablesKt.u(pVarF, 0);
                m2VarT = e2.t(content, pVarF, (i14 >> 9) & 14);
                popupId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new yh.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // yh.a
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, pVarF, bb.c.d.f31377lj, 6);
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    f0.o(popupId, "popupId");
                    layoutDirection2 = layoutDirection;
                    final PopupLayout popupLayout3 = new PopupLayout(aVar3, hVar3, str, view, eVar, popupPositionProvider, popupId, null, 128, null);
                    popupLayout3.setContent(rVarU, androidx.compose.runtime.internal.b.c(1302892335, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                            if ((i17 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1302892335, i17, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:242)");
                            }
                            n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                    f0.p(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.U(semantics);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                    a(rVar);
                                    return b2.f124493a;
                                }
                            }, 1, null);
                            final PopupLayout popupLayout4 = popupLayout3;
                            n nVarA2 = androidx.compose.ui.draw.a.a(OnRemeasuredModifierKt.a(nVarC, new l<s1.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                {
                                    super(1);
                                }

                                public final void a(long j10) {
                                    popupLayout4.m7setPopupContentSizefhxjrPA(s1.r.b(j10));
                                    popupLayout4.u();
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                                    a(rVar.getF139248a());
                                    return b2.f124493a;
                                }
                            }), popupLayout3.getCanCalculatePosition() ? 1.0f : 0.0f);
                            final m2<? extends p<? super androidx.compose.runtime.p, ? super Integer, b2>> m2Var = m2VarT;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar2, 606497925, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i18) {
                                    if ((i18 & 11) == 2 && pVar3.b()) {
                                        pVar3.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(606497925, i18, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:253)");
                                    }
                                    AndroidPopup_androidKt.b(m2Var).invoke(pVar3, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                    a(pVar3, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                            pVar2.T(1406149896);
                            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17161a;
                            pVar2.T(-1323940314);
                            s1.e eVar3 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection6 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            d2 d2Var2 = (d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion2.a();
                            q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF2 = LayoutKt.f(nVarA2);
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
                            Updater.j(pVarB2, androidPopup_androidKt$SimpleStack$1, companion2.d());
                            Updater.j(pVarB2, eVar3, companion2.b());
                            Updater.j(pVarB2, layoutDirection6, companion2.c());
                            Updater.j(pVarB2, d2Var2, companion2.f());
                            pVar2.x();
                            qVarF2.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
                            pVar2.T(2058660585);
                            aVarB.invoke(pVar2, 6);
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    }));
                    pVarF.N(popupLayout3);
                    objU = popupLayout3;
                } else {
                    layoutDirection2 = layoutDirection;
                }
                pVarF.c0();
                final PopupLayout popupLayout4 = (PopupLayout) objU;
                final yh.a<b2> aVar6 = aVar3;
                final h hVar6 = hVar3;
                final LayoutDirection layoutDirection6 = layoutDirection2;
                EffectsKt.c(popupLayout4, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements e0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ PopupLayout f17130a;

                        public a(PopupLayout popupLayout) {
                            this.f17130a = popupLayout;
                        }

                        @Override // androidx.compose.runtime.e0
                        public void dispose() {
                            this.f17130a.e();
                            this.f17130a.n();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                        f0.p(DisposableEffect, "$this$DisposableEffect");
                        popupLayout4.p();
                        popupLayout4.r(aVar6, hVar6, str, layoutDirection6);
                        return new a(popupLayout4);
                    }
                }, pVarF, 8);
                EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        popupLayout4.r(aVar6, hVar6, str, layoutDirection6);
                    }
                }, pVarF, 0);
                EffectsKt.c(popupPositionProvider, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements e0 {
                        @Override // androidx.compose.runtime.e0
                        public void dispose() {
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                        f0.p(DisposableEffect, "$this$DisposableEffect");
                        popupLayout4.setPositionProvider(popupPositionProvider);
                        popupLayout4.u();
                        return new a();
                    }
                }, pVarF, i14 & 14);
                EffectsKt.h(popupLayout4, new AndroidPopup_androidKt$Popup$5(popupLayout4, null), pVarF, 72);
                n nVarA2 = OnGloballyPositionedModifierKt.a(n.INSTANCE, new l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.layout.q childCoordinates) {
                        f0.p(childCoordinates, "childCoordinates");
                        androidx.compose.ui.layout.q qVarD = childCoordinates.D();
                        f0.m(qVarD);
                        popupLayout4.t(qVarD);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                        a(qVar);
                        return b2.f124493a;
                    }
                });
                final LayoutDirection layoutDirection7 = layoutDirection2;
                i0 i0Var2 = new i0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // androidx.compose.ui.layout.i0
                    @dl.d
                    public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> list, long j10) {
                        f0.p(Layout, "$this$Layout");
                        f0.p(list, "<anonymous parameter 0>");
                        popupLayout4.setParentLayoutDirection(layoutDirection7);
                        return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            public final void a(@dl.d e1.a layout) {
                                f0.p(layout, "$this$layout");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar7) {
                                a(aVar7);
                                return b2.f124493a;
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i17) {
                        return h0.c(this, nVar, list, i17);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i17) {
                        return h0.d(this, nVar, list, i17);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i17) {
                        return h0.a(this, nVar, list, i17);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i17) {
                        return h0.b(this, nVar, list, i17);
                    }
                };
                pVarF.T(-1323940314);
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var2 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                aVarA = companion2.a();
                q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF2 = LayoutKt.f(nVarA2);
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
                Updater.j(pVarB2, i0Var2, companion2.d());
                Updater.j(pVarB2, eVar3, companion2.b());
                Updater.j(pVarB2, layoutDirection8, companion2.c());
                Updater.j(pVarB2, d2Var2, companion2.f());
                pVarF.x();
                qVarF2.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(2085825549);
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                aVar4 = aVar3;
                hVar4 = hVar3;
            } else {
                pVarF.l();
                aVar4 = aVar2;
                hVar4 = hVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                    AndroidPopup_androidKt.a(popupPositionProvider, aVar4, hVar4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        aVar2 = aVar;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                }
                i12 |= i16;
            } else {
                hVar2 = hVar;
            }
            i12 |= i16;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            if (pVarF.s(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & bb.c.f.br) == 1170) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 4) != 0) {
                    i14 = i12 & (-897);
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    aVar3 = aVar2;
                } else {
                    i14 = i12;
                    aVar3 = aVar2;
                    hVar3 = hVar2;
                }
            } else {
                if (i15 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 4) != 0) {
                    i14 = i12 & (-897);
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    aVar3 = aVar2;
                } else {
                    i14 = i12;
                    aVar3 = aVar2;
                    hVar3 = hVar2;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:219)");
            }
            view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            str = (String) pVarF.K(f17116a);
            layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            rVarU = ComposablesKt.u(pVarF, 0);
            m2VarT = e2.t(content, pVarF, (i14 >> 9) & 14);
            popupId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new yh.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, pVarF, bb.c.d.f31377lj, 6);
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                f0.o(popupId, "popupId");
                layoutDirection2 = layoutDirection;
                final PopupLayout popupLayout5 = new PopupLayout(aVar3, hVar3, str, view, eVar, popupPositionProvider, popupId, null, 128, null);
                popupLayout5.setContent(rVarU, androidx.compose.runtime.internal.b.c(1302892335, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                        if ((i17 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1302892335, i17, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:242)");
                        }
                        n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                f0.p(semantics, "$this$semantics");
                                SemanticsPropertiesKt.U(semantics);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        }, 1, null);
                        final PopupLayout popupLayout6 = popupLayout5;
                        n nVarA3 = androidx.compose.ui.draw.a.a(OnRemeasuredModifierKt.a(nVarC, new l<s1.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                popupLayout6.m7setPopupContentSizefhxjrPA(s1.r.b(j10));
                                popupLayout6.u();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return b2.f124493a;
                            }
                        }), popupLayout5.getCanCalculatePosition() ? 1.0f : 0.0f);
                        final m2<? extends p<? super androidx.compose.runtime.p, ? super Integer, b2>> m2Var = m2VarT;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar2, 606497925, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i18) {
                                if ((i18 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(606497925, i18, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:253)");
                                }
                                AndroidPopup_androidKt.b(m2Var).invoke(pVar3, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                        pVar2.T(1406149896);
                        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17161a;
                        pVar2.T(-1323940314);
                        s1.e eVar4 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection9 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        d2 d2Var3 = (d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion3.a();
                        q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF3 = LayoutKt.f(nVarA3);
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
                        Updater.j(pVarB3, androidPopup_androidKt$SimpleStack$1, companion3.d());
                        Updater.j(pVarB3, eVar4, companion3.b());
                        Updater.j(pVarB3, layoutDirection9, companion3.c());
                        Updater.j(pVarB3, d2Var3, companion3.f());
                        pVar2.x();
                        qVarF3.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        aVarB.invoke(pVar2, 6);
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }));
                pVarF.N(popupLayout5);
                objU = popupLayout5;
            } else {
                layoutDirection2 = layoutDirection;
            }
            pVarF.c0();
            final PopupLayout popupLayout6 = (PopupLayout) objU;
            final yh.a<b2> aVar7 = aVar3;
            final h hVar7 = hVar3;
            final LayoutDirection layoutDirection9 = layoutDirection2;
            EffectsKt.c(popupLayout6, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PopupLayout f17130a;

                    public a(PopupLayout popupLayout) {
                        this.f17130a = popupLayout;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f17130a.e();
                        this.f17130a.n();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout6.p();
                    popupLayout6.r(aVar7, hVar7, str, layoutDirection9);
                    return new a(popupLayout6);
                }
            }, pVarF, 8);
            EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    popupLayout6.r(aVar7, hVar7, str, layoutDirection9);
                }
            }, pVarF, 0);
            EffectsKt.c(popupPositionProvider, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {
                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout6.setPositionProvider(popupPositionProvider);
                    popupLayout6.u();
                    return new a();
                }
            }, pVarF, i14 & 14);
            EffectsKt.h(popupLayout6, new AndroidPopup_androidKt$Popup$5(popupLayout6, null), pVarF, 72);
            n nVarA3 = OnGloballyPositionedModifierKt.a(n.INSTANCE, new l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.layout.q childCoordinates) {
                    f0.p(childCoordinates, "childCoordinates");
                    androidx.compose.ui.layout.q qVarD = childCoordinates.D();
                    f0.m(qVarD);
                    popupLayout6.t(qVarD);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                    a(qVar);
                    return b2.f124493a;
                }
            });
            final LayoutDirection layoutDirection10 = layoutDirection2;
            i0 i0Var3 = new i0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> list, long j10) {
                    f0.p(Layout, "$this$Layout");
                    f0.p(list, "<anonymous parameter 0>");
                    popupLayout6.setParentLayoutDirection(layoutDirection10);
                    return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                        public final void a(@dl.d e1.a layout) {
                            f0.p(layout, "$this$layout");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar8) {
                            a(aVar8);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.c(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.d(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.a(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.b(this, nVar, list, i17);
                }
            };
            pVarF.T(-1323940314);
            s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var3 = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            aVarA = companion3.a();
            q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF3 = LayoutKt.f(nVarA3);
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
            Updater.j(pVarB3, i0Var3, companion3.d());
            Updater.j(pVarB3, eVar4, companion3.b());
            Updater.j(pVarB3, layoutDirection11, companion3.c());
            Updater.j(pVarB3, d2Var3, companion3.f());
            pVarF.x();
            qVarF3.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(2085825549);
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            aVar4 = aVar3;
            hVar4 = hVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 4) != 0) {
                    i14 = i12 & (-897);
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    aVar3 = aVar2;
                } else {
                    i14 = i12;
                    aVar3 = aVar2;
                    hVar3 = hVar2;
                }
            } else {
                if (i15 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 4) != 0) {
                    i14 = i12 & (-897);
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    aVar3 = aVar2;
                } else {
                    i14 = i12;
                    aVar3 = aVar2;
                    hVar3 = hVar2;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:219)");
            }
            view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            str = (String) pVarF.K(f17116a);
            layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            rVarU = ComposablesKt.u(pVarF, 0);
            m2VarT = e2.t(content, pVarF, (i14 >> 9) & 14);
            popupId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new yh.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, pVarF, bb.c.d.f31377lj, 6);
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                f0.o(popupId, "popupId");
                layoutDirection2 = layoutDirection;
                final PopupLayout popupLayout7 = new PopupLayout(aVar3, hVar3, str, view, eVar, popupPositionProvider, popupId, null, 128, null);
                popupLayout7.setContent(rVarU, androidx.compose.runtime.internal.b.c(1302892335, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                        if ((i17 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1302892335, i17, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:242)");
                        }
                        n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                f0.p(semantics, "$this$semantics");
                                SemanticsPropertiesKt.U(semantics);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        }, 1, null);
                        final PopupLayout popupLayout8 = popupLayout7;
                        n nVarA4 = androidx.compose.ui.draw.a.a(OnRemeasuredModifierKt.a(nVarC, new l<s1.r, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                popupLayout8.m7setPopupContentSizefhxjrPA(s1.r.b(j10));
                                popupLayout8.u();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return b2.f124493a;
                            }
                        }), popupLayout7.getCanCalculatePosition() ? 1.0f : 0.0f);
                        final m2<? extends p<? super androidx.compose.runtime.p, ? super Integer, b2>> m2Var = m2VarT;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar2, 606497925, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i18) {
                                if ((i18 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(606497925, i18, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:253)");
                                }
                                AndroidPopup_androidKt.b(m2Var).invoke(pVar3, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                        pVar2.T(1406149896);
                        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17161a;
                        pVar2.T(-1323940314);
                        s1.e eVar5 = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection12 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        d2 d2Var4 = (d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion4.a();
                        q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF4 = LayoutKt.f(nVarA4);
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
                        androidx.compose.runtime.p pVarB4 = Updater.b(pVar2);
                        Updater.j(pVarB4, androidPopup_androidKt$SimpleStack$1, companion4.d());
                        Updater.j(pVarB4, eVar5, companion4.b());
                        Updater.j(pVarB4, layoutDirection12, companion4.c());
                        Updater.j(pVarB4, d2Var4, companion4.f());
                        pVar2.x();
                        qVarF4.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        aVarB.invoke(pVar2, 6);
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }));
                pVarF.N(popupLayout7);
                objU = popupLayout7;
            } else {
                layoutDirection2 = layoutDirection;
            }
            pVarF.c0();
            final PopupLayout popupLayout8 = (PopupLayout) objU;
            final yh.a<b2> aVar8 = aVar3;
            final h hVar8 = hVar3;
            final LayoutDirection layoutDirection12 = layoutDirection2;
            EffectsKt.c(popupLayout8, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PopupLayout f17130a;

                    public a(PopupLayout popupLayout) {
                        this.f17130a = popupLayout;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f17130a.e();
                        this.f17130a.n();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout8.p();
                    popupLayout8.r(aVar8, hVar8, str, layoutDirection12);
                    return new a(popupLayout8);
                }
            }, pVarF, 8);
            EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    popupLayout8.r(aVar8, hVar8, str, layoutDirection12);
                }
            }, pVarF, 0);
            EffectsKt.c(popupPositionProvider, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {
                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout8.setPositionProvider(popupPositionProvider);
                    popupLayout8.u();
                    return new a();
                }
            }, pVarF, i14 & 14);
            EffectsKt.h(popupLayout8, new AndroidPopup_androidKt$Popup$5(popupLayout8, null), pVarF, 72);
            n nVarA4 = OnGloballyPositionedModifierKt.a(n.INSTANCE, new l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.layout.q childCoordinates) {
                    f0.p(childCoordinates, "childCoordinates");
                    androidx.compose.ui.layout.q qVarD = childCoordinates.D();
                    f0.m(qVarD);
                    popupLayout8.t(qVarD);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                    a(qVar);
                    return b2.f124493a;
                }
            });
            final LayoutDirection layoutDirection13 = layoutDirection2;
            i0 i0Var4 = new i0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> list, long j10) {
                    f0.p(Layout, "$this$Layout");
                    f0.p(list, "<anonymous parameter 0>");
                    popupLayout8.setParentLayoutDirection(layoutDirection13);
                    return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                        public final void a(@dl.d e1.a layout) {
                            f0.p(layout, "$this$layout");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar9) {
                            a(aVar9);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.c(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.d(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.a(this, nVar, list, i17);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i17) {
                    return h0.b(this, nVar, list, i17);
                }
            };
            pVarF.T(-1323940314);
            s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection14 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var4 = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            aVarA = companion4.a();
            q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF4 = LayoutKt.f(nVarA4);
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
            androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
            Updater.j(pVarB4, i0Var4, companion4.d());
            Updater.j(pVarB4, eVar5, companion4.b());
            Updater.j(pVarB4, layoutDirection14, companion4.c());
            Updater.j(pVarB4, d2Var4, companion4.f());
            pVarF.x();
            qVarF4.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(2085825549);
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            aVar4 = aVar3;
            hVar4 = hVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                AndroidPopup_androidKt.a(popupPositionProvider, aVar4, hVar4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<androidx.compose.runtime.p, Integer, b2> b(m2<? extends p<? super androidx.compose.runtime.p, ? super Integer, b2>> m2Var) {
        return (p) m2Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    /* JADX WARN: Code duplicated, block: B:99:0x0170  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.e androidx.compose.ui.c cVar, long j10, @dl.e yh.a<b2> aVar, @dl.e h hVar, @dl.d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.c cVar2;
        int i12;
        long j11;
        int i13;
        yh.a<b2> aVar2;
        int i14;
        h hVar2;
        int i15;
        androidx.compose.ui.c cVarC;
        long jA;
        h hVar3;
        long j12;
        boolean zS;
        Object objU;
        final androidx.compose.ui.c cVar3;
        final long j13;
        final yh.a<b2> aVar3;
        final h hVar4;
        u1 u1VarH;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(295309329);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            cVar2 = cVar;
        } else if ((i10 & 14) == 0) {
            cVar2 = cVar;
            i12 = (pVarF.s(cVar2) ? 4 : 2) | i10;
        } else {
            cVar2 = cVar;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                j11 = j10;
                i12 |= pVarF.z(j11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    aVar2 = aVar;
                    if (pVarF.s(aVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if ((i11 & 8) == 0) {
                        hVar2 = hVar;
                        int i18 = pVarF.s(hVar2) ? 2048 : 1024;
                        i12 |= i18;
                    } else {
                        hVar2 = hVar;
                    }
                    i12 |= i18;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((46811 & i12) == 9362 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i16 != 0) {
                            cVarC = androidx.compose.ui.c.INSTANCE.C();
                        } else {
                            cVarC = cVar2;
                        }
                        if (i17 != 0) {
                            jA = o.a(0, 0);
                        } else {
                            jA = j11;
                        }
                        if (i13 != 0) {
                            aVar2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            hVar3 = new h(false, false, false, null, false, false, 63, null);
                            i12 &= -7169;
                        } else {
                            hVar3 = hVar2;
                        }
                        j12 = jA;
                    } else {
                        pVarF.l();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        cVarC = cVar2;
                        aVar2 = aVar2;
                        hVar3 = hVar2;
                        j12 = j11;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
                    }
                    s1.n nVarB = s1.n.b(j12);
                    pVarF.T(511388516);
                    zS = pVarF.s(nVarB) | pVarF.s(cVarC);
                    objU = pVarF.U();
                    if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new a(cVarC, j12, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a aVar4 = (a) objU;
                    int i19 = i12 >> 3;
                    a(aVar4, aVar2, hVar3, content, pVarF, (i19 & 112) | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    cVar3 = cVarC;
                    j13 = j12;
                    aVar3 = aVar2;
                    hVar4 = hVar3;
                } else {
                    pVarF.l();
                    cVar3 = cVar2;
                    j13 = j11;
                    aVar3 = aVar2;
                    hVar4 = hVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        AndroidPopup_androidKt.c(cVar3, j13, aVar3, hVar4, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            aVar2 = aVar;
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                    }
                    i12 |= i18;
                } else {
                    hVar2 = hVar;
                }
                i12 |= i18;
            } else {
                hVar2 = hVar;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.s(content)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46811 & i12) == 9362) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                } else {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
                }
                s1.n nVarB2 = s1.n.b(j12);
                pVarF.T(511388516);
                zS = pVarF.s(nVarB2) | pVarF.s(cVarC);
                objU = pVarF.U();
                if (zS) {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                } else {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar5 = (a) objU;
                int i110 = i12 >> 3;
                a(aVar5, aVar2, hVar3, content, pVarF, (i110 & 112) | (i110 & bb.c.b.f30796me) | (i110 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                cVar3 = cVarC;
                j13 = j12;
                aVar3 = aVar2;
                hVar4 = hVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                } else {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
                }
                s1.n nVarB3 = s1.n.b(j12);
                pVarF.T(511388516);
                zS = pVarF.s(nVarB3) | pVarF.s(cVarC);
                objU = pVarF.U();
                if (zS) {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                } else {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar6 = (a) objU;
                int i111 = i12 >> 3;
                a(aVar6, aVar2, hVar3, content, pVarF, (i111 & 112) | (i111 & bb.c.b.f30796me) | (i111 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                cVar3 = cVarC;
                j13 = j12;
                aVar3 = aVar2;
                hVar4 = hVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    AndroidPopup_androidKt.c(cVar3, j13, aVar3, hVar4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        j11 = j10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                aVar2 = aVar;
                if (pVarF.s(aVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                    }
                    i12 |= i18;
                } else {
                    hVar2 = hVar;
                }
                i12 |= i18;
            } else {
                hVar2 = hVar;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.s(content)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46811 & i12) == 9362) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                } else {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
                }
                s1.n nVarB4 = s1.n.b(j12);
                pVarF.T(511388516);
                zS = pVarF.s(nVarB4) | pVarF.s(cVarC);
                objU = pVarF.U();
                if (zS) {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                } else {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar7 = (a) objU;
                int i112 = i12 >> 3;
                a(aVar7, aVar2, hVar3, content, pVarF, (i112 & 112) | (i112 & bb.c.b.f30796me) | (i112 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                cVar3 = cVarC;
                j13 = j12;
                aVar3 = aVar2;
                hVar4 = hVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                } else {
                    if (i16 != 0) {
                        cVarC = androidx.compose.ui.c.INSTANCE.C();
                    } else {
                        cVarC = cVar2;
                    }
                    if (i17 != 0) {
                        jA = o.a(0, 0);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        aVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        hVar3 = new h(false, false, false, null, false, false, 63, null);
                        i12 &= -7169;
                    } else {
                        hVar3 = hVar2;
                    }
                    j12 = jA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
                }
                s1.n nVarB5 = s1.n.b(j12);
                pVarF.T(511388516);
                zS = pVarF.s(nVarB5) | pVarF.s(cVarC);
                objU = pVarF.U();
                if (zS) {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                } else {
                    objU = new a(cVarC, j12, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar8 = (a) objU;
                int i113 = i12 >> 3;
                a(aVar8, aVar2, hVar3, content, pVarF, (i113 & 112) | (i113 & bb.c.b.f30796me) | (i113 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                cVar3 = cVarC;
                j13 = j12;
                aVar3 = aVar2;
                hVar4 = hVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    AndroidPopup_androidKt.c(cVar3, j13, aVar3, hVar4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        aVar2 = aVar;
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                }
                i12 |= i18;
            } else {
                hVar2 = hVar;
            }
            i12 |= i18;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (pVarF.s(content)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((46811 & i12) == 9362) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    cVarC = androidx.compose.ui.c.INSTANCE.C();
                } else {
                    cVarC = cVar2;
                }
                if (i17 != 0) {
                    jA = o.a(0, 0);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    i12 &= -7169;
                } else {
                    hVar3 = hVar2;
                }
                j12 = jA;
            } else {
                if (i16 != 0) {
                    cVarC = androidx.compose.ui.c.INSTANCE.C();
                } else {
                    cVarC = cVar2;
                }
                if (i17 != 0) {
                    jA = o.a(0, 0);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    i12 &= -7169;
                } else {
                    hVar3 = hVar2;
                }
                j12 = jA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
            }
            s1.n nVarB6 = s1.n.b(j12);
            pVarF.T(511388516);
            zS = pVarF.s(nVarB6) | pVarF.s(cVarC);
            objU = pVarF.U();
            if (zS) {
                objU = new a(cVarC, j12, null);
                pVarF.N(objU);
            } else {
                objU = new a(cVarC, j12, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a aVar9 = (a) objU;
            int i114 = i12 >> 3;
            a(aVar9, aVar2, hVar3, content, pVarF, (i114 & 112) | (i114 & bb.c.b.f30796me) | (i114 & bb.c.g.f32954lc), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            cVar3 = cVarC;
            j13 = j12;
            aVar3 = aVar2;
            hVar4 = hVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    cVarC = androidx.compose.ui.c.INSTANCE.C();
                } else {
                    cVarC = cVar2;
                }
                if (i17 != 0) {
                    jA = o.a(0, 0);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    i12 &= -7169;
                } else {
                    hVar3 = hVar2;
                }
                j12 = jA;
            } else {
                if (i16 != 0) {
                    cVarC = androidx.compose.ui.c.INSTANCE.C();
                } else {
                    cVarC = cVar2;
                }
                if (i17 != 0) {
                    jA = o.a(0, 0);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    aVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    hVar3 = new h(false, false, false, null, false, false, 63, null);
                    i12 &= -7169;
                } else {
                    hVar3 = hVar2;
                }
                j12 = jA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:184)");
            }
            s1.n nVarB7 = s1.n.b(j12);
            pVarF.T(511388516);
            zS = pVarF.s(nVarB7) | pVarF.s(cVarC);
            objU = pVarF.U();
            if (zS) {
                objU = new a(cVarC, j12, null);
                pVarF.N(objU);
            } else {
                objU = new a(cVarC, j12, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a aVar10 = (a) objU;
            int i115 = i12 >> 3;
            a(aVar10, aVar2, hVar3, content, pVarF, (i115 & 112) | (i115 & bb.c.b.f30796me) | (i115 & bb.c.g.f32954lc), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            cVar3 = cVarC;
            j13 = j12;
            aVar3 = aVar2;
            hVar4 = hVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                AndroidPopup_androidKt.c(cVar3, j13, aVar3, hVar4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final String tag, @dl.d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(tag, "tag");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-498879600);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(tag) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-498879600, i11, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:329)");
            }
            CompositionLocalKt.b(new k1[]{f17116a.f(tag)}, content, pVarF, (i11 & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                AndroidPopup_androidKt.d(tag, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    private static final void e(n nVar, p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar, androidx.compose.runtime.p pVar2, int i10) {
        pVar2.T(1406149896);
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17161a;
        int i11 = ((i10 << 3) & 112) | ((i10 >> 3) & 14);
        pVar2.T(-1323940314);
        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar2.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion.a();
        q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar);
        int i12 = ((i11 << 9) & bb.c.g.f32954lc) | 6;
        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar2.h();
        if (pVar2.D()) {
            pVar2.L(aVarA);
        } else {
            pVar2.d();
        }
        pVar2.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
        Updater.j(pVarB, androidPopup_androidKt$SimpleStack$1, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar2.x();
        qVarF.invoke(v1.a(v1.b(pVar2)), pVar2, Integer.valueOf((i12 >> 3) & 112));
        pVar2.T(2058660585);
        pVar.invoke(pVar2, Integer.valueOf((i12 >> 9) & 14));
        pVar2.c0();
        pVar2.f();
        pVar2.c0();
        pVar2.c0();
    }

    @dl.d
    public static final j1<String> h() {
        return f17116a;
    }

    public static final boolean i(@dl.d View view) {
        f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final boolean j(@dl.d View view, @dl.e String str) {
        f0.p(view, "view");
        return (view instanceof PopupLayout) && (str == null || f0.g(str, ((PopupLayout) view).getTestTag()));
    }

    public static /* synthetic */ boolean k(View view, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return j(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.p l(Rect rect) {
        return new s1.p(rect.left, rect.top, rect.right, rect.bottom);
    }
}
