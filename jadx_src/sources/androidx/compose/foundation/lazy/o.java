package androidx.compose.foundation.lazy;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/o;", "Landroidx/compose/foundation/lazy/layout/i;", "", "", "i", "()Ljava/util/List;", "headerIndexes", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface o extends androidx.compose.foundation.lazy.layout.i {
    @dl.d
    LazyItemScopeImpl h();

    @dl.d
    List<Integer> i();
}
