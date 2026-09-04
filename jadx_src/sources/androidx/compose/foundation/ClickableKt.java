package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ay\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008b\u0001\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a>\u0010\u001f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001cH\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aQ\u0010&\u001a\u00020\b*\u00020!2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070$H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a«\u0001\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020)2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0$2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/n;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/g;", "role", "Lkotlin/Function0;", "Lkotlin/b2;", "onClick", "d", "(Landroidx/compose/ui/n;ZLjava/lang/String;Landroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/foundation/x;", "indication", "b", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;ZLjava/lang/String;Landroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "onLongClickLabel", "onLongClick", "onDoubleClick", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/n;ZLjava/lang/String;Landroidx/compose/ui/semantics/g;Ljava/lang/String;Lyh/a;Lyh/a;Lyh/a;)Landroidx/compose/ui/n;", "f", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;ZLjava/lang/String;Landroidx/compose/ui/semantics/g;Ljava/lang/String;Lyh/a;Lyh/a;Lyh/a;)Landroidx/compose/ui/n;", "Landroidx/compose/runtime/a1;", "Landroidx/compose/foundation/interaction/i$b;", "pressedInteraction", "", "Landroidx/compose/ui/input/key/a;", "currentKeyPressInteractions", ak.av, "(Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/a1;Ljava/util/Map;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/gestures/k;", "Lb1/f;", "pressPoint", "Landroidx/compose/runtime/m2;", "delayPressInteraction", "n", "(Landroidx/compose/foundation/gestures/k;JLandroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/a1;Landroidx/compose/runtime/m2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "gestureModifiers", "Lkotlinx/coroutines/q0;", "indicationScope", "keyClickOffset", "j", "(Landroidx/compose/ui/n;Landroidx/compose/ui/n;Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;Lkotlinx/coroutines/q0;Ljava/util/Map;Landroidx/compose/runtime/m2;ZLjava/lang/String;Landroidx/compose/ui/semantics/g;Ljava/lang/String;Lyh/a;Lyh/a;)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ClickableKt {
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.foundation.interaction.g interactionSource, @dl.d final a1<androidx.compose.foundation.interaction.i.b> pressedInteraction, @dl.d final Map<androidx.compose.ui.input.key.a, androidx.compose.foundation.interaction.i.b> currentKeyPressInteractions, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(pressedInteraction, "pressedInteraction");
        kotlin.jvm.internal.f0.p(currentKeyPressInteractions, "currentKeyPressInteractions");
        androidx.compose.runtime.p pVarF = pVar.F(1297229208);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1297229208, i10, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.c(interactionSource, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a1 f4713a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map f4714b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f4715c;

                public a(a1 a1Var, Map map, androidx.compose.foundation.interaction.g gVar) {
                    this.f4713a = a1Var;
                    this.f4714b = map;
                    this.f4715c = gVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    androidx.compose.foundation.interaction.i.b bVar = (androidx.compose.foundation.interaction.i.b) this.f4713a.getValue();
                    if (bVar != null) {
                        this.f4715c.a(new androidx.compose.foundation.interaction.i.a(bVar));
                        this.f4713a.setValue(null);
                    }
                    Iterator it = this.f4714b.values().iterator();
                    while (it.hasNext()) {
                        this.f4715c.a(new androidx.compose.foundation.interaction.i.a((androidx.compose.foundation.interaction.i.b) it.next()));
                    }
                    this.f4714b.clear();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                return new a(pressedInteraction, currentKeyPressInteractions, interactionSource);
            }
        }, pVarF, i10 & 14);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                ClickableKt.a(interactionSource, pressedInteraction, currentKeyPressInteractions, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n clickable, @dl.d final androidx.compose.foundation.interaction.g interactionSource, @dl.e final x xVar, final boolean z10, @dl.e final String str, @dl.e final androidx.compose.ui.semantics.g gVar, @dl.d final yh.a<b2> onClick) {
        kotlin.jvm.internal.f0.p(clickable, "$this$clickable");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        return ComposedModifierKt.g(clickable, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("clickable");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("onClickLabel", str);
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("interactionSource", interactionSource);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4

            /* JADX INFO: compiled from: Clickable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class a implements androidx.compose.ui.modifier.e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a1<Boolean> f4730b;

                a(a1<Boolean> a1Var) {
                    this.f4730b = a1Var;
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ boolean a0(yh.l lVar) {
                    return androidx.compose.ui.o.a(this, lVar);
                }

                @Override // androidx.compose.ui.n
                public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
                    return androidx.compose.ui.m.a(this, nVar);
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ boolean t(yh.l lVar) {
                    return androidx.compose.ui.o.b(this, lVar);
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ Object v(Object obj, yh.p pVar) {
                    return androidx.compose.ui.o.d(this, obj, pVar);
                }

                @Override // androidx.compose.ui.modifier.e
                public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
                    kotlin.jvm.internal.f0.p(scope, "scope");
                    this.f4730b.setValue((Boolean) scope.a(ScrollableKt.f()));
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ Object x(Object obj, yh.p pVar) {
                    return androidx.compose.ui.o.c(this, obj, pVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(92076020);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(92076020, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
                }
                m2 m2VarT = e2.t(onClick, pVar, 0);
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                a1 a1Var = (a1) objU;
                pVar.T(-492369756);
                Object objU2 = pVar.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVar.N(objU2);
                }
                pVar.c0();
                Map map = (Map) objU2;
                pVar.T(1841981561);
                if (z10) {
                    ClickableKt.a(interactionSource, a1Var, map, pVar, bb.c.b.O7);
                }
                pVar.c0();
                final yh.a<Boolean> aVarD = Clickable_androidKt.d(pVar, 0);
                pVar.T(-492369756);
                Object objU3 = pVar.U();
                if (objU3 == companion.a()) {
                    objU3 = h2.g(Boolean.TRUE, null, 2, null);
                    pVar.N(objU3);
                }
                pVar.c0();
                final a1 a1Var2 = (a1) objU3;
                pVar.T(511388516);
                boolean zS = pVar.s(a1Var2) | pVar.s(aVarD);
                Object objU4 = pVar.U();
                if (zS || objU4 == companion.a()) {
                    objU4 = new yh.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            return Boolean.valueOf(a1Var2.getValue().booleanValue() || aVarD.invoke().booleanValue());
                        }
                    };
                    pVar.N(objU4);
                }
                pVar.c0();
                m2 m2VarT2 = e2.t(objU4, pVar, 0);
                pVar.T(-492369756);
                Object objU5 = pVar.U();
                if (objU5 == companion.a()) {
                    objU5 = h2.g(b1.f.d(b1.f.f30364b.e()), null, 2, null);
                    pVar.N(objU5);
                }
                pVar.c0();
                a1 a1Var3 = (a1) objU5;
                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.foundation.interaction.g gVar2 = interactionSource;
                Boolean boolValueOf = Boolean.valueOf(z10);
                androidx.compose.foundation.interaction.g gVar3 = interactionSource;
                Object[] objArr = {a1Var3, Boolean.valueOf(z10), gVar3, a1Var, m2VarT2, m2VarT};
                boolean z11 = z10;
                pVar.T(-568225417);
                int i11 = 0;
                boolean zS2 = false;
                for (int i12 = 6; i11 < i12; i12 = 6) {
                    zS2 |= pVar.s(objArr[i11]);
                    i11++;
                }
                Object objU6 = pVar.U();
                if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU6 = new ClickableKt$clickable$4$gesture$1$1(a1Var3, z11, gVar3, a1Var, m2VarT2, m2VarT, null);
                    pVar.N(objU6);
                }
                pVar.c0();
                androidx.compose.ui.n nVarB = SuspendingPointerInputFilterKt.b(companion2, gVar2, boolValueOf, (yh.p) objU6);
                androidx.compose.ui.n.Companion companion3 = androidx.compose.ui.n.INSTANCE;
                pVar.T(-492369756);
                Object objU7 = pVar.U();
                androidx.compose.runtime.p.Companion companion4 = androidx.compose.runtime.p.INSTANCE;
                if (objU7 == companion4.a()) {
                    objU7 = new a(a1Var2);
                    pVar.N(objU7);
                }
                pVar.c0();
                androidx.compose.ui.n nVarS0 = companion3.s0((androidx.compose.ui.n) objU7);
                androidx.compose.foundation.interaction.g gVar4 = interactionSource;
                x xVar2 = xVar;
                pVar.T(773894976);
                pVar.T(-492369756);
                Object objU8 = pVar.U();
                if (objU8 == companion4.a()) {
                    Object xVar3 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                    pVar.N(xVar3);
                    objU8 = xVar3;
                }
                pVar.c0();
                q0 coroutineScope = ((androidx.compose.runtime.x) objU8).getCoroutineScope();
                pVar.c0();
                androidx.compose.ui.n nVarJ = ClickableKt.j(nVarS0, nVarB, gVar4, xVar2, coroutineScope, map, a1Var3, z10, str, gVar, null, null, onClick);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarJ;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n c(androidx.compose.ui.n nVar, androidx.compose.foundation.interaction.g gVar, x xVar, boolean z10, String str, androidx.compose.ui.semantics.g gVar2, yh.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return b(nVar, gVar, xVar, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : gVar2, aVar);
    }

    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n clickable, final boolean z10, @dl.e final String str, @dl.e final androidx.compose.ui.semantics.g gVar, @dl.d final yh.a<b2> onClick) {
        kotlin.jvm.internal.f0.p(clickable, "$this$clickable");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        return ComposedModifierKt.g(clickable, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("clickable");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("onClickLabel", str);
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-756081143);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
                }
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                x xVar = (x) pVar.K(IndicationKt.a());
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarB = ClickableKt.b(companion, (androidx.compose.foundation.interaction.g) objU, xVar, z10, str, gVar, onClick);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarB;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n e(androidx.compose.ui.n nVar, boolean z10, String str, androidx.compose.ui.semantics.g gVar, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return d(nVar, z10, str, gVar, aVar);
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n combinedClickable, @dl.d final androidx.compose.foundation.interaction.g interactionSource, @dl.e final x xVar, final boolean z10, @dl.e final String str, @dl.e final androidx.compose.ui.semantics.g gVar, @dl.e final String str2, @dl.e final yh.a<b2> aVar, @dl.e final yh.a<b2> aVar2, @dl.d final yh.a<b2> onClick) {
        kotlin.jvm.internal.f0.p(combinedClickable, "$this$combinedClickable");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        return ComposedModifierKt.g(combinedClickable, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("combinedClickable");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("onClickLabel", str);
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
                x0Var.getProperties().c("onDoubleClick", aVar2);
                x0Var.getProperties().c("onLongClick", aVar);
                x0Var.getProperties().c("onLongClickLabel", str2);
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("interactionSource", interactionSource);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4

            /* JADX INFO: compiled from: Clickable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class a implements androidx.compose.ui.modifier.e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a1<Boolean> f4780b;

                a(a1<Boolean> a1Var) {
                    this.f4780b = a1Var;
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ boolean a0(yh.l lVar) {
                    return androidx.compose.ui.o.a(this, lVar);
                }

                @Override // androidx.compose.ui.n
                public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
                    return androidx.compose.ui.m.a(this, nVar);
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ boolean t(yh.l lVar) {
                    return androidx.compose.ui.o.b(this, lVar);
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ Object v(Object obj, yh.p pVar) {
                    return androidx.compose.ui.o.d(this, obj, pVar);
                }

                @Override // androidx.compose.ui.modifier.e
                public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
                    kotlin.jvm.internal.f0.p(scope, "scope");
                    this.f4780b.setValue((Boolean) scope.a(ScrollableKt.f()));
                }

                @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
                public /* synthetic */ Object x(Object obj, yh.p pVar) {
                    return androidx.compose.ui.o.c(this, obj, pVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                Map map;
                a1 a1Var;
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1841718000);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1841718000, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
                }
                m2 m2VarT = e2.t(onClick, pVar, 0);
                m2 m2VarT2 = e2.t(aVar, pVar, 0);
                m2 m2VarT3 = e2.t(aVar2, pVar, 0);
                boolean z11 = aVar != null;
                boolean z12 = aVar2 != null;
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final a1 a1Var2 = (a1) objU;
                pVar.T(-492369756);
                Object objU2 = pVar.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVar.N(objU2);
                }
                pVar.c0();
                Map map2 = (Map) objU2;
                pVar.T(1321107720);
                if (z10) {
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    final androidx.compose.foundation.interaction.g gVar2 = interactionSource;
                    pVar.T(511388516);
                    boolean zS = pVar.s(a1Var2) | pVar.s(gVar2);
                    Object objU3 = pVar.U();
                    if (zS || objU3 == companion.a()) {
                        objU3 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1

                            /* JADX INFO: compiled from: Effects.kt */
                            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                            public static final class a implements androidx.compose.runtime.e0 {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                final /* synthetic */ a1 f4778a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                final /* synthetic */ androidx.compose.foundation.interaction.g f4779b;

                                public a(a1 a1Var, androidx.compose.foundation.interaction.g gVar) {
                                    this.f4778a = a1Var;
                                    this.f4779b = gVar;
                                }

                                @Override // androidx.compose.runtime.e0
                                public void dispose() {
                                    androidx.compose.foundation.interaction.i.b bVar = (androidx.compose.foundation.interaction.i.b) this.f4778a.getValue();
                                    if (bVar != null) {
                                        this.f4779b.a(new androidx.compose.foundation.interaction.i.a(bVar));
                                        this.f4778a.setValue(null);
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                                return new a(a1Var2, gVar2);
                            }
                        };
                        pVar.N(objU3);
                    }
                    pVar.c0();
                    EffectsKt.c(boolValueOf, (yh.l) objU3, pVar, 0);
                    ClickableKt.a(interactionSource, a1Var2, map2, pVar, bb.c.b.O7);
                }
                pVar.c0();
                final yh.a<Boolean> aVarD = Clickable_androidKt.d(pVar, 0);
                pVar.T(-492369756);
                Object objU4 = pVar.U();
                if (objU4 == companion.a()) {
                    objU4 = h2.g(Boolean.TRUE, null, 2, null);
                    pVar.N(objU4);
                }
                pVar.c0();
                final a1 a1Var3 = (a1) objU4;
                pVar.T(511388516);
                boolean zS2 = pVar.s(a1Var3) | pVar.s(aVarD);
                Object objU5 = pVar.U();
                if (zS2 || objU5 == companion.a()) {
                    objU5 = new yh.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            return Boolean.valueOf(a1Var3.getValue().booleanValue() || aVarD.invoke().booleanValue());
                        }
                    };
                    pVar.N(objU5);
                }
                pVar.c0();
                m2 m2VarT4 = e2.t(objU5, pVar, 0);
                pVar.T(-492369756);
                Object objU6 = pVar.U();
                if (objU6 == companion.a()) {
                    objU6 = h2.g(b1.f.d(b1.f.f30364b.e()), null, 2, null);
                    pVar.N(objU6);
                }
                pVar.c0();
                a1 a1Var4 = (a1) objU6;
                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                Object[] objArr = {interactionSource, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z10)};
                androidx.compose.foundation.interaction.g gVar3 = interactionSource;
                Object[] objArr2 = {a1Var4, Boolean.valueOf(z12), Boolean.valueOf(z10), m2VarT3, Boolean.valueOf(z11), m2VarT2, gVar3, a1Var2, m2VarT4, m2VarT};
                boolean z13 = z10;
                pVar.T(-568225417);
                int i11 = 0;
                boolean zS3 = false;
                for (int i12 = 10; i11 < i12; i12 = 10) {
                    zS3 |= pVar.s(objArr2[i11]);
                    i11++;
                }
                Object objU7 = pVar.U();
                if (zS3 || objU7 == androidx.compose.runtime.p.INSTANCE.a()) {
                    map = map2;
                    a1Var = a1Var3;
                    objU7 = new ClickableKt$combinedClickable$4$gesture$1$1(a1Var4, z12, z13, z11, m2VarT3, m2VarT2, gVar3, a1Var2, m2VarT4, m2VarT, null);
                    pVar.N(objU7);
                } else {
                    map = map2;
                    a1Var = a1Var3;
                }
                pVar.c0();
                androidx.compose.ui.n nVarE = SuspendingPointerInputFilterKt.e(companion2, objArr, (yh.p) objU7);
                androidx.compose.ui.n.Companion companion3 = androidx.compose.ui.n.INSTANCE;
                pVar.T(-492369756);
                Object objU8 = pVar.U();
                androidx.compose.runtime.p.Companion companion4 = androidx.compose.runtime.p.INSTANCE;
                if (objU8 == companion4.a()) {
                    objU8 = new a(a1Var);
                    pVar.N(objU8);
                }
                pVar.c0();
                androidx.compose.ui.n nVarS0 = companion3.s0((androidx.compose.ui.n) objU8);
                androidx.compose.foundation.interaction.g gVar4 = interactionSource;
                x xVar2 = xVar;
                pVar.T(773894976);
                pVar.T(-492369756);
                Object objU9 = pVar.U();
                if (objU9 == companion4.a()) {
                    objU9 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                    pVar.N(objU9);
                }
                pVar.c0();
                q0 coroutineScope = ((androidx.compose.runtime.x) objU9).getCoroutineScope();
                pVar.c0();
                androidx.compose.ui.n nVarJ = ClickableKt.j(nVarS0, nVarE, gVar4, xVar2, coroutineScope, map, a1Var4, z10, str, gVar, str2, aVar, onClick);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarJ;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n h(@dl.d androidx.compose.ui.n combinedClickable, final boolean z10, @dl.e final String str, @dl.e final androidx.compose.ui.semantics.g gVar, @dl.e final String str2, @dl.e final yh.a<b2> aVar, @dl.e final yh.a<b2> aVar2, @dl.d final yh.a<b2> onClick) {
        kotlin.jvm.internal.f0.p(combinedClickable, "$this$combinedClickable");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        return ComposedModifierKt.g(combinedClickable, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("combinedClickable");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("onClickLabel", str);
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
                x0Var.getProperties().c("onDoubleClick", aVar2);
                x0Var.getProperties().c("onLongClick", aVar);
                x0Var.getProperties().c("onLongClickLabel", str2);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1969174843);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                x xVar = (x) pVar.K(IndicationKt.a());
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarF = ClickableKt.f(companion, (androidx.compose.foundation.interaction.g) objU, xVar, z10, str, gVar, str2, aVar, aVar2, onClick);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarF;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n genericClickableWithoutGesture, @dl.d androidx.compose.ui.n gestureModifiers, @dl.d androidx.compose.foundation.interaction.g interactionSource, @dl.e x xVar, @dl.d q0 indicationScope, @dl.d Map<androidx.compose.ui.input.key.a, androidx.compose.foundation.interaction.i.b> currentKeyPressInteractions, @dl.d m2<b1.f> keyClickOffset, boolean z10, @dl.e String str, @dl.e androidx.compose.ui.semantics.g gVar, @dl.e String str2, @dl.e yh.a<b2> aVar, @dl.d yh.a<b2> onClick) {
        kotlin.jvm.internal.f0.p(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        kotlin.jvm.internal.f0.p(gestureModifiers, "gestureModifiers");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(indicationScope, "indicationScope");
        kotlin.jvm.internal.f0.p(currentKeyPressInteractions, "currentKeyPressInteractions");
        kotlin.jvm.internal.f0.p(keyClickOffset, "keyClickOffset");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        return FocusableKt.e(HoverableKt.a(IndicationKt.b(m(l(genericClickableWithoutGesture, gVar, str, aVar, str2, z10, onClick), z10, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, xVar), interactionSource, z10), z10, interactionSource).s0(gestureModifiers);
    }

    private static final androidx.compose.ui.n l(androidx.compose.ui.n nVar, final androidx.compose.ui.semantics.g gVar, final String str, final yh.a<b2> aVar, final String str2, final boolean z10, final yh.a<b2> aVar2) {
        return SemanticsModifierKt.b(nVar, true, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                androidx.compose.ui.semantics.g gVar2 = gVar;
                if (gVar2 != null) {
                    SemanticsPropertiesKt.p0(semantics, gVar2.getValue());
                }
                String str3 = str;
                final yh.a<b2> aVar3 = aVar2;
                SemanticsPropertiesKt.N(semantics, str3, new yh.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        aVar3.invoke();
                        return Boolean.TRUE;
                    }
                });
                final yh.a<b2> aVar4 = aVar;
                if (aVar4 != null) {
                    SemanticsPropertiesKt.P(semantics, str2, new yh.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            aVar4.invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z10) {
                    return;
                }
                SemanticsPropertiesKt.j(semantics);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        });
    }

    private static final androidx.compose.ui.n m(androidx.compose.ui.n nVar, final boolean z10, final Map<androidx.compose.ui.input.key.a, androidx.compose.foundation.interaction.i.b> map, final m2<b1.f> m2Var, final q0 q0Var, final yh.a<b2> aVar, final androidx.compose.foundation.interaction.g gVar) {
        return KeyInputModifierKt.b(nVar, new yh.l<androidx.compose.ui.input.key.b, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1

            /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Clickable.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4836b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f4837c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.i.b f4838d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.i.b bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f4837c = gVar;
                    this.f4838d = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.f4837c, this.f4838d, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f4836b;
                    if (i10 == 0) {
                        t0.n(obj);
                        androidx.compose.foundation.interaction.g gVar = this.f4837c;
                        androidx.compose.foundation.interaction.i.b bVar = this.f4838d;
                        this.f4836b = 1;
                        if (gVar.b(bVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0083  */
            @dl.d
            public final Boolean a(@dl.d KeyEvent keyEvent) {
                kotlin.jvm.internal.f0.p(keyEvent, "keyEvent");
                boolean z11 = true;
                if (z10 && Clickable_androidKt.g(keyEvent)) {
                    if (map.containsKey(androidx.compose.ui.input.key.a.B4(androidx.compose.ui.input.key.d.a(keyEvent)))) {
                        z11 = false;
                    } else {
                        androidx.compose.foundation.interaction.i.b bVar = new androidx.compose.foundation.interaction.i.b(m2Var.getValue().getF30368a(), null);
                        map.put(androidx.compose.ui.input.key.a.B4(androidx.compose.ui.input.key.d.a(keyEvent)), bVar);
                        kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(gVar, bVar, null), 3, null);
                    }
                } else if (z10 && Clickable_androidKt.c(keyEvent)) {
                    androidx.compose.foundation.interaction.i.b bVarRemove = map.remove(androidx.compose.ui.input.key.a.B4(androidx.compose.ui.input.key.d.a(keyEvent)));
                    if (bVarRemove != null) {
                        kotlinx.coroutines.k.f(q0Var, null, null, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(gVar, bVarRemove, null), 3, null);
                    }
                    aVar.invoke();
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.b bVar) {
                return a(bVar.h());
            }
        });
    }

    @dl.e
    public static final Object n(@dl.d androidx.compose.foundation.gestures.k kVar, long j10, @dl.d androidx.compose.foundation.interaction.g gVar, @dl.d a1<androidx.compose.foundation.interaction.i.b> a1Var, @dl.d m2<? extends yh.a<Boolean>> m2Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new ClickableKt$handlePressInteraction$2(kVar, j10, gVar, a1Var, m2Var, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }
}
