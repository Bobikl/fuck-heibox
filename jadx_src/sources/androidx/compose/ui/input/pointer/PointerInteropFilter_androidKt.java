package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0001\u001a/\u0010\u0010\u001a\u00020\u0000*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0003H\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/input/pointer/p0;", "requestDisallowInterceptTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "b", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", sd.b.f139384b, ak.aF, "Lkotlin/m0;", "name", "motionEvent", "Lkotlin/b2;", "watcher", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class PointerInteropFilter_androidKt {
    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super MotionEvent, b2> watcher) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(watcher, "watcher");
        return SuspendingPointerInputFilterKt.c(nVar, watcher, new PointerInteropFilter_androidKt$motionEventSpy$1(watcher, null));
    }

    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.e final p0 p0Var, @dl.d final yh.l<? super MotionEvent, Boolean> onTouchEvent) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(onTouchEvent, "onTouchEvent");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("pointerInteropFilter");
                x0Var.getProperties().c("requestDisallowInterceptTouchEvent", p0Var);
                x0Var.getProperties().c("onTouchEvent", onTouchEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(374375707);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(374375707, i10, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new PointerInteropFilter();
                    pVar.N(objU);
                }
                pVar.c0();
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objU;
                pointerInteropFilter.f(onTouchEvent);
                pointerInteropFilter.g(p0Var);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return pointerInteropFilter;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final AndroidViewHolder view) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(view, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.f(new yh.l<MotionEvent, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = view.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        });
        p0 p0Var = new p0();
        pointerInteropFilter.g(p0Var);
        view.setOnRequestDisallowInterceptTouchEvent$ui_release(p0Var);
        return nVar.s0(pointerInteropFilter);
    }

    public static /* synthetic */ androidx.compose.ui.n d(androidx.compose.ui.n nVar, p0 p0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p0Var = null;
        }
        return b(nVar, p0Var, lVar);
    }
}
