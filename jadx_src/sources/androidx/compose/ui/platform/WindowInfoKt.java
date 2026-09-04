package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "isWindowFocused", "Lkotlin/b2;", "onWindowFocusChanged", ak.av, "(Lyh/l;Landroidx/compose/runtime/p;I)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class WindowInfoKt {
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.l<? super Boolean, kotlin.b2> onWindowFocusChanged, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(onWindowFocusChanged, "onWindowFocusChanged");
        androidx.compose.runtime.p pVarF = pVar.F(127829799);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(onWindowFocusChanged) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(127829799, i11, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            o2 o2Var = (o2) pVarF.K(CompositionLocalsKt.v());
            androidx.compose.runtime.m2 m2VarT = androidx.compose.runtime.e2.t(onWindowFocusChanged, pVarF, i11 & 14);
            pVarF.T(511388516);
            boolean zS = pVarF.s(o2Var) | pVarF.s(m2VarT);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new WindowInfoKt$WindowFocusObserver$1$1(o2Var, m2VarT, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            EffectsKt.h(o2Var, (yh.p) objU, pVarF, 64);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                WindowInfoKt.a(onWindowFocusChanged, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
