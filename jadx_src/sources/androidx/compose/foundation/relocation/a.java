package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.r;
import b1.i;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BringIntoViewResponder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Landroidx/compose/foundation/relocation/c;", "Landroidx/compose/ui/layout/q;", "childCoordinates", "Lkotlin/Function0;", "Lb1/i;", "boundsProvider", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/layout/q;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/view/View;", "b", "Landroid/view/View;", sd.b.f139384b, "<init>", "(Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    public a(@dl.d View view) {
        f0.p(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.c
    @dl.e
    public Object a(@dl.d q qVar, @dl.d yh.a<i> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        i iVarS;
        long jF = r.f(qVar);
        i iVarInvoke = aVar.invoke();
        if (iVarInvoke == null || (iVarS = iVarInvoke.S(jF)) == null) {
            return b2.f124493a;
        }
        this.view.requestRectangleOnScreen(g.c(iVarS), false);
        return b2.f124493a;
    }
}
