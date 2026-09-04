package androidx.compose.foundation.lazy;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0098\u0001\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jq\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000421\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH'¢\u0006\u0004\b\u0019\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/w;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/g;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/q;)V", ak.aF, "(Ljava/lang/Object;Lyh/q;)V", "", "count", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function2;", "itemContent", "b", "(ILyh/l;Lyh/l;Lyh/r;)V", "e", "(ILyh/l;Lyh/r;)V", "d", "foundation_release"}, k = 1, mv = {1, 7, 1})
@a0
public interface w {

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static void a(@dl.d w wVar, @dl.e Object obj, @dl.e Object obj2, @dl.d yh.q<? super g, ? super androidx.compose.runtime.p, ? super Integer, b2> content) {
            f0.p(content, "content");
            LazyListScope$CC.a(wVar, obj, obj2, content);
        }

        @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void b(w wVar, Object obj, yh.q content) {
            f0.p(content, "content");
            LazyListScope$CC.b(wVar, obj, content);
        }

        @Deprecated
        public static void e(@dl.d w wVar, int i10, @dl.e yh.l<? super Integer, ? extends Object> lVar, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super g, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
            f0.p(contentType, "contentType");
            f0.p(itemContent, "itemContent");
            LazyListScope$CC.c(wVar, i10, lVar, contentType, itemContent);
        }

        @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void f(w wVar, int i10, yh.l lVar, yh.r itemContent) {
            f0.p(itemContent, "itemContent");
            LazyListScope$CC.d(wVar, i10, lVar, itemContent);
        }
    }

    void a(@dl.e Object key, @dl.e Object contentType, @dl.d yh.q<? super g, ? super androidx.compose.runtime.p, ? super Integer, b2> content);

    void b(int count, @dl.e yh.l<? super Integer, ? extends Object> key, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super g, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent);

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void c(Object key, yh.q content);

    @androidx.compose.foundation.t
    void d(@dl.e Object key, @dl.e Object contentType, @dl.d yh.q<? super g, ? super androidx.compose.runtime.p, ? super Integer, b2> content);

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void e(int count, yh.l key, yh.r itemContent);
}
