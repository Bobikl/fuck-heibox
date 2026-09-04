package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.i;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: BringIntoViewResponder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/relocation/c;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/relocation/c;", "Lb1/i;", "Landroid/graphics/Rect;", ak.aF, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @dl.d
    @h
    public static final c b(@dl.e p pVar, int i10) {
        pVar.T(-1031410916);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1031410916, i10, -1, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)");
        }
        View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        pVar.T(1157296644);
        boolean zS = pVar.s(view);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            objU = new a(view);
            pVar.N(objU);
        }
        pVar.c0();
        a aVar = (a) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(i iVar) {
        return new Rect((int) iVar.t(), (int) iVar.getF30372b(), (int) iVar.x(), (int) iVar.j());
    }
}
