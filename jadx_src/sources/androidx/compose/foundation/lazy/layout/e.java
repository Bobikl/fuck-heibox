package androidx.compose.foundation.lazy.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J<\u0010\u0011\u001a\u00020\b2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/e;", "", "", UCropPlusActivity.ARG_INDEX, "g", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/m;", "scrollOffset", "Lkotlin/b2;", "e", "targetScrollOffset", "", ak.aF, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "Lkotlin/t;", "block", "b", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "d", "()I", "firstVisibleItemIndex", "i", "firstVisibleItemScrollOffset", "f", "lastVisibleItemIndex", ak.av, "itemCount", RXScreenCaptureService.KEY_HEIGHT, "numOfItemsForTeleport", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface e {
    int a();

    @dl.e
    Object b(@dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar);

    float c(int index, int targetScrollOffset);

    int d();

    void e(@dl.d androidx.compose.foundation.gestures.m mVar, int i10, int i11);

    int f();

    @dl.e
    Integer g(int index);

    @dl.d
    s1.e getDensity();

    int h();

    int i();
}
