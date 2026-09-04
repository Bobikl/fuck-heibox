package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.e1;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b0;", "", "Landroidx/compose/foundation/lazy/grid/e;", UCropPlusActivity.ARG_INDEX, "key", "", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/e1;", "placeables", "Landroidx/compose/foundation/lazy/grid/w;", ak.av, "(ILjava/lang/Object;IILjava/util/List;)Landroidx/compose/foundation/lazy/grid/w;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface b0 {
    @dl.d
    w a(int index, @dl.d Object key, int crossAxisSize, int mainAxisSpacing, @dl.d List<? extends e1> placeables);
}
