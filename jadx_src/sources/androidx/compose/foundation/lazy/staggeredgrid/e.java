package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u001d\u0010\u0005\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u00020\u000f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\u0082\u0001\u0001\u0012ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/e;", "", "Ls1/n;", ak.aF, "()J", w.c.R, "", "getIndex", "()I", UCropPlusActivity.ARG_INDEX, "b", "lane", "getKey", "()Ljava/lang/Object;", "key", "Ls1/r;", ak.av, UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface e {
    long a();

    int b();

    long c();

    int getIndex();

    @dl.d
    Object getKey();
}
