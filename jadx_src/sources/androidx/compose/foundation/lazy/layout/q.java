package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.ScrollAxisRange;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/q;", "", "Landroidx/compose/ui/semantics/h;", "b", "Landroidx/compose/ui/semantics/b;", "d", "", "delta", "Lkotlin/b2;", ak.aF, "(FLkotlin/coroutines/c;)Ljava/lang/Object;", "", UCropPlusActivity.ARG_INDEX, ak.av, "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface q {
    @dl.e
    Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.d
    ScrollAxisRange b();

    @dl.e
    Object c(float f10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.d
    androidx.compose.ui.semantics.b d();
}
