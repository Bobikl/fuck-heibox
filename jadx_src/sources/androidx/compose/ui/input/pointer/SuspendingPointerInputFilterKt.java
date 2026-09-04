package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.platform.x0;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.u0;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aQ\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0010\"\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "d", "(Landroidx/compose/ui/n;Lyh/p;)Landroidx/compose/ui/n;", "key1", ak.aF, "(Landroidx/compose/ui/n;Ljava/lang/Object;Lyh/p;)Landroidx/compose/ui/n;", "key2", "b", "(Landroidx/compose/ui/n;Ljava/lang/Object;Ljava/lang/Object;Lyh/p;)Landroidx/compose/ui/n;", "", Constants.PARAM_KEYS, "e", "(Landroidx/compose/ui/n;[Ljava/lang/Object;Lyh/p;)Landroidx/compose/ui/n;", "", ak.av, "Ljava/lang/String;", "PointerInputModifierNoParamError", "Landroidx/compose/ui/input/pointer/p;", "Landroidx/compose/ui/input/pointer/p;", "EmptyPointerEvent", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class SuspendingPointerInputFilterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f14723a = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final p f14724b = new p(CollectionsKt__CollectionsKt.E());

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.e final Object obj, @dl.e final Object obj2, @dl.d final yh.p<? super i0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("pointerInput");
                x0Var.getProperties().c("key1", obj);
                x0Var.getProperties().c("key2", obj2);
                x0Var.getProperties().c("block", block);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1175567217);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1175567217, i10, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:285)");
                }
                s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
                d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
                pVar.T(1157296644);
                boolean zS = pVar.s(eVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new SuspendingPointerInputFilter(d2Var, eVar);
                    pVar.N(objU);
                }
                pVar.c0();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objU;
                EffectsKt.f(suspendingPointerInputFilter, obj, obj2, new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, block, null), pVar, bb.c.f.f32551s4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return suspendingPointerInputFilter;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.e final Object obj, @dl.d final yh.p<? super i0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("pointerInput");
                x0Var.getProperties().c("key1", obj);
                x0Var.getProperties().c("block", block);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-906157935);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-906157935, i10, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:237)");
                }
                s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
                d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
                pVar.T(1157296644);
                boolean zS = pVar.s(eVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new SuspendingPointerInputFilter(d2Var, eVar);
                    pVar.N(objU);
                }
                pVar.c0();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objU;
                EffectsKt.g(suspendingPointerInputFilter, obj, new SuspendingPointerInputFilterKt$pointerInput$2$2$1(suspendingPointerInputFilter, block, null), pVar, bb.c.b.f30606e8);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return suspendingPointerInputFilter;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = f14723a)
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d yh.p<? super i0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        throw new IllegalStateException(f14723a.toString());
    }

    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar, @dl.d final Object[] keys, @dl.d final yh.p<? super i0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(block, "block");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("pointerInput");
                x0Var.getProperties().c(Constants.PARAM_KEYS, keys);
                x0Var.getProperties().c("block", block);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(664422852);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(664422852, i10, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:330)");
                }
                s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
                d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
                pVar.T(1157296644);
                boolean zS = pVar.s(eVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new SuspendingPointerInputFilter(d2Var, eVar);
                    pVar.N(objU);
                }
                pVar.c0();
                Object[] objArr = keys;
                yh.p<i0, kotlin.coroutines.c<? super b2>, Object> pVar2 = block;
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objU;
                u0 u0Var = new u0(2);
                u0Var.a(suspendingPointerInputFilter);
                u0Var.b(objArr);
                EffectsKt.j(u0Var.d(new Object[u0Var.c()]), new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter, pVar2, null), pVar, 72);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return suspendingPointerInputFilter;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
