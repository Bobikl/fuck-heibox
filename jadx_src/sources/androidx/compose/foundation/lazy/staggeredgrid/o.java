package androidx.compose.foundation.lazy.staggeredgrid;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@p
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0098\u0001\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/o;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/f;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/q;)V", "", "count", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function2;", "itemContent", "b", "(ILyh/l;Lyh/l;Lyh/r;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface o {
    @androidx.compose.foundation.t
    void a(@dl.e Object key, @dl.e Object contentType, @dl.d yh.q<? super f, ? super androidx.compose.runtime.p, ? super Integer, b2> content);

    void b(int count, @dl.e yh.l<? super Integer, ? extends Object> key, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super f, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent);
}
